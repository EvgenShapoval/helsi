package smokeFilterTest;


import baseTest.BaseTest;
import pages.ClinicsPage;
import pages.HomePage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;


public class SmokeFilterTest extends BaseTest {

	
    @Test
    public void smokeFilterTest() throws InterruptedException {
	
    	driver.get("https://helsi.me/");
    	
    	HomePage homePage = new HomePage(driver);
    	
    	homePage.buttonCloseCitySelect.click();
//    	Thread.sleep(1000);
    	
    	Actions actions = new Actions(driver);
    	actions.moveToElement(homePage.selectServiceDoc).click().perform();
    	actions.moveToElement(homePage.selectServiceClinic).click().perform();
    	homePage.ButtonServiceSearch.click();
    	    	
    	ClinicsPage clinicsPage = new ClinicsPage(driver);
    	
    	actions.moveToElement(clinicsPage.selectAllAreas).click().perform();
    	actions.moveToElement(clinicsPage.selectSvyatoshyn).click().perform();
    	clinicsPage.checkboxPrivate.click();
    	Thread.sleep(1000);
    	clinicsPage.checkboxChildrenRoom.click();
    	Thread.sleep(1000);
//    	clinicsPage.linkClinicViva.click();
    	
//    	FilterChips
    	
    	String actualMessageSvyatoshyn = clinicsPage.filterChipsSvyatoshyn.getText();
    	String actualMessagePrivate = clinicsPage.checkboxPrivate.getText();
    	String actualMessageChildrenRoom = clinicsPage.filterChipsChildrenRoom.getText();
    	
    	
    	String expectedMessageSvyatoshyn = "Святошинський";
    	String expectedMessagePrivate = "Приватні";
    	String expectedMessageChildrenRoom = "Дитяча кімната";
    	
    	
    	boolean compareMessageSvyatoshyn = actualMessageSvyatoshyn.equals(expectedMessageSvyatoshyn);
    	boolean compareMessagePrivate = actualMessagePrivate.equals(expectedMessagePrivate);
    	boolean compareMessageChildrenRoom = actualMessageChildrenRoom.equals(expectedMessageChildrenRoom);
    	
    	
//		Check the massages in FilterChips
		Assert.assertTrue("Fail. Expected message - " + expectedMessageSvyatoshyn + 
				". Actual message - " + actualMessageSvyatoshyn + 
				" Or: Expected message - " + expectedMessagePrivate +
				". Actual message - " + actualMessagePrivate +
				" Or: Expected message - " + expectedMessageChildrenRoom +
				". Actual message - " + actualMessageChildrenRoom, 
				compareMessageSvyatoshyn & compareMessagePrivate & compareMessageChildrenRoom);
    	
    	
    	
    	
    	
//    	System.out.println();
//    	System.out.println(clinicsPage.checkboxPrivate.getText());
//    	System.out.println(clinicsPage.filterChipsChildrenRoom.getText());
    	
    	
//    	Thread.sleep(3000);
    	
//    	Select clickSelectService = new Select(homePage.selectService);
//    	clickSelectService.selectByIndex(0);
    	
//    	homePage.clickSelectService();
    	
    	   	

//    	homePage.selectService.click();
	
    	Thread.sleep(3000);
    }
}
