import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class MidtermTest {

	@Test
	void TestMidterm() throws Exception {
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("นวพร");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("บุญก่อน");
		
//		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"vfb-31-1\"]"));
//		radio1.click();
		
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("บ้านเลขที่ 100/150  ตำบลลำพยา อำเภอเมือง");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("เกษมเพชร");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("ทาวน์เฮ้าส์");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("ภาคกลาง");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("นครปฐม");
		
		
//		Select option1 = new Select(driver.findElement(By.xpath("//*[@id=\"select2-vfb-13-country-container\"]")));
//		option1.selectByVisibleText("Thailand");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("644259018@webmail.npru.ac.th");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys("02/08/2023");
		
		
//		Select option2 = new Select(driver.findElement(By.xpath("//*[@id=\"select2-vfb-16-hour-container\"]")));
//		option2.selectByVisibleText("08");
//		
//		Select option3 = new Select(driver.findElement(By.xpath("//*[@id=\"select2-vfb-16-min-container\"]")));
//		option3.selectByVisibleText("55");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("0928811045");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-20-0\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"vfb-20-1\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-20-3\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-20-4\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-20-5\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("อยากรวยต้องทำยังไง");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("123");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
		
		
		
		
		
		

		String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();
		assertEquals("Dynamic Transaction Verification", result);
		
		String title = driver.getTitle();
		System.out.println(title);

		Thread.sleep(5000);
		driver.quit();
	}

}
