package PagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundColorClass {
	WebDriver driver;

	public BackgroundColorClass(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionSky()']")
	WebElement SkyBlueBackground_Element;
	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionWhite()']")
	WebElement WhiteBackground_Element;

	public void clickSkyBlueBlackgroundButton() {
		// SkyBlueBackground_Element.click();
		try {

			Thread.sleep(1000);
			SkyBlueBackground_Element.click();

		} catch (InterruptedException e) {
			System.out.println(SkyBlueBackground_Element);
			e.printStackTrace();
		}

	}

	public void clickWhiteeBlackgroundButton() {
//		WhiteBackground_Element.click();

		try {

			Thread.sleep(1000);
			WhiteBackground_Element.click();

		} catch (InterruptedException e) {
			System.out.println(WhiteBackground_Element);
			e.printStackTrace();
		}

	}
}

//button[@onclick="check_security('wlan1security_div0')"]
