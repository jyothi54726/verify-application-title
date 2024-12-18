package verifyTitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyTitle {

	public static String url="http://1883.82.125.5/nareshit/login.php";
	public static String un="nareshit";
	public static String pw="nareshit";
	public static String title1="OrangeHRM-New Level of HR Management";
	
	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to(url);
		if(driver.getTitle().equals(title1)) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched and expected title is "+driver.getTitle());
		}
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pw);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		driver.close();
	}
}
