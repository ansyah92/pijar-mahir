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

WebUI.callTestCase(findTestCase('User/Login/Positive Case/Pastikan User dapat melakukan Login'), [('username') : 'atikarizki41@gmail.com'
        , ('password') : 'kiki1999'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Search/input_Kategori_search'))

WebUI.setText(findTestObject('Search/input_Kategori_search'), 'Cara Komunikasi Profesional untuk Bisnis Sukses')

WebUI.click(findTestObject('Search/button_Kategori_w-10 h-full flex justify-center items-center bg-black-200'))

WebUI.click(findTestObject('Home Page/Prod/Detail Course/img_concat(, , Cara Komunikasi Profesional untuk Bisnis Sukses, , )_rounded-lg h-full w-full'))

WebUI.scrollToElement(findTestObject('Home Page/Prod/Detail Course/h3_Highlight'), 0)

WebUI.scrollToElement(findTestObject('Home Page/Prod/Detail Course/h3_Detail'), 0)

WebUI.scrollToElement(findTestObject('Home Page/Prod/Detail Course/h3_Materi Pelatihan'), 0)

WebUI.scrollToElement(findTestObject('Home Page/Prod/Detail Course/h3_Rating  Ulasan'), 0)

