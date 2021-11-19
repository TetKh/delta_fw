package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.BasicInfoPage;
import pages.LanguagePreferencePage;
import pages.LogInInfoPage;
import utilities.SeleniumUtils;

public class LanguagePreferenceTest extends TestBase{

    @Test
    public  void verifySelectLanguageDropDown(){
        new SignUpButtonTest().SingUpButtonTest();
        new LanguagePreferencePage().scrollWindow();
        new LanguagePreferencePage().selectLanguage.sendKeys(Keys.DOWN,Keys.ENTER);
       // new LanguagePreferencePage().selectLanguage.click();
    }


}
