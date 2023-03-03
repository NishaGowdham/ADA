package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.runner.Test_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	
	public static WebDriver driver;
	
	

@Given("^user Opening Adactin Application By Weblaunch$")
public void user_Opening_Adactin_Application_By_Weblaunch() throws Throwable {
	driver.get("https://adactinhotelapp.com/");
}

@When("^user Login By Using The User Details In Userid Field$")
public void user_Login_By_Using_The_User_Details_In_Userid_Field() throws Throwable {
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("NishaGowdham");
}

@When("^user Proviede Necessary Password In Password Field$")
public void user_Proviede_Necessary_Password_In_Password_Field() throws Throwable {
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("Goni*1816");
}

@Then("^user Click The Login Button$")
public void user_Click_The_Login_Button() throws Throwable {
	WebElement loginBtn = driver.findElement(By.name("login"));
	loginBtn.click();
}

@Given("^user Move On To The Search Hotel By Login$")
public void user_Move_On_To_The_Search_Hotel_By_Login() throws Throwable {
	driver.get("https://adactinhotelapp.com/SearchHotel.php");
}

@When("^select Location By Dropdown$")
public void select_Location_By_Dropdown() throws Throwable {
	WebElement location = driver.findElement(By.id("location"));
	String listValue="Sydney";
	location.selectByVisibleText(location);
	
}

@When("^select Hotel By Dropdown$")
public void select_Hotel_By_Dropdown() throws Throwable {
	driver.findElement(By.)
}

@When("^select Room Type By Dropdown$")
public void select_Room_Type_By_Dropdown() throws Throwable {
	driver.findElement(By.)
}

@When("^type Number Of Rooms By Dropdown$")
public void type_Number_Of_Rooms_By_Dropdown() throws Throwable {
	driver.findElement(By.)
}

@When("^type Checkin Date$")
public void type_Checkin_Date() throws Throwable {
	driver.findElement(By.)
	}

@When("^type Check Out Date$")
public void type_Check_Out_Date() throws Throwable {
	driver.findElement(By.)
}

@When("^type Adults Per Room$")
public void type_Adults_Per_Room() throws Throwable {
	driver.findElement(By.)
}

@When("^type Childrens Per Room$")
public void type_Childrens_Per_Room() throws Throwable {

	driver.findElement(By.)
	}

@Then("^sarch By Buutton$")
public void sarch_By_Buutton() throws Throwable {
}

@When("^user Opends The Select Hotel Page$")
public void user_Opends_The_Select_Hotel_Page() throws Throwable {
	driver.findElement(By.)
}

@When("^select The Hotel Name Location and all$")
public void select_The_Hotel_Name_Location_and_all() throws Throwable {
	driver.findElement(By.)
}

@Then("^click Continue$")
public void click_Continue() throws Throwable {

}

@When("^type Required Credentials in Book Hotel Page$")
public void type_Required_Credentials_in_Book_Hotel_Page() throws Throwable {
}

@When("^type Hote Name$")
public void type_Hote_Name() throws Throwable {
}

@When("^type Location$")
public void type_Location() throws Throwable {
}

@When("^select room Type$")
public void select_room_Type() throws Throwable {
}

@When("^type First Name$")
public void type_First_Name() throws Throwable {
}

@When("^type Billing$")
public void type_Billing() throws Throwable {
}

@When("^type card Details$")
public void type_card_Details() throws Throwable {
}

@Then("^select Book Now Button$")
public void select_Book_Now_Button() throws Throwable {
}

@When("^type The Hotel Name$")
public void type_The_Hotel_Name() throws Throwable {
}

@When("^type The Location$")
public void type_The_Location() throws Throwable {
}

@When("^type The Room Type$")
public void type_The_Room_Type() throws Throwable {
}

@When("^type The Order Number$")
public void type_The_Order_Number() throws Throwable {
}

@Then("^select The Logout Button$")
public void select_The_Logout_Button() throws Throwable {
}



	
}
