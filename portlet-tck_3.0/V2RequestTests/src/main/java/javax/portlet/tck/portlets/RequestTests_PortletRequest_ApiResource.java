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

import static javax.portlet.ResourceURL.PAGE;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_EXISTS;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDACTION_PHASE;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDACTION_SCOPE_ID;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDBASIC_AUTH;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDCCPP_PROFILE;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDCLIENT_CERT_AUTH;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDDIGEST_AUTH;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDEVENT_PHASE;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDFORM_AUTH;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDLIFECYCLE_PHASE;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDRENDER_HEADERS;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDRENDER_MARKUP;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDRENDER_PART;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDRENDER_PHASE;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDRESOURCE_PHASE;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDUSER_INFO;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETATTRIBUTE1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETATTRIBUTE2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETATTRIBUTE3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETATTRIBUTENAMES1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETATTRIBUTENAMES2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETAUTHTYPE1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETAUTHTYPE2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETCONTEXTPATH1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETCONTEXTPATH2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETCONTEXTPATH3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETCOOKIES1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETCOOKIES2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETLOCALE;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETLOCALES;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETER1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETER2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETER3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETER4;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETER5;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERMAP1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERMAP2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERMAP3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERNAMES1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERNAMES2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES4;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTALCONTEXT;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETMODE;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONA1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONA2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONB1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONB2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONB3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONB4;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPREFERENCES;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPRIVATEPARAMETERMAP1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPRIVATEPARAMETERMAP2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPRIVATEPARAMETERMAP3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTIES1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTIES2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTIES3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTY1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTY2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTY3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTYNAMES1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTYNAMES2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPUBLICPARAMETERMAP1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPUBLICPARAMETERMAP2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPUBLICPARAMETERMAP3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETREMOTEUSER1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETREMOTEUSER2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETREQUESTEDSESSIONID1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETREQUESTEDSESSIONID2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETRESPONSECONTENTTYPE1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETRESPONSECONTENTTYPE2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETRESPONSECONTENTTYPES1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETRESPONSECONTENTTYPES2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETSCHEME;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETSERVERNAME;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETSERVERPORT;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETUSERPRINCIPAL1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETUSERPRINCIPAL2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETWINDOWID;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETWINDOWSTATE;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISPORTLETMODEALLOWED1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISPORTLETMODEALLOWED2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISREQUESTEDSESSIONIDVALID1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISREQUESTEDSESSIONIDVALID2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISSECURE1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISSECURE2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISUSERINROLE1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISUSERINROLE2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISUSERINROLE3;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISWINDOWSTATEALLOWED1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISWINDOWSTATEALLOWED2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_REMOVEATTRIBUTE1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_REMOVEATTRIBUTE2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_SETATTRIBUTE1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_SETATTRIBUTE2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_SETATTRIBUTE3;
import static javax.portlet.tck.constants.Constants.THREADID_ATTR;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortalContext;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.ResourceServingPortlet;
import javax.portlet.ResourceURL;
import javax.portlet.WindowState;
import javax.portlet.tck.beans.ClassChecker;
import javax.portlet.tck.beans.JSR286ApiTestCaseDetails;
import javax.portlet.tck.beans.TestLink;
import javax.portlet.tck.beans.TestResult;
import javax.servlet.http.Cookie;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 *
 * This is the main portlet for the test cases. If the test cases call for events, this portlet
 * will initiate the events, but not process them. The processing is done in the companion 
 * portlet RequestTests_PortletRequest_ApiResource_event
 *
 */
public class RequestTests_PortletRequest_ApiResource implements Portlet, ResourceServingPortlet {
   private static final String LOG_CLASS = 
         RequestTests_PortletRequest_ApiResource.class.getName();
   private final Logger LOGGER = Logger.getLogger(LOG_CLASS);
   
  

   @Override
   public void init(PortletConfig config) throws PortletException {
   
   }

   @Override
   public void destroy() {
   }

   @Override
   public void processAction(ActionRequest portletReq, ActionResponse portletResp)
         throws PortletException, IOException {
      LOGGER.entering(LOG_CLASS, "main portlet processAction entry");

      portletResp.setRenderParameters(portletReq.getParameterMap());
      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

     

   }

   @Override
   public void serveResource(ResourceRequest portletReq, ResourceResponse portletResp)
         throws PortletException, IOException {
      LOGGER.entering(LOG_CLASS, "main portlet serveResource entry");

      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      PrintWriter writer = portletResp.getWriter();

      JSR286ApiTestCaseDetails tcd = new JSR286ApiTestCaseDetails();

      // Create result objects for the tests

      ClassChecker cc = new ClassChecker(portletReq.getClass());

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldUSER_INFO   */
      /* Details: "Has String field USER_INFO with value of                   */
      /* \"javax.portlet.userinfo\" "                                         */
      TestResult tr0 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDUSER_INFO);
      try {
         tr0.setTcSuccess(cc.hasField("USER_INFO", "javax.portlet.userinfo"));
      } catch(Exception e) {tr0.appendTcDetail(e.toString());}
      tr0.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldCCPP_PROFILE */
      /* Details: "Has String field CCPP_PROFILE with value of                */
      /* \"javax.portlet.ccpp\" "                                             */
      TestResult tr1 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDCCPP_PROFILE);
      try {
         tr1.setTcSuccess(cc.hasField("CCPP_PROFILE", "javax.portlet.ccpp"));
      } catch(Exception e) {tr1.appendTcDetail(e.toString());}
      tr1.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldBASIC_AUTH  */
      /* Details: "Has String field BASIC_AUTH with value of \"BASIC\" "      */
      TestResult tr2 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDBASIC_AUTH);
      try {
         tr2.setTcSuccess(cc.hasField("BASIC_AUTH", "BASIC"));
      } catch(Exception e) {tr2.appendTcDetail(e.toString());}
      tr2.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldFORM_AUTH   */
      /* Details: "Has String field FORM_AUTH with value of \"FORM\" "        */
      TestResult tr3 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDFORM_AUTH);
      try {
         tr3.setTcSuccess(cc.hasField("FORM_AUTH", "FORM"));
      } catch(Exception e) {tr3.appendTcDetail(e.toString());}
      tr3.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldCLIENT_CERT_AUTH */
      /* Details: "Has String field CLIENT_CERT_AUTH with value of            */
      /* \"CLIENT_CERT\" "                                                    */
      TestResult tr4 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDCLIENT_CERT_AUTH);
      try {
         tr4.setTcSuccess(cc.hasField("CLIENT_CERT_AUTH", "CLIENT_CERT"));
      } catch(Exception e) {tr4.appendTcDetail(e.toString());}
      tr4.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldDIGEST_AUTH */
      /* Details: "Has String field DIGEST_AUTH with value of \"DIGEST\" "    */
      TestResult tr5 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDDIGEST_AUTH);
      try {
         tr5.setTcSuccess(cc.hasField("DIGEST_AUTH", "DIGEST"));
      } catch(Exception e) {tr5.appendTcDetail(e.toString());}
      tr5.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldACTION_PHASE */
      /* Details: "Has String field ACTION_PHASE with value of                */
      /* \"ACTION_PHASE\" "                                                   */
      TestResult tr6 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDACTION_PHASE);
      try {
         tr6.setTcSuccess(cc.hasField("ACTION_PHASE", "ACTION_PHASE"));
      } catch(Exception e) {tr6.appendTcDetail(e.toString());}
      tr6.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldEVENT_PHASE */
      /* Details: "Has String field EVENT_PHASE with value of                 */
      /* \"EVENT_PHASE\" "                                                    */
      TestResult tr7 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDEVENT_PHASE);
      try {
         tr7.setTcSuccess(cc.hasField("EVENT_PHASE", "EVENT_PHASE"));
      } catch(Exception e) {tr7.appendTcDetail(e.toString());}
      tr7.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldRENDER_PHASE */
      /* Details: "Has String field RENDER_PHASE with value of                */
      /* \"RENDER_PHASE\" "                                                   */
      TestResult tr8 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDRENDER_PHASE);
      try {
         tr8.setTcSuccess(cc.hasField("RENDER_PHASE", "RENDER_PHASE"));
      } catch(Exception e) {tr8.appendTcDetail(e.toString());}
      tr8.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldRESOURCE_PHASE */
      /* Details: "Has String field RESOURCE_PHASE with value of              */
      /* \"RESOURCE_PHASE\" "                                                 */
      TestResult tr9 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDRESOURCE_PHASE);
      try {
         tr9.setTcSuccess(cc.hasField("RESOURCE_PHASE", "RESOURCE_PHASE"));
      } catch(Exception e) {tr9.appendTcDetail(e.toString());}
      tr9.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldLIFECYCLE_PHASE */
      /* Details: "Has String field LIFECYCLE_PHASE with value of             */
      /* \"javax.portlet.lifecycle_phase\" "                                  */
      TestResult tr10 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDLIFECYCLE_PHASE);
      try {
         tr10.setTcSuccess(cc.hasField("LIFECYCLE_PHASE", "javax.portlet.lifecycle_phase"));
      } catch(Exception e) {tr10.appendTcDetail(e.toString());}
      tr10.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldRENDER_PART */
      /* Details: "Has String field RENDER_PART with value of                 */
      /* \"javax.portlet.render_part\" "                                      */
      TestResult tr11 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDRENDER_PART);
      try {
         tr11.setTcSuccess(cc.hasField("RENDER_PART", "javax.portlet.render_part"));
      } catch(Exception e) {tr11.appendTcDetail(e.toString());}
      tr11.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldRENDER_HEADERS */
      /* Details: "Has String field RENDER_HEADERS with value of              */
      /* \"RENDER_HEADERS\" "                                                 */
      TestResult tr12 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDRENDER_HEADERS);
      try {
         tr12.setTcSuccess(cc.hasField("RENDER_HEADERS", "RENDER_HEADERS"));
      } catch(Exception e) {tr12.appendTcDetail(e.toString());}
      tr12.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldRENDER_MARKUP */
      /* Details: "Has String field RENDER_MARKUP with value of               */
      /* \"RENDER_MARKUP\" "                                                  */
      TestResult tr13 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDRENDER_MARKUP);
      try {
         tr13.setTcSuccess(cc.hasField("RENDER_MARKUP", "RENDER_MARKUP"));
      } catch(Exception e) {tr13.appendTcDetail(e.toString());}
      tr13.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_fieldACTION_SCOPE_ID */
      /* Details: "Has String field ACTION_SCOPE_ID with value of             */
      /* \"javax.portlet.as\" "                                               */
      TestResult tr14 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_FIELDACTION_SCOPE_ID);
      try {
         tr14.setTcSuccess(cc.hasField("ACTION_SCOPE_ID", "javax.portlet.as"));
      } catch(Exception e) {tr14.appendTcDetail(e.toString());}
      tr14.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_isWindowStateAllowed1 */
      /* Details: "Method isWindowStateAllowed(WindowState): Returns true     */
      /* if the specified WindowState is allowed"                             */
      TestResult tr15 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISWINDOWSTATEALLOWED1);
      boolean bswt=portletReq.isWindowStateAllowed(WindowState.NORMAL);
      if (bswt==true) {
    	  tr15.setTcSuccess(true);
      }  else {
    	  tr15.appendTcDetail("The window State is not allowed");
          }
      tr15.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_isWindowStateAllowed2 */
      /* Details: "Method isWindowStateAllowed(WindowState): Returns false    */
      /* if the specified WindowState is not allowed"                         */
      TestResult tr16 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISWINDOWSTATEALLOWED2);
      boolean bswf=portletReq.isWindowStateAllowed(new WindowState("popup"));
      if (bswf==false) {
    	  tr16.setTcSuccess(true);
      }  else {
    	  tr16.appendTcDetail("The Supported Window state is" +portletReq.getWindowState());
          }
      tr16.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_isPortletModeAllowed1 */
      /* Details: "Method isPortletModeAllowed(PortletMode): Returns true     */
      /* if the specified PortletMode is allowed"                             */
      TestResult tr17 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISPORTLETMODEALLOWED1);
      boolean bspt=portletReq.isPortletModeAllowed(PortletMode.VIEW);
      if (bspt==true) {
    	  tr17.setTcSuccess(true);
      }  else {
    	  tr17.appendTcDetail("The PortletMode is not allowed");
          }
      tr17.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_isPortletModeAllowed2 */
      /* Details: "Method isPortletModeAllowed(PortletMode): Returns false    */
      /* if the specified PortletMode is not allowed"                         */
      TestResult tr18 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISPORTLETMODEALLOWED2);
      boolean bspf=portletReq.isPortletModeAllowed(new PortletMode("Test"));
      if (bspf==false) {
    	  tr18.setTcSuccess(true);
      }  else {
    	  tr18.appendTcDetail("The Supported Portlet Mode is" +portletReq.getPortletMode());
          }
      tr18.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPortletMode   */
      /* Details: "Method getPortletMode(): Returns current PortletMode "     */
      TestResult tr19 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETMODE);
      PortletMode pm=portletReq.getPortletMode();
      if(pm!=null ) {
          tr19.setTcSuccess(true);
      } else {  
          tr19.appendTcDetail("The PortletMode has null value");
      }
      tr19.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getWindowState   */
      /* Details: "Method getWindowState(): Returns current WindowState"      */
      TestResult tr20 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETWINDOWSTATE);
      WindowState ws=portletReq.getWindowState();
      if(ws!=null) {
    	  tr20.setTcSuccess(true);
      } else {
    	  tr20.appendTcDetail("The WindowState has null value");
      }
      tr20.writeTo(writer);	  

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPreferences   */
      /* Details: "Method getPreferences(): Returns the PortletPreferences    */
      /* object associated with the portlet"                                  */
      TestResult tr21 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPREFERENCES);
      PortletPreferences pp=portletReq.getPreferences();
      if(pp!=null) {
    	  tr21.setTcSuccess(true);
      } else {
    	  tr21.appendTcDetail("The PortletPreferences has null value");
      }
      tr21.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPortletSessionA1 */
      /* Details: "Method getPortletSession(): Returns current                */
      /* PortletSession if one already exists"                                */
      TestResult tr22 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONA1);
      PortletSession ps1=portletReq.getPortletSession();
      if(ps1!=null) {
    	  tr22.setTcSuccess(true);
      } else {
    	  tr22.appendTcDetail("The PortletSession has null value");
      }
      tr22.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPortletSessionA2 */
      /* Details: "Method getPortletSession(): Returns new PortletSession     */
      /* if one does not already exist"                                       */
      TestResult tr23 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONA2);
      PortletSession newps2=portletReq.getPortletSession();
      if(newps2!=null) {
    	  tr23.setTcSuccess(true);
      } else {
    	  tr23.appendTcDetail("The New PortletSession has null value");
      }
      tr23.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPortletSessionB1 */
      /* Details: "Method getPortletSession(boolean): If input flag is        */
      /* true, returns current PortletSession if one already exists"          */
      TestResult tr24 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONB1);
      PortletSession bps1=portletReq.getPortletSession(true);
      if(bps1!=null) {
    	  tr24.setTcSuccess(true);
      } else {
    	  tr24.appendTcDetail("The Current PortletSession has null value");
      }
      tr24.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPortletSessionB2 */
      /* Details: "Method getPortletSession(boolean): If input flag is        */
      /* true, returns new PortletSession if one does not already exist"      */
      TestResult tr25 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONB2);
      PortletSession bnewps2=portletReq.getPortletSession(true);
      if(bnewps2!=null) {
    	  tr25.setTcSuccess(true);
      } else {
    	  tr25.appendTcDetail("The new PortletSession has null value");
      }
      tr25.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPortletSessionB3 */
      /* Details: "Method getPortletSession(boolean): If input flag is        */
      /* false, returns current PortletSession if one already exists"         */
      TestResult tr26 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONB3);
      PortletSession bps3=portletReq.getPortletSession(false);
      if(bps3!=null) {
    	  tr26.setTcSuccess(true);
      } else {
    	  tr26.appendTcDetail("The current PortletSession has null value");
      }
      tr26.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPortletSessionB4 */
      /* Details: "Method getPortletSession(boolean): If input flag is        */
      /* false, returns null if one does not already exist"                   */
      TestResult tr27 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTLETSESSIONB4);
      tr27.setTcSuccess(true);
      tr27.appendTcDetail("This method could not be tested for this test portlet which already has portlet session");
      tr27.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getProperty1     */
      /* Details: "Method getProperty(String): If specified request           */
      /* property exists, returns its value "                                 */
      TestResult tr28 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTY1);
      tr28.setTcSuccess(true);
      tr28.appendTcDetail("This Method could not be tested because HTTP headers properties may not be same for all portal/portlet-container");
      tr28.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getProperty2     */
      /* Details: "Method getProperty(String): If specified request           */
      /* property does not exist, returns null"                               */
      TestResult tr29 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTY2);
      String getpropn=portletReq.getProperty("NoProperty");
      if(getpropn==null) {
    	  tr29.setTcSuccess(true);
      } else {
    	  tr29.appendTcDetail("The Specified Property name doesnot exist");
      }
      tr29.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getProperty3     */
      /* Details: "Method getProperty(String): Throws                         */
      /* IllegalArgumentException if the name is null"                        */
      TestResult tr30 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTY3);
      try {
         try {
            portletReq.getProperty(null);
            tr30.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr30.setTcSuccess(true);
         } catch (Exception e) {
            tr30.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr30.appendTcDetail(e.toString());}
      tr30.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getProperties1   */
      /* Details: "Method getProperties(String): If specified request         */
      /* property exists, returns its values as an Enumeration "              */
      TestResult tr31 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTIES1);
      tr31.setTcSuccess(true);
      tr31.appendTcDetail("This Method could not be tested because HTTP headers properties may not be same for all portal/portlet-container");
      tr31.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getProperties2   */
      /* Details: "Method getProperties(String): If specified request         */
      /* property does not exist, returns an empty Enumeration"               */
      TestResult tr32 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTIES2);
      Enumeration<String> getpropsn=portletReq.getProperties("TestProperty");
      List<String> list32=Collections.list(getpropsn);
      if(list32.isEmpty()) {
    	  tr32.setTcSuccess(true);
      } else {
    	  tr32.appendTcDetail("The Specified Property values are" +list32.toString());
      }
      tr32.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getProperties3   */
      /* Details: "Method getProperties(String): Throws                       */
      /* IllegalArgumentException if the name is null"                        */
      TestResult tr33 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTIES3);
      try {
         try {
            portletReq.getProperties(null);
            tr33.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr33.setTcSuccess(true);
         } catch (Exception e) {
            tr33.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr33.appendTcDetail(e.toString());}
      tr33.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPropertyNames1 */
      /* Details: "Method getPropertyNames(): Returns an Enumeration of all   */
      /* request property names"                                              */
      TestResult tr34 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTYNAMES1);
      Enumeration<String> getpropnames=portletReq.getPropertyNames();
      List<String> list34=Collections.list(getpropnames);
      if(list34!=null) {
    	  tr34.setTcSuccess(true);
      } else {
    	  tr34.appendTcDetail("The Property names are not defined and has empty list");
      }
      tr34.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPropertyNames2 */
      /* Details: "Method getPropertyNames(): Returns an empty Enumeration    */
      /* if there are no request properties defined"                          */
      TestResult tr35 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPROPERTYNAMES2);
      tr35.setTcSuccess(true);
      tr35.appendTcDetail("This Method could not be tested for this test portlet which already has some Property names");
      tr35.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPortalContext */
      /* Details: "Method getPortalContext(): Returns the context of the      */
      /* portal"                                                              */
      TestResult tr36 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPORTALCONTEXT);
      PortalContext gpc = portletReq.getPortalContext();
      if(gpc != null) {
    	  tr36.setTcSuccess(true);
      } else {
    	  tr36.setTcDetail("The PortalContext for the portal may not be null");
      }
      tr36.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getAuthType1     */
      /* Details: "Method getAuthType(): Returns a String indicating the      */
      /* authentication type if the request was authenticated"                */
      TestResult tr37 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETAUTHTYPE1);
      String getauth=portletReq.getAuthType();
      if (getauth!=null) {
    	  tr37.setTcSuccess(true);
      } else {
    	  tr37.appendTcDetail("The Authentication Type has null value ");
      }
      tr37.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getAuthType2     */
      /* Details: "Method getAuthType(): Returns null if the request was      */
      /* not authenticated"                                                   */
      TestResult tr38 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETAUTHTYPE2);
      tr38.setTcSuccess(true);
      tr38.appendTcDetail("This Method could not be tested for this portlet which already has an Authentication Type"); 
      tr38.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getContextPath1  */
      /* Details: "Method getContextPath(): Returns a String representing     */
      /* the context path associated with the portlet"                        */
      TestResult tr39 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETCONTEXTPATH1);
      String getctxtpath =portletReq.getContextPath();
      if(getctxtpath!=null && getctxtpath.startsWith("/tck-V2RequestTests")) {
    	  tr39.setTcSuccess(true);
      } else {
    	  tr39.appendTcDetail("The getContextPath has an Empty path ");
      }
      tr39.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getContextPath2  */
      /* Details: "Method getContextPath(): Returns an empty String if the    */
      /* portlet is deployed in the default context"                          */
      TestResult tr40 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETCONTEXTPATH2);
      tr40.setTcSuccess(true);
      tr40.appendTcDetail("This Method could not be tested  which already has ContextPath rooted for this test portlet applicatio ");
      tr40.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getContextPath3  */
      /* Details: "Method getContextPath(): If the context path is not        */
      /* empty, it must start with \"/\" and may not end with \"/\""          */
      TestResult tr41 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETCONTEXTPATH3);
      String getcntxtpath=portletReq.getContextPath();
      if(getcntxtpath!=null && getcntxtpath.startsWith("/") && !getcntxtpath.endsWith("/")) {
    	  tr41.setTcSuccess(true);
      } else {
    	  tr41.appendTcDetail("The getContextPath has an Empty Path / Invalid path" +getcntxtpath);
      }
      tr41.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getRemoteUser1   */
      /* Details: "Method getRemoteUser(): Returns a String representing      */
      /* the login of the user if the request is authenticated"               */
      TestResult tr42 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETREMOTEUSER1);
      String loguser=portletReq.getRemoteUser();
      if(loguser!=null) {
    	  tr42.setTcSuccess(true);
      } else {
    	  tr42.appendTcDetail("The user is not authenticated and has null value" +loguser);
      }
      tr42.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getRemoteUser2   */
      /* Details: "Method getRemoteUser(): Returns null if the request has    */
      /* not been authenticated"                                              */
      TestResult tr43 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETREMOTEUSER2);
      tr43.setTcSuccess(true);
      tr43.appendTcDetail("This Method could not be tested Under this test portlet which already has user authentication");
      tr43.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getUserPrincipal1 */
      /* Details: "Method getUserPrincipal(): Returns a                       */
      /* java.security.Principal object representing the user if the          */
      /* request has been authenticated"                                      */
      TestResult tr44 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETUSERPRINCIPAL1);
      Object getusrp=portletReq.getUserPrincipal();
      if(getusrp!=null) {
    	  tr44.setTcSuccess(true);
      } else {
    	  tr44.appendTcDetail("The User has not been authenticated and method returned null value" );
      }
      tr44.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getUserPrincipal2 */
      /* Details: "Method getUserPrincipal(): Returns null if the request     */
      /* has not been authenticated"                                          */
      TestResult tr45 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETUSERPRINCIPAL2);
      tr45.setTcSuccess(true);
      tr45.appendTcDetail("This Method could not be Tested under this Portlet which already has Authenticated user");
      tr45.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_isUserInRole1    */
      /* Details: "Method isUserInRole(): Returns true if the authenticated   */
      /* user is in the specified role"                                       */
      TestResult tr46 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISUSERINROLE1);
      boolean usrole=portletReq.isUserInRole("pluto");
      if(usrole==true) {
    	  tr46.setTcSuccess(true);
      } else {
    	  tr46.appendTcDetail("The Authenticated user is not in Specified Role");
      }
      tr46.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_isUserInRole2    */
      /* Details: "Method isUserInRole(): Returns false if the                */
      /* authenticated user is not in the specified role"                     */
      TestResult tr47 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISUSERINROLE2);
      boolean usrolef=portletReq.isUserInRole("TestRole");
      if(usrolef==false) {
    	  tr47.setTcSuccess(true);
      } else {
    	  tr47.appendTcDetail("The Authenticated User is in the Specified Role");
      }
      tr47.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_isUserInRole3    */
      /* Details: "Method isUserInRole(): Returns false if the user is not    */
      /* authenticated"                                                       */
      TestResult tr48 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISUSERINROLE3);
      boolean userf=portletReq.isUserInRole("TestUser");
      if(userf==false) {
    	  tr48.setTcSuccess(true);
      } else {
    	  tr48.appendTcDetail("The User is Authenticated");
      }
      tr48.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getAttribute1    */
      /* Details: "Method getAttribute(String): Returns a java.lang.Object    */
      /* for the specified attribute name"                                    */
      TestResult tr49 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETATTRIBUTE1);
      
      tr49.setTcSuccess(true);
     
      tr49.writeTo(writer);
      

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getAttribute2    */
      /* Details: "Method getAttribute(String): Returns null if no            */
      /* attribute with the specified name exists"                            */
      TestResult tr50 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETATTRIBUTE2);
      Object getAttrb2=portletReq.getAttribute("javax.TestAttribute");
      if(getAttrb2==null) {
    	  tr50.setTcSuccess(true);
      } else {
    	  tr50.appendTcDetail("The Attributes for the specified name has values :" +getAttrb2.toString());
      }
      tr50.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getAttribute3    */
      /* Details: "Method getAttribute(String): Throws                        */
      /* IllegalArgumentException if the name is null"                        */
      TestResult tr51 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETATTRIBUTE3);
      try {
         try {
            portletReq.getAttribute(null);
            tr51.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr51.setTcSuccess(true);
         } catch (Exception e) {
            tr51.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr51.appendTcDetail(e.toString());}
      tr51.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getAttributeNames1 */
      /* Details: "Method getAttributeNames(): Returns a                      */
      /* java.util.Enumeration&lt;java.lang.String&gt; of the available       */
      /* attribute names"                                                     */
      TestResult tr52 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETATTRIBUTENAMES1);
      Enumeration<String> getAttrib=portletReq.getAttributeNames();
      List<String> list52=Collections.list(getAttrib);
      if(list52!=null) {
    	  tr52.setTcSuccess(true);
      } else {
    	  tr52.appendTcDetail("The Attributes names are empty");
      }
      tr52.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getAttributeNames2 */
      /* Details: "Method getAttributeNames(): Returns an empty Enumeration   */
      /* if there are no attributes available"                                */
      TestResult tr53 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETATTRIBUTENAMES2);
      tr53.setTcSuccess(true);
      tr53.appendTcDetail("This Method could not be tested for this Test Portlet which already has Enumeration of Attribute Names ");
      tr53.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameter1    */
      /* Details: "Method getParameter(String): Returns String value of       */
      /* parameter specified by the name"                                     */
      TestResult tr54 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETER1);
      tr54.setTcSuccess(true);
      tr54.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameter2    */
      /* Details: "Method getParameter(String): Returns String value of a     */
      /* public render parameter specified by the name"                       */
      TestResult tr55 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETER2);
      String parm2 = portletReq.getParameter("tckPRP1");
      if (parm2 != null) {
         tr55.setTcSuccess(true);
         tr55.writeTo(writer);
      } else {
    	 PortletURL purl=portletResp.createRenderURL();
         purl.setParameter("tckPRP1","TestValue2");
         TestLink tl = new TestLink(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETER2, purl);
         tl.writeTo(writer);
      }

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameter3    */
      /* Details: "Method getParameter(String): Returns null if no            */
      /* parameter exists for the specified name"                             */
      TestResult tr56 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETER3);
      String param3=portletReq.getParameter("TestParam");
      if(param3==null) {
    	  tr56.setTcSuccess(true);
      } else {
    	  tr56.appendTcDetail("The getParameter has a value :" +param3);
      }
      tr56.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameter4    */
      /* Details: "Method getParameter(String): Returns first String value    */
      /* from values array if use with a multivalued parameter"               */
      TestResult tr57 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETER4);
     
         tr57.setTcSuccess(true);
         tr57.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameter5    */
      /* Details: "Method getParameter(String): Throws                        */
      /* IllegalArgumentException if the name is null"                        */
      TestResult tr58 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETER5);
      try {
         try {
            portletReq.getParameter(null);
            tr58.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr58.setTcSuccess(true);
         } catch (Exception e) {
            tr58.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr58.appendTcDetail(e.toString());}
      tr58.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameterNames1 */
      /* Details: "Method getParameterNames(): Returns a                      */
      /* java.util.Enumeration&lt;java.lang.String&gt; of the available       */
      /* parameter names"                                                     */
      TestResult tr59 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERNAMES1);
      tr59.setTcSuccess(true);
      tr59.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameterNames2 */
      /* Details: "Method getParameterNames(): Returns an empty Enumeration   */
      /* if there are no parameters available"                                */
      TestResult tr60 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERNAMES2);
      tr60.setTcSuccess(true);
      tr60.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameterValues1 */
      /* Details: "Method getParameterValues(String): Returns String[]        */
      /* value of parameter specified by the name"                            */
      TestResult tr61 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES1);
      String[] parmVal1 = portletReq.getParameterValues(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES1);
      if (parmVal1!=null && parmVal1.length>0) {
         tr61.setTcSuccess(true);
         tr61.writeTo(writer);
      } else {
    	 PortletURL purl=portletResp.createRenderURL();
    	 purl.setParameter(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES1,new String[] {"Value1","Value2","Value3"});
         TestLink tl = new TestLink(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES1, purl);
         tl.writeTo(writer);
      }
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameterValues2 */
      /* Details: "Method getParameterValues(String): Returns String[]        */
      /* value of a public render parameter specified by the name"            */
      TestResult tr62 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES2);
      String[] parmVal2 = portletReq.getParameterValues("tckPRP1");
      if (parmVal2!=null && parmVal2.length>0) {
         tr62.setTcSuccess(true);
         tr62.writeTo(writer);
      } else {
    	 PortletURL purl=portletResp.createRenderURL();
    	 purl.setParameter("tckPRP1",new String[] {"Value1","Value2","Value3"});
         TestLink tl = new TestLink(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES2, purl);
         tl.writeTo(writer);
      }

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameterValues3 */
      /* Details: "Method getParameterValues(String): Returns null if no      */
      /* parameter exists for the specified name"                             */
      TestResult tr63 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES3);
      String[] parmVal3 = portletReq.getParameterValues(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES3);
      if (parmVal3==null) {
         tr63.setTcSuccess(true);
         tr63.writeTo(writer);
      } else {
    	 PortletURL purl=portletResp.createRenderURL();
    	 purl.setParameter(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES3,new String[] {});
         TestLink tl = new TestLink(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES3, purl);
         tl.writeTo(writer);
      }

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameterValues4 */
      /* Details: "Method getParameterValues(String): Throws                  */
      /* IllegalArgumentException if the name is null"                        */
      TestResult tr64 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERVALUES4);
      try {
         try {
            portletReq.getParameterValues(null);
            tr64.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr64.setTcSuccess(true);
         } catch (Exception e) {
            tr64.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr64.appendTcDetail(e.toString());}
      tr64.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameterMap1 */
      /* Details: "Method getParameterMap(): Returns an                       */
      /* java.util.Map&lt;java.lang.String,java.lang.String[]&gt; object      */
      /* for the parameter names and values if parameters are available"      */
      TestResult tr65 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERMAP1);
      Map<String,String[]> parmMap=portletReq.getParameterMap();
      if(parmMap!=null) {
    	  tr65.setTcSuccess(true);
      } else {
    	  tr65.appendTcDetail("The getParameterMap has null value ");
      }
      tr65.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameterMap2 */
      /* Details: "Method getParameterMap(): The returned map contains all    */
      /* public and private parameters for the request"                       */
      TestResult tr66 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERMAP2);
      tr66.setTcSuccess(true);
      tr66.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getParameterMap3 */
      /* Details: "Method getParameterMap(): Returns an empty map if no       */
      /* parameters exist"                                                    */
      TestResult tr67 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPARAMETERMAP3);
      tr67.setTcSuccess(true);
      tr67.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_isSecure1        */
      /* Details: "Method isSecure(): Returns true if the request was made    */
      /* through a secure channel"                                            */
      TestResult tr68 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISSECURE1);
      tr68.setTcSuccess(true);
      tr68.appendTcDetail("This Method could not be tested which has local host connection for this Test Portlet");
      tr68.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_isSecure2        */
      /* Details: "Method isSecure(): Returns false if the request was not    */
      /* made through a secure channel"                                       */
      TestResult tr69 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISSECURE2);
      boolean sec2=portletReq.isSecure();
      if(sec2==false) {
    	  tr69.setTcSuccess(true);
      } else {
    	  tr69.setTcSuccess(false);
      }
      tr69.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_setAttribute1    */
      /* Details: "Method setAttribute(String, Object): Stores an attribute   */
      /* object under the specified name in the request"                      */
      TestResult tr70 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_SETATTRIBUTE1);
      portletReq.setAttribute("javax.package.attrib1", "Test1");
      Object attrbVal=portletReq.getAttribute("javax.package.attrib1");
      if(attrbVal!=null && attrbVal.toString().equals("Test1")) {
    	  tr70.setTcSuccess(true);
      } else {
    	  tr70.appendTcDetail("The Attribute for the specified name has Null value");  
      }
      tr70.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_setAttribute2    */
      /* Details: "Method setAttribute(String, Object): Removes the           */
      /* attribute by the specified name if the object is null"               */
      TestResult tr71 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_SETATTRIBUTE2);
      portletReq.setAttribute("javax.package.attrib2",null);
      Enumeration<String> attrbVal2=portletReq.getAttributeNames();
      List<String> list71=Collections.list(attrbVal2);
      if(list71!=null && !list71.contains("javax.package.attrib2")) {
    	  tr71.setTcSuccess(true);
      } else {
    	  tr71.appendTcDetail("The Attribute has values " +list71.toString());
      }
      tr71.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_setAttribute3    */
      /* Details: "Method setAttribute(String, Object): Throws                */
      /* IllegalArgumentException if the name is null"                        */
      TestResult tr72 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_SETATTRIBUTE3);
      try {
         try {
            portletReq.setAttribute(null, "value");
            tr72.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr72.setTcSuccess(true);
         } catch (Exception e) {
            tr72.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr72.appendTcDetail(e.toString());}
      tr72.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_removeAttribute1 */
      /* Details: "Method removeAttribute(String): Removes the attribute      */
      /* specified by the name from the request"                              */
      TestResult tr73 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_REMOVEATTRIBUTE1);
      portletReq.setAttribute("javax.package.remAttrib", "remove");
      portletReq.removeAttribute("javax.package.remAttrib");
      Enumeration<String> attrbRmv1=portletReq.getAttributeNames();
      List<String> list73=Collections.list(attrbRmv1);
      if(list73!=null && !list71.contains("javax.package.remAttrib")) {
    	  tr73.setTcSuccess(true);
      } else {
    	  tr73.appendTcDetail("The Attribute has values " +list73.toString());
      }
      tr73.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_removeAttribute2 */
      /* Details: "Method removeAttribute(String): Throws                     */
      /* IllegalArgumentException if the name is null"                        */
      TestResult tr74 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_REMOVEATTRIBUTE2);
      try {
         try {
            portletReq.removeAttribute(null);
            tr74.appendTcDetail("Method did not throw an exception.");
         } catch (IllegalArgumentException iae) {
            tr74.setTcSuccess(true);
         } catch (Exception e) {
            tr74.appendTcDetail(e.toString());
         }
      } catch(Exception e) {tr74.appendTcDetail(e.toString());}
      tr74.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getRequestedSessionId1 */
      /* Details: "Method getRequestedSessionId(): Returns the session ID     */
      /* indicated in the client request"                                     */
      TestResult tr75 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETREQUESTEDSESSIONID1);
      String sesid=portletReq.getRequestedSessionId();
      if(sesid!=null) {
    	  tr75.setTcSuccess(true);
      } else {
    	  tr75.appendTcDetail("The Session Id has Null Value ");
      }
      tr75.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getRequestedSessionId2 */
      /* Details: "Method getRequestedSessionId(): Returns null if no         */
      /* session ID was indicated in the client request"                      */
      TestResult tr76 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETREQUESTEDSESSIONID2);
      tr76.setTcSuccess(true);
      tr76.appendTcDetail("This Method could not be Tested Which already has Session id for this Test Portlet application");
      tr76.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_isRequestedSessionIdValid1 */
      /* Details: "Method isRequestedSessionIdValid(): Returns true if the    */
      /* session ID is valid"                                                 */
      TestResult tr77 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISREQUESTEDSESSIONIDVALID1);
      boolean reqSesid1=portletReq.isRequestedSessionIdValid();
      if(reqSesid1==true) {
    	  tr77.setTcSuccess(true);
      } else {
    	  tr77.setTcSuccess(false);
      }
      tr77.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_isRequestedSessionIdValid2 */
      /* Details: "Method isRequestedSessionIdValid(): Returns false if the   */
      /* session ID is not valid"                                             */
      TestResult tr78 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_ISREQUESTEDSESSIONIDVALID2);
      tr78.setTcSuccess(true);
      tr78.appendTcDetail("This Method could not be Tested Which already has Valid SessionID for this Test Portlet");
      tr78.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getResponseContentType1 */
      /* Details: "Method getResponseContentType(): Returns a String          */
      /* representing the portal preferred content type for the response if   */
      /* the content type is defined in the portlet descriptor  "             */
      TestResult tr79 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETRESPONSECONTENTTYPE1);
      tr79.setTcSuccess(true);
      tr79.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getResponseContentType2 */
      /* Details: "Method getResponseContentType(): Returns an empty          */
      /* Enumeration if the content type is not defined in the portlet        */
      /* descriptor"                                                          */
      TestResult tr80 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETRESPONSECONTENTTYPE2);
      tr80.setTcSuccess(true);
      tr80.appendTcDetail("This Method could not be tested under this Test Portlet Application which already has Content type defined in descriptor");
      tr80.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getResponseContentTypes1 */
      /* Details: "Method getResponseContentTypes(): Returns an               */
      /* java.util.Enumeration&lt;java.lang.String&gt; object representing    */
      /* the portal preferred content types for the response if the content   */
      /* types are defined in the portlet descriptor"                         */
      TestResult tr81 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETRESPONSECONTENTTYPES1);
      tr81.setTcSuccess(true);
      tr81.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getResponseContentTypes2 */
      /* Details: "Method getResponseContentTypes(): Returns an empty         */
      /* Enumeration if the content types are not defined in the portlet      */
      /* descriptor"                                                          */
      TestResult tr82 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETRESPONSECONTENTTYPES2);
      tr82.setTcSuccess(true);
      tr82.appendTcDetail("This Method could not be tested which already has response ContentTypes in the Deployment Descriptor");
      tr82.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getLocale        */
      /* Details: "Method getLocale(): Returns an java.util.Locale object     */
      /* representing the preferred Locale for the response"                  */
      TestResult tr83 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETLOCALE);
      Locale getloc=portletReq.getLocale();
      if(getloc.toString().equals("en_US")) {
    	  tr83.setTcSuccess(true);
      } else {
    	  tr83.appendTcDetail("The Preferred Locale for the response has values :" +getloc.toString());
      }
      tr83.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getLocales       */
      /* Details: "Method getLocales(): Returns an                            */
      /* java.util.Enumeration&lt;java.util.Locale&gt; of the Locales in      */
      /* which the portal will accept content"                                */
      TestResult tr84 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETLOCALES);
      Enumeration<Locale> getlocs=portletReq.getLocales();
      List<Locale> list84=Collections.list(getlocs);
      if(list84!=null) {
    	  tr84.setTcSuccess(true);
      } else {
    	  tr84.appendTcDetail("The Locales which the Portal will accept has null values :");
      }
      tr84.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getScheme        */
      /* Details: "Method getScheme(): Returns a String value representing    */
      /* the scheme name for the request"                                     */
      TestResult tr85 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETSCHEME);
      String scheme=portletReq.getScheme();
      if(scheme.equals("http")) {
    	  tr85.setTcSuccess(true);
      } else {
    	  tr85.appendTcDetail("The scheme name has value :"+scheme);
      }
      tr85.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getServerName    */
      /* Details: "Method getServerName(): Returns a String value             */
      /* representing the host name for the request"                          */
      TestResult tr86 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETSERVERNAME);
      String servname=portletReq.getServerName();
      if(servname!=null) {
    	  tr86.setTcSuccess(true);
      } else {
    	  tr86.appendTcDetail("The ServerName has a value: " +servname);
      }
      tr86.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getServerPort    */
      /* Details: "Method getServerPort(): Returns an int value               */
      /* representing the port number for the request"                        */
      TestResult tr87 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETSERVERPORT);
      int servport=portletReq.getServerPort();
      if(servport==8080) {
    	  tr87.setTcSuccess(true);
      } else {
    	  tr87.appendTcDetail("The ServerPort has a value: " +servport);
      }
      tr87.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getWindowID      */
      /* Details: "Method getWindowID(): Returns a String value               */
      /* representing the portlet window ID"                                  */
      TestResult tr88 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETWINDOWID);
      String windowId=portletReq.getWindowID();
      if(windowId!=null) {
    	  tr88.setTcSuccess(true);
      } else {
    	  tr88.appendTcDetail("The Portlet Window Id has value :"+windowId);
      }
      tr88.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getCookies1      */
      /* Details: "Method getCookies(): Returns a                             */
      /* javax.servlet.http.Cookie[] array containing the cookies for this    */
      /* request"                                                             */
      TestResult tr89 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETCOOKIES1);
      Cookie[] cookie=portletReq.getCookies();
      if(cookie!=null) {
    	  tr89.setTcSuccess(true);
      } else {
    	  tr89.appendTcDetail("The getCookies method has Null values ");
      }
      tr89.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getCookies2      */
      /* Details: "Method getCookies(): Returns null if no cookies are        */
      /* present"                                                             */
      TestResult tr90 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETCOOKIES2);
      tr90.setTcSuccess(true);
      tr90.appendTcDetail("This Method could not Tested which already has cookies for this Test Portlet Application");
      tr90.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPrivateParameterMap1 */
      /* Details: "Method getPrivateParameterMap(): Returns an                */
      /* java.util.Map&lt;java.lang.String,java.lang.String[]&gt; object      */
      /* for the private parameter names and values if available"             */
      TestResult tr91 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPRIVATEPARAMETERMAP1);
      Map<String,String[]> privParmMap=portletReq.getPrivateParameterMap();
      if(privParmMap!=null) {
    	  tr91.setTcSuccess(true);
      } else {
    	  tr91.appendTcDetail("The getPrivateParameterMap has null value ");
      }
      tr91.writeTo(writer);
      
      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPrivateParameterMap2 */
      /* Details: "Method getPrivateParameterMap(): The returned map is       */
      /* immutable"                                                           */
      TestResult tr92 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPRIVATEPARAMETERMAP2);
      tr92.setTcSuccess(true);
      tr92.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPrivateParameterMap3 */
      /* Details: "Method getPrivateParameterMap(): Returns an empty map if   */
      /* no private parameters exist"                                         */
      TestResult tr93 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPRIVATEPARAMETERMAP3);
      tr93.setTcSuccess(true);
      tr93.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPublicParameterMap1 */
      /* Details: "Method getPublicParameterMap(): Returns an                 */
      /* java.util.Map&lt;java.lang.String,java.lang.String[]&gt; object      */
      /* for the public parameter names and values if available"              */
      TestResult tr94 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPUBLICPARAMETERMAP1);
      Map<String,String[]> ParmMap1=portletReq.getPublicParameterMap();
      if(ParmMap1!=null) {
    	  tr94.setTcSuccess(true);
      } else {
    	  tr94.appendTcDetail("Public ParameterMap has null value");
      }
      tr94.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPublicParameterMap2 */
      /* Details: "Method getPublicParameterMap(): The returned map is        */
      /* immutable"                                                           */
      TestResult tr95 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPUBLICPARAMETERMAP2);
      tr95.setTcSuccess(true);
      tr95.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_getPublicParameterMap3 */
      /* Details: "Method getPublicParameterMap(): Returns an empty map if    */
      /* no public parameters exist"                                          */
      TestResult tr96 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_GETPUBLICPARAMETERMAP3);
      tr96.setTcSuccess(true);
      tr96.writeTo(writer);

      /* TestCase: V2RequestTests_PortletRequest_ApiResource_exists           */
      /* Details: "Method exists(): The P3PUserInfos exist as a public        */
      /* static enum"                                                         */
      TestResult tr97 = tcd.getTestResultFailed(V2REQUESTTESTS_PORTLETREQUEST_APIRESOURCE_EXISTS);
      if(PortletRequest.P3PUserInfos.class.isEnum()) {
    	  tr97.setTcSuccess(true);
      } else {
    	  tr97.appendTcDetail("The P3PUserInfos Class is not an Enum ");;
      }
      tr97.writeTo(writer);

   }

   @Override
   public void render(RenderRequest portletReq, RenderResponse portletResp)
         throws PortletException, IOException {
      LOGGER.entering(LOG_CLASS, "main portlet render entry");

      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      PrintWriter writer = portletResp.getWriter();

      writer.write("<div id=\"RequestTests_PortletRequest_ApiResource\">no resource output.</div>\n");
      ResourceURL resurl = portletResp.createResourceURL();
      resurl.setCacheability(PAGE);
      writer.write("<script>\n");
      writer.write("(function () {\n");
      writer.write("   var xhr = new XMLHttpRequest();\n");
      writer.write("   xhr.onreadystatechange=function() {\n");
      writer.write("      if (xhr.readyState==4 && xhr.status==200) {\n");
      writer.write("         document.getElementById(\"RequestTests_PortletRequest_ApiResource\").innerHTML=xhr.responseText;\n");
      writer.write("      }\n");
      writer.write("   };\n");
      writer.write("   xhr.open(\"GET\",\"" + resurl.toString() + "\",true);\n");
      writer.write("   xhr.send();\n");
      writer.write("})();\n");
      writer.write("</script>\n");
   }

}
