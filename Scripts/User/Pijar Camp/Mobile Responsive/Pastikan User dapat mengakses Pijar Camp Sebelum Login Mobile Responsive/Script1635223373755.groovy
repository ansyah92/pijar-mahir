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

WebUI.callTestCase(findTestCase('CustomKeyword/Oper Browser Mobile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CustomKeyword/Negative to URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login/button__z-2 absolute right-0 top-0 bg-white w-10 h-10 flex rounded-full justify-center items-center border-black-300 border-2.5'))

WebUI.focus(findTestObject('Pijar Camp/Top Pijar Camp/button_Pijar Camp'))

WebUI.click(findTestObject('Pijar Camp/Top Pijar Camp/button_Kunjungi Pijar Camp'))

WebUI.scrollToElement(findTestObject('Pijar Camp/Page_Pijar Camp/h3_Mulai Karir  Teknologi Bersama  Pijar Camp'), 10)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Pijar Camp/Page_Pijar Camp/p_TENTANG PIJAR CAMP'), 10)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Pijar Camp/Page_Pijar Camp/p_KEUNTUNGAN GABUNG PIJAR CAMP'), 10)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Pijar Camp/Page_Pijar Camp/p_TENTANG PROGRAM PIJAR CAMP'), 10)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Pijar Camp/Page_Pijar Camp/p_TESTIMONI ALUMNI'), 10)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Pijar Camp/Page_Pijar Camp/p_Mulai Karirmu Bersama Pijar Camp'), 10)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Pijar Camp/Page_Pijar Camp/p_KISAH SUKSES'), 10)

