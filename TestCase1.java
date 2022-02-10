package week2.day1.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Dhana");
		driver.findElement(By.id("lastNameField")).sendKeys("sekar");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}
}