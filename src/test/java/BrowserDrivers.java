import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDrivers {
    public WebDriver firefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver firefoxBrowser = new FirefoxDriver();
        firefoxBrowser.manage().window().maximize();
        firefoxBrowser.get("http://localhost:4200");
        return firefoxBrowser;
    }

    public void chromeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.manage().window().maximize();
        chromeBrowser.get("http://localhost:4200");
    }
}
