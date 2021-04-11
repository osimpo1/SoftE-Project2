package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
    public static void main(String[] args) {
    	 // declaration and instantiation of objects/variables  
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\oseis\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();  
          
    // Launch website  
        driver.navigate().to("https://findmymoviepro.herokuapp.com/");  
              
        // Click on the search text box and send value  
        driver.findElement(By.id("autoComplete")).sendKeys("Batman returns");  
              
        // Click on the search button  
        driver.findElement(By.name("searchie")).click();  
        
    }

}
