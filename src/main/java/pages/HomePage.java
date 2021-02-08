package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.BasePage;

//public class HomePage {
//
//public WebDriver driver;

//public HomePage (WebDriver driver) {
//	this.driver = driver;
//	PageFactory.initElements(driver, this);
//}

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

//	CitySelect
	@FindBy(css = ".CitySelect-module-close-container_23CtW")
	public WebElement buttonCloseCitySelect;

	@FindBy(xpath = "//span[text()='ТАК']")
	public WebElement buttonYesCitySelect;

//  Search form	
    @FindBy(xpath = "//span[text()='Записатися до лікаря']")
    public WebElement selectServiceDoc;
    
    @FindBy(xpath = "//span[text()='Знайти клініку']")
    public WebElement selectServiceClinic;
        
    @FindBy(css = ".ReactAutosuggest-module-container_fWFET > input")
    public WebElement InputSearch;

//	xpath = "//span[text()='Знайти']"
    @FindBy(css = ".index-module-search__btn-box_2T8xi")
    public WebElement ButtonServiceSearch;
    
	}
