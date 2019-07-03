package customKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import java.text.SimpleDateFormat;
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date;
import java.text.ParseException;
import java.util.TimeZone;


public class check_RequestStartDate {
	
	@Keyword
	def check_DateFormat(String request_StartDate) {
		Date javaDate
		if (request_StartDate.trim().equals("")) {
			return false;
		}
		/* Date is not 'null' */
		else {
			try {
				SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
				sdfrmt.setTimeZone(TimeZone.getTimeZone("UTC"));
				javaDate = sdfrmt.parse(request_StartDate);
				//System.out.println("Valid date is: " + sdfrmt.format(javaDate));
				System.out.println("valid date format")
			}
			catch(Exception e) {
				System.out.println("Invalid date format")
				//System.out.println(javaDate)
				return false;
			}
			return true;
		}
	}
	@Keyword
	def date_converter() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		Date date = new Date();
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		//Date CurrentDate = dateFormat.parse(date)
		System.out.println("UTC Time is: " + dateFormat.format(date));
	}
}