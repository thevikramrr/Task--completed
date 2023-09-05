package week6.day2;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Whatsapp {

	public static void main(String[]args) throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--start-maximized");
		ChromeDriver driver =new ChromeDriver(option);
		driver.get("https://web.whatsapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Link with phone number']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Type your phone number.']")).sendKeys("7200316091");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//span[@data-icon='menu'])[1]")).click();
		//click on new group
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='New group']")).click();
		//type mobile number
		Thread.sleep(8000);
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Type contact name']"));
		//ele.click();
		ele.sendKeys("Manoj Tleaf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder='Type contact name']/following::span)[3]")).click();
		//click on arrow icon
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@data-icon='arrow-forward']")).click();
		//enter the group name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@title,'Group Subject')]")).sendKeys("TestLeaf");
		//click on group arrow icon
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@data-icon='checkmark-medium']")).click();
		
		driver.findElement(By.xpath("//div[@title='Type a message']")).sendKeys("Hi");
		driver.findElement(By.xpath("//span[@data-icon='send']")).click();
//		driver.quit();
		
	}
}