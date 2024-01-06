package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day07_ReRun_Page {

    public Day07_ReRun_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath= "//button[@id='myGlobalSearchBtn']")
    public WebElement aramaButonu;
    @FindBy(xpath= "(//p[@class =\"fc-button-label\"])[1]")
    public WebElement kabulEt;
    @FindBy(xpath= "//input[@class='search-input']")
    public WebElement aramaKutusu;
    @FindBy(xpath= "//button[@class =\"search-button my-icon icon-search search-active\"]")
    public WebElement aramaicintikla;
    @FindBy(xpath= "h2[normalize-space()='\n" +
            "                        //div[@class =\"card p-3 mb-3 mx-2\"]\n" +
            "                    '")//h1[='iran yapıştırıcısı']
    public WebElement aramaSonucuduzenli;

    @FindBy(xpath= "//div[@class =\"card p-3 mb-3 mx-2\"]")
    public WebElement aramaSonucu;



}
