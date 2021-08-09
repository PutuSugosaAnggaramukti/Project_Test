import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.bukalapak.com/')

WebUI.click(findTestObject('Object Repository/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/p_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Accounts/input_E-mail  Username  Nomor Handphone_use_7836c5'), 'anggaputu75@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Accounts/input_Password_user_sessionpassword'), 'tB0qfor7gV2U3D6r11KA8A==')

WebUI.click(findTestObject('Object Repository/Page_Accounts/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/input_Lihat BukaMall_searchkeywords'), 
    'raket')

WebUI.click(findTestObject('Object Repository/Page_Situs Belanja Online dan Jual Beli Mud_3c8940/button_Lihat BukaMall_v-omnisearch__submit'))

WebUI.click(findTestObject('Object Repository/Page_Jual Produk Raket Termurah dan Terleng_18864f/img_Asuransi_bl-thumbnail--img'))

WebUI.waitForElementVisible(findTestObject("Object Repository/Page_Jual Raket Badminton Lining paket leng_8d0615/button_Beli Sekarang"), 10)


WebUI.closeBrowser()

