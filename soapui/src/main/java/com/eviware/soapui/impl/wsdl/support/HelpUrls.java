/*
 * Copyright 2004-2014 SmartBear Software
 *
 * Licensed under the EUPL, Version 1.1 or - as soon as they will be approved by the European Commission - subsequent
 * versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is
 * distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the Licence for the specific language governing permissions and limitations
 * under the Licence.
*/

package com.eviware.soapui.impl.wsdl.support;

/**
 * Help URLS in SoapUI documentation
 *
 * @author ole.matzura
 */

public interface HelpUrls
{
	public static final String HELP_URL_ROOT = "http://www.soapui.org/userguide/";

	public static final String OVERVIEW_HELP_URL = HELP_URL_ROOT + "overview.html";
	public static final String PROJECT_OVERVIEW_HELP_URL = HELP_URL_ROOT + "projects/index.html";
	public static final String INTERFACE_OVERVIEW_HELP_URL = HELP_URL_ROOT + "interfaces/interfaceview.html";
	public static final String WSDL_CONTENT_HELP_URL = HELP_URL_ROOT + "interfaces/interfaceeditor.html";
	public static final String WSI_COMPLIANCE_HELP_URL = HELP_URL_ROOT + "interfaces/wsi.html";

	// TODO option for adding help URl to page section, see
	// buildInterfaceOverviewTab() section operations
	public static final String INTERFACE_HELP_URL = HELP_URL_ROOT + "interfaces/index.html";

	public static final String HEADERS_HELP_URL = "http://www.soapui.org/SOAP-and-WSDL/adding-headers-and-attachments.html#1-custom-http-headers";
	public static final String PREPAREDPROPERTIES_HELP_URL = HELP_URL_ROOT
			+ "functional/datasourcestep.html#JDBC_DataSource_PreparedProperties";
	public static final String ATTACHMENTS_HELP_URL = HELP_URL_ROOT + "attachments.html";

	public static final String TESTSUITE_HELP_URL = HELP_URL_ROOT + "functional/testsuites.html";
	public static final String CREATEMOCKRESPONSESTEP_HELP_URL = HELP_URL_ROOT + "functional/mockresponse.html";

	public static final String ADDREQUESTASMOCKRESPONSESTEP_HELP_URL = HELP_URL_ROOT + "functional/mockresponse.html";
	public static final String ADDMOCKRESPONSETOTESTCASE_HELP_URL = HELP_URL_ROOT + "functional/mockresponse.html";
	public static final String ADDMOCKOPERATIONASMOCKRESPONSESTEP_HELP_URL = HELP_URL_ROOT
			+ "functional/mockresponse.html";
	public static final String SETMOCKOPERATION_HELP_URL = HELP_URL_ROOT
			+ "functional/mockresponsestep.html#Set_Mock_Operation";

	public static final String USERGUIDE_HELP_URL = HELP_URL_ROOT + "index.html";
	public static final String GETTINGSTARTED_HELP_URL = "http://www.soapui.org/gettingstarted/index.html";
	public static final String GOTOSTEPEDITOR_HELP_URL = HELP_URL_ROOT
			+ "functional/gotostep.html#The_Conditional_Goto_Editor";
	public static final String GROOVYSTEPEDITOR_HELP_URL = HELP_URL_ROOT
			+ "functional/groovystep.html#The_Groovy_Script_Editor";
	public static final String PROPERTIESSTEPEDITOR_HELP_URL = HELP_URL_ROOT
			+ "functional/propertiesstep.html#Properties_Editor";
	public static final String TRANSFERSTEPEDITOR_HELP_URL = HELP_URL_ROOT
			+ "functional/propertytransfers.html#The_PropertyTransfer_Editor";
	public static final String JDBCSTEPEDITOR_HELP_URL = HELP_URL_ROOT + "functional/jdbc-requests.html";
	public static final String TESTCASEEDITOR_HELP_URL = HELP_URL_ROOT + "functional/testcases.html#The_TestCase_Editor";
	public static final String TESTSUITEEDITOR_HELP_URL = HELP_URL_ROOT + "functional/testsuites.html#TestSuite_Runner";
	public static final String LOADTESTEDITOR_HELP_URL = HELP_URL_ROOT + "loadtest/index.html#The_LoadTest_Editor";
	public static final String STATISTICSGRAPH_HELP_URL = HELP_URL_ROOT
			+ "loadtest/diagrams.html#The_Statistics_Diagram";
	public static final String REQUESTEDITOR_HELP_URL = HELP_URL_ROOT + "requests.html#The_Request_Editor";
	public static final String TESTREQUESTEDITOR_HELP_URL = HELP_URL_ROOT
			+ "functional/testrequests.html#The_TestRequest_Editor";
	public static final String PREFERENCES_HELP_URL = HELP_URL_ROOT + "preferences.html";
	public static final String TESTCASEOPTIONS_HELP_URL = HELP_URL_ROOT + "functional/testcases.html#TestCase_Options";
	public static final String LOADTESTOPTIONS_HELP_URL = HELP_URL_ROOT + "loadtest/index.html#LoadTest_Options";
	public static final String XPATHASSERTIONEDITOR_HELP_URL = HELP_URL_ROOT
			+ "functional/response-assertions.html#XPath_Match";

	public static final String ENDPOINTSEDITOR_HELP_URL = HELP_URL_ROOT + "interfaces/endpoints.html";

	public static final String AXIS1X_HELP_URL = "http://ws.apache.org/axis/java/reference.html#WSDL2JavaReference";
	public static final String AXIS2X_HELP_URL = "http://ws.apache.org/axis2/tools/1_0/CodegenToolReference.html";
	public static final String DOTNET_HELP_URL = "http://msdn2.microsoft.com/en-us/library/7h3ystb6.aspx";
	public static final String GSOAP_HELP_URL = "http://www.cs.fsu.edu/~engelen/soap.html";

	public static final String JABXJC_HELP_URL = "http://java.sun.com/webservices/docs/2.0/jaxb/xjc.html";
	public static final String WSTOOLS_HELP_URL = "http://labs.jboss.com/portal/jbossws/user-guide/en/html/index.html";
	public static final String TCPMON_HELP_URL = "http://ws.apache.org/commons/tcpmon/";
	public static final String WSCOMPILE_HELP_URL = "http://java.sun.com/webservices/docs/2.0/jaxrpc/jaxrpc-tools.html#wp80809";
	public static final String WSIMPORT_HELP_URL = "http://java.sun.com/webservices/docs/2.0/jaxws/wsimport.html";
	public static final String CXFWSDL2JAVA_HELP_URL = "http://cwiki.apache.org/CXF20DOC/wsdl-to-java.html";
	public static final String XFIRE_HELP_URL = "http://xfire.codehaus.org/Client+and+Server+Stub+Generation+from+WSDL";
	public static final String XMLBEANS_HELP_URL = "http://xmlbeans.apache.org/docs/2.0.0/guide/tools.html#scomp";
	public static final String ORACLEWSA_HELP_URL = HELP_URL_ROOT + "tools/topdown.html#Oracle_WSA";
	public static final String JBOSSWS_WSCONSUME_HELP_URL = "http://jbws.dyndns.org/mediawiki/index.php/Wsconsume";

	public static final String MAX_ERRORS_LOAD_TEST_ASSERTION_HELP_URL = HELP_URL_ROOT
			+ "loadtest/assertions.html#Max_Errors_Assertion";
	public static final String STEP_MAXIMUM_LOAD_TEST_ASSERTION_HELP_URL = HELP_URL_ROOT
			+ "loadtest/assertions.html#Step_Maximum_Assertion";
	public static final String STEP_STATUS_LOAD_TEST_ASSERTION_HELP_URL = HELP_URL_ROOT
			+ "loadtest/assertions.html#Step_Status_Assertion";
	public static final String STEP_TPS_LOAD_TEST_ASSERTION_HELP_URL = HELP_URL_ROOT
			+ "loadtest/assertions.html#Step_TPS_Assertion";
	public static final String STEP_AVERAGE_LOAD_TEST_ASSERTION_HELP_URL = HELP_URL_ROOT
			+ "loadtest/assertions.html#Step_Average_Assertion";

	public static final String SIMPLE_CONTAINS_HELP_URL = HELP_URL_ROOT
			+ "functional/response-assertions.html#Simple_Contains";
	public static final String SIMPLE_NOT_CONTAINS_HELP_URL = HELP_URL_ROOT
			+ "functional/response-assertions.html#Simple_NotContains_Assertion";
	public static final String GROOVYASSERTION_HELP_URL = HELP_URL_ROOT
			+ "functional/response-assertions.html#Script_Assertion";

	public static final String MOCKSERVICE_HELP_URL = HELP_URL_ROOT + "mock/services.html";
	public static final String MOCKRESPONSE_SCRIPT_HELP_URL = HELP_URL_ROOT + "mock/responses.html#Response_Scripts";

	public static final String MOCKOPERATION_HELP_URL = HELP_URL_ROOT + "mock/operations.html";
	public static final String MOCKOPERATION_SCRIPTDISPATCH_HELP_URL = HELP_URL_ROOT
			+ "mock/operations.html#Groovy_Script_Dispatching";
	public static final String MOCKOPERATION_XPATHDISPATCH_HELP_URL = HELP_URL_ROOT
			+ "mock/operations.html#XPath_Dispatching";

	public static final String RESPONSE_ASSERTIONS_HELP_URL = HELP_URL_ROOT + "functional/response-assertions.html";

	public static final String TESTRUNNER_HELP_URL = HELP_URL_ROOT + "commandline/testcaserunner.html#Launch_Dialog";
	public static final String XQUERYASSERTIONEDITOR_HELP_URL = HELP_URL_ROOT
			+ "functional/response-assertions.html#XQuery_Match_Assertion";

	public static final String LOADTEST_ASSERTIONS_URL = HELP_URL_ROOT + "loadtest/assertions.html";

	public static final String UPDATE_INTERFACE_HELP_URL = HELP_URL_ROOT
			+ "interfaces/index.html#Updating_the_Interface_Definition";

	public static final String NEWPROJECT_HELP_URL = HELP_URL_ROOT + "projects/index.html#Creating_a_WSDL_Projects";

	public static final String GENERATE_MOCKSERVICE_HELP_URL = HELP_URL_ROOT + "mock/services.html";

	public static final String GENERATE_TESTSUITE_HELP_URL = HELP_URL_ROOT + "functional/testsuites.html";

	public static final String CHANGEMOCKOPERATION_HELP_URL = HELP_URL_ROOT + "mock/operations.html#Change_Operation";

	public static final String CLONEMOCKSERVICE_HELP_URL = HELP_URL_ROOT + "mock/services.html";

	public static final String MOCKSERVICEOPTIONS_HELP_URL = HELP_URL_ROOT + "mock/services.html#MockService_Options";

	public static final String CLONETESTCASE_HELP_URL = HELP_URL_ROOT + "functional/testcases.html#Clone_TestCase";

	public static final String CLONETESTSTEP_HELP_URL = HELP_URL_ROOT + "functional/testcases.html#Clone_TestSteps";

	public static final String CLONETESTSUITE_HELP_URL = HELP_URL_ROOT + "functional/testsuites.html";

	public static final String CHANGEOPERATION_HELP_URL = HELP_URL_ROOT
			+ "functional/testrequests.html#Change_Operation";

	public static final String RUNTESTCASESTEP_HELP_URL = HELP_URL_ROOT + "functional/runtestcasestep.html";

	public static final String SOAPMONITOR_HELP_URL = HELP_URL_ROOT + "monitor/index.html";
	public static final String SOAPMONITOR_GENERAL_OPTIONS = "http://www.soapui.org/HTTP-Recording/general-options.html";
	public static final String SOAPMONITOR_MONITOR_OPTIONS = "http://www.soapui.org/HTTP-Recording/monitor-options.html";
	public static final String SOAPMONITOR_MONITOR = "http://www.soapui.org/HTTP-Recording/monitor.html";

	public static final String WSS_HELP_URL = HELP_URL_ROOT + "projects/wss.html";

	public static final String OUTGOINGWSS_HELP_URL = HELP_URL_ROOT + "projects/wss.html#Outgoing_WSS";

	public static final String INCOMINGWSS_HELP_URL = HELP_URL_ROOT + "projects/wss.html#Incoming_WSS";

	public static final String CRYPTOSWSS_HELP_URL = HELP_URL_ROOT + "projects/wss.html#Keystores";

	public static final String NEWRESTPROJECT_HELP_URL = "http://www.soapui.org/REST-Testing/getting-started.html";

	public static final String NEWRESTSERVICE_HELP_URL = HELP_URL_ROOT + "rest/index.html";

	public static final String RESTREQUESTEDITOR_HELP_URL = HELP_URL_ROOT + "rest/requests.html";

	public static final String RESTMETHODEDITOR_HELP_URL = HELP_URL_ROOT + "rest/methods.html";

	public static final String CREATEWADLDOC_HELP_URL = HELP_URL_ROOT + "rest/index.html";

	public static final String WADL2JAVA_HELP_URL = "https://wadl.dev.java.net/wadl2java.html";

	public static final String WADL_PARAMS_HELP_URL = HELP_URL_ROOT + "rest/params.html";

	public static final String NEW_WADL_PROJECT_HELP_URL = "http://www.soapui.org/REST-Testing/working-with-rest-services.html";

	public static final String RESTRESOURCEEDITOR_HELPURL = HELP_URL_ROOT + "rest/resources.html";

	public static final String MOCKOPERATION_QUERYMATCHDISPATCH_HELP_URL = HELP_URL_ROOT
			+ "mock/operations.html#Query/Match_Dispatching";

	public static final String FORUMS_HELP_URL = "http://forum.soapui.org/";

	public static final String TRIAL_URL = "http://www.eviware.com/soapui/trial";

	public static final String TESTSUITELIST_HELP_URL = null;

	public static final String JDBC_CONNECTION_HELP_URL = HELP_URL_ROOT + "projects/jdbcConnections.html";

	public static final String MOCKASWAR_HELP_URL = HELP_URL_ROOT + "mock/mock_as_war.html";

	public static final String MANUALTESTSTEP_HELP_URL = "";

	public static final String SECURITYTESTEDITOR_HELP_URL = "http://www.soapui.org/Security/working-with-security-tests.html";

	public static final String SECURITY_ASSERTION_HELP = "http://www.soapui.org/Security/security-scans-overview.html#3-security-scan-assertions";
	public static final String SECURITY_XSS_ASSERTION_HELP = "http://www.soapui.org/Security/cross-site-scripting.html";
	public static final String SECURITY_INVALID_HTTP_CODES_ASSERTION_HELP = "http://www.soapui.org/Security/security-scans-overview.html#3-1-invalid-http-codes";
	public static final String SECURITY_VALID_HTTP_CODES_ASSERTION_HELP = "http://www.soapui.org/Security/security-scans-overview.html#3-2-valid-http-codes";
	public static final String SECURITY_SENSITIVE_INFORMATION_EXPOSURE_ASSERTION_HELP = "http://www.soapui.org/Security/security-scans-overview.html#3-3-system-information-exposure";
	public static final String SECURITY_MALICIOUS_ATTACHMENT_HELP = "http://www.soapui.org/Security/malicious-attachment.html";

	public static final String SECURITY_SCANS_OVERVIEW = "http://www.soapui.org/Security/security-scans-overview.html";
	public static final String ALERT_SITE_HELP_URL = HELP_URL_ROOT + "";
	public static final String ADD_ASSERTION_PANEL = "http://www.soapui.org/Functional-Testing/getting-started-with-assertions.html#add_assertion";

	public static final String ADD_AUTHORIZATION = "http://www.soapui.org/OAuth/add-authorization.html";
	public static final String OAUTH_OVERVIEW = "http://www.soapui.org/OAuth/oauth2-overview.html";
	public static final String OAUTH_ACCESS_TOKEN_FROM_SERVER = "http://www.soapui.org/OAuth/access-token-from-server.html";
	public static final String OAUTH_AUTOMATING_ACCES_TOKEN_RETRIEVAL = "http://www.soapui.org/OAuth/automating-access-token-retrieval.html";
	public static final String OAUTH_ADVANCED_OPTIONS = "http://www.soapui.org/OAuth/advanced-options.html";
	public static final String OAUTH_ACCESS_TOKEN_RETRIEVAL = "http://www.soapui.org/OAuth/access-token-retrieval.html";
	public static final String OAUTH_AUTOMATED_TOKEN_PROFILE_EDITOR = "http://www.soapui.org/OAuth/automated-token-profile-editor.html";

	public static final String AUTHORIZATION = "http://www.soapui.org/OAuth/authorization.html";
	public static final String AUTHORIZATION_BASIC = "http://www.soapui.org/OAuth/Basic.html";
	public static final String AUTHORIZATION_NTLM = "http://www.soapui.org/OAuth/NTLM.html";
	public static final String AUTHORIZATION_SPNEGO_KERBEROS = "http://www.soapui.org/OAuth/SPNEGO-Kerberos.html";
	public static final String AUTHORIZATION_OAUTH2 = "http://www.soapui.org/OAuth/OAuth2.html";

	public static final String REST_MOCKSERVICE_HELP_URL = "http://www.soapui.org/REST-Service-Mocking/mock-service-editor.html";
	public static final String REST_MOCKSERVICE_ACTION = "http://www.soapui.org/REST-Service-Mocking/mock-action-editor.html";
	public static final String REST_MOCK_RESPONSE_EDITOR = "http://www.soapui.org/REST-Service-Mocking/mock-response-editor.html";
	public static final String REST_MOCK_RESPONSE_EDITOR_HEADER = "http://www.soapui.org/REST-Service-Mocking/mock-response-editor-header.html";
	public static final String REST_MOCK_RESPONSE_SCRIPT = "http://www.soapui.org/REST-Service-Mocking/mock-response-script.html";
	public static final String REST_MOCK_RESPONSE_EDITOR_BODY = "http://www.soapui.org/REST-Service-Mocking/mock-response-editor-body.html";
	public static final String API_TESTING_DOJO_HELP_URL = "http://www.soapui.org/dojo/overview.html";
}
