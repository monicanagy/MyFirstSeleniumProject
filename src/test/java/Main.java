import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        loginTest();
        invalidLoginTest();
        RegisterTest();

    }
    public static void loginTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/customer/account/index/");

        WebElement accountLink= driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountLink.click();

        //WebElement loginLink= driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        //loginLink.click();

        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();

        driver.findElement(By.cssSelector("#email")).sendKeys("monica.nagy1986@gmail.com");

        driver.findElement(By.cssSelector("#pass")).sendKeys("Nightwish1900");

        driver.findElement(By.cssSelector("#send2 > span > span")).click();

        driver.close();
    }
    public static void invalidLoginTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/customer/account/index/");

        WebElement accountLink= driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountLink.click();

        //WebElement loginLink= driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        //loginLink.click();

        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();

        driver.findElement(By.cssSelector("#email")).sendKeys("monica.nagy1986@gmail.com");

        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");

        driver.findElement(By.cssSelector("#send2 > span > span")).click();

        driver.close();
    }
    public static void RegisterTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/customer/account/index/");

        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();

        driver.findElement(By.cssSelector("#firstname")).sendKeys("Maria Ioana");

        driver.findElement(By.cssSelector("#middlename")).sendKeys("Ionescu");

        driver.findElement(By.cssSelector("#email_address")).sendKeys("mariaioana@yahoo.com");

        driver.findElement(By.cssSelector("#password")).sendKeys("abcde");

        driver.findElement(By.cssSelector("#confirmation")).sendKeys("abcde");

        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();

        driver.close();



    }
}




