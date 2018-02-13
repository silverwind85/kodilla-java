package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertTrue;

public class CrudAppTestSuite {

    static final String BASE_URL = "https://silverwind85.github.io";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleandUpAfterTest(){
        driver.close();
    }

    public String testAddTask() throws InterruptedException {
        final String XPATH_NAME = "//form[contains(@class,\"datatable__row datatable__row--add\")]/fieldset[1]/input";
        final String XPATH_CONTENT = "//form[contains(@class,\"datatable__row datatable__row--add\")]/fieldset[2]/textarea";
        final String XPATH_BUTTON = "//form[contains(@class,\"datatable__row datatable__row--add\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        //Given
        WebElement searchNameInput = driver.findElement(By.xpath(XPATH_NAME));
        searchNameInput.sendKeys(taskName);

        WebElement searchContentInput = driver.findElement(By.xpath(XPATH_CONTENT));
        searchContentInput.sendKeys(taskContent);

        WebElement searchSubmitButton = driver.findElement(By.xpath(XPATH_BUTTON));
        searchSubmitButton.click();

        Thread.sleep(2000);
        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theFrom -> {
                    WebElement selectElement = theFrom.findElement(By.xpath(".//select[1]"));
                    Select select = new Select((selectElement));
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theFrom.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();

                });
        Thread.sleep(5000);

    }


    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("slcieslar@gmail.com");
        driverTrello.findElement(By.id("password")).sendKeys("Cyber@1985");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Application\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span"))
                .stream()
                .filter(span -> span.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;
        driverTrello.close();

        return result;
    }


    private boolean testDeleteTask(String taskName) throws InterruptedException {
        boolean result = false;
        driver.switchTo().alert().accept();
        driver.navigate().refresh();
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;
        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(f -> f.findElement(By.xpath(".//button[4]")).click());
                /*.filter(delete->delete.findElement(By.xpath(".//button")).getText().contains("Delete")).forEach(delete->delete.click());*/

        Thread.sleep(2000);

        result = driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .collect(Collectors.toList())
                .size() == 0;

        return result;
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {

        String taskName = testAddTask();
        sendTestTaskToTrello(taskName);
        /*assertTrue(checkTaskExistsInTrello(taskName));*/
        assertTrue(testDeleteTask(taskName));


    }


}

