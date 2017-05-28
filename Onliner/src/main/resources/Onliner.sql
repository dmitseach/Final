-- MySQL Script generated by MySQL Workbench
-- Sun May 28 02:08:19 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Brand`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Brand` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Card Type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Card Type` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Card type` ENUM('VISA', 'MASTERCARD') NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`Origin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Origin` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `Brand_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Origin_Brand1_idx` (`Brand_id` ASC),
  CONSTRAINT `fk_Origin_Brand1`
    FOREIGN KEY (`Brand_id`)
    REFERENCES `mydb`.`Brand` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`OS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`OS` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Display`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Display` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Year`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Year` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `year` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Phone`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Phone` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `model` VARCHAR(45) NOT NULL,
  `resolution` VARCHAR(45) NOT NULL,
  `Brand_id` INT UNSIGNED NOT NULL,
  `OS_id` INT NOT NULL,
  `Display_id` INT NOT NULL,
  `Year_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Phones_Brand1_idx` (`Brand_id` ASC),
  INDEX `fk_Phones_OS1_idx` (`OS_id` ASC),
  INDEX `fk_Phones_Display1_idx` (`Display_id` ASC),
  INDEX `fk_Phones_Year1_idx` (`Year_id` ASC),
  CONSTRAINT `fk_Phones_Brand1`
    FOREIGN KEY (`Brand_id`)
    REFERENCES `mydb`.`Brand` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Phones_OS1`
    FOREIGN KEY (`OS_id`)
    REFERENCES `mydb`.`OS` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Phones_Display1`
    FOREIGN KEY (`Display_id`)
    REFERENCES `mydb`.`Display` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Phones_Year1`
    FOREIGN KEY (`Year_id`)
    REFERENCES `mydb`.`Year` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Colour`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Colour` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `colour` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`CoolSyst`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CoolSyst` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ConstrType`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ConstrType` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Fridge`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Fridge` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `model` VARCHAR(45) NOT NULL,
  `Brand_id` INT UNSIGNED NOT NULL,
  `Colour_id` INT NOT NULL,
  `CoolSyst_id` INT NOT NULL,
  `ConstrType_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Fridges_Brand1_idx` (`Brand_id` ASC),
  INDEX `fk_Fridges_Colour1_idx` (`Colour_id` ASC),
  INDEX `fk_Fridges_ConstrType1_idx` (`CoolSyst_id` ASC),
  INDEX `fk_Fridges_ConstrType2_idx` (`ConstrType_id` ASC),
  CONSTRAINT `fk_Fridges_Brand1`
    FOREIGN KEY (`Brand_id`)
    REFERENCES `mydb`.`Brand` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Fridges_Colour1`
    FOREIGN KEY (`Colour_id`)
    REFERENCES `mydb`.`Colour` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Fridges_ConstrType1`
    FOREIGN KEY (`CoolSyst_id`)
    REFERENCES `mydb`.`CoolSyst` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Fridges_ConstrType2`
    FOREIGN KEY (`ConstrType_id`)
    REFERENCES `mydb`.`ConstrType` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO Brand (name) VALUES ('Samsung'), ('Daewoo'), ('LG');
INSERT INTO Colour (colour) VALUES ('серебристый');
INSERT INTO CoolSyst (type) VALUES ('полный No Frost');
INSERT INTO ConstrType (type) VALUES ('side by side');
INSERT INTO Fridge (model, Brand_id, Colour_id, CoolSyst_id, ConstrType_id) VALUES ('RS57K4000SA', 1, 1, 1, 1);
INSERT INTO Fridge (model, Brand_id, Colour_id, CoolSyst_id, ConstrType_id) VALUES ('FRS-2021 IAL', 2, 1, 1, 1);
INSERT INTO OS (name) VALUES ('Android');
INSERT INtO Display (type) VALUES ('AMOLED');
INSERT INTO Year (year) VALUES ('2017');
INSERT INTO Phone(model, resolution, Brand_id, OS_id, Display_id, Year_id) VALUES ('Galaxy A5', '1080x1920', 1, 1, 1, 1);