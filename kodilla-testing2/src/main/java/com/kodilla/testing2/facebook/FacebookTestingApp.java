package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    static final String XPATH_SELECT_DAY_BIRTHDAY = "//span[contains(@class,\"_5k_4\")]/span/select[1]";
    static final String XPATH_SELECT_MONTH_BIRTHDAY="//span[contains(@class,\"_5k_4\")]/span/select[2]";
    static final String XPATH_SELECT_YEAR_BIRTHDAY="//span[contains(@class,\"_5k_4\")]/span/select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY_BIRTHDAY));
        Select selectDayBirthday = new Select(selectCombo);
        selectDayBirthday.selectByIndex(2);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT_MONTH_BIRTHDAY));
        Select selectMonthBirthday = new Select(selectCombo2);
        selectMonthBirthday.selectByIndex(1);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_SELECT_YEAR_BIRTHDAY));
        Select selectYearBirthday = new Select(selectCombo3);
        selectYearBirthday.selectByIndex(20);

    }



}
