package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver drv;
	
	@Given("i  launch the browser with URL {string}")
	public void i_launch_the_browser_with_url(String url) {
		drv= new ChromeDriver();
		drv.get(url);
		drv.manage().window().maximize();
	}
	
	@Then("i should see the login page")
	public void i_should_see_the_login_page() {
	    if(drv.findElement(By.linkText("I forgot my password")).isDisplayed());
	    {
	     System.out.println("Login page is displayed");
	     }
	    }
	
	@When("i enter  email as {string}")
	public void i_enter_email_as(String email) {
	     
		drv.findElement(By.name("email")).sendKeys(email);
	}
	
	@When("i enter  password as {string}")
	public void i_enter_password_as(String pass) {
	    
		drv.findElement(By.name("password")).sendKeys(pass);
	}
	
	@When("i  click on login button")
	public void i_click_on_login_button() {
	 
		drv.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[3]/div[2]/button")).click();
	}
	
	@Then("i should see the  user dashboard")
	public void i_should_see_the_user_dashboard() {
	     if(drv.findElement(By.xpath("//*[@id=\"contact-info\"]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/label")).isDisplayed())
	     {
	    	 System.out.println("Login is Successful");
	     }
	}
	
	@When("i click Logout")
	public void i_click_logout() {
	   
		drv.findElement(By.xpath("//a[@class='dropdown-toggle after_login']")).click();
		drv.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[3]/ul/li[2]/div/ul/li[5]/a")).click();
	}
	
	@When("I close the browser")
	public void i_close_the_browser() {
		drv.quit();
	}
	
	
	@Given("I will open the browser with URL {string}")
	public void i_will_open_the_browser_with_url(String url) {
	drv = new ChromeDriver();
	 drv.get(url);
	 drv.manage().window().maximize();
	}
	@Then("I  should see the resgister option")
	public void i_should_see_the_resgister_option() {
	    
		if(drv.findElement(By.linkText("Register")).isDisplayed())
		{
			System.out.println("Register option displayed");

		}
		
	}
	
	@When("I click on Register")
	public void i_click_on_register() {
		drv.findElement(By.linkText("Register")).click();
	}
	
	@Then("I should see the Sign up page for register")
	public void i_should_see_the_sign_up_page_for_register() {
	    String Exp="register";
	    String Act=drv.getCurrentUrl();
	    if(Act.contains(Exp))
	    {
	    	System.out.println("Register form displayed");
	    }
	}
	@When("I want to enter the usere name as {string}")
	public void i_want_to_enter_the_usere_name_as(String user) {
	  drv.findElement(By.id("name")).sendKeys(user);
		
	}
	@When("I want to enter the mobile number {string}")
	public void i_want_to_enter_the_mobile_number(String num) {
	    drv.findElement(By.id("contact")).sendKeys(num);
	}
	@When("I want to add the email id as {string}")
	public void i_want_to_add_the_email_id_as(String email) {
	   drv.findElement(By.name("email")).sendKeys(email);
	}
	@When("I want to  add password as {string}")
	public void i_want_to_add_password_as(String pass) {
	    drv.findElement(By.name("password")).sendKeys(pass);
	}
	@When("I want to select gender as {string}")
	public void i_want_to_select_gender_as(String gen) {
	      
	    Select sel =new Select(drv.findElement(By.xpath("//*[@id=\"identicalForm\"]/div[3]/div[1]/select")));
	    sel.selectByVisibleText(gen);
	 }
@When("I want to add date as {string}")
	public void i_want_to_add_date_as(String date) {
	  drv.findElement(By.name("dob")).sendKeys(date);
	}
	@When("I want to click on privacy policy")
	public void i_want_to_click_on_privacy_policy() {
	   drv.findElement(By.id("flexCheckChecked")).click();
	}
	
	@When("I click on Register in Register page")
	public void i_click_on_register_in_register_page() {
	    
		drv.findElement(By.name("submit")).click();

	}
	
	@Then("I should see the Register Sccessfull message")
	public void i_should_see_the_register_sccessfull_message() {
	   
		String Exp ="success";
		String Act=drv.getCurrentUrl();
		if(Act.contains(Exp))
		{
			System.out.println("Login Success");
		}
	}
	



	



	
	



}
