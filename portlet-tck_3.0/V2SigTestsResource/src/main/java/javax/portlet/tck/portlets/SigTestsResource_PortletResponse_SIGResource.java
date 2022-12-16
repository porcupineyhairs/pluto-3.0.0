/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package javax.portlet.tck.portlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.ResourceServingPortlet;
import javax.portlet.ResourceURL;
import javax.portlet.tck.beans.ClassChecker;
import javax.portlet.tck.beans.JSR286SignatureTestCaseDetails;
import javax.portlet.tck.beans.TestResult;

import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTY;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTYA;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTYB;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTYRETURNS;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTYRETURNSA;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTYRETURNSB;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASCREATEELEMENT;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASCREATEELEMENTRETURNS;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASENCODEURL;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASENCODEURLRETURNS;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASGETNAMESPACE;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASGETNAMESPACERETURNS;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASSETPROPERTY;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASSETPROPERTYRETURNS;
import static javax.portlet.tck.constants.Constants.THREADID_ATTR;
import static javax.portlet.ResourceURL.PAGE;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names are defined
 * in the /src/main/resources/xml-resources/additionalTCs.xml file. The build process will integrate
 * the test case names defined in the additionalTCs.xml file into the complete list of test case
 * names for execution by the driver.
 *
 * This is the main portlet for the test cases. If the test cases call for events, this portlet will
 * initiate the events, but not process them. The processing is done in the companion portlet
 * SigTestsResource_PortletResponse_SIGResource_event
 *
 */
public class SigTestsResource_PortletResponse_SIGResource
    implements Portlet, ResourceServingPortlet {

  @Override
  public void init(PortletConfig config) throws PortletException {}

  @Override
  public void destroy() {}

  @Override
  public void processAction(ActionRequest portletReq, ActionResponse portletResp)
      throws PortletException, IOException {

    portletResp.setRenderParameters(portletReq.getParameterMap());
    long tid = Thread.currentThread().getId();
    portletReq.setAttribute(THREADID_ATTR, tid);

  }

  @Override
  public void serveResource(ResourceRequest portletReq, ResourceResponse portletResp)
      throws PortletException, IOException {

    long tid = Thread.currentThread().getId();
    portletReq.setAttribute(THREADID_ATTR, tid);

    PrintWriter writer = portletResp.getWriter();

    JSR286SignatureTestCaseDetails tcd = new JSR286SignatureTestCaseDetails();

    // Create result objects for the tests

    ClassChecker cc = new ClassChecker(portletResp.getClass());

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasAddProperty */
    /* Details: "ResourceResponse has a addProperty(String, String) */
    /* method " */
    TestResult tr0 =
        tcd.getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTY);
    try {
      String name = "addProperty";
      Class<?>[] exceptions = null;
      Class<?>[] parms = {String.class, String.class};
      tr0.setTcSuccess(cc.hasMethod(name, parms, exceptions));
    } catch (Exception e) {
      tr0.appendTcDetail(e.toString());
    }
    tr0.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasAddPropertyA */
    /* Details: "ResourceResponse has a */
    /* addProperty(javax.servlet.http.Cookie) method " */
    TestResult tr1 =
        tcd.getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTYA);
    try {
      String name = "addProperty";
      Class<?>[] exceptions = null;
      Class<?>[] parms = {javax.servlet.http.Cookie.class};
      tr1.setTcSuccess(cc.hasMethod(name, parms, exceptions));
    } catch (Exception e) {
      tr1.appendTcDetail(e.toString());
    }
    tr1.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasAddPropertyB */
    /* Details: "ResourceResponse has a addProperty(String, */
    /* org.w3c.dom.Element) method " */
    TestResult tr2 =
        tcd.getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTYB);
    try {
      String name = "addProperty";
      Class<?>[] exceptions = null;
      Class<?>[] parms = {String.class, org.w3c.dom.Element.class};
      tr2.setTcSuccess(cc.hasMethod(name, parms, exceptions));
    } catch (Exception e) {
      tr2.appendTcDetail(e.toString());
    }
    tr2.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasAddPropertyReturns */
    /* Details: "ResourceResponse method addProperty(String, String) */
    /* returns void " */
    TestResult tr3 = tcd
        .getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTYRETURNS);
    try {
      String name = "addProperty";
      Class<?> retType = void.class;
      Class<?>[] parms = {String.class, String.class};
      tr3.setTcSuccess(cc.methodHasReturnType(name, retType, parms));
    } catch (Exception e) {
      tr3.appendTcDetail(e.toString());
    }
    tr3.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasAddPropertyReturnsA */
    /* Details: "ResourceResponse method */
    /* addProperty(javax.servlet.http.Cookie) returns void " */
    TestResult tr4 = tcd
        .getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTYRETURNSA);
    try {
      String name = "addProperty";
      Class<?> retType = void.class;
      Class<?>[] parms = {javax.servlet.http.Cookie.class};
      tr4.setTcSuccess(cc.methodHasReturnType(name, retType, parms));
    } catch (Exception e) {
      tr4.appendTcDetail(e.toString());
    }
    tr4.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasAddPropertyReturnsB */
    /* Details: "ResourceResponse method addProperty(String, */
    /* org.w3c.dom.Element) returns void " */
    TestResult tr5 = tcd
        .getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASADDPROPERTYRETURNSB);
    try {
      String name = "addProperty";
      Class<?> retType = void.class;
      Class<?>[] parms = {String.class, org.w3c.dom.Element.class};
      tr5.setTcSuccess(cc.methodHasReturnType(name, retType, parms));
    } catch (Exception e) {
      tr5.appendTcDetail(e.toString());
    }
    tr5.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasCreateElement */
    /* Details: "ResourceResponse has a createElement(String) throws */
    /* org.w3c.dom.DOMException method " */
    TestResult tr6 =
        tcd.getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASCREATEELEMENT);
    try {
      String name = "createElement";
      Class<?>[] exceptions = {org.w3c.dom.DOMException.class};
      Class<?>[] parms = {String.class};
      tr6.setTcSuccess(cc.hasMethod(name, parms, exceptions));
    } catch (Exception e) {
      tr6.appendTcDetail(e.toString());
    }
    tr6.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasCreateElementReturns */
    /* Details: "ResourceResponse method createElement(String) returns */
    /* org.w3c.dom.Element " */
    TestResult tr7 = tcd.getTestResultFailed(
        V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASCREATEELEMENTRETURNS);
    try {
      String name = "createElement";
      Class<?> retType = org.w3c.dom.Element.class;
      Class<?>[] parms = {String.class};
      tr7.setTcSuccess(cc.methodHasReturnType(name, retType, parms));
    } catch (Exception e) {
      tr7.appendTcDetail(e.toString());
    }
    tr7.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasEncodeURL */
    /* Details: "ResourceResponse has a encodeURL(String)  method " */
    TestResult tr8 =
        tcd.getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASENCODEURL);
    try {
      String name = "encodeURL";
      Class<?>[] exceptions = null;
      Class<?>[] parms = {String.class};
      tr8.setTcSuccess(cc.hasMethod(name, parms, exceptions));
    } catch (Exception e) {
      tr8.appendTcDetail(e.toString());
    }
    tr8.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasEncodeURLReturns */
    /* Details: "ResourceResponse method encodeURL(String) returns String */
    /* " */
    TestResult tr9 =
        tcd.getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASENCODEURLRETURNS);
    try {
      String name = "encodeURL";
      Class<?> retType = String.class;
      Class<?>[] parms = {String.class};
      tr9.setTcSuccess(cc.methodHasReturnType(name, retType, parms));
    } catch (Exception e) {
      tr9.appendTcDetail(e.toString());
    }
    tr9.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasGetNamespace */
    /* Details: "ResourceResponse has a getNamespace()  method " */
    TestResult tr10 =
        tcd.getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASGETNAMESPACE);
    try {
      String name = "getNamespace";
      Class<?>[] exceptions = null;
      Class<?>[] parms = null;
      tr10.setTcSuccess(cc.hasMethod(name, parms, exceptions));
    } catch (Exception e) {
      tr10.appendTcDetail(e.toString());
    }
    tr10.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasGetNamespaceReturns */
    /* Details: "ResourceResponse method getNamespace() returns String " */
    TestResult tr11 = tcd
        .getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASGETNAMESPACERETURNS);
    try {
      String name = "getNamespace";
      Class<?> retType = String.class;
      Class<?>[] parms = null;
      tr11.setTcSuccess(cc.methodHasReturnType(name, retType, parms));
    } catch (Exception e) {
      tr11.appendTcDetail(e.toString());
    }
    tr11.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasSetProperty */
    /* Details: "ResourceResponse has a setProperty(String, String) */
    /* method " */
    TestResult tr12 =
        tcd.getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASSETPROPERTY);
    try {
      String name = "setProperty";
      Class<?>[] exceptions = null;
      Class<?>[] parms = {String.class, String.class};
      tr12.setTcSuccess(cc.hasMethod(name, parms, exceptions));
    } catch (Exception e) {
      tr12.appendTcDetail(e.toString());
    }
    tr12.writeTo(writer);

    /* TestCase: V2SigTestsResource_PortletResponse_SIGResource_hasSetPropertyReturns */
    /* Details: "ResourceResponse method setProperty(String, String) */
    /* returns void " */
    TestResult tr13 = tcd
        .getTestResultFailed(V2SIGTESTSRESOURCE_PORTLETRESPONSE_SIGRESOURCE_HASSETPROPERTYRETURNS);
    try {
      String name = "setProperty";
      Class<?> retType = void.class;
      Class<?>[] parms = {String.class, String.class};
      tr13.setTcSuccess(cc.methodHasReturnType(name, retType, parms));
    } catch (Exception e) {
      tr13.appendTcDetail(e.toString());
    }
    tr13.writeTo(writer);

  }

  @Override
  public void render(RenderRequest portletReq, RenderResponse portletResp)
      throws PortletException, IOException {

    long tid = Thread.currentThread().getId();
    portletReq.setAttribute(THREADID_ATTR, tid);

    PrintWriter writer = portletResp.getWriter();

    writer.write(
        "<div id=\"SigTestsResource_PortletResponse_SIGResource\">no resource output.</div>\n");
    ResourceURL resurl = portletResp.createResourceURL();
    resurl.setCacheability(PAGE);
    writer.write("<script>\n");
    writer.write("(function () {\n");
    writer.write("   var xhr = new XMLHttpRequest();\n");
    writer.write("   xhr.onreadystatechange=function() {\n");
    writer.write("      if (xhr.readyState==4 && xhr.status==200) {\n");
    writer.write(
        "         document.getElementById(\"SigTestsResource_PortletResponse_SIGResource\").innerHTML=xhr.responseText;\n");
    writer.write("      }\n");
    writer.write("   };\n");
    writer.write("   xhr.open(\"GET\",\"" + resurl.toString() + "\",true);\n");
    writer.write("   xhr.send();\n");
    writer.write("})();\n");
    writer.write("</script>\n");
  }

}
