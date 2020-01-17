import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
public class AmazonTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		String url;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sugar");
		WebElement button=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
		button.click();
		WebElement button2=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/span/a/div/img"));
		button2.click();
		Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nan pro");
		WebElement button3=driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
		button3.click();
        WebElement button4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/span/a/div/img"));
		button4.click();
		Set<String> ids2 = driver.getWindowHandles();
        Iterator<String> it2 = ids2.iterator();
        String parentId2 = it2.next();
        String childId2 = it2.next();
        String childId3 = it2.next();
        driver.switchTo().window(childId3);
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tshirt for men");
		WebElement button5=driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
		button5.click();
        WebElement button6=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[5]/div/span/div/div/span/a/div/img"));
		button6.click();
		Set<String> ids3 = driver.getWindowHandles();
        Iterator<String> it3 = ids3.iterator();
        String parentId3 = it3.next();
        String childId4 = it3.next();
        String childId5 = it3.next();
        String childId6 = it3.next();
        driver.switchTo().window(childId6);
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phone");
		WebElement button7=driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
		button7.click();
        WebElement button8=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/span/a/div/img"));
		button8.click();
		Set<String> ids4 = driver.getWindowHandles();
        Iterator<String> it4 = ids4.iterator();
        String parentId4 = it4.next();
        String childId7 = it4.next();
        String childId8 = it4.next();
        String childId9 = it4.next();
        String childId10 = it4.next();
        driver.switchTo().window(childId10);
        driver.findElement(By.id("add-to-cart-button")).click();
        WebElement button9=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[4]/div/div/div/span[1]/span/span/a"));
		button9.click();
		String product1=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[5]/div/div[2]/div[2]/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span")).getText();
		String product2=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[5]/div/div[2]/div[2]/form/div[2]/div[4]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span")).getText();
		String product3=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[5]/div/div[2]/div[2]/form/div[2]/div[5]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span")).getText();
		String product4=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[5]/div/div[2]/div[2]/form/div[2]/div[6]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span")).getText();
		String total=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[5]/div/div[1]/div[2]/form/div[3]/div[2]/div/div[1]/span/span[2]/span/span")).getText();
		System.out.println(product1+"\n"+product2+"\n"+product3+"\n"+product4+"\n"+total);
		
	}	
}