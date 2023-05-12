package com.demo.nopcommerce.Pages;

import com.demo.nopcommerce.Utilities.Utils;
import com.demo.nopcommerce.Utilities.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;

    By registerLink = By.className("ico-register");
    By gender = By.id("gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dateofBirth = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    By dateOfBirthMonth = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    By dateOfBirthYear = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
    By email = By.xpath("//*[@id=\"Email\"]");
    By companyName = By.id("Company");
    By password = By.xpath("//*[@id=\"Password\"]");
    By confirmPassword = By.xpath("//*[@id=\"ConfirmPassword\"]");
    By registerButton = By.xpath("//*[@id=\"register-button\"]");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);

    }
    public void clickOnRegisterLink(){
        utils.doClick(registerLink);
    }

    public String getPageTitle(){
        return utils.waitForTitlePresent(5, Constant.REGISTER_PAGE_TITLE);
    }
        public void doRegister(String Gender,String FirstName,String Lastname,String DateOfBirthDay,String DateOfBirthMonth,String DateOfBirthYear,String Email,String CompanyName,String Password,String ConfirmPassword) throws InterruptedException {
            {
                utils.doSendKey(gender, Gender);
                utils.doSendKey(firstName, FirstName);
                utils.doSendKey(lastName, Lastname);
                utils.doSendKey(dateofBirth, DateOfBirthDay);
                utils.doSendKey(dateOfBirthMonth,DateOfBirthMonth);
                utils.doSendKey(dateOfBirthYear,DateOfBirthYear);
                utils.doSendKey(email,Email);
                utils.doSendKey(companyName,CompanyName);
                utils.doSendKey(password,Password);
                utils.doSendKey(confirmPassword,ConfirmPassword);
                utils.doClick(registerButton);





            }
        }
}