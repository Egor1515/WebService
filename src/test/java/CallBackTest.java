import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CallBackTest {
    private WebDriver driver;

    @BeforeAll
    public static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "./driver/windows/chromedriver.exe");
    }

    @BeforeEach
        public void setUp() {

        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

    }

    @AfterEach
    public void tearDown() {

        driver.quit();
        driver = null;
    }

    @Test

    public void shouldSendForm() {
        driver.get("http://localhost:9999/");
        List<WebElement> textFields = driver.findElements(By.className("input__control"));
        textFields.get(0).sendKeys("Иван");
        textFields.get(1).sendKeys("89146865959");
        driver.findElement(By.className("checkbox__control")).click();
        driver.findElement(By.tagName("button")).click();
        String actualText = driver.findElement(By.className("aller-success")).getText();
        String expectedText = "Ваша заявка успешно отправлена!";
        assertEquals(expectedText, actualText);

    }


}
