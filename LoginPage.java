package org.Testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//creating class
public class LoginPage
{
    //main method
    public static void main(String[] args)
    {
        //driver launch
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");//launching the browser
        driver.findElement(By.id("user-name")).sendKeys("standard_user");//sending username
        driver.findElement(By.id("password")).sendKeys("secret_sauce");//sending password
        driver.findElement(By.id("login-button")).click();//clicking login button
    }
}
