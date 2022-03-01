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

WebUI.verifyElementText(findTestObject('Keranjang/h3_Kategori'), 'Kategori')

WebUI.scrollToElement(findTestObject('Keranjang/h3_Kategori'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Keranjang/h3_Terakhir dicari'), 'Terakhir dicari')

WebUI.scrollToElement(findTestObject('Keranjang/h3_Terakhir dicari'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Keranjang/h3_Kelas Terbaik Pijar Mahir'), 'Kelas Terbaik Pijar Mahir!')

WebUI.scrollToElement(findTestObject('Keranjang/h3_Kelas Terbaik Pijar Mahir'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Keranjang/h3_Rekomendasi Kursus'), 'Rekomendasi Kursus')

WebUI.scrollToElement(findTestObject('Keranjang/h3_Rekomendasi Kursus'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Keranjang/h3_Siap Jadi Talenta Digital Terbaik'), 'Siap Jadi Talenta Digital Terbaik!')

WebUI.scrollToElement(findTestObject('Keranjang/h3_Siap Jadi Talenta Digital Terbaik'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Keranjang/h3_Best Seller'), 'Best Seller')

WebUI.scrollToElement(findTestObject('Keranjang/h3_Best Seller'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Keranjang/h3_Populer Saat Ini'), 'Populer Saat Ini')

WebUI.scrollToElement(findTestObject('Keranjang/h3_Populer Saat Ini'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Keranjang/h3_Kartu Prakerja'), 'Kartu Prakerja')

WebUI.scrollToElement(findTestObject('Keranjang/h3_Kartu Prakerja'), 0)

WebUI.delay(3)

WebUI.focus(findTestObject('Keranjang/div_Eksis di Google dengan Google My BusinessLEAP'))

WebUI.click(findTestObject('Keranjang/div_Eksis di Google dengan Google My BusinessLEAP'))

WebUI.click(findTestObject('Keranjang/button_Keranjang'))

//WebUI.verifyElementText(findTestObject('Keranjang/Page_Pijar Mahir/h3_Berhasil ditambahkan ke Keranjang'), 'Berhasil ditambahkan ke Keranjang')

WebUI.click(findTestObject('Keranjang/Page_Pijar Mahir/button_Lihat Keranjang'))

