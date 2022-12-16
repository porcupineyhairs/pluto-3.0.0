/*  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package javax.portlet.tck.portlets;

import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYA1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYA2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYB1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYB3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYB4;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYC1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYC2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_SETPROPERTY1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_SETPROPERTY3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ENCODEURL1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ENCODEURL2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_GETNAMESPACE1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT4;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT5;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT6;
import static javax.portlet.PortletSession.APPLICATION_SCOPE;
import static javax.portlet.tck.constants.Constants.RESULT_ATTR_PREFIX;
import static javax.portlet.tck.constants.Constants.THREADID_ATTR;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.tck.beans.JSR286ApiTestCaseDetails;
import javax.portlet.tck.beans.TestButton;
import javax.portlet.tck.beans.TestResult;
import javax.portlet.tck.constants.Constants;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case
 * names are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the
 * additionalTCs.xml file into the complete list of test case names for
 * execution by the driver.
 *
 * This is the main portlet for the test cases. If the test cases call for
 * events, this portlet will initiate the events, but not process them. The
 * processing is done in the companion portlet
 * ResponseTests_PortletResponse_ApiAction_event
 *
 */
public class ResponseTests_PortletResponse_ApiAction implements Portlet {

   @Override
   public void init(PortletConfig config) throws PortletException {
   }

   @Override
   public void destroy() {
   }

   @Override
   public void processAction(ActionRequest portletReq,
         ActionResponse portletResp) throws PortletException, IOException {

      portletResp.setRenderParameters(portletReq.getParameterMap());
      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      StringWriter writer = new StringWriter();

      JSR286ApiTestCaseDetails tcd = new JSR286ApiTestCaseDetails();

      // Create result objects for the tests

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyA1 */
      /* Details: "Method addProperty(javax.servlet.http.Cookie): Adds the */
      /* specified cookie property to the response" */
      TestResult tr0 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYA1);
      tr0.setTcSuccess(true);
      tr0.appendTcDetail(
            "This Method Could not be tested as Specified Property cannot be added to the response for this Test Portlets ");
      tr0.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyA2 */
      /* Details: "Method addProperty(javax.servlet.http.Cookie): Throws */
      /* IllegalArgumentException if the specified cookie is null" */
      TestResult tr1 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYA2);
      try {
         try {
            portletResp.addProperty(null);
            tr1.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr1.setTcSuccess(true);
         } catch (Exception e) {
            tr1.appendTcDetail(e.toString());
         }
      } catch (Exception e) {
         tr1.appendTcDetail(e.toString());
      }
      tr1.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyB1 */
      /* Details: "Method addProperty(String, org.w3c.dom.Element): Adds an */
      /* XML DOM Element to the response for the specified key" */
      TestResult tr2 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYB1);
      tr2.setTcSuccess(true);
      tr2.appendTcDetail(
            "This Method Could not be tested as XML DOM element cannot be added to the response for this Test Portlets ");
      tr2.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyB3 */
      /* Details: "Method addProperty(String, org.w3c.dom.Element): If the */
      /* specified DOM Element value is null, the key is removed from the */
      /* response" */
      TestResult tr3 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYB3);
      tr3.setTcSuccess(true);
      tr3.appendTcDetail(
            "This Method Could not be tested as XML DOM element cannot be added to the response for this Test Portlets ");
      tr3.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyB4 */
      /* Details: "Method addProperty(String, org.w3c.dom.Element): Throws */
      /* IllegalArgumentException if the specified key is null" */
      TestResult tr4 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYB4);
      try {
         try {
            org.w3c.dom.Element el = portletResp.createElement("p");
            portletResp.addProperty((String) null, el);
            tr4.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr4.setTcSuccess(true);
         } catch (Exception e) {
            tr4.appendTcDetail(e.toString());
         }
      } catch (Exception e) {
         tr4.appendTcDetail(e.toString());
      }
      tr4.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyC1 */
      /* Details: "Method addProperty(String, String): A property can be */
      /* added" */
      TestResult tr5 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYC1);
      tr5.setTcSuccess(true);
      tr5.appendTcDetail(
            "This Method could not be Tested as Property cannot be added to the Response for this Test Portlet");
      tr5.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyC2 */
      /* Details: "Method addProperty(String, String): Throws */
      /* IllegalArgumentException if the specified key is null" */
      TestResult tr6 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYC2);
      try {
         try {
            portletResp.addProperty(null, "value");
            tr6.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr6.setTcSuccess(true);
         } catch (Exception e) {
            tr6.appendTcDetail(e.toString());
         }
      } catch (Exception e) {
         tr6.appendTcDetail(e.toString());
      }
      tr6.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_setProperty1 */
      /* Details: "Method setProperty(String, String): Sets a property */
      /* value for the specified key" */
      TestResult tr7 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_SETPROPERTY1);
      tr7.setTcSuccess(true);
      tr7.appendTcDetail(
            "This Method Could not be Tested as Property value cannot be added to Response for this Test Portlet");
      tr7.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_setProperty3 */
      /* Details: "Method setProperty(String, String): Throws */
      /* IllegalArgumentException if the specified key is null" */
      TestResult tr8 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_SETPROPERTY3);
      try {
         try {
            portletResp.setProperty(null, "value");
            tr8.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr8.setTcSuccess(true);
         } catch (Exception e) {
            tr8.appendTcDetail(e.toString());
         }
      } catch (Exception e) {
         tr8.appendTcDetail(e.toString());
      }
      tr8.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_encodeURL1 */
      /* Details: "Method encodeURL(String): Returns a String representing */
      /* the encoded URL" */
      TestResult tr9 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ENCODEURL1);
      try {
         String ecode = portletResp.encodeURL("/sample.img");
         if (ecode.equals("/sample.img")) {
            tr9.setTcSuccess(true);
         }
      } catch (IllegalArgumentException iae) {
         tr9.appendTcDetail(iae.toString());
      }
      tr9.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_encodeURL2 */
      /* Details: "Method encodeURL(String): Throws */
      /* IllegalArgumentException if the input string is not an absolute */
      /* URL and does not start with at \"/\" character" */
      TestResult tr10 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ENCODEURL2);
      try {
         portletResp.encodeURL("sample.img");
         tr10.appendTcDetail("Method Did not Throw Exception");
      } catch (IllegalArgumentException iae) {
         tr10.setTcSuccess(true);
      }
      tr10.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_getNamespace1 */
      /* Details: "Method getNamespace(): Returns a String containing the */
      /* namespace value" */
      TestResult tr11 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_GETNAMESPACE1);
      String getName = portletResp.getNamespace();
      if (getName != null) {
         tr11.setTcSuccess(true);
      }
      tr11.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement1 */
      /* Details: "Method createElement(String): Returns an */
      /* org.w3c.dom.Element object for the specified tag name" */
      TestResult tr12 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT1);
      try {
         org.w3c.dom.Element el = portletResp.createElement("Test1");
         if (el.getTagName().toString().equals("Test1")) {
            tr12.setTcSuccess(true);
         }

      } catch (org.w3c.dom.DOMException de) {
         tr12.appendTcDetail(de.toString());
      }
      tr12.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement2 */
      /* Details: "Method createElement(String): The returned Element has */
      /* nodeName set to the the specified tag name " */
      TestResult tr13 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT2);
      try {
         org.w3c.dom.Element el = portletResp.createElement("Test2");
         if (el.getNodeName().equals("Test2")) {
            tr13.setTcSuccess(true);
         }
      } catch (org.w3c.dom.DOMException de) {
         tr13.appendTcDetail(de.toString());
      }
      tr13.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement3 */
      /* Details: "Method createElement(String): The returned Element has */
      /* localName set to null" */
      TestResult tr14 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT3);
      try {
         org.w3c.dom.Element el = portletResp.createElement("Test3");
         String loc = el.getLocalName();
         if (loc == null) {
            tr14.setTcSuccess(true);
         }
      } catch (org.w3c.dom.DOMException de) {
         tr14.appendTcDetail(de.toString());
      }
      tr14.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement4 */
      /* Details: "Method createElement(String): The returned Element has */
      /* prefix set to null" */
      TestResult tr15 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT4);
      try {
         org.w3c.dom.Element el = portletResp.createElement("Test4");
         String prefix = el.getPrefix();
         if (prefix == null) {
            tr15.setTcSuccess(true);
         }
      } catch (org.w3c.dom.DOMException de) {
         tr15.appendTcDetail(de.toString());
      }
      tr15.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement5 */
      /* Details: "Method createElement(String): The returned Element has */
      /* namespaceURI set to null" */
      TestResult tr16 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT5);
      try {
         org.w3c.dom.Element el = portletResp.createElement("Test5");
         String nameSpace = el.getNamespaceURI();
         if (nameSpace == null) {
            tr16.setTcSuccess(true);
         }
      } catch (org.w3c.dom.DOMException de) {
         tr16.appendTcDetail(de.toString());
      }
      tr16.writeTo(writer);

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement6 */
      /* Details: "Method createElement(String): Throws */
      /* org.w3c.dom.DOMException - INVALID_CHARACTER_ERR if the specified */
      /* name contains an illegal character. " */
      TestResult tr17 = tcd.getTestResultFailed(
            V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT6);
      try {
         portletResp.createElement("$Test6");
         tr17.appendTcDetail("Method did not Throw Exception");
      } catch (org.w3c.dom.DOMException de) {
         tr17.setTcSuccess(true);
      }
      tr17.writeTo(writer);

      portletReq.getPortletSession().setAttribute(
            Constants.RESULT_ATTR_PREFIX
                  + "ResponseTests_PortletResponse_ApiAction",
            writer.toString(), APPLICATION_SCOPE);
   }

   @Override
   public void render(RenderRequest portletReq, RenderResponse portletResp)
         throws PortletException, IOException {

      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      PrintWriter writer = portletResp.getWriter();

      PortletSession ps = portletReq.getPortletSession();
      String msg = (String) ps.getAttribute(
            RESULT_ATTR_PREFIX + "ResponseTests_PortletResponse_ApiAction",
            APPLICATION_SCOPE);
      if (msg != null) {
         writer.write("<p>" + msg + "</p><br/>\n");
         ps.removeAttribute(
               RESULT_ATTR_PREFIX + "ResponseTests_PortletResponse_ApiAction",
               APPLICATION_SCOPE);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyA1 */
      /* Details: "Method addProperty(javax.servlet.http.Cookie): Adds the */
      /* specified cookie property to the response" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYA1, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyA2 */
      /* Details: "Method addProperty(javax.servlet.http.Cookie): Throws */
      /* IllegalArgumentException if the specified cookie is null" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYA2, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyB1 */
      /* Details: "Method addProperty(String, org.w3c.dom.Element): Adds an */
      /* XML DOM Element to the response for the specified key" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYB1, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyB3 */
      /* Details: "Method addProperty(String, org.w3c.dom.Element): If the */
      /* specified DOM Element value is null, the key is removed from the */
      /* response" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYB3, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyB4 */
      /* Details: "Method addProperty(String, org.w3c.dom.Element): Throws */
      /* IllegalArgumentException if the specified key is null" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYB4, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyC1 */
      /* Details: "Method addProperty(String, String): A property can be */
      /* added" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYC1, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_addPropertyC2 */
      /* Details: "Method addProperty(String, String): Throws */
      /* IllegalArgumentException if the specified key is null" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ADDPROPERTYC2, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_setProperty1 */
      /* Details: "Method setProperty(String, String): Sets a property */
      /* value for the specified key" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_SETPROPERTY1, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_setProperty3 */
      /* Details: "Method setProperty(String, String): Throws */
      /* IllegalArgumentException if the specified key is null" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_SETPROPERTY3, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_encodeURL1 */
      /* Details: "Method encodeURL(String): Returns a String representing */
      /* the encoded URL" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ENCODEURL1, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_encodeURL2 */
      /* Details: "Method encodeURL(String): Throws */
      /* IllegalArgumentException if the input string is not an absolute */
      /* URL and does not start with at \"/\" character" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_ENCODEURL2, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_getNamespace1 */
      /* Details: "Method getNamespace(): Returns a String containing the */
      /* namespace value" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_GETNAMESPACE1, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement1 */
      /* Details: "Method createElement(String): Returns an */
      /* org.w3c.dom.Element object for the specified tag name" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT1, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement2 */
      /* Details: "Method createElement(String): The returned Element has */
      /* nodeName set to the the specified tag name " */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT2, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement3 */
      /* Details: "Method createElement(String): The returned Element has */
      /* localName set to null" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT3, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement4 */
      /* Details: "Method createElement(String): The returned Element has */
      /* prefix set to null" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT4, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement5 */
      /* Details: "Method createElement(String): The returned Element has */
      /* namespaceURI set to null" */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT5, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2ResponseTests_PortletResponse_ApiAction_createElement6 */
      /* Details: "Method createElement(String): Throws */
      /* org.w3c.dom.DOMException - INVALID_CHARACTER_ERR if the specified */
      /* name contains an illegal character. " */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(
               V2RESPONSETESTS_PORTLETRESPONSE_APIACTION_CREATEELEMENT6, aurl);
         tb.writeTo(writer);
      }

   }

}
