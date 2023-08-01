package in.swiggyTest.teststep;

import org.openqa.selenium.chrome.ChromeDriver;

import in.swiggymain.pages.Food;
import in.swiggymain.pages.LandingPage;
import in.swiggymain.pages.Restaurant;
import in.swiggymain.pages.SignIn;

public class Driver  extends Tools{
	
	protected static LandingPage landingpage;
	protected static Restaurant restaurant;
	protected static Food food;
	protected static SignIn signin;
	
	public static void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		landingpage = new LandingPage(driver);
		restaurant = new Restaurant(driver);
		food = new Food(driver);
		signin = new SignIn(driver);
	}

}