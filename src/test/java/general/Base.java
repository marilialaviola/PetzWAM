// 1 - Pacote
package general;

// 2 - Bibliotecas
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// 3 - Classe
public class Base {
    public WebDriver driver; // objeto do Selenium WebDriver, vulgo bola
    // ^ - ao usar PageFactory mudar de public para protected

    // v - criar um construtor e inicializar os elementos do PageFactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);//Quando tem que trabalhar com PageFactory cria a super Base.
    }

}