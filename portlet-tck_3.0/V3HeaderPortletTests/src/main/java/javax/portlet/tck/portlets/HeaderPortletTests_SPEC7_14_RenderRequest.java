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

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.HeaderPortlet;
import javax.portlet.HeaderRequest;
import javax.portlet.HeaderResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.annotations.PortletConfiguration;
import javax.portlet.tck.beans.TestResult;
import javax.portlet.tck.util.ModuleTestCaseDetails;

import static javax.portlet.tck.util.ModuleTestCaseDetails.V3HEADERPORTLETTESTS_SPEC7_14_RENDERREQUEST_GETETAG;
import static javax.portlet.tck.constants.Constants.RESULT_ATTR_PREFIX;
import static javax.portlet.PortletSession.PORTLET_SCOPE;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 *
 */

@PortletConfiguration(portletName = "HeaderPortletTests_SPEC7_14_RenderRequest")
public class HeaderPortletTests_SPEC7_14_RenderRequest implements Portlet, HeaderPortlet {

   @Override
   public void init(PortletConfig config) throws PortletException {
   }

   @Override
   public void destroy() {
   }

   @Override
   public void processAction(ActionRequest portletReq, ActionResponse portletResp) throws PortletException, IOException {
   }

   @Override
   public void render(RenderRequest portletReq, RenderResponse portletResp) throws PortletException, IOException {

      PrintWriter writer = portletResp.getWriter();
      String msg = (String) portletReq.getPortletSession().getAttribute(
            RESULT_ATTR_PREFIX + "HeaderPortletTests_SPEC7_14_RenderRequest",
            PORTLET_SCOPE);
      writer.write("<p>" + msg + "</p>\n");
      portletReq.getPortletSession().removeAttribute(
            RESULT_ATTR_PREFIX + "HeaderPortletTests_SPEC7_14_RenderRequest",
            PORTLET_SCOPE);
   }
   
   @Override
   public void renderHeaders(HeaderRequest portletReq,
         HeaderResponse PortletResp) throws PortletException, IOException {
      
      StringWriter writer = new StringWriter();

      ModuleTestCaseDetails tcd = new ModuleTestCaseDetails();
      
      /* TestCase: V3HeaderPortletTests_SPEC7_14_RenderRequest_getETag              */
      /* Details: "Method getETag(): Returns null if there is no cached response."  */
      {
         TestResult result = tcd.getTestResultFailed(V3HEADERPORTLETTESTS_SPEC7_14_RENDERREQUEST_GETETAG);
         if(portletReq.getETag()==null){
            result.setTcSuccess(true);
         }
         result.writeTo(writer);
      }
      
      portletReq.getPortletSession().setAttribute(
            RESULT_ATTR_PREFIX + "HeaderPortletTests_SPEC7_14_RenderRequest",
            writer.toString(), PORTLET_SCOPE);
   }

}
