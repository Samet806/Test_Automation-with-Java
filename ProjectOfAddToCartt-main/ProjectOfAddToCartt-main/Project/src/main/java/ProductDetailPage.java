import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductDetailPage extends BasePage {

    By addToCartButtonLocator = By.id("addBasket");
    By sizeLocator = By.xpath("//span[@class='m-variation__item']");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() {
        getAllSizes().get(1).click();
        click(addToCartButtonLocator);
    }

    private List<WebElement> getAllSizes() {
        return findAll(sizeLocator);
    }

    public void compareOfPrice() {
        String price1 = driver.findElement(By.xpath("//ins[@class='m-price__new']")).getText();
        String price2 = driver.findElement(By.xpath("//span[@class='m-productPrice__salePrice']")).getText();
        if (price1.equalsIgnoreCase(price2)) {
            System.out.println("The Price1 value is same as Price2  ");
        } else {
            System.out.println("The Price1 value is not same as Price2  ");
        }
    }


}