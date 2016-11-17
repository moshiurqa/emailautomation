package login;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Login_Gmail1 {
public static void main(String[] args) {
// Create a new instance of the Firefox driver
WebDriver driver = new FirefoxDriver();
//  Wait For Page To Load
// Put a Implicit wait, this means that any search for elements on the page
//could take the time the implicit wait is set for before throwing exception 

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Navigate to URL
driver.get("https://mail.google.com/");
// Maximize the window.
driver.manage().window().maximize();
// Enter UserName
driver.findElement(By.id("Email")).sendKeys("intuitdemo80");
driver.findElement(By.id("next")).click();
// Enter Password
driver.findElement(By.id("Passwd")).sendKeys("intuit101");
// Wait For Page To Load
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
// Click on 'Sign In' button
driver.findElement(By.id("signIn")).click();
//Close the browser.
driver.close();
}
}