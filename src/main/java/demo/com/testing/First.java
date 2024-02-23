package demo.com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Pratice From Start\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html#");
		
		driver.manage().window().maximize();
		
		WebDriverWait nw = new WebDriverWait(driver,60);
		nw.until(ExpectedConditions.elementToBeSelected(By.xpath("//a[contains(text(), '6')]")));
		
		
		List<WebElement> li = driver.findElements(By.xpath("//a[contains(text(), '6')]"));
		System.out.println(li.size());

	}

}
