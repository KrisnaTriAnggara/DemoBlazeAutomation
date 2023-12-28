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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

WebUI.click(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/menu_Log in'))

WebUI.setText(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/field_loginusername'), 'anggalfc17')

WebUI.setText(findTestObject('Purchase_ItemNexus/Page_PurchaseItem/field_loginpassword'), 'anggalfc18')

WebUI.click(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/button_Log in'))

WebUI.click(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/img_Nexus6'))

WebUI.click(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/btn_Add to cart'))

WebUI.click(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/btn_menu_Cart'))

WebUI.click(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/btn_Place Order'))

WebUI.setText(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/field_inputname'), 'anggalfc')

WebUI.setText(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/field_inputcountry'), 'indonesia')

WebUI.setText(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/field_inputcity'), 'jakarta')

WebUI.setText(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/field_inputcard'), 'bca')

WebUI.setText(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/field_inputmonth'), '12')

WebUI.setText(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/field_inputyear'), '2023')

WebUI.click(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/btn_Purchase'))

WebUI.click(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/Thank you for your purchase'))

WebUI.click(findTestObject('Object Repository/Purchase_ItemNexus/Page_PurchaseItem/btn_OK'))

