import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class CallBackTest {
    private WebDriver driver;


    @BeforeAll
    static void setupClass() {

        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }


    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test

    public void shouldSendForm() {

        driver.get("http://localhost:5555/");
        driver.findElement(By.cssSelector("[data-test-id='name'] input")).sendKeys("Иванов Константин");
        driver.findElement(By.cssSelector("[data-test-id='phone'] input")).sendKeys("+79146865959");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);

    }

    @Test

    public void shouldSendForm1() {
        driver.get("http://localhost:5555/");

        driver.findElement(By.cssSelector("[data-test-id='name'] input")).sendKeys("Иванова-Петрова Ирина");
        driver.findElement(By.cssSelector("[data-test-id='phone'] input")).sendKeys("+79876543210");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);
    }

    @Test

    public void shouldSendForm2() {
        driver.get("http://localhost:5555/");
        driver.findElement(By.cssSelector("[data-test-id='name'] input")).sendKeys("Андрей О");
        driver.findElement(By.cssSelector("[data-test-id='phone'] input")).sendKeys("+79146865959");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);
    }

    @Test

    public void shouldSendForm3() {
        driver.get("http://localhost:5555/");
        driver.findElement(By.cssSelector("[data-test-id='name'] input")).sendKeys("Константинов Константин");
        driver.findElement(By.cssSelector("[data-test-id='phone'] input")).sendKeys("+79146865959");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);
    }

    @Test

    public void shouldSendForm4() {
        driver.get("http://localhost:5555/");
        driver.findElement(By.cssSelector("[data-test-id='name'] input")).sendKeys("О Ян");
        driver.findElement(By.cssSelector("[data-test-id='phone'] input")).sendKeys("+79146865959");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);
    }

    @Test

    public void shouldSendForm5() {
        driver.get("http://localhost:5555/");
        driver.findElement(By.cssSelector("[data-test-id='name'] input")).sendKeys("Константинов-Поликарпов Константин");
        driver.findElement(By.cssSelector("[data-test-id='phone'] input")).sendKeys("+77777777777");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);


    }
}