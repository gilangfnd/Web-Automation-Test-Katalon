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

WebUI.navigateToUrl('https://reqres.in/')

WS.delay(5)

'using request: /api/users?page=1)'
WebUI.click(findTestObject('Object Repository/WebAutomationTest/Page_Reqres - A hosted REST-API ready to re_1f6e1c/li_List users'))

WS.delay(3)

WebUI.click(findTestObject('Object Repository/WebAutomationTest/Page_Reqres - A hosted REST-API ready to re_1f6e1c/div_Request                                _6cd239'))

WS.delay(3)

WebUI.click(findTestObject('Object Repository/WebAutomationTest/Page_Reqres - A hosted REST-API ready to re_1f6e1c/li_Single user'))

WS.delay(3)

WebUI.click(findTestObject('Object Repository/WebAutomationTest/Page_Reqres - A hosted REST-API ready to re_1f6e1c/li_Create'))

WS.delay(3)

'email value taken from GET single user response'
WebUI.click(findTestObject('Object Repository/WebAutomationTest/Page_Reqres - A hosted REST-API ready to re_1f6e1c/li_Register - successful'))

WS.delay(3)

WebUI.click(findTestObject('Object Repository/WebAutomationTest/Page_Reqres - A hosted REST-API ready to re_1f6e1c/div_Request                                _d1ad64'))

WebUI.closeBrowser()

