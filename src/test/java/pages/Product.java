// 1 - Pacote
package pages;

// 2 - Bibliotecas
import general.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// 3 - Classe
public class Product extends Base {

    // 3.1 - Mapeamentos

    @FindBy(css = "div.col-md-7.prod-info:nth-child(6) > h1:nth-child(1)")
    private WebElement productTitle;

    @FindBy(css = "div.price-current")
    private WebElement productPrice;

    // 3.2 - Construtor
    public Product(WebDriver driver) {
        super(driver);
    }

    // 3.3 - Métodos e Funções baseados no Mapeamento

    // Ler o titulo da guia
    public String readTitleTab(){
        return driver.getTitle();
    }

    // Ler o nome do produto
    public String readProductTitle(){
        return productTitle.getText();
    }

    // Ler o preço do produto
    public String readProductPrice(){
        return productPrice.getText();
    }


}
