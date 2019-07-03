<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>OCR_URL</name>
   <tag></tag>
   <elementGuidId>abdba022-15b2-4598-b8a0-fb5bbc4f9c7e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;fileUrl\&quot;:\&quot;https://tier-1-docs-123.s3.amazonaws.com/tier_1_input/test_8675309_20190402120000_100_Final_00000.pdf\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic UVZUVXNlcjpRdnRQYXNzd29yZDAxMjM0NTY3ODkw</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://q25i8nrv0e.execute-api.us-east-1.amazonaws.com/dev/job/create/url?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*
import java.io.*;

import org.stringtemplate.v4.compiler.STParser.namedArg_return

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.verification.WSResponseManager
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import groovy.json.JsonSlurper
import internal.GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS


RequestObject request = WSResponseManager.getInstance().getCurrentRequest()
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


List&lt;TestObjectProperty> reqHeaders = request.getHttpHeaderProperties()

for(int i=0; i&lt; reqHeaders.size();i++) {
	String name = reqHeaders.get(i).getName()
	
	switch(name) {
		case 'Content-Type' : assertThat(reqHeaders.get(i).getValue()).isEqualTo('application/json')
			break
		case 'Authorization' : assertThat(reqHeaders.get(i).getValue()).isEqualTo(GlobalVariable.authorization)
			break
		default : break
	}
}

assertThat(request.getRestRequestMethod()).isEqualTo(&quot;POST&quot;)
//println(request.getHttpBody().trim().replace('\n', &quot;&quot;).replaceAll(&quot;\\s&quot;, &quot;&quot;))
Boolean isValidBody = CustomKeywords.'customKeywords.check_Request_Body.validate_Request_Body'(request.getHttpBody().trim().replace('\n', &quot;&quot;).replaceAll(&quot;\\s&quot;, &quot;&quot;))
//println(bit)
assertThat(isValidBody)isEqualTo(true)


WS.verifyResponseStatusCode(response, 200)
assertThat(response.getStatusCode()).isEqualTo(200)



GlobalVariable.Document_Id=CustomKeywords.'customKeywords.get_Response_String.extract_document_id'(response.responseBodyContent,1)
WS.verifyGreaterThan(GlobalVariable.Document_Id, 0)

GlobalVariable.Request_Date=CustomKeywords.'customKeywords.get_Response_String.extract_document_id'(response.responseBodyContent,2)

Boolean isValidDate = CustomKeywords.'customKeywords.check_RequestStartDate.check_DateFormat'(GlobalVariable.Request_Date)
assertThat(isValidDate)isEqualTo(true)
CustomKeywords.'customKeywords.check_RequestStartDate.date_converter'()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
