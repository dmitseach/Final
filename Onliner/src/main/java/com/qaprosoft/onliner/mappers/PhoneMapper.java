package com.qaprosoft.onliner.mappers;

import java.util.List;

import com.qaprosoft.onliner.objects.Phone;

public interface PhoneMapper {

	Phone getPhoneById(Integer id);

	List<Phone> getAllPhones();

}
