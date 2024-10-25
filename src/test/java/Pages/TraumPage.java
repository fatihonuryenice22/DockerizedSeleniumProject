package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class TraumPage {


    public static Object navigateToVw;
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    static By signinbutton = By.xpath("(//button[normalize-space()='Sign In'])[1]");
    static By emailArea = By.id("email");
    static By pwArea = By.id("password");
    static By myaccountButton= By.cssSelector("#account-btn");
    static By loginButton= By.xpath("//button[@aria-label='save button']");
    static By signoutButton= By.xpath("(//a[normalize-space()='Sign Out'])[1]");
    static By shopnowButton= By.xpath("//button[normalize-space()='Shop Now']");
    static By ordernowButton= By.xpath("//button[normalize-space()='Order Now']");
    static By becomeourpartnerButton= By.xpath("//button[normalize-space()='Become Our Partner']");
    static By coffetype1= By.xpath("//p[normalize-space()='Whole Bean Coffees']");
    static By coffetype2= By.xpath("//p[normalize-space()='Capsules Coffees']");
    static By coffetype3= By.xpath("//p[normalize-space()='Drip Coffees']");
    static By coffetype11 =By.xpath("//h3[normalize-space()='Uva Mela Blend Coffee | Dark Roasted']");
    static By about= By.xpath("//button[@role='button' and contains(text(), 'About')]");
    static By about1=By.xpath("//a[contains(@class,'hover:text-[#CF6300]')][normalize-space()='About']");
    static By about2=By.xpath("//a[contains(@class,'hover:text-[#CF6300]')][normalize-space()='Sustainability']");
    static By about3=By.xpath("//a[contains(@class,'hover:text-[#CF6300]')][normalize-space()='Contact']");
     // static By learn= By.xpath("(//div[@id='2'])");
    static By learn1=By.xpath("//a[normalize-space()='Brew Guides']");
    static By learn2=By.xpath("//a[normalize-space()='Blog']");
    static By wholesale1=By.xpath("//a[normalize-space()='Wholesale']");
    static By wholesale2=By.xpath("//a[normalize-space()='Coffee For Restaurant']");
    static By wholesale3=By.xpath("//a[normalize-space()='Coffee For Hotels']");
    static By wholesale4=By.xpath("//a[normalize-space()='Cafes and Coffee Shops']");
    static By wholesale5=By.xpath("//a[normalize-space()='Coffee At Work']");
    static By wholesale6=By.xpath("//a[normalize-space()='Equipments']");
    static By wholesale7=By.xpath("//a[normalize-space()='Training']");
    static By myaccountButtonFooter= By.id("myAccountBtn");
    static By faq=By.xpath("(//span[normalize-space()='FAQ'])[1]");
    static By bop= By.xpath("(//span[@class='text-white leading-5 font-sans font-normal md:text-sm 5xl:text-xl text-[14px] hover:text-[#CF6300]'][normalize-space()='Become Our Partner'])[1]");
    static By contact= By.xpath("(//span[normalize-space()='Contact'])[1]");
    static By products= By.xpath("(//span[normalize-space()='Products'])[1]");
    static By stayintouch=By.xpath("(//span[contains(@class,'font-butler capitalize text-[#CF6300] 5xl:text-2xl text-[18px] md:text-xl font-bold leading-7 mt-2 underline')])[1]");
    public TraumPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void closeBrowserM() {
        System.out.println("Otomatik Kapatma islemi");
    }

    public static void openBrowserM() {
        System.out.println("Otomatik Kapatma islemi");
    }

    public static void clickToSignIn() {
        try {
            Thread.sleep(5000);
            System.out.println("bekleyenzi");// 2 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(signinbutton);
        try {
            Thread.sleep(5000);
            System.out.println("bekleyenzi");// 2 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.findElement(emailArea).sendKeys("yenicefatihonur@gmail.com");
        try {
            Thread.sleep(5000);
            System.out.println("bekleyenzi");// 2 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.findElement(pwArea).sendKeys("Fatihonur22");
        try {
            Thread.sleep(5000);
            System.out.println("bekleyenzi");// 2 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(loginButton);
        try {
            Thread.sleep(5000);
            System.out.println("bekleyenzi");// 2 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void clickToLogout() {
        try {
            Thread.sleep(10000);
            System.out.println("bekleyenz2i");
            System.out.println("bekleyenz2i");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        elementHelper.click(myaccountButton);
        try {
            Thread.sleep(2000);
            System.out.println("bekleyenzi");
            System.out.println("bekleyenzi");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(signoutButton);
        try {
            Thread.sleep(5000);
            System.out.println("bekleyenzi");// 2 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void mainPageValidation() {
        elementHelper.findElement(shopnowButton);
        elementHelper.findElement(ordernowButton);
        elementHelper.findElement(becomeourpartnerButton);

    }

    public static void ClickToOrderNow() {
        try {
            Thread.sleep(5000);
            System.out.println("birinci order nowdan önce");// 2 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(ordernowButton);
        try {
            Thread.sleep(5000);
            System.out.println("birinci order nowdan sonra 2. order nowa geliyo");// 2 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.click(ordernowButton);
        try {
            Thread.sleep(5000);
            System.out.println("ikinci order nowdan sonra");// 2 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void productValidations() {
        elementHelper.findElement(coffetype1);
        elementHelper.findElement(coffetype2);
        elementHelper.findElement(coffetype3);
        elementHelper.findElement(coffetype11);

    }

    public static void clicktoAboutOption() {
       // elementHelper.click(about);
        try {
            Thread.sleep(1000);
            System.out.println("about tıklamaca");// 2 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.findElement(about1);
        elementHelper.findElement(about2);
        elementHelper.findElement(about3);

    }

    public static void clicktoLearnMenu() {
       //  elementHelper.click(learn);
        try {
            Thread.sleep(1000);
            System.out.println("learn tıklamaca");// 2 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.findElement(learn1);
        elementHelper.findElement(learn2);
    }

    public static void validateWholesaleNavMenu() {
        elementHelper.findElement(wholesale1);
        elementHelper.findElement(wholesale2);
        elementHelper.findElement(wholesale3);
        elementHelper.findElement(wholesale4);
        elementHelper.findElement(wholesale5);
        elementHelper.findElement(wholesale6);
        elementHelper.findElement(wholesale7);
    }

    public static void ScrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public static void ValidateFooter() {
        elementHelper.findElement(myaccountButtonFooter);
        elementHelper.findElement(faq);
      elementHelper.findElement(bop);
        elementHelper.findElement(contact);
         elementHelper.findElement(products);
        elementHelper.findElement(stayintouch);

    }
}
