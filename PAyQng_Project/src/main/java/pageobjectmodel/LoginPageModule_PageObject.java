package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageModule_PageObject {
@FindBy(id="username")	
public static WebElement username;
@FindBy(id="pass")
public static WebElement password;
@FindBy(id="linkadd")
public static WebElement clickonlogin;
}
