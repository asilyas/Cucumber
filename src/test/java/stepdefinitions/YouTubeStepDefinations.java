package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import pages.YouTubePage;


public class YouTubeStepDefinations {
    YouTubePage youTubePage=new YouTubePage();
    AmazonPage amazonPage=new AmazonPage();



    @Then("ilk secenegi tiklayip cikan ilk videonun icerinde Ders yazisininin ciktigini test eder")
    public void ilkSecenegiTiklayipCikanIlkVideonunIcerindeDersYazisinininCiktiginiTestEder() {
        youTubePage.ahmetKanal.click();

        String expectedYazi= "Ders";
        String actualYazi= youTubePage.ahmetKanalIlkVideo.getText();

        Assert.assertTrue(actualYazi.contains(expectedYazi));


    }

    @When("youtube da arama kutusuna {string} yazar")
    public void youtubeDaAramaKutusunaYazar(String aranacakKelime) {
       youTubePage.youtubeAramaKutusu.sendKeys(aranacakKelime+Keys.ENTER);

    }
}
