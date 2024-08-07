import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomerTest {
    @Test
    public void addCustomer() {
        BrowserDrivers browserDrivers = new BrowserDrivers();
        WebDriver driver = browserDrivers.firefoxDriver();

        // znalezienie przycisku add customer
        driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
        //wprowadzenie danych id
        // imie
        driver.findElement(
                By.id("firstName")).sendKeys("Test");
        // nazwisko
        driver.findElement(
                By.id("last-name")).sendKeys("Testowy");
        // email
        driver.findElement(
                By.id("email")).sendKeys("testowy@testowy.com");
        // zatwierdzenie save
        driver.findElement(
                By.xpath("//button[text()='Save']")).click();
        // sprawdzenie czy customer istnieje
        Assert.assertTrue(
                driver.findElement(
                                By.xpath("//td[contains(text(),'Test')]"))
                        .isDisplayed());
        driver.quit();
    }
}
