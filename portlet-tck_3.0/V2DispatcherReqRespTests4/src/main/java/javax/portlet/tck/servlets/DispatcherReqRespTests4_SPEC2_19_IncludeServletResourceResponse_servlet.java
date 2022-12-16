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

import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_CONTAINSHEADER;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_ENCODEREDIRECTURL;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_ENCODEREDIRECTURL1;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_ENCODEURL;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_ENCODEURL1;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_GETBUFFERSIZE;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_GETCHARACTERENCODING;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_GETCONTENTTYPE;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_GETLOCALE;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_ISCOMMITTED;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.portlet.MimeResponse;
import javax.portlet.PortletResponse;
import javax.portlet.ResourceResponse;
import javax.portlet.tck.beans.CompareUtils;
import javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails;
import javax.portlet.tck.beans.TestResult;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet for JSR 362 request dispatcher testing.
 * Used by portlet: DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse
 *
 * @author nick
 *
 */
public class DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse_servlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
         throws ServletException, IOException {
      processTCKReq(req, resp);
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp)
         throws ServletException, IOException {
      processTCKReq(req, resp);
   }

   // The tck uses only get & post requests
   @SuppressWarnings("deprecation")
   protected void processTCKReq(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      PortletResponse portletResp = (PortletResponse) request.getAttribute("javax.portlet.response");

      PrintWriter writer = ((MimeResponse)portletResp).getWriter();

      JSR286DispatcherReqRespTestCaseDetails tcd = new JSR286DispatcherReqRespTestCaseDetails();

      // Create result objects for the tests

      /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse_containsHeader */
      /* Details: "In a target servlet of a include in the Resource phase,    */
      /* the method HttpServletResponse.containsHeader must return false"     */
      TestResult tr0 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_CONTAINSHEADER);
      try {
         boolean ok = response.containsHeader("Accept");
         tr0.setTcSuccess(ok == false);
      } catch(Exception e) {tr0.appendTcDetail(e.toString());}
      tr0.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse_encodeRedirectURL1 */
      /* Details: "In a target servlet of a include in the Resource phase,    */
      /* the method HttpServletResponse.encodeRedirectURL must return null"   */
      TestResult tr1 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_ENCODEREDIRECTURL1);
      try {
         String isval = response.encodeRedirectURL("http://www.cnn.com/");
         CompareUtils.stringsEqual(isval, null, tr1);
      } catch(Exception e) {tr1.appendTcDetail(e.toString());}
      tr1.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse_encodeRedirectUrl */
      /* Details: "In a target servlet of a include in the Resource phase,    */
      /* the method HttpServletResponse.encodeRedirectUrl must return null"   */
      TestResult tr2 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_ENCODEREDIRECTURL);
      try {
         String isval = response.encodeRedirectUrl("http://www.cnn.com/");
         CompareUtils.stringsEqual(isval, null, tr2);
      } catch(Exception e) {tr2.appendTcDetail(e.toString());}
      tr2.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse_encodeURL1 */
      /* Details: "In a target servlet of a include in the Resource phase,    */
      /* the method HttpServletResponse.encodeURL must provide the same       */
      /* functionality as ResourceResponse.encodeURL"                         */
      TestResult tr3 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_ENCODEURL1);
      try {
         String turl = "http://www.apache.org/";
         String hval = (String)response.encodeURL(turl);
         String pval = (String)portletResp.encodeURL(turl);
         CompareUtils.stringsEqual("HttpServletResponse", hval, "ResourceResponse", pval, tr3);
      } catch(Exception e) {tr3.appendTcDetail(e.toString());}
      tr3.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse_encodeUrl */
      /* Details: "In a target servlet of a include in the Resource phase,    */
      /* the method HttpServletResponse.encodeUrl must provide the same       */
      /* functionality as ResourceResponse.encodeURL"                         */
      TestResult tr4 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_ENCODEURL);
      try {
         String turl = "http://www.apache.org/";
         String hval = (String)response.encodeUrl(turl);
         String pval = (String)portletResp.encodeURL(turl);
         CompareUtils.stringsEqual("HttpServletResponse", hval, "ResourceResponse", pval, tr4);
      } catch(Exception e) {tr4.appendTcDetail(e.toString());}
      tr4.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse_getBufferSize */
      /* Details: "In a target servlet of a include in the Resource phase,    */
      /* the method HttpServletResponse.getBufferSize must provide the same   */
      /* functionality as ResourceResponse.getBufferSize"                     */
      TestResult tr5 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_GETBUFFERSIZE);
      try {
         int hval = response.getBufferSize();
         int pval = ((ResourceResponse)portletResp).getBufferSize();
         String str = "Value " + hval + " from " + "HttpServletResponse" + " does not equal value " + pval + " + ResourceResponse";
         if (hval != pval) {
            tr5.appendTcDetail(str);
         }
         tr5.setTcSuccess(hval == pval);
      } catch(Exception e) {tr5.appendTcDetail(e.toString());}
      tr5.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse_getCharacterEncoding */
      /* Details: "In a target servlet of a include in the Resource phase,    */
      /* the method HttpServletResponse.getCharacterEncoding must provide     */
      /* the same functionality as ResourceResponse.getCharacterEncoding"     */
      TestResult tr6 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_GETCHARACTERENCODING);
      try {
         String hval = response.getCharacterEncoding();
         String pval = ((ResourceResponse)portletResp).getCharacterEncoding();
         CompareUtils.stringsEqual("HttpServletResponse", hval, "ResourceResponse", pval, tr6);
      } catch(Exception e) {tr6.appendTcDetail(e.toString());}
      tr6.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse_getContentType */
      /* Details: "In a target servlet of a include in the Resource phase,    */
      /* the method HttpServletResponse.getContentType must provide the       */
      /* same functionality as ResourceResponse.getContentType"               */
      TestResult tr7 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_GETCONTENTTYPE);
      try {
         String hval = response.getContentType();
         String pval = ((ResourceResponse)portletResp).getContentType();
         CompareUtils.stringsEqual("HttpServletResponse", hval, "ResourceResponse", pval, tr7);
      } catch(Exception e) {tr7.appendTcDetail(e.toString());}
      tr7.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse_getLocale */
      /* Details: "In a target servlet of a include in the Resource phase,    */
      /* the method HttpServletResponse.getLocale must provide the same       */
      /* functionality as ResourceResponse.getLocale"                         */
      TestResult tr8 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_GETLOCALE);
      try {
         Locale hl = response.getLocale();
         Locale pl = ((MimeResponse)portletResp).getLocale();
         String hval = hl.getDisplayName();
         String pval = pl.getDisplayName();
         CompareUtils.stringsEqual("HttpServletResponse", hval, "ResourceResponse", pval, tr8);
      } catch(Exception e) {tr8.appendTcDetail(e.toString());}
      tr8.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests4_SPEC2_19_IncludeServletResourceResponse_isCommitted */
      /* Details: "In a target servlet of a include in the Resource phase,    */
      /* the method HttpServletResponse.isCommitted must provide the same     */
      /* functionality as ResourceResponse.isCommitted"                       */
      TestResult tr9 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS4_SPEC2_19_INCLUDESERVLETRESOURCERESPONSE_ISCOMMITTED);
      try {
         boolean hval = response.isCommitted();
         boolean pval = ((ResourceResponse)portletResp).isCommitted();
         String str = "Value " + hval + " from " + "HttpServletResponse" + " does not equal value " + pval + " + ResourceResponse";
         if (hval != pval) {
            tr9.appendTcDetail(str);
         }
         tr9.setTcSuccess(hval == pval);
      } catch(Exception e) {tr9.appendTcDetail(e.toString());}
      tr9.writeTo(writer);


   }
}
