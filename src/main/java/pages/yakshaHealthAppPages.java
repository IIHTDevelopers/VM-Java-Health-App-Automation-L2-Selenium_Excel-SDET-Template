package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class yakshaHealthAppPages extends StartupPage {


	String pageName = this.getClass().getSimpleName();
	public yakshaHealthAppPages(WebDriver driver) 
	{
		super(driver);
	}

	/**@Test1.1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		return false;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyTitleOfThePage() throws Exception {
		return "";
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyURLOfThePage() throws Exception {
		return "";
	}

	/**@test2
	 * about this method verifySelectCounterPopupIsPresentAndNavigateToNextpage() 
	 * @param : null
	 * @description : it is verify all fields is present in current page or not 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean verifySelectCounterPopupIsPresentAndNavigateToNextpage() throws Exception {
		return null;
	}

	/**@test3
	 * about this method performKeyBoardOperationToOpenAddNewPatientPopup() 
	 * @param : null
	 * @description : it will perform Key board operation (Alt +N) to open the Add new patient page
	 * @return : String
	 * @author : Yaksha
	 */
	public String performKeyBoardOperationToOpenAddNewPatientPopup() throws Exception {
		return "";
	}

	/**@Test4
	 * about this method fillTheTextFieldInAddNewPatientPopup() 
	 * @param : get the data from Excel file as type Map<String, String> expectedData
	 * @description : enter value in text field of Add New Patient as per excel expected data and fetch the value of that text field ,
	 * @return : fetch the value text field as string type
	 * @author : Yaksha
	 */
	public String fillTheTextFieldInAddNewPatientPopup(Map<String, String> expectedData) throws Exception {
		return "";
	}

	/**@Test5.1
	 * about this method verifyFirstNameIsPresent() 
	 * @param : null
	 * @description : it will fetch the data from the FirstName textfield
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyFirstNameIsPresent() throws Exception {
		return "";
	}

	/**@Test5.2
	 * about this method verifyMiddleNameIsPresent() 
	 * @param : null
	 * @description : it will fetch the data from the MiddleName Text field
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyMiddleNameIsPresent() throws Exception {

		return "";
	}

	/**@Test5.3
	 * about this method verifyLastNameIsPresent() 
	 * @param : null
	 * @description : it will fetch the data from the LastName Text field
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyLastNameIsPresent() throws Exception {

		return "";
	}

	/**@Test5.4
	 * about this method verifyAgeValueIsPresent() 
	 * @param : null
	 * @description : it will fetch the data from the age Text field
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyAgeValueIsPresent() throws Exception {

		return "";
	}

	/**@Test5.5
	 * about this method verifyContactNumberIsPresent() 
	 * @param : null
	 * @description : it will fetch the data from the contact Text field
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyContactNumberIsPresent() throws Exception {

		return "";
	}

	/**@Test6
	 * about this method verifyIndiaIsSelectedFromCountryDropdown() 
	 * @param : get the data from excel file as type Map<String, String> expectedData
	 * @description : it will select the country as per excel expected data.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyIndiaIsSelectedFromCountryDropdown(Map<String, String> expectedData) throws Exception {

		return "";
	}

	/**@test7
	 * about this method validateErrorMessageWhenClickOnRegisterBillingButton() 
	 * @param : null
	 * @description : it is getting the error message and validate the error message ,
	 * @return : errorMessage as string type
	 * @author : Yaksha
	 */
	public String validateErrorMessageWhenClickOnRegisterBillingButton() throws Exception {
		return "";
	}

	/**@test8
	 * about this method verifyDispensaryArrowIsExpanding() 
	 * @param : null
	 * @description : Verify that the dispensary modules's arrow is expanding, and submodules are being displayed.
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean verifyDispensaryArrowIsExpanding() throws Exception {
		return null;
	}

	/**@test9
	 * about this method verifyDispensaryArrowIsMinimizing() 
	 * @param : null
	 * @description : Verify that the dispensary module's arrow is minimizing properly. 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean verifyDispensaryArrowIsMinimizing() throws Exception {
		return null;
	}

	/**@test10
	 * about this method verifyControlScrollingFromDispensaryToSettingModule() 
	 * @param : null
	 * @description : Verify that the left navigation menu scroll bar is scrolling from Dispensary module to settings module.
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean verifyControlIsScrollingFromDispensaryToSettingModule() throws Exception {
		return null;
	}

	/**@Test11
	 * about this method searchForPatientAndViewDetailsOfSelectedPatient()
	 * @param : Map<String, String>
	 * @description : Search for a patient name and view the details of the selected patient.
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean searchForPatientAndViewDetailsOfSelectedPatient(Map<String, String> expectedData) throws Exception {
		return false;
	}
	
	
	/**@Test12
	 * about this method takeScreenshotOfTheDoctorPage()
	 * @param : null
	 * @description : go to the doctor tab and take a screenshot
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean takeScreenshotOfTheDoctorPage() throws Exception {
		return false;
	}
	
	/**@Test13
	 * about this method deactivateUserByManagingAlertPopup()
	 * @param : null
	 * @description : Go to settings then go to security, click Deactivate button and click on cancel button in the popup
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean deactivateUserByManagingAlertPopup() throws Exception {
		return false;
	}
	
	/**@Test14
	 * about this method verifyToolTipOfAnElement()
	 * @param : null
	 * @description :go to appointmentTab and verify the tooltip value/text.
	 * @return : String
	 * @author : Yaksha
	 */
	public String verifyToolTipOfAnElement() throws Exception {
		return "";
	}
}
