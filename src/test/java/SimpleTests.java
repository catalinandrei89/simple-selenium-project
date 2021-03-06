import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTests {


    @Test
    public void testThatIAmOnFacebookPageByTitle() {
        //0. setare preconditii test
        //1. deschidem browser
        //2. navigam catre www.facebook.com
        //3. verificam ca suntem pe www.facebook.com
        //3.2. verificare titlu pagina "Facebook - Log In or Sign Up"
        //4. inchide sesiune browser

        //0 - setare preconditii -- ii spunem ca vom folosi firefox browser
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");

        //1. deschidem browser
        WebDriver driver = new FirefoxDriver(); // deschide o instanta de firefox

        //2. navigam catre www.facebook.com
        driver.get("https://www.facebook.com/"); // browserul ma va directa catre facebook.com
        //driver.navigate().to("https://www.facebook.com/"); // browserul ma va directa catre facebook.co

        //3. verificam ca suntem pe www.facebook.com
        //3.2. verificare titlu pagina "Facebook - Log In or Sign Up"
        String titluAsteptat = "Facebook - Log In or Sign Up";
        String titlulActual = driver.getTitle();
//        if(titlulActual.equals(titluAsteptat)) {
//            System.out.println("Esti pe pagina Facebook!");
//        }
//        else
//        {
//            System.out.println("Ai gresit pagina, prietenul meu!");
//        }
        //dorim sa facem un assertion
        Assert.assertEquals(titlulActual, titluAsteptat);

        //4. inchidem sesiune browser
        driver.quit();
    }


    @Test
    public void testThatIAmOnFacebookPageByLogo() {
        //0. setare preconditii test
        //1. deschidem browser
        //2. navigam catre www.facebook.com
        //3. verificam ca suntem pe www.facebook.com
        //3.1. verificare logo
        //4. inchide sesiune browser

        //0 - setare preconditii -- ii spunem ca vom folosi firefox browser
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");

        //1. deschidem browser
        WebDriver driver = new FirefoxDriver(); // deschide o instanta de firefox

        //2. navigam catre www.facebook.com
        // driver.get("https://www.facebook.com/"); // browserul ma va directa catre facebook.com
        driver.navigate().to("https://www.facebook.com/"); // browserul ma va directa catre facebook.co

        //3. verificam ca suntem pe www.facebook.com
        //3.1. verificare logo

        WebElement logoFacebook = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i"));

        Assert.assertTrue(logoFacebook.isDisplayed());

        //4. inchidem sesiune browser
        driver.quit();
    }


    @Test
    public void inputUserAndPassword() {
        //0. setare preconditii test
        //1. deschidem browser
        //2. navigam catre www.facebook.com
        //3. introducem date in email si password input fields
        //4. verificam ca datele au fost introduse
        //5. apasam butonul de LOGIN
        //6. verificam ca ne-am logat
        //7. inchide sesiune browser

        //0 - setare preconditii -- ii spunem ca vom folosi firefox browser
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");

        //1. deschidem browser
        WebDriver driver = new FirefoxDriver(); // deschide o instanta de firefox

        //2. navigam catre www.facebook.com
        // driver.get("https://www.facebook.com/"); // browserul ma va directa catre facebook.com
        driver.navigate().to("https://www.facebook.com/"); // browserul ma va directa catre facebook.co


        WebElement inputPassword = driver.findElement(By.id("pass"));
        WebElement inputEmail = driver.findElement(By.id("email"));

        inputEmail.sendKeys("fier4jat@yahoo.com");
        inputPassword.sendKeys("cea mai smechera parola din lume");


    }


}
