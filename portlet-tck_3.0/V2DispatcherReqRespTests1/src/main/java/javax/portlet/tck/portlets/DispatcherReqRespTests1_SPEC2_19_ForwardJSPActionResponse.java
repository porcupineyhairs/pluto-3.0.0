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

import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_CONTAINSHEADER;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_ENCODEREDIRECTURL1;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_ENCODEREDIRECTURL;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_ENCODEURL1;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_ENCODEURL;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_GETBUFFERSIZE;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_GETCHARACTERENCODING;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_GETCONTENTTYPE;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_GETLOCALE;
import static javax.portlet.tck.beans.JSR286DispatcherReqRespTestCaseDetails.V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_ISCOMMITTED;
import static javax.portlet.PortletSession.APPLICATION_SCOPE;
import static javax.portlet.tck.constants.Constants.JSP_PREFIX;
import static javax.portlet.tck.constants.Constants.JSP_SUFFIX;
import static javax.portlet.tck.constants.Constants.QUERY_STRING;
import static javax.portlet.tck.constants.Constants.RESULT_ATTR_PREFIX;
import static javax.portlet.tck.constants.Constants.THREADID_ATTR;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.ResourceServingPortlet;
import javax.portlet.tck.beans.TestButton;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 *
 * This is the main portlet for the test cases. If the test cases call for events, this portlet
 * will initiate the events, but not process them. The processing is done in the companion 
 * portlet DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse_event
 *
 */
public class DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse implements Portlet, ResourceServingPortlet {
   
   private PortletConfig portletConfig = null;

   @Override
   public void init(PortletConfig config) throws PortletException {
      this.portletConfig = config;
   }

   @Override
   public void destroy() {
   }

   @Override
   public void processAction(ActionRequest portletReq, ActionResponse portletResp)
         throws PortletException, IOException {

      portletResp.setRenderParameters(portletReq.getParameterMap());
      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      // Now do the actual dispatch
      String target = JSP_PREFIX + "DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse" + JSP_SUFFIX + "?" + QUERY_STRING;
      PortletRequestDispatcher rd = portletConfig.getPortletContext()
            .getRequestDispatcher(target);
      rd.forward(portletReq, portletResp);
   }

   @Override
   public void serveResource(ResourceRequest portletReq, ResourceResponse portletResp)
         throws PortletException, IOException {

      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

   }

   @Override
   public void render(RenderRequest portletReq, RenderResponse portletResp)
         throws PortletException, IOException {

      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      PrintWriter writer = portletResp.getWriter();

      PortletSession ps = portletReq.getPortletSession();
      String msg = (String) ps.getAttribute(RESULT_ATTR_PREFIX + "DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse", APPLICATION_SCOPE);
      if (msg != null) {
         writer.write("<p>" + msg + "</p><br/>\n");
         ps.removeAttribute(RESULT_ATTR_PREFIX + "DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse", APPLICATION_SCOPE);
      }

      /* TestCase: V2DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse_containsHeader */
      /* Details: "In a target jsp of a forward in the Action phase, the      */
      /* method HttpServletResponse.containsHeader must return false"         */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_CONTAINSHEADER, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse_encodeRedirectURL1 */
      /* Details: "In a target jsp of a forward in the Action phase, the      */
      /* method HttpServletResponse.encodeRedirectURL must return null"       */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_ENCODEREDIRECTURL1, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse_encodeRedirectUrl */
      /* Details: "In a target jsp of a forward in the Action phase, the      */
      /* method HttpServletResponse.encodeRedirectUrl must return null"       */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_ENCODEREDIRECTURL, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse_encodeURL1 */
      /* Details: "In a target jsp of a forward in the Action phase, the      */
      /* method HttpServletResponse.encodeURL must provide the same           */
      /* functionality as ActionResponse.encodeURL"                           */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_ENCODEURL1, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse_encodeUrl */
      /* Details: "In a target jsp of a forward in the Action phase, the      */
      /* method HttpServletResponse.encodeUrl must provide the same           */
      /* functionality as ActionResponse.encodeURL"                           */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_ENCODEURL, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse_getBufferSize */
      /* Details: "In a target jsp of a forward in the Action phase, the      */
      /* method HttpServletResponse.getBufferSize must return 0"              */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_GETBUFFERSIZE, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse_getCharacterEncoding */
      /* Details: "In a target jsp of a forward in the Action phase, the      */
      /* method HttpServletResponse.getCharacterEncoding must return null"    */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_GETCHARACTERENCODING, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse_getContentType */
      /* Details: "In a target jsp of a forward in the Action phase, the      */
      /* method HttpServletResponse.getContentType must return null"          */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_GETCONTENTTYPE, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse_getLocale */
      /* Details: "In a target jsp of a forward in the Action phase, the      */
      /* method HttpServletResponse.getLocale must return null"               */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_GETLOCALE, aurl);
         tb.writeTo(writer);
      }

      /* TestCase: V2DispatcherReqRespTests1_SPEC2_19_ForwardJSPActionResponse_isCommitted */
      /* Details: "In a target jsp of a forward in the Action phase, the      */
      /* method HttpServletResponse.isCommitted must return false"            */
      {
         PortletURL aurl = portletResp.createActionURL();
         aurl.setParameters(portletReq.getPrivateParameterMap());
         TestButton tb = new TestButton(V2DISPATCHERREQRESPTESTS1_SPEC2_19_FORWARDJSPACTIONRESPONSE_ISCOMMITTED, aurl);
         tb.writeTo(writer);
      }

   }

}
