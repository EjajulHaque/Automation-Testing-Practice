package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GuiElement extends BasePage {

    //Constructor
    public GuiElement(WebDriver driver){
        super(driver);
    }
    //Locator
    @FindBy(xpath = "(//input[@id='name'])[1]")
    WebElement textName;
    @FindBy(xpath = "//input[@id='email']")
    WebElement textEmail;
    @FindBy(xpath = "//input[@id='phone']")
    WebElement phoneNumber;
    @FindBy(xpath = "//textarea[@id='textarea']")
    WebElement textAddress;
    @FindBy(xpath = "//input[@id='male']")
    WebElement genderRadioButton;
    @FindBy(xpath = "//input[@id='saturday']")
    WebElement dayRadioButton;
    @FindBy(xpath = "//select[@id='country']")
    WebElement countryDropDown;
    @FindBy(xpath = "//label[normalize-space()='Colors:']")
    WebElement colourMouseAction;
    @FindBy(xpath = "//option[@value='red']")
    WebElement redColourMouseAction;
    @FindBy(xpath = "//label[normalize-space()='Sorted List:']")
    WebElement sortedListMouseAction;
    @FindBy(xpath = "//option[@value='dog']")
    WebElement dogMouseAction;
    @FindBy(xpath = "//body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]")
    WebElement smartPhone;
    @FindBy(xpath = "//ul[@id='pagination']//li//a[@href='#'][normalize-space()='2']")
    WebElement paginationWebTable2;
    @FindBy(xpath = "//input[@id='input1']")
    WebElement paragraph1;
    @FindBy(xpath = "//button[@id='btn1']")
    WebElement paragraph1Button;
    @FindBy(xpath = "//input[@id='input2']")
    WebElement paragraph2;
    @FindBy(xpath = "//button[@id='btn2']")
    WebElement paragraph2Button;
    @FindBy(xpath = "//input[@id='input3']")
    WebElement paragraph3;
    @FindBy(xpath = "//button[@id='btn3']")
    WebElement paragraph3Button;
    @FindBy(xpath = "//input[@id='Wikipedia1_wikipedia-search-input']")
    WebElement searchBar;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement searchBarButton;
    @FindBy(xpath = "//button[@name='start']")
    WebElement dynamicStartButton;
    @FindBy(xpath = "//button[normalize-space()='STOP']")
    WebElement dynamicStopButton;

    //Action Methods
    public void setTextName(String name){
        textName.sendKeys(name);
    }
    public void setTextEmail(String email){
        textEmail.sendKeys(email);
    }
    public void setPhoneNumber(String number){
        phoneNumber.sendKeys(number);
    }
    public void setTextAddress(String address){
        textAddress.sendKeys(address);
    }
    public void setGenderRadioButton(){
        genderRadioButton.click();
    }
    public void setDayRadioButton(){
        dayRadioButton.click();
    }
    Select dropDownElement=new Select(countryDropDown);
    public void setCountryDropDown(){
        dropDownElement.selectByValue("canada");
    }
    Actions act=new Actions(driver);
    public void setColourMouseAction(){
        act.moveToElement(colourMouseAction).moveToElement(redColourMouseAction).click().perform();
    }
    Actions act1=new Actions(driver);
    public void setSortedListMouseAction(){
        act1.moveToElement(sortedListMouseAction).moveToElement(dogMouseAction).click().perform();
    }
    public void setSmartPhone(){
        smartPhone.click();
    }
    public void setPaginationWebTable2(){
      paginationWebTable2.click();
    }
    public void setParagraph1(String paragraphSetion){
        paragraph1.sendKeys(paragraphSetion);
    }
    public void setParagraph1Button(){
        paragraph1Button.click();
    }
    public void setParagraph2(String paragraph2Section){
        paragraph2.sendKeys(paragraph2Section);
    }
    public void setParagraph2Button(){
        paragraph2Button.click();
    }
    public void setParagraph3(String paragraph3Section){
        paragraph3.sendKeys(paragraph3Section);
    }
    public void setParagraph3Button(){
        paragraph3Button.click();
    }
    public void setSearchBar(String searchBar1){
        searchBar.sendKeys(searchBar1);
    }
    public void setSearchBarButton(){
        searchBarButton.click();
    }
    public void setDynamicStartButton(){
        dynamicStartButton.click();
    }
    public void setDynamicStopButton(){
        dynamicStopButton.click();
    }
}
