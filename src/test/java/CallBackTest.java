import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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
        driver.get("http://localhost:5555/");

    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test

    public void shouldSendForm() {


        driver.findElement(By.cssSelector(".input__control[type='text']")).sendKeys("Иванов Константин");
        driver.findElement(By.cssSelector(".input__control[type='tel']")).sendKeys("+79146865959");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);

    }

    @Test

    public void shouldSendForm1() {

        driver.findElement(By.cssSelector(".input__control[type='text']")).sendKeys("Иванова-Петрова Ирина");
        driver.findElement(By.cssSelector(".input__control[type='tel']")).sendKeys("+79876543210");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);
    }

    @Test

    public void shouldSendForm2() {
        driver.findElement(By.cssSelector(".input__control[type='text']")).sendKeys("Андрей О");
        driver.findElement(By.cssSelector(".input__control[type='tel']")).sendKeys("+79146865959");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);
    }

    @Test

    public void shouldSendForm3() {
        driver.findElement(By.cssSelector(".input__control[type='text']")).sendKeys("Константинов Константин");
        driver.findElement(By.cssSelector(".input__control[type='tel']")).sendKeys("+79146865959");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);
    }

    @Test

    public void shouldSendForm4() {
        driver.findElement(By.cssSelector(".input__control[type='text']")).sendKeys("О Ян");
        driver.findElement(By.cssSelector(".input__control[type='tel']")).sendKeys("+79146865959");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);
    }

    @Test

    public void shouldSendForm5() {
        driver.findElement(By.cssSelector(".input__control[type='text']")).sendKeys("Константинов-Поликарпов Константин");
        driver.findElement(By.cssSelector(".input__control[type='tel']")).sendKeys("+77777777777");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String actualText = driver.findElement(By.cssSelector(".paragraph[data-test-id='order-success']")).getText();
        String expectedText = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        assertEquals(expectedText, actualText);


    }
}