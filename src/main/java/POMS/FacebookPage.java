package POMS;

import Utils.BaseDriver;
import com.mongodb.DBRef;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FacebookPage extends ParentClass {

    WebElement myElement;

    public FacebookPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "a[class='login']")
    private WebElement signIn;
    @FindBy(id = "email")
    private WebElement userName;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(css = "button[id='SubmitLogin']")
    private WebElement submit;
    @FindBy(xpath = "//li[@class='facebook']")
    private WebElement facebookIcon;
    @FindBy(xpath = "//li[@class='twitter']")
    private WebElement twitterIcon;
    @FindBy(xpath = "//li[@class='youtube']")
    private WebElement youtubeIcon;
    @FindBy(xpath = "//li[@class='google-plus']")
    private WebElement googleIcon;
    //@FindBy(xpath = "//h1/a/i[@class='fb_logo img sp_gvgjaEcb2-y sx_e20672']")
    //private WebElement facebookLogo;

    public void findElmAndClick(String elementToClick) {

        switch (elementToClick) {

            case "signIn":
                myElement = signIn;
                break;
            case "submit":
                myElement = submit;
                break;
            case "facebookIcon":
                myElement=facebookIcon;
                break;
            case "twitterIcon":
                myElement=twitterIcon;
                break;
            case "youtubeIcon":
                myElement=youtubeIcon;
                break;
            case "googleIcon":
                myElement=googleIcon;
                break;
        }

        clickFunction(myElement);
    }
public void findElmAndSendKeys(String inputElement,String textToSend){
        switch (inputElement){
            case"userName":
                myElement=userName;
                break;
            case"password":
                myElement=password;
                break;
        }
        sendKeysFunction(myElement,textToSend);

}

    }



