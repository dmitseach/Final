package com.qaprosoft.tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.api.methods.GetApiMethod;
import com.qaprosoft.api.methods.PostApiMethod;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.http.HttpResponseStatusType;
import com.qaprosoft.utils.AbstractAPITest;
import com.qaprosoft.utils.Constants;

public class PoloniexSampleTest extends AbstractAPITest implements Constants {

	@Test(dataProvider = "SingleDataProvider")
	@XlsDataSourceParameters(path = "OrderBook.xls", sheet = "orderBook", dsUid = "TUID")
	public void getOrderBook(Map<String, String> params) throws ParseException, FileNotFoundException, IOException {
		params.remove("TUID");
		GetApiMethod request = new GetApiMethod(POLONIEX_PUBIC_API_URL + GET_ORDER_BOOK_COMMAND);
		request.expectResponseStatus(HttpResponseStatusType.OK_200);
		JSONObject actual = (JSONObject) parser.parse(request.callAPI().asString());
		JSONObject expected = (JSONObject) parser
				.parse(new FileReader(ClassLoader.getSystemResource("OrderBook.json").getFile()));
		Assert.assertEquals(actual, expected, "Data is not valid!");

	}

	@Test(dataProvider = "SingleDataProvider")
	@XlsDataSourceParameters(path = "OrderBook.xls", sheet = "balances", dsUid = "TUID")
	public void getBalance(Map<String, String> params) throws ParseException, FileNotFoundException, IOException {
		params.remove("TUID");
		long millis = System.currentTimeMillis();
		final String nonce = "nonce=" + millis;
		PostApiMethod request = new PostApiMethod(
				POLONIEX_TRADING_API + KEY_HEADER + "&" + SECRET_HEADER + "&" + GET_BALANCE_COMMAND + "&" + nonce);
		request.expectResponseStatus(HttpResponseStatusType.OK_200);
		JSONObject actual = (JSONObject) parser.parse(request.callAPI().asString());
		JSONObject expected = (JSONObject) parser
				.parse(new FileReader(ClassLoader.getSystemResource("Balance.json").getFile()));
		Assert.assertEquals(actual, expected, "Data is not valid!");

	}

}
