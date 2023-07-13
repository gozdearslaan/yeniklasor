import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
@VisibleForTesting
public class BaseTest {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }



























}
