import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{


    By searchBoxLocator = By.xpath("//input[@class='default-input o-header__search--input']");



    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search() {
      // click(searchBoxLocator);

        driver.findElement(By.xpath("//input[@class='default-input o-header__search--input']")).sendKeys("Pantolon", Keys.ENTER);



    }
}