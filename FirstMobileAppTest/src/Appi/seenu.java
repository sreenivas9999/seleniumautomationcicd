/**
 * 
 */
/**
 * @author Srinivas
 *
 */
package Appi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class seenu {
	public WebDriver driver;
	@BeforeMethod
	public void setup(){
		DesiredCapabilities Capabilities = 
	}
	@Test
	public void Gm1() {
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//*[@id='view_container']/div/div[2]/div/div[2]/div[2]/div/div/content/span")).click();
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("sreenivas");
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("add");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sreenivasssssssssss");
		driver.findElement(By.xpath("//*[@id='passwd']/div[1]/div/div[1]/input")).sendKeys("Venkateswara@9");
		driver.findElement(By.xpath("//*[@id='confirm-passwd']/div[1]/div/div[1]/input")).sendKeys("Venkateswara@9");
		//driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		//driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Venkateswara@9");
		driver.findElement(By.xpath("//*[@id='accountDetailsNext']/content/span")).click();
		//driver.findElement(By.xpath("//*[@id='phoneNumberId']")).sendKeys("9259643267");
		//driver.findElement(By.xpath("//*[@id='gradsIdvPhoneNext']/content/span")).click();
	}
