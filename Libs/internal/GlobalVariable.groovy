package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object Document_Id
     
    /**
     * <p></p>
     */
    public static Object Base_URL
     
    /**
     * <p></p>
     */
    public static Object authorization
     
    /**
     * <p></p>
     */
    public static Object content
     
    /**
     * <p></p>
     */
    public static Object regex
     
    /**
     * <p></p>
     */
    public static Object Request_Date
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['Document_Id' : '7625', 'Base_URL' : 'https://q25i8nrv0e.execute-api.us-east-1.amazonaws.com/dev/job', 'authorization' : 'Basic UVZUVXNlcjpRdnRQYXNzd29yZDAxMjM0NTY3ODkw', 'content' : 'application/json', 'regex' : '\\{\\"[a-zA-Z]{1,}\\"\\:\\"[a-z]{1,}\\:\\/\\/[a-zA-Z0-9-.\\/_]{1,}\\.(jpg|JPG|PNG|png|pdf|PDF)\\"\\}', 'Request_Date' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        Document_Id = selectedVariables["Document_Id"]
        Base_URL = selectedVariables["Base_URL"]
        authorization = selectedVariables["authorization"]
        content = selectedVariables["content"]
        regex = selectedVariables["regex"]
        Request_Date = selectedVariables["Request_Date"]
        
    }
}
