package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YouTubePage {
  public  YouTubePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

 @FindBy(xpath = "(//input[@autocomplete=\"off\"])[1]\n")
    public WebElement youtubeAramaKutusu;

 @FindBy(xpath = "//ytd-channel-name[@id='channel-title']//yt-formatted-string[@id='text']")
    public WebElement ahmetKanal;

 @FindBy(xpath = "(//*[text()='Genel Bilgilendirme Programlamaya Giriş Ders-04'])[2]")
    public WebElement ahmetKanalIlkVideo;




}
