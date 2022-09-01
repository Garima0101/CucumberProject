package steps;

import org.openqa.selenium.support.PageFactory;
import PagesPackage.BackgroundColorClass;
import PagesPackage.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundColorSteps extends BaseClass {
	BackgroundColorClass bgcolor;

	@Before
	public void method() {
		initDriver();
		bgcolor = PageFactory.initElements(driver, BackgroundColorClass.class);
	}

	@Given("^User enter url\"([^\"]*)\"$")
	public void user_enter_url(String URL) throws Throwable {
		driver.get(URL);

	}

	@And("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() throws Throwable {
		System.out.println("Set to Blue Background");
	}

	@When("^I click on Set Sky Blue Background button")
	public void i_click_on_the_button() {
		bgcolor.clickSkyBlueBlackgroundButton();

	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		System.out.println("Background Color changed  to Blue ");
	}

	@And("^Set SkyWhite Background button exists")
	public void set_SkyWhite_Background_button_exists$() throws Throwable {
		System.out.println("Set to White Background");
	}

	@When("^I click on Set White Background button$")
	public void i_click_on_Set_White_Background_button() throws Throwable {

		bgcolor.clickWhiteeBlackgroundButton();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		System.out.println("Background Color changed  to White ");
	}

	@After
	public void tearDown() {
		driver.close();

	}

}
