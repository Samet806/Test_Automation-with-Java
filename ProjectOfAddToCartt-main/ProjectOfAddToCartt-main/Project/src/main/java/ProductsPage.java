import org.openqa.selenium.*;

import java.util.List;

public class ProductsPage extends BasePage {

    By shippingOptionLocator = By.id("productFilterOpenButton");
    By productNameLocator =  By.xpath("//div[@class='col-sm-4 col-md-4 col-lg-4 o-productList__itemWrapper']");
    By scrollLocator=By.id("moreContentButton");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(shippingOptionLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }

    public void scroll() {
        //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        //click(scrollLocator);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       click(scrollLocator);
    }
}