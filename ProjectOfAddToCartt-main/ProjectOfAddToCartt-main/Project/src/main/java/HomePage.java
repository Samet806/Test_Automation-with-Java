import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    SearchBox searchBox;
    By cartCountLocator = By.xpath("//span[@class='o-header__userInfo--count']");
    //By cartContainerLocator = By.id("nav-cart-count-container");
    By acceptCookiesLocator = By.id("onetrust-accept-btn-handler");


    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }



    public void goToCart() {
        click(cartCountLocator);
    }

    private int getCartCount() {
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies() {
        if (isDisplayed(acceptCookiesLocator)) {
            click(acceptCookiesLocator);
        }


    }


}