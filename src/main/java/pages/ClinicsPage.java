package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClinicsPage extends BasePage {

	public ClinicsPage(WebDriver driver) {
		super(driver);
	}

//	Filters
	@FindBy(xpath = "//span[text()='Всі райони']")
	public WebElement selectAllAreas;
	
	@FindBy(xpath = "//span[text()='Святошинський']")
	public WebElement selectSvyatoshyn;
	
	@FindBy(xpath = "//span[text()='Приватні']")
	public WebElement checkboxPrivate;
	
	@FindBy(xpath = "//span[text()='Оплата карткою']")
	public WebElement checkboxPaymentCard;
	
	@FindBy(xpath = "//span[text()='Дитяча кімната']")
	public WebElement checkboxChildrenRoom;
	
//	(css = ".OrganizationCard-module-organization-name_1DA73")
	@FindBy(xpath = "//h3[text()='Клініка VIVA (Віва) на Борщагівці']")
	public WebElement linkClinicViva;
	
//	FilterChips
	@FindBy(xpath = "//span[contains(@class,'3nCe5') and text()='Святошинський']")
	public WebElement filterChipsSvyatoshyn;
	
	@FindBy(xpath = "//span[contains(@class,'3nCe5') and text()='Приватні']")
	public WebElement filterChipsPrivate;
	
	@FindBy(xpath = "//span[contains(@class,'3nCe5') and text()='Дитяча кімната']")
	public WebElement filterChipsChildrenRoom;
	
}
