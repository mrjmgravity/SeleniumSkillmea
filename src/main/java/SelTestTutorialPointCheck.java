import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTestTutorialPointCheck {

    private WebDriver ovladac;

        @BeforeEach
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\seven\\IdeaProjects\\SeleniumSkillmea\\src\\main\\resources\\chromedriver.exe");
            ovladac = new ChromeDriver();
        }

        @AfterEach
        public void tearDown(){
            ovladac.quit();
        }

        @Test
        public void checkBoxTest(){

            ovladac.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");


        }

}
