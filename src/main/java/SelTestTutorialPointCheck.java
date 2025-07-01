import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelTestTutorialPointCheck {

    private WebDriver ovladac;

        @BeforeEach
        public void setUp(){
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\seven\\IdeaProjects\\SeleniumSkillmea\\src\\main\\resources\\chromedriver.exe");
            //ovladac = new ChromeDriver();

            WebDriverManager.firefoxdriver().setup();
            ovladac = new FirefoxDriver();
        }

        @AfterEach
        public void tearDown(){
            ovladac.quit();
        }

        @Test
        public void checkBoxTest(){

            ovladac.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
            ovladac.findElement(By.xpath("//*[@id=\"bs_1\"]/span[1]")).click();

            ovladac.findElement(By.id("c_bf_1")).click();
            ovladac.findElement(By.id("c_bf_2")).click();
            assertTrue(ovladac.findElement(By.id("c_bs_1")).isSelected());
            ovladac.findElement(By.id("c_bf_1")).click();
            assertFalse(ovladac.findElement(By.id("c_bs_1")).isSelected());


        }

}
