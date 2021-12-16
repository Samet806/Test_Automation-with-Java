import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartPage extends BasePage {

    By productNameLocator = new By.ByCssSelector("span.m-basket__productInfoName ");

    By productLocator = By.id("quantitySelect0");
    By productNumberLocator = By.xpath("//option[@value='2']");
    By removeLocator = By.id("removeCartItemBtn0");
    By cartCountLocator = By.xpath("//span[@class='o-header__userInfo--count']");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size() > 0;
    }

    private List<WebElement> getProducts() {
        return findAll(productNameLocator);
    }

    public void increase() {
        click(productLocator);
        click(productNumberLocator);
    }

    public void remove() {
        click(removeLocator);

    }


}