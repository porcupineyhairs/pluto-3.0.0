<%--
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed  under the  License is distributed on an "AS IS" BASIS,
WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
implied.

See the License for the specific language governing permissions and
limitations under the License.
--%>

<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0"  prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.io.*,java.util.*,java.util.logging.*" %>
<%@ page import="static java.util.logging.Logger.*" %>
<%@ page import="javax.portlet.*,javax.portlet.filter.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ page import="javax.portlet.tck.beans.*,javax.portlet.tck.constants.*" %>
<%@ page import="static javax.portlet.tck.constants.Constants.*" %>
<%@ page import="static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.*" %>
<%

      PortletRequest portletReq = (PortletRequest) request.getAttribute("javax.portlet.request");
      PortletResponse portletResp = (PortletResponse) request.getAttribute("javax.portlet.response");
      PortletConfig portletConfig = (PortletConfig) request.getAttribute("javax.portlet.config");
      long svtTid = Thread.currentThread().getId();
      long reqTid = (Long) portletReq.getAttribute(THREADID_ATTR);

      StringWriter writer = new StringWriter();

      JSR286DispatcherReqRespTestCaseDetails tcd = new JSR286DispatcherReqRespTestCaseDetails();

      // Create result objects for the tests

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getAttribute */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getAttribute must provide the same         */
      /* functionality as EventRequest.getAttribute"                          */
      TestResult tr0 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETATTRIBUTE);
      try {
         String hval = (String)request.getAttribute(ATTR_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getAttribute");
         String pval = (String)portletReq.getAttribute(ATTR_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getAttribute");
         CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr0);
      } catch(Exception e) {tr0.appendTcDetail(e.toString());}
      tr0.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getAttributeNames */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getAttributeNames must provide the same    */
      /* functionality as EventRequest.getAttributeNames"                     */
      TestResult tr1 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETATTRIBUTENAMES);
      try {
         Enumeration<String> he = request.getAttributeNames();
         Enumeration<String> pe = portletReq.getAttributeNames();
         CompareUtils.enumsEqual("HttpServletRequest attribute names", he, "EventRequest attribute names", pe,tr1);
      } catch(Exception e) {tr1.appendTcDetail(e.toString());}
      tr1.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getAuthType */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getAuthType must provide the same          */
      /* functionality as EventRequest.getAuthType"                           */
      TestResult tr2 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETAUTHTYPE);
      try {
         String hval = request.getAuthType();
         String pval = ((EventRequest)portletReq).getAuthType();
         CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr2);
      } catch(Exception e) {tr2.appendTcDetail(e.toString());}
      tr2.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getCharacterEncoding */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getCharacterEncoding must return null"     */
      TestResult tr3 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETCHARACTERENCODING);
      try {
         String isval = request.getCharacterEncoding();
         CompareUtils.stringsEqual(isval, null, tr3);
      } catch(Exception e) {tr3.appendTcDetail(e.toString());}
      tr3.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getContentLength */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getContentLength must return 0"            */
      TestResult tr4 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETCONTENTLENGTH);
      try {
         int isval = request.getContentLength();
         if (isval != 0) tr4.appendTcDetail("Returned value was: " + isval);
         tr4.setTcSuccess(isval == 0);
      } catch(Exception e) {tr4.appendTcDetail(e.toString());}
      tr4.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getContentType */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getContentType must return null"           */
      TestResult tr5 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETCONTENTTYPE);
      try {
         String isval = request.getContentType();
         CompareUtils.stringsEqual(isval, null, tr5);
      } catch(Exception e) {tr5.appendTcDetail(e.toString());}
      tr5.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getContextPath */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getContextPath must provide the same       */
      /* functionality as EventRequest.getContextPath"                        */
      TestResult tr6 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETCONTEXTPATH);
      try {
         String hval = request.getContextPath();
         String pval = ((EventRequest)portletReq).getContextPath();
         CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr6);
      } catch(Exception e) {tr6.appendTcDetail(e.toString());}
      tr6.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getCookies */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getCookies must provide the same           */
      /* functionality as EventRequest.getCookies"                            */
      TestResult tr7 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETCOOKIES);
      try {
         Cookie[] hvals = request.getCookies();
         Cookie[] pvals = ((EventRequest)portletReq).getCookies();
         HashSet<Cookie> hsc = new HashSet<Cookie>(Arrays.asList(hvals));
         HashSet<Cookie> psc = new HashSet<Cookie>(Arrays.asList(pvals));
         CompareUtils.setsEqual("cookies from HttpServletRequest", hsc, "cookies from from EventRequest", psc, tr7);
      } catch(Exception e) {tr7.appendTcDetail(e.toString());}
      tr7.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getDateHeader */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getDateHeader must return a value          */
      /* corresponding to that returned by EventRequest.getProperty for the   */
      /* corresponding header name"                                           */
      TestResult tr8 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETDATEHEADER);
      try {
         long hval = request.getDateHeader(DATE_HEADER);
         String pstr = portletReq.getProperty(DATE_HEADER);
         long pval = (pstr == null) ? -1 : Long.parseLong(pstr);
         boolean ok = (hval == pval);
         if (!ok) {
            String str = DATE_HEADER + " from HttpServletRequest: " + hval + ", did not equal " + pval + " from EventRequest";
            tr8.appendTcDetail(str);
         }
         tr8.setTcSuccess(ok);
      } catch(Exception e) {tr8.appendTcDetail(e.toString());}
      tr8.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getHeader */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getHeader must return a value              */
      /* corresponding to that returned by EventRequest.getProperty for the   */
      /* corresponding header name"                                           */
      TestResult tr9 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETHEADER);
      try {
         String hval = request.getHeader(ACCEPT_HEADER);
         String pval = portletReq.getProperty(ACCEPT_HEADER);
         CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr9);
      } catch(Exception e) {tr9.appendTcDetail(e.toString());}
      tr9.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getHeaderNames */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* Enumeration returned by HttpServletRequest.getHeaderNames must be    */
      /* contained in the Enumeration returned by                             */
      /* EventRequest.getPropertyNames"                                       */
      TestResult tr10 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETHEADERNAMES);
      try {
         // he must be contained in pe 
         Enumeration<String> he = request.getHeaderNames();
         Enumeration<String> pe = portletReq.getPropertyNames();
         HashSet<String> hs = new HashSet<String>();
         while (he.hasMoreElements()) {
            hs.add(he.nextElement());
         }
         HashSet<String> ps = new HashSet<String>();
         while (pe.hasMoreElements()) {
            ps.add(pe.nextElement());
         }
         boolean ok = ps.containsAll(hs);
         if (!ok) {
            hs.removeAll(ps);
            String str = "The following headers from HttpServletRequest are not contained in EventRequest: ";
            for (String h : hs) {;
               str += "\"" + h + "\", ";
            };
            tr10.appendTcDetail(str);
         }
         tr10.setTcSuccess(ok);
      } catch(Exception e) {tr10.appendTcDetail(e.toString());}
      tr10.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getHeaders */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getHeaders must return a value             */
      /* corresponding to that returned by EventRequest.getProperties for     */
      /* the corresponding header name"                                       */
      TestResult tr11 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETHEADERS);
      try {
         Enumeration<String> he = request.getHeaders(ACCEPT_LANG_HEADER);
         Enumeration<String> pe = portletReq.getProperties(ACCEPT_LANG_HEADER);
         CompareUtils.enumsEqual("HttpServletRequest parameter names", he, "EventRequest parameter names", pe,tr11);
      } catch(Exception e) {tr11.appendTcDetail(e.toString());}
      tr11.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getInputStream */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getInputStream must return null"           */
      TestResult tr12 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETINPUTSTREAM);
      try {
         ServletInputStream isval = request.getInputStream();
         tr12.setTcSuccess(isval == null);
      } catch(Exception e) {tr12.appendTcDetail(e.toString());}
      tr12.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getIntHeader */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getIntHeader must return a value           */
      /* corresponding to that returned by EventRequest.getProperty for the   */
      /* corresponding header name"                                           */
      TestResult tr13 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETINTHEADER);
      try {
         int hval = request.getIntHeader(CONTENT_LENGTH_HEADER);
         String pstr = portletReq.getProperty(CONTENT_LENGTH_HEADER);
         int pval = (pstr == null) ? -1 : Integer.parseInt(pstr);
         boolean ok = (hval == pval);
         if (!ok) {
            String str = CONTENT_LENGTH_HEADER + " from HttpServletRequest: " + hval + ", did not equal " + pval + " from EventRequest";
            tr13.appendTcDetail(str);
         }
         tr13.setTcSuccess(ok);
      } catch(Exception e) {tr13.appendTcDetail(e.toString());}
      tr13.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getLocalAddr */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getLocalAddr must return null"             */
      TestResult tr14 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETLOCALADDR);
      try {
         String isval = request.getLocalAddr();
         CompareUtils.stringsEqual(isval, null, tr14);
      } catch(Exception e) {tr14.appendTcDetail(e.toString());}
      tr14.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getLocalName */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getLocalName must return null"             */
      TestResult tr15 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETLOCALNAME);
      try {
         String isval = request.getLocalName();
         CompareUtils.stringsEqual(isval, null, tr15);
      } catch(Exception e) {tr15.appendTcDetail(e.toString());}
      tr15.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getLocalPort */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getLocalPort must return 0"                */
      TestResult tr16 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETLOCALPORT);
      try {
         int isval = request.getLocalPort();
         if (isval != 0) tr16.appendTcDetail("Returned value was: " + isval);
         tr16.setTcSuccess(isval == 0);
      } catch(Exception e) {tr16.appendTcDetail(e.toString());}
      tr16.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getLocale */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getLocale must provide the same            */
      /* functionality as EventRequest.getLocale"                             */
      TestResult tr17 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETLOCALE);
      try {
         Locale hl = request.getLocale();
         Locale pl = portletReq.getLocale();
         String hval = hl.getDisplayName();
         String pval = pl.getDisplayName();
         CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr17);
      } catch(Exception e) {tr17.appendTcDetail(e.toString());}
      tr17.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getLocales */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getLocales must provide the same           */
      /* functionality as EventRequest.getLocales"                            */
      TestResult tr18 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETLOCALES);
      try {
         Enumeration<Locale> he = request.getLocales();
         Enumeration<Locale> pe = portletReq.getLocales();
         CompareUtils.enumsEqual("HttpServletRequest locales", he, "EventRequest locales", pe,tr18);
      } catch(Exception e) {tr18.appendTcDetail(e.toString());}
      tr18.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getMethod */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getMethod must provide the same            */
      /* functionality as EventRequest.getMethod"                             */
      TestResult tr19 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETMETHOD);
      try {
         String hval = request.getMethod();
         String pval = ((EventRequest)portletReq).getMethod();
         CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr19);
      } catch(Exception e) {tr19.appendTcDetail(e.toString());}
      tr19.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getParameter */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getParameter must provide the same         */
      /* functionality as EventRequest.getParameter"                          */
      TestResult tr20 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETPARAMETER);
      try {
         // TestSetupLink
         String val = portletReq.getParameter(PARM_NAME);
         if (val != null) {
            String hval = request.getParameter(PARM_NAME);
            String pval = portletReq.getParameter(PARM_NAME);
            CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr20);
            tr20.writeTo(writer);
         }
      } catch(Exception e) {tr20.appendTcDetail(e.toString());}

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getParameterMap */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getParameterMap must provide the same      */
      /* functionality as EventRequest.getParameterMap"                       */
      TestResult tr21 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETPARAMETERMAP);
      try {
         // TestSetupLink
         String val = portletReq.getParameter(PARM_NAME);
         if (val != null) {
            Map<String, String[]> hmap = request.getParameterMap();
            Map<String, String[]> pmap = portletReq.getParameterMap();
            CompareUtils.mapsEqual("map from HttpServletRequest", hmap, "map from EventRequest", pmap, tr21);
            tr21.writeTo(writer);
         }
      } catch(Exception e) {tr21.appendTcDetail(e.toString());}

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getParameterNames */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getParameterNames must provide the same    */
      /* functionality as EventRequest.getParameterNames"                     */
      TestResult tr22 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETPARAMETERNAMES);
      try {
         // TestSetupLink
         String val = portletReq.getParameter(PARM_NAME);
         if (val != null) {
            Enumeration<String> he = request.getParameterNames();
            Enumeration<String> pe = portletReq.getParameterNames();
            CompareUtils.enumsEqual("HttpServletRequest parameter names", he, "EventRequest parameter names", pe,tr22);
            tr22.writeTo(writer);
         }
      } catch(Exception e) {tr22.appendTcDetail(e.toString());}

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getParameterValues */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getParameterValues must provide the same   */
      /* functionality as EventRequest.getParameterValues"                    */
      TestResult tr23 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETPARAMETERVALUES);
      try {
         // TestSetupLink
         String val = portletReq.getParameter(PARM_NAME);
         if (val != null) {
            String[] hvals = request.getParameterValues(PARM_NAME);
            String[] pvals = portletReq.getParameterValues(PARM_NAME);
            String hval = ((hvals==null) ? "null" : hvals[0]);
            String pval = ((pvals==null) ? "null" : pvals[0]);
            CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr23);
            tr23.writeTo(writer);
         }
      } catch(Exception e) {tr23.appendTcDetail(e.toString());}

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getPathInfo */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getPathInfo must a value corresponding     */
      /* to the path used to obtain the PortletRequestDispatcher"             */
      TestResult tr24 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETPATHINFO);
      try {
         String hval = request.getPathInfo();
         String pval = null;
         CompareUtils.stringsEqual("HttpServletRequest", hval, " defined: ", pval, tr24);
      } catch(Exception e) {tr24.appendTcDetail(e.toString());}
      tr24.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getPathTranslated */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getPathTranslated must a value             */
      /* corresponding to the path used to obtain the                         */
      /* PortletRequestDispatcher"                                            */
      TestResult tr25 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETPATHTRANSLATED);
      try {
         String hval = request.getPathTranslated();
         String pval = null;
         CompareUtils.stringsEqual("HttpServletRequest", hval, " defined: ", pval, tr25);
      } catch(Exception e) {tr25.appendTcDetail(e.toString());}
      tr25.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getProtocol */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getProtocol must return \"HTTP/1.1\""      */
      TestResult tr26 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETPROTOCOL);
      try {
         String isval = request.getProtocol();
         CompareUtils.stringsEqual(isval, "HTTP/1.1", tr26);
      } catch(Exception e) {tr26.appendTcDetail(e.toString());}
      tr26.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getQueryString */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getQueryString must a value                */
      /* corresponding to the query string information used to obtain the     */
      /* PortletRequestDispatcher"                                            */
      TestResult tr27 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETQUERYSTRING);
      try {
         String hval = request.getQueryString();
         String pval = QUERY_STRING;
         CompareUtils.stringsEqual("HttpServletRequest", hval, " defined: ", pval, tr27);
      } catch(Exception e) {tr27.appendTcDetail(e.toString());}
      tr27.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getReader */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getReader must return null"                */
      TestResult tr28 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETREADER);
      try {
         BufferedReader isval = request.getReader();
         tr28.setTcSuccess(isval == null);
      } catch(Exception e) {tr28.appendTcDetail(e.toString());}
      tr28.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getRealPath */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getRealPath must return null"              */
      TestResult tr29 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETREALPATH);
      try {
         String isval = request.getRealPath("/WEB-INF/portlet.xml");
         CompareUtils.stringsEqual(isval, null, tr29);
      } catch(Exception e) {tr29.appendTcDetail(e.toString());}
      tr29.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getRemoteAddr */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getRemoteAddr must return null"            */
      TestResult tr30 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETREMOTEADDR);
      try {
         String isval = request.getRemoteAddr();
         CompareUtils.stringsEqual(isval, null, tr30);
      } catch(Exception e) {tr30.appendTcDetail(e.toString());}
      tr30.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getRemoteHost */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getRemoteHost must return null"            */
      TestResult tr31 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETREMOTEHOST);
      try {
         String isval = request.getRemoteHost();
         CompareUtils.stringsEqual(isval, null, tr31);
      } catch(Exception e) {tr31.appendTcDetail(e.toString());}
      tr31.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getRemotePort */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getRemotePort must return 0"               */
      TestResult tr32 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETREMOTEPORT);
      try {
         int isval = request.getRemotePort();
         if (isval != 0) tr32.appendTcDetail("Returned value was: " + isval);
         tr32.setTcSuccess(isval == 0);
      } catch(Exception e) {tr32.appendTcDetail(e.toString());}
      tr32.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getRemoteUser */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getRemoteUser must provide the same        */
      /* functionality as EventRequest.getRemoteUser"                         */
      TestResult tr33 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETREMOTEUSER);
      try {
         String hval = request.getRemoteUser();
         String pval = ((EventRequest)portletReq).getRemoteUser();
         CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr33);
      } catch(Exception e) {tr33.appendTcDetail(e.toString());}
      tr33.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getRequestDispatcher */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getRequestDispatcher must provide          */
      /* functionality as defined in the servlet specification"               */
      TestResult tr34 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETREQUESTDISPATCHER);
      try {
         String sname = JSP_PREFIX + "DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest" + JSP_SUFFIX;
         RequestDispatcher hval = request.getRequestDispatcher(sname);
         if (hval == null) {
            tr34.appendTcDetail("Could not obtain request dispatcher for " + sname);
         }
         tr34.setTcSuccess(hval != null);
      } catch(Exception e) {tr34.appendTcDetail(e.toString());}
      tr34.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getRequestURI */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getRequestURI must a value corresponding   */
      /* to the path and query string information used to obtain the          */
      /* PortletRequestDispatcher"                                            */
      TestResult tr35 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETREQUESTURI);
      try {
         String sname = JSP_PREFIX + "DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest" + JSP_SUFFIX;
         String hval = request.getRequestURI();
         if (!hval.contains(sname)) {
            tr35.appendTcDetail("Request URI " + hval + " does not contain " + sname);
         }
         tr35.setTcSuccess(hval.contains(sname));
      } catch(Exception e) {tr35.appendTcDetail(e.toString());}
      tr35.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getRequestURL */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getRequestURL must return null"            */
      TestResult tr36 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETREQUESTURL);
      try {
         StringBuffer isval = request.getRequestURL();
         if (isval != null) tr36.appendTcDetail("Request URL is " + isval.toString());
         tr36.setTcSuccess(isval == null);
      } catch(Exception e) {tr36.appendTcDetail(e.toString());}
      tr36.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getRequestedSessionId */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getRequestedSessionId must provide the     */
      /* same functionality as EventRequest.getRequestedSessionId"            */
      TestResult tr37 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETREQUESTEDSESSIONID);
      try {
         String hval = request.getRequestedSessionId();
         String pval = ((EventRequest)portletReq).getRequestedSessionId();
         CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr37);
      } catch(Exception e) {tr37.appendTcDetail(e.toString());}
      tr37.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getScheme */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getScheme must provide the same            */
      /* functionality as EventRequest.getScheme"                             */
      TestResult tr38 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETSCHEME);
      try {
         String hval = request.getScheme();
         String pval = ((EventRequest)portletReq).getScheme();
         CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr38);
      } catch(Exception e) {tr38.appendTcDetail(e.toString());}
      tr38.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getServerName */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getServerName must provide the same        */
      /* functionality as EventRequest.getServerName"                         */
      TestResult tr39 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETSERVERNAME);
      try {
         String hval = request.getServerName();
         String pval = ((EventRequest)portletReq).getServerName();
         CompareUtils.stringsEqual("HttpServletRequest", hval, "EventRequest", pval, tr39);
      } catch(Exception e) {tr39.appendTcDetail(e.toString());}
      tr39.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getServerPort */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getServerPort must provide the same        */
      /* functionality as EventRequest.getServerPort"                         */
      TestResult tr40 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETSERVERPORT);
      try {
         int hval = request.getServerPort();
         int pval = ((EventRequest)portletReq).getServerPort();
         String str = "Value " + hval + " from " + "HttpServletRequest" + " does not equal value " + pval + " + EventRequest";
         if (hval != pval) {
            tr40.appendTcDetail(str);
         }
         tr40.setTcSuccess(hval == pval);
      } catch(Exception e) {tr40.appendTcDetail(e.toString());}
      tr40.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getServletPath */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getServletPath must a value                */
      /* corresponding to the path used to obtain the                         */
      /* PortletRequestDispatcher"                                            */
      TestResult tr41 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETSERVLETPATH);
      try {
         String sname = JSP_PREFIX + "DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest" + JSP_SUFFIX;
         String hval = request.getServletPath();
         String pval = sname;
         CompareUtils.stringsEqual("HttpServletRequest", hval, " defined: ", pval, tr41);
      } catch(Exception e) {tr41.appendTcDetail(e.toString());}
      tr41.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getSession */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getSession must provide the same           */
      /* functionality as                                                     */
      /* EventRequest.getPortletSession(APPLICATION_SCOPE)"                   */
      TestResult tr42 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETSESSION);
      try {
         HttpSession hval = request.getSession();
         if (hval == null) {
            tr42.appendTcDetail("Could not get session from HttpServletRequest");
         }
         tr42.setTcSuccess(hval != null);
      } catch(Exception e) {tr42.appendTcDetail(e.toString());}
      tr42.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_getUserPrincipal */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.getUserPrincipal must provide the same     */
      /* functionality as EventRequest.getUserPrincipal"                      */
      TestResult tr43 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_GETUSERPRINCIPAL);
      try {
         java.security.Principal hpal = request.getUserPrincipal();
         java.security.Principal ppal = ((EventRequest)portletReq).getUserPrincipal();
         String str = "Value " + hpal.toString() + " from " + "HttpServletRequest" + " does not equal value " + ppal.toString() + " + EventRequest";
         if (!hpal.equals(ppal)) {
            tr43.appendTcDetail(str);
         }
         tr43.setTcSuccess(hpal.equals(ppal));
      } catch(Exception e) {tr43.appendTcDetail(e.toString());}
      tr43.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_isRequestedSessionIdValid */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.isRequestedSessionIdValid must provide     */
      /* the same functionality as EventRequest.isRequestedSessionIdValid"    */
      TestResult tr44 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_ISREQUESTEDSESSIONIDVALID);
      try {
         boolean hval = request.isRequestedSessionIdValid();
         boolean pval = ((EventRequest)portletReq).isRequestedSessionIdValid();
         String str = "Value " + hval + " from " + "HttpServletRequest" + " does not equal value " + pval + " + EventRequest";
         if (hval != pval) {
            tr44.appendTcDetail(str);
         }
         tr44.setTcSuccess(hval == pval);
      } catch(Exception e) {tr44.appendTcDetail(e.toString());}
      tr44.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_isSecure */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.isSecure must provide the same             */
      /* functionality as EventRequest.isSecure"                              */
      TestResult tr45 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_ISSECURE);
      try {
         boolean hval = request.isSecure();
         boolean pval = ((EventRequest)portletReq).isSecure();
         String str = "Value " + hval + " from " + "HttpServletRequest" + " does not equal value " + pval + " + EventRequest";
         if (hval != pval) {
            tr45.appendTcDetail(str);
         }
         tr45.setTcSuccess(hval == pval);
      } catch(Exception e) {tr45.appendTcDetail(e.toString());}
      tr45.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_isUserInRole */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.isUserInRole must provide the same         */
      /* functionality as EventRequest.isUserInRole"                          */
      TestResult tr46 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_ISUSERINROLE);
      try {
         boolean hval = request.isUserInRole(ROLE_NAME);
         boolean pval = ((EventRequest)portletReq).isUserInRole(ROLE_NAME);
         String str = "Value " + hval + " from " + "HttpServletRequest" + " does not equal value " + pval + " + EventRequest";
         if (hval != pval) {
            tr46.appendTcDetail(str);
         }
         tr46.setTcSuccess(hval == pval);
      } catch(Exception e) {tr46.appendTcDetail(e.toString());}
      tr46.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_removeAttribute */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.removeAttribute must provide the same      */
      /* functionality as EventRequest.removeAttribute"                       */
      TestResult tr47 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_REMOVEATTRIBUTE);
      try {
         String hname = ATTR_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_removeAttribute1";
         String pname = ATTR_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_removeAttribute2";
         request.setAttribute(hname, "Value");
         portletReq.setAttribute(pname, "Value");
         request.removeAttribute(hname);
         portletReq.removeAttribute(pname);
         String hval = (String)request.getAttribute(hname);
         String pval = (String)portletReq.getAttribute(pname);
         boolean ok = (hval == null) && (pval == null);
         String str = "";
         if (!ok) {;
            if (hval != null) str += "Attribute could not be removed through HttpServletRequest." ;
            if (pval != null) str += "Attribute could not be removed through EventRequest." ;
            tr47.appendTcDetail(str);
         };
         tr47.setTcSuccess(ok);
      } catch(Exception e) {tr47.appendTcDetail(e.toString());}
      tr47.writeTo(writer);

      /* TestCase: V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_setAttribute */
      /* Details: "In a target jsp of a include in the Event phase, the       */
      /* method HttpServletRequest.setAttribute must provide the same         */
      /* functionality as EventRequest.setAttribute"                          */
      TestResult tr48 = tcd.getTestResultFailed(V2DISPATCHERREQRESPTESTS3_SPEC2_19_INCLUDEJSPEVENTREQUEST_SETATTRIBUTE);
      try {
         String hname = ATTR_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_setAttribute1";
         String pname = ATTR_PREFIX + "V2DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest_setAttribute2";
         request.setAttribute(hname, "Value");
         portletReq.setAttribute(pname, "Value");
         String hval = (String)request.getAttribute(hname);
         String pval = (String)portletReq.getAttribute(pname);
         request.removeAttribute(hname);
         portletReq.removeAttribute(pname);
         boolean ok = (hval.equals("Value") && pval.equals("Value")) ;
         String str = "";
         if (!ok) {;
            if (!hval.equals("Value")) str += "Attribute could not be set/read through HttpServletRequest." ;
            if (!pval.equals("Value")) str += "Attribute could not be set/read through EventRequest." ;
            tr48.appendTcDetail(str);
         };
         tr48.setTcSuccess(ok);
      } catch(Exception e) {tr48.appendTcDetail(e.toString());}
      tr48.writeTo(writer);

      request.getSession().setAttribute(
                   Constants.RESULT_ATTR_PREFIX + "DispatcherReqRespTests3_SPEC2_19_IncludeJSPEventRequest",
                   writer.toString());
%>
