import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterTestPage {

    WebDriver driver;
    BasePage basePage;
    Properties prop = new Properties();
    RegisterPage registerPage;
    @BeforeMethod
    public void  openBrowser(){
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);
    }

    @Test
    public  void RegisterTest() throws InterruptedException {
        registerPage.clickOnRegisterLink();
        registerPage.getPageTitle();
        registerPage.doRegister(prop.getProperty("gender"),prop.getProperty("firstname"),prop.getProperty("lastname"),prop.getProperty("dateofbirth"),prop.getProperty("dateofbirthmonth"),prop.getProperty("dateofbirthyear"),prop.getProperty("email"),prop.getProperty("companyname"),prop.getProperty("password"),prop.getProperty("confirmpassword"));


    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
