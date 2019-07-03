
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


def static "customKeywords.webServices.verifyStatusCode"(
    	TestObject request	
     , 	int expectedStatusCode	) {
    (new customKeywords.webServices()).verifyStatusCode(
        	request
         , 	expectedStatusCode)
}

def static "customKeywords.webServices.addBasicAuthorizationProperty"(
    	TestObject request	
     , 	String username	
     , 	String password	) {
    (new customKeywords.webServices()).addBasicAuthorizationProperty(
        	request
         , 	username
         , 	password)
}

def static "customKeywords.get_Response_String.extract_document_id"(
    	String response_String	
     , 	int index	) {
    (new customKeywords.get_Response_String()).extract_document_id(
        	response_String
         , 	index)
}

def static "customKeywords.check_RequestStartDate.check_DateFormat"(
    	String request_StartDate	) {
    (new customKeywords.check_RequestStartDate()).check_DateFormat(
        	request_StartDate)
}

def static "customKeywords.check_RequestStartDate.date_converter"() {
    (new customKeywords.check_RequestStartDate()).date_converter()
}

def static "customKeywords.check_Request_Body.validate_Request_Body"(
    	String reqBody	) {
    (new customKeywords.check_Request_Body()).validate_Request_Body(
        	reqBody)
}
