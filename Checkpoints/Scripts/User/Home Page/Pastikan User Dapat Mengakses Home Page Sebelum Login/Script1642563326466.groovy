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

WebUI.callTestCase(findTestCase('CustomKeyword/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CustomKeyword/Negative to URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login/button__z-2 absolute right-0 top-0 bg-white w-10 h-10 flex rounded-full justify-center items-center border-black-300 border-2.5'))

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/h3_Kategori'), 'Kategori')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/h3_Kategori'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/h3_Kelas Terbaik Pijar Mahir'), 'Kelas Terbaik Pijar Mahir!')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/h3_Kelas Terbaik Pijar Mahir'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/h3_Siap Jadi Talenta Digital Terbaik'), 'Siap Jadi Talenta Digital Terbaik!')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/h3_Siap Jadi Talenta Digital Terbaik'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('null'), 'Best Seller')

WebUI.scrollToElement(findTestObject('null'), 0)

WebUI.click(findTestObject('Home Page/Button Home Page/Next_Best'))

WebUI.click(findTestObject('Home Page/Button Home Page/Prev_Best'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('null'), 'Populer Saat Ini')

WebUI.scrollToElement(findTestObject('null'), 0)

WebUI.click(findTestObject('Home Page/Button Home Page/Next_Populer'))

WebUI.click(findTestObject('Home Page/Button Home Page/Prev_Populer'))

WebUI.delay(0)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/h3_Pilihan Terbaik Untuk Kamu'), 'Pilihan Terbaik Untuk Kamu')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/h3_Pilihan Terbaik Untuk Kamu'), 0)

WebUI.click(findTestObject('Home Page/Button Home Page/Next_Terbaik'))

WebUI.click(findTestObject('Home Page/Button Home Page/Prev_Terbaik'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/h3_Kartu Prakerja'), 'Kartu Prakerja')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/h3_Kartu Prakerja'), 0)

WebUI.click(findTestObject('Home Page/Button Home Page/Next_Prakerja'))

WebUI.click(findTestObject('Home Page/Button Home Page/Prev_Prakerja'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/p_Berakhir dalam'), 'Berakhir dalam')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/p_Berakhir dalam'), 0)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/h3_Pijar Camp'), 'Pijar Camp')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/h3_Pijar Camp'), 0)

WebUI.click(findTestObject('Home Page/Button Home Page/Next_Camp'))

WebUI.click(findTestObject('Home Page/Button Home Page/Prev_Camp'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/h3_Spesial hanya di Pijar Mahir'), 'Spesial hanya di Pijar Mahir')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/h3_Spesial hanya di Pijar Mahir'), 0)

WebUI.verifyElementText(findTestObject('Home Page/Page_Pijar Mahir/h3_Mitra Pelatihan'), 'Mitra Pelatihan')

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/h3_Mitra Pelatihan'), 0)

WebUI.scrollToElement(findTestObject('Home Page/Page_Pijar Mahir/h3_Testimoni DariPelajar'), 0)

