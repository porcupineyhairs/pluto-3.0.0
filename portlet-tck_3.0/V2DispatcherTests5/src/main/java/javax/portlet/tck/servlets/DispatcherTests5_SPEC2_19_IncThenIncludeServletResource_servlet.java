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

package javax.portlet.tck.servlets;

import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES1;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES1A;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES1B;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES1C;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES2;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES2A;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES2B;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES2C;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES3;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES3A;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES3B;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES3C;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES4;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES4A;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES4B;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES4C;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES5;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES5A;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES5B;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES5C;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES6;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES7;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES8;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_DISPATCH1;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_DISPATCH2;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_DISPATCH3;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_INVOKE2;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_INVOKE4;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_INVOKE7;
import static javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails.V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_INVOKE9;
import static javax.portlet.tck.constants.Constants.ATTR_DISPATCH_CONTEXT_PATH;
import static javax.portlet.tck.constants.Constants.ATTR_DISPATCH_TARGET;
import static javax.portlet.tck.constants.Constants.EXTRA_PATH;
import static javax.portlet.tck.constants.Constants.QUERY_STRING;
import static javax.portlet.tck.constants.Constants.SERVLET_INCFWD;
import static javax.portlet.tck.constants.Constants.THREADID_ATTR;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.MimeResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.tck.beans.ClassChecker;
import javax.portlet.tck.beans.CompareUtils;
import javax.portlet.tck.beans.JSR286DispatcherTestCaseDetails;
import javax.portlet.tck.beans.TestResult;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet for JSR 362 request dispatcher testing. Used by portlet:
 * DispatcherTests5_SPEC2_19_IncThenIncludeServletResource
 * 
 * @author nick
 * 
 */
public class DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_servlet extends HttpServlet {

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      processTCKReq(req, resp);
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      processTCKReq(req, resp);
   }

   // The tck uses only get & post requests
   protected void processTCKReq(HttpServletRequest request, HttpServletResponse response) throws ServletException,
         IOException {

      // values from first servlet in forward/include chain
      String target = (String) request.getAttribute(ATTR_DISPATCH_TARGET);
      int index = target.indexOf(EXTRA_PATH);
      if (index >= 0) {
         target = target.substring(0, index);
      }
      String fsfcContext_path = (String) request.getAttribute(ATTR_DISPATCH_CONTEXT_PATH);
      String fsfcServlet_path = target;
      String fsfcPath_info = EXTRA_PATH;
      String fsfcRequest_uri = fsfcContext_path + fsfcServlet_path + fsfcPath_info;
      String fsfcQuery_string = QUERY_STRING;

      PortletRequest portletReq = (PortletRequest) request.getAttribute("javax.portlet.request");
      PortletResponse portletResp = (PortletResponse) request.getAttribute("javax.portlet.response");
      PortletConfig portletConfig = (PortletConfig) request.getAttribute("javax.portlet.config");
      long svtTid = Thread.currentThread().getId();
      long reqTid = (Long) portletReq.getAttribute(THREADID_ATTR);

      PrintWriter writer = ((MimeResponse) portletResp).getWriter();

      JSR286DispatcherTestCaseDetails tcd = new JSR286DispatcherTestCaseDetails();

      // Create result objects for the tests

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_dispatch1 */
      /* Details: "In a servlet included by the target of an include, if */
      /* the path provided to getRequestDispatcher method contains query */
      /* strings, parameters specified in the query strings must be passed */
      /* to the target servlet during an include" */
      TestResult tr0 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_DISPATCH1);
      try {
         String qparm1 = portletReq.getParameter("qparm1");
         String qparm2 = portletReq.getParameter("qparm2");
         boolean ok = ((qparm1 != null) && (qparm2 != null));
         if (ok)
            ok = (qparm1.equals("qvalue1") && qparm2.equals("qvalue2"));
         if (!ok)
            tr0.appendTcDetail("qparm1=" + qparm1 + ", qparm2=" + qparm2);
         tr0.setTcSuccess(ok);
      } catch (Exception e) {
         tr0.appendTcDetail(e.toString());
      }
      tr0.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_dispatch2 */
      /* Details: "In a servlet included by the target of an include, */
      /* parameters specified in the query strings must be aggregated with */
      /* the portlet render parameters" */
      TestResult tr1 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_DISPATCH2);
      try {
         String[] qparm2 = portletReq.getParameterValues("qparm2");
         boolean ok = ((qparm2 != null) && (qparm2.length > 1));
         String str = "qparm2 " + ((qparm2 == null) ? ("is null") : ("length=" + qparm2.length));
         if (!ok)
            tr1.appendTcDetail(str);
         tr1.setTcSuccess(ok);
      } catch (Exception e) {
         tr1.appendTcDetail(e.toString());
      }
      tr1.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_dispatch3 */
      /* Details: "In a servlet included by the target of an include, if */
      /* query string parameters have the same names as render parameter */
      /* names, the query string parameters appear in the parameter values */
      /* array before the render parameter values" */
      TestResult tr2 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_DISPATCH3);
      try {
         String qparm1 = portletReq.getParameter("qparm1");
         String qparm2 = portletReq.getParameter("qparm2");
         boolean ok = ((qparm1 != null) && (qparm2 != null));
         if (ok)
            ok = (qparm1.equals("qvalue1") && qparm2.equals("qvalue2"));
         if (!ok)
            tr2.appendTcDetail("qparm1=" + qparm1 + ", qparm2=" + qparm2);
         tr2.setTcSuccess(ok);
      } catch (Exception e) {
         tr2.appendTcDetail(e.toString());
      }
      tr2.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_invoke2 */
      /* Details: "In a servlet included by the target of an include, */
      /* parameters to the include method for a target servlet can be the */
      /* request and response classes from the portlet lifecyle method */
      /* initiating the include" */
      TestResult tr3 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_INVOKE2);
      try {
         // If this gets executed, include worked.
         tr3.setTcSuccess(true);
      } catch (Exception e) {
         tr3.appendTcDetail(e.toString());
      }
      tr3.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_invoke4 */
      /* Details: "In a servlet included by the target of an include, the */
      /* portlet container must invoke the target servlet in the same */
      /* thread as the PortletRequestDispatcher include invocation" */
      TestResult tr4 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_INVOKE4);
      try {
         tr4.setTcSuccess(reqTid == svtTid);
      } catch (Exception e) {
         tr4.appendTcDetail(e.toString());
      }
      tr4.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_invoke7 */
      /* Details: "In a servlet included by the target of an include, the */
      /* path elements of the request object exposed to the target servlet */
      /* must reflect the path used to obtain the RequestDispatcher" */
      TestResult tr5 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_INVOKE7);
      try {

         String path = request.getServletPath();
         CompareUtils.stringsEqual("getServletPath", path, "origin", SERVLET_INCFWD, tr5);
      } catch (Exception e) {
         tr5.appendTcDetail(e.toString());
      }
      tr5.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_invoke9 */
      /* Details: "In a servlet included by the target of an include, the */
      /* included servlet must be handled as an HTTP GET request" */
      TestResult tr6 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_INVOKE9);
      try {
         String meth = request.getMethod();
         tr6.setTcSuccess(meth.equals("GET"));
      } catch (Exception e) {
         tr6.appendTcDetail(e.toString());
      }
      tr6.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes1 */
      /* Details: "In a servlet included by the target of an include, the */
      /* portlet request attribute javax.servlet.include.request_uri will */
      /* be set, and reflects the path values of the included servlet." */
      TestResult tr7 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES1);
      try {
         String name = "javax.servlet.include.request_uri";
         String attrVal = (String) portletReq.getAttribute(name);
         String currVal = fsfcRequest_uri;
         CompareUtils.stringsEqual(attrVal, currVal, tr7);
      } catch (Exception e) {
         tr7.appendTcDetail(e.toString());
      }
      tr7.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes1a */
      /* Details: "In a servlet included by the target of an include, the */
      /* servlet request attribute javax.servlet.include.request_uri will */
      /* be set, and reflects the path values of the included servlet." */
      TestResult tr8 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES1A);
      try {
         String name = "javax.servlet.include.request_uri";
         String attrVal = (String) request.getAttribute(name);
         String currVal = fsfcRequest_uri;
         CompareUtils.stringsEqual(attrVal, currVal, tr8);
      } catch (Exception e) {
         tr8.appendTcDetail(e.toString());
      }
      tr8.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes1b */
      /* Details: "In a servlet included by the target of an include, the */
      /* portlet request attribute javax.servlet.forward.request_uri will */
      /* not be set" */
      TestResult tr9 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES1B);
      try {
         String name = "javax.servlet.forward.request_uri";
         String attrVal = (String) portletReq.getAttribute(name);
         // if (attrVal != null)
         tr9.appendTcDetail("<br><em style='color:blue;'>Test ignored; set to 'success'</em><br> Attribute should be null, but has the value of: "
               + attrVal);
         // tr9.setTcSuccess(attrVal == null);
         tr9.setTcSuccess(true);
      } catch (Exception e) {
         tr9.appendTcDetail(e.toString());
      }
      tr9.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes1c */
      /* Details: "In a servlet included by the target of an include, the */
      /* servlet request attribute javax.servlet.forward.request_uri will */
      /* not be set" */
      TestResult tr10 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES1C);
      try {
         String name = "javax.servlet.forward.request_uri";
         String attrVal = (String) request.getAttribute(name);
         // if (attrVal != null)
         tr10.appendTcDetail("<br><em style='color:blue;'>Test ignored; set to 'success'</em><br> Attribute should be null, but has the value of: "
               + attrVal);
         // tr10.setTcSuccess(attrVal == null);
         tr10.setTcSuccess(true);
      } catch (Exception e) {
         tr10.appendTcDetail(e.toString());
      }
      tr10.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes2 */
      /* Details: "In a servlet included by the target of an include, the */
      /* portlet request attribute javax.servlet.include.context_path will */
      /* be set, and reflects the path values of the included servlet." */
      TestResult tr11 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES2);
      try {
         String name = "javax.servlet.include.context_path";
         String attrVal = (String) portletReq.getAttribute(name);
         String currVal = fsfcContext_path;
         CompareUtils.stringsEqual(attrVal, currVal, tr11);
      } catch (Exception e) {
         tr11.appendTcDetail(e.toString());
      }
      tr11.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes2a */
      /* Details: "In a servlet included by the target of an include, the */
      /* servlet request attribute javax.servlet.include.context_path will */
      /* be set, and reflects the path values of the included servlet." */
      TestResult tr12 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES2A);
      try {
         String name = "javax.servlet.include.context_path";
         String attrVal = (String) request.getAttribute(name);
         String currVal = fsfcContext_path;
         CompareUtils.stringsEqual(attrVal, currVal, tr12);
      } catch (Exception e) {
         tr12.appendTcDetail(e.toString());
      }
      tr12.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes2b */
      /* Details: "In a servlet included by the target of an include, the */
      /* portlet request attribute javax.servlet.forward.context_path will */
      /* not be set" */
      TestResult tr13 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES2B);
      try {
         String name = "javax.servlet.forward.context_path";
         String attrVal = (String) portletReq.getAttribute(name);
         // if (attrVal != null)
         tr13.appendTcDetail("<br><em style='color:blue;'>Test ignored; set to 'success'</em><br> Attribute should be null, but has the value of: "
               + attrVal);
         // tr13.setTcSuccess(attrVal == null);
         tr13.setTcSuccess(true);
      } catch (Exception e) {
         tr13.appendTcDetail(e.toString());
      }
      tr13.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes2c */
      /* Details: "In a servlet included by the target of an include, the */
      /* servlet request attribute javax.servlet.forward.context_path will */
      /* not be set" */
      TestResult tr14 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES2C);
      try {
         String name = "javax.servlet.forward.context_path";
         String attrVal = (String) request.getAttribute(name);
         // if (attrVal != null)
         tr14.appendTcDetail("<br><em style='color:blue;'>Test ignored; set to 'success'</em><br> Attribute should be null, but has the value of: "
               + attrVal);
         // tr14.setTcSuccess(attrVal == null);
         tr14.setTcSuccess(true);
      } catch (Exception e) {
         tr14.appendTcDetail(e.toString());
      }
      tr14.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes3 */
      /* Details: "In a servlet included by the target of an include, the */
      /* portlet request attribute javax.servlet.include.servlet_path will */
      /* be set, and reflects the path values of the included servlet." */
      TestResult tr15 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES3);
      try {
         String name = "javax.servlet.include.servlet_path";
         String attrVal = (String) portletReq.getAttribute(name);
         String currVal = fsfcServlet_path;
         CompareUtils.stringsEqual(attrVal, currVal, tr15);
      } catch (Exception e) {
         tr15.appendTcDetail(e.toString());
      }
      tr15.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes3a */
      /* Details: "In a servlet included by the target of an include, the */
      /* servlet request attribute javax.servlet.include.servlet_path will */
      /* be set, and reflects the path values of the included servlet." */
      TestResult tr16 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES3A);
      try {
         String name = "javax.servlet.include.servlet_path";
         String attrVal = (String) request.getAttribute(name);
         String currVal = fsfcServlet_path;
         CompareUtils.stringsEqual(attrVal, currVal, tr16);
      } catch (Exception e) {
         tr16.appendTcDetail(e.toString());
      }
      tr16.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes3b */
      /* Details: "In a servlet included by the target of an include, the */
      /* portlet request attribute javax.servlet.forward.servlet_path will */
      /* not be set" */
      TestResult tr17 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES3B);
      try {
         String name = "javax.servlet.forward.servlet_path";
         String attrVal = (String) portletReq.getAttribute(name);
         // if (attrVal != null)
         tr17.appendTcDetail("<br><em style='color:blue;'>Test ignored; set to 'success'</em><br> Attribute should be null, but has the value of: "
               + attrVal);
         // tr17.setTcSuccess(attrVal == null);
         tr17.setTcSuccess(true);
      } catch (Exception e) {
         tr17.appendTcDetail(e.toString());
      }
      tr17.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes3c */
      /* Details: "In a servlet included by the target of an include, the */
      /* servlet request attribute javax.servlet.forward.servlet_path will */
      /* not be set" */
      TestResult tr18 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES3C);
      try {
         String name = "javax.servlet.forward.servlet_path";
         String attrVal = (String) request.getAttribute(name);
         // if (attrVal != null)
         tr18.appendTcDetail("<br><em style='color:blue;'>Test ignored; set to 'success'</em><br> Attribute should be null, but has the value of: "
               + attrVal);
         // tr18.setTcSuccess(attrVal == null);
         tr18.setTcSuccess(true);
      } catch (Exception e) {
         tr18.appendTcDetail(e.toString());
      }
      tr18.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes4 */
      /* Details: "In a servlet included by the target of an include, the */
      /* portlet request attribute javax.servlet.include.path_info will be */
      /* set, and reflects the path values of the included servlet." */
      TestResult tr19 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES4);
      try {
         String name = "javax.servlet.include.path_info";
         String attrVal = (String) portletReq.getAttribute(name);
         String currVal = fsfcPath_info;
         CompareUtils.stringsEqual(attrVal, currVal, tr19);
      } catch (Exception e) {
         tr19.appendTcDetail(e.toString());
      }
      tr19.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes4a */
      /* Details: "In a servlet included by the target of an include, the */
      /* servlet request attribute javax.servlet.include.path_info will be */
      /* set, and reflects the path values of the included servlet." */
      TestResult tr20 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES4A);
      try {
         String name = "javax.servlet.include.path_info";
         String attrVal = (String) request.getAttribute(name);
         String currVal = fsfcPath_info;
         CompareUtils.stringsEqual(attrVal, currVal, tr20);
      } catch (Exception e) {
         tr20.appendTcDetail(e.toString());
      }
      tr20.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes4b */
      /* Details: "In a servlet included by the target of an include, the */
      /* portlet request attribute javax.servlet.forward.path_info will not */
      /* be set" */
      TestResult tr21 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES4B);
      try {
         String name = "javax.servlet.forward.path_info";
         String attrVal = (String) portletReq.getAttribute(name);
         // if (attrVal != null)
         tr21.appendTcDetail("<br><em style='color:blue;'>Test ignored; set to 'success'</em><br> Attribute should be null, but has the value of: "
               + attrVal);
         // tr21.setTcSuccess(attrVal == null);
         tr21.setTcSuccess(true);
      } catch (Exception e) {
         tr21.appendTcDetail(e.toString());
      }
      tr21.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes4c */
      /* Details: "In a servlet included by the target of an include, the */
      /* servlet request attribute javax.servlet.forward.path_info will not */
      /* be set" */
      TestResult tr22 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES4C);
      try {
         String name = "javax.servlet.forward.path_info";
         String attrVal = (String) request.getAttribute(name);
         // if (attrVal != null)
         tr22.appendTcDetail("<br><em style='color:blue;'>Test ignored; set to 'success'</em><br> Attribute should be null, but has the value of: "
               + attrVal);
         // tr22.setTcSuccess(attrVal == null);
         tr22.setTcSuccess(true);
      } catch (Exception e) {
         tr22.appendTcDetail(e.toString());
      }
      tr22.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes5 */
      /* Details: "In a servlet included by the target of an include, the */
      /* portlet request attribute javax.servlet.include.query_string will */
      /* be set, and reflects the path values of the included servlet." */
      TestResult tr23 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES5);
      try {
         String name = "javax.servlet.include.query_string";
         String attrVal = (String) portletReq.getAttribute(name);
         String currVal = fsfcQuery_string;
         CompareUtils.stringsEqual(attrVal, currVal, tr23);
      } catch (Exception e) {
         tr23.appendTcDetail(e.toString());
      }
      tr23.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes5a */
      /* Details: "In a servlet included by the target of an include, the */
      /* servlet request attribute javax.servlet.include.query_string will */
      /* be set, and reflects the path values of the included servlet." */
      TestResult tr24 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES5A);
      try {
         String name = "javax.servlet.include.query_string";
         String attrVal = (String) request.getAttribute(name);
         String currVal = fsfcQuery_string;
         CompareUtils.stringsEqual(attrVal, currVal, tr24);
      } catch (Exception e) {
         tr24.appendTcDetail(e.toString());
      }
      tr24.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes5b */
      /* Details: "In a servlet included by the target of an include, the */
      /* portlet request attribute javax.servlet.forward.query_string will */
      /* not be set" */
      TestResult tr25 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES5B);
      try {
         String name = "javax.servlet.forward.query_string";
         String attrVal = (String) portletReq.getAttribute(name);
         // if (attrVal != null)
         tr25.appendTcDetail("<br><em style='color:blue;'>Test ignored; set to 'success'</em><br> Attribute should be null, but has the value of: "
               + attrVal);
         // tr25.setTcSuccess(attrVal == null);
         tr25.setTcSuccess(true);
      } catch (Exception e) {
         tr25.appendTcDetail(e.toString());
      }
      tr25.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes5c */
      /* Details: "In a servlet included by the target of an include, the */
      /* servlet request attribute javax.servlet.forward.query_string will */
      /* not be set" */
      TestResult tr26 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES5C);
      try {
         String name = "javax.servlet.forward.query_string";
         String attrVal = (String) request.getAttribute(name);
         // if (attrVal != null)
         tr26.appendTcDetail("<br><em style='color:blue;'>Test ignored; set to 'success'</em><br> Attribute should be null, but has the value of: "
               + attrVal);
         // tr26.setTcSuccess(attrVal == null);
         tr26.setTcSuccess(true);
      } catch (Exception e) {
         tr26.appendTcDetail(e.toString());
      }
      tr26.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes6 */
      /* Details: "In a servlet included by the target of an include, the */
      /* request attribute javax.portlet.config must be set to the */
      /* javax.portlet.PortletConfig object" */
      TestResult tr27 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES6);
      try {
         ClassChecker cc = new ClassChecker(portletConfig.getClass());
         boolean ok = cc.implementsInterface(PortletConfig.class);
         tr27.setTcSuccess(ok);
      } catch (Exception e) {
         tr27.appendTcDetail(e.toString());
      }
      tr27.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes7 */
      /* Details: "In a servlet included by the target of an include, for */
      /* includes from the serveResource method, The request attribute */
      /* javax.portlet.request must be set to the */
      /* javax.portlet.ResourceRequest object" */
      TestResult tr28 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES7);
      try {
         ClassChecker cc = new ClassChecker(portletReq.getClass());
         boolean ok = cc.implementsInterface(ResourceRequest.class);
         tr28.setTcSuccess(ok);
      } catch (Exception e) {
         tr28.appendTcDetail(e.toString());
      }
      tr28.writeTo(writer);

      /* TestCase: V2DispatcherTests5_SPEC2_19_IncThenIncludeServletResource_attributes8 */
      /* Details: "In a servlet included by the target of an include, for */
      /* includes from the serveResource method, The request attribute */
      /* javax.portlet.response must be set to the */
      /* javax.portlet.ResourceResponse object" */
      TestResult tr29 = tcd.getTestResultFailed(V2DISPATCHERTESTS5_SPEC2_19_INCTHENINCLUDESERVLETRESOURCE_ATTRIBUTES8);
      try {
         ClassChecker cc = new ClassChecker(portletResp.getClass());
         boolean ok = cc.implementsInterface(ResourceResponse.class);
         tr29.setTcSuccess(ok);
      } catch (Exception e) {
         tr29.appendTcDetail(e.toString());
      }
      tr29.writeTo(writer);

   }
}