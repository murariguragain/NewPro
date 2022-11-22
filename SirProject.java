package newProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SirProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/murariguragain/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qatest.commentsoldrt.com/webstore-login?destination=/account");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("guragainmp1@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Automation2038");
		driver.findElement(By.xpath("//*[@id=\"login-section\"]/form/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"vue-app-account\"]/div/header/div/div/div[3]/a[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class=\"absolute top-2 right-2\"])")).click();
		driver.findElement(By.xpath(
				"(//a[@class=\"text-nav lg:text-nav-lg inline-block my-4 border-transparent hover:border-current uppercase\"])[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[alt='Product\\: Velvet Duvet Cover']")).click();
		driver.findElement(By.xpath("(//label[@class=\"absolute inset-0 z-20 opacity-0 cursor-pointer\"])[1]")).click();
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		driver.findElement(By.xpath("(//a[@tabindex=\"0\"])[3]")).click();
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("one")).click();

		driver.findElement(By.xpath("//*[@id=\"variantListings\"]/div/div/div/div[2]/div/div[2]/input")).click();
		 driver.findElement(By.xpath("//*[@id=\"variantListings\"]/div/div/div/div[2]/div/div[2]/input")).sendKeys("123 tylor Dr");
		driver.findElement(By.id("locality")).click();
		driver.findElement(By.id("locality")).sendKeys("Lexington");
		WebElement w = driver.findElement(By.name("state"));
		Select sel = new Select(w);
		sel.selectByValue("KY");
		driver.findElement(By.xpath("(//input[@class=\"default-input\"])[6]")).sendKeys("45654");
		driver.findElement(By.id("save-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(@for, 'credit-card')]")).click();

		WebElement card = driver.findElement(By.cssSelector("iframe[title=\"Secure card payment input frame\"]"));
		driver.switchTo().frame(card);
		// driver.findElement(By.cssSelector("[class=\"form-row\"]")).click();
		driver.findElement(By.name("cardnumber")).sendKeys("4242 4242 4242 4242");
		driver.findElement(By.name("cardnumber")).sendKeys("09/24");
		driver.findElement(By.name("cvc")).sendKeys("111");
		driver.findElement(By.name("postal")).sendKeys("45654");
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		driver.findElement(By.id("stripe-button")).click();
		driver.findElement(By.xpath("(//button[@class=\"_pill-button\"])[4]")).click();
		driver.findElement(By.cssSelector("[class=\"default-input coupon-input\"]")).sendKeys("5OFF20");
		driver.findElement(By.cssSelector("[id=\"save-button\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("[class=\"_cta-button\"]")).click();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("[class=\"webstore-checkout-btn\"]")).click();
		driver.findElement(By.cssSelector("[class=\"icon-account w-6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vue-app-account\"]/div/div[2]/section/div/div[2]/div[2]/div[6]/span"))
				.click();

	}
}
