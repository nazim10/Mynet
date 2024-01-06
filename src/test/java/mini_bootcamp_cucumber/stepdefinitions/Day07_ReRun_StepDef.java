package mini_bootcamp_cucumber.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mini_bootcamp_cucumber.pages.Day07_ReRun_Page;
import mini_bootcamp_cucumber.utilities.ConfigurationReader;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import static org.junit.Assert.assertTrue;
public class Day07_ReRun_StepDef {
    Day07_ReRun_Page page = new Day07_ReRun_Page();
    @Given("{string} sitesine gidilir")
    public void sitesine_gidilir(String string) {
        switch (string) {
            case "cicek sepeti":
                Driver.getDriver().get(ConfigurationReader.getProperty("ciceksepeti"));
                break;
            case "getir":
                Driver.getDriver().get(ConfigurationReader.getProperty("getir"));
                break;
            case "pazarama":
                Driver.getDriver().get(ConfigurationReader.getProperty("pazarama"));
                break;
            case "mynet":
                Driver.getDriver().get(ConfigurationReader.getProperty("mynet"));
                break;
            case "trendyol":
                Driver.getDriver().get(ConfigurationReader.getProperty("trendyol"));
                break;
            case "boyner":
                Driver.getDriver().get(ConfigurationReader.getProperty("boyner"));
                break;
            case "madame coco":
                Driver.getDriver().get(ConfigurationReader.getProperty("madameCoco"));
                break;
            case "ets tur":
                Driver.getDriver().get(ConfigurationReader.getProperty("etstur"));
                break;
            case "herokuapp":
                Driver.getDriver().get(ConfigurationReader.getProperty("herokuapp"));
                break;
            default:
                break;
        }
    }
    @And("arama butonuna basar")
    public void aramaButonunaBasar() {
            page.kabulEt.click();
            page.aramaButonu.click();
            //trend videolari kapatmak icin
        //ReusableMethods.waitForVisibility(page.aramaButonu, 10);
        //ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#myGlobalSearchBtn\")");

    }
    @And("arama kutusuna {string} yazar")
    public void aramaKutusunaYazar(String arg0) {
        //if(ReusableMethods.webelementJavaScript("document.querySelector(\"#taboola-video-reel-close-slider\")").isDisplayed()){
        //    ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#taboola-video-reel-close-slider\")");
        //}
        page.aramaKutusu.sendKeys(arg0);
        page.aramaicintikla.click();
        // ReusableMethods.clickJSElementWithJavaScript("document.querySelector('#myGlobalSearchBtn')");
        // ReusableMethods.waitForVisibility(page.aramaKutusu, 10);
        //ReusableMethods.showElementWithFrame("input[id='myGlobalSearchInput");
        //ReusableMethods.sendKeyWithJavaScript(arg0, page.aramaKutusu);
    }
    @Then("sonuçlar {string} oldugunu dogrular")
    public void sonuclarOldugunuDogrular(String arg0) {
        // ReusableMethods.waitForVisibility(page.aramaSonucu,25 );
        String Cikti1 = "";
        Cikti1 = page.aramaSonucu.getText().toLowerCase();
        System.out.println("cikti1 =   " + Cikti1);
        //System.out.println("normalize space = " + page.aramaSonucu.getText());
        //page.aramaSonucu.getText().replaceAll(" ", "");
        // System.out.println("replace all = " + page.aramaSonucu);
        //System.out.println("actualText = " + actualText);
        assertTrue(Cikti1.contains(arg0));
    }

    @Then("sonuçlarda {string} oldugunu dogrular")
    public void sonuçlardaOldugunuDogrular(String arg0) {
        String Cikti2 = "";
        Cikti2 = page.aramaSonucu.getText();
        System.out.println("cikti2 =   " + Cikti2);
        assertTrue(Cikti2.contains(arg0));


    }

    @And("arama butonuna tekrar basar")
    public void aramaButonunaTekrarBasar() {
        page.aramaButonu.click();
    }
}
