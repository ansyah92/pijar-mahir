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

WebUI.callTestCase(findTestCase('User/Login/Positive Case/Pastikan User dapat melakukan Login'), [('username') : 'fitrianisa@yopmail.com'
        , ('password') : '123Abcde'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/h3_Kategori'), 'Kategori')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/h3_Kategori'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/Page_Pijar Mahir/h3_Terakhir dicari'), 'Terakhir dicari')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/Page_Pijar Mahir/h3_Terakhir dicari'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/Page_Pijar Mahir/h3_Kelas Terbaik Pijar Mahir'), 'Kelas Terbaik Pijar Mahir!')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/Page_Pijar Mahir/h3_Kelas Terbaik Pijar Mahir'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/Page_Pijar Mahir/h3_Rekomendasi Kursus'), 'Rekomendasi Kursus')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/Page_Pijar Mahir/h3_Rekomendasi Kursus'), 0)

WebUI.delay(3)

WebUI.focus(findTestObject('Wishlist/Tambah Wishlist/Page_Pijar Mahir/Page_Pijar Mahir/img_Lihat Semua_rounded-lg rounded-br-lg'))

WebUI.click(findTestObject('Wishlist/Tambah Wishlist/Page_Pijar Mahir/Page_Pijar Mahir/img_Lihat Semua_rounded-lg rounded-br-lg'))

WebUI.scrollToElement(findTestObject('Wishlist/Tambah Wishlist/p_Benefit yang Didapat'), 0)

WebUI.click(findTestObject('Wishlist/Tambah Wishlist/button_Wishlist'))

