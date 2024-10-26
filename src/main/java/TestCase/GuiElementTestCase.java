package TestCase;

import PageObject.GuiElement;
import TestBase.BaseClass;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GuiElementTestCase extends BaseClass {
    @Test
    public void addPersonDetails(){
        GuiElement ge=new GuiElement(driver);
        ge.setTextName("gulab");
        ge.setTextEmail("gulabalam@gmail.com");
        ge.setPhoneNumber("6204821045");
        ge.setTextAddress("Khagaria,Bihar");
        ge.setGenderRadioButton();
        ge.setDayRadioButton();
        ge.setCountryDropDown();
        ge.setColourMouseAction();
        ge.setSortedListMouseAction();
        ge.setSmartPhone();
        ge.setPaginationWebTable2();
        ge.setParagraph1("gulab");
        ge.setParagraph1Button();
        ge.setParagraph2("rose");
        ge.setParagraph2Button();
        ge.setParagraph3("haque");
        ge.setParagraph3Button();
        ge.setSearchBar("flipkart");
        ge.setSearchBarButton();
        ge.setDynamicStartButton();
        ge.setDynamicStopButton();
    }
}
