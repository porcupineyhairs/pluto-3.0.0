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

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.annotations.PortletConfiguration;
import javax.portlet.annotations.Supports;
import javax.portlet.tck.beans.TestResult;
import javax.portlet.tck.util.ModuleTestCaseDetails;

import static javax.portlet.tck.util.ModuleTestCaseDetails.V3ANNOTATIONPORTLETAPPCONFIGOVERRIDETESTS_SPEC1_28_PORTLETMODES_DECLARINGPORTLETMODES7;
import static javax.portlet.tck.util.ModuleTestCaseDetails.V3ANNOTATIONPORTLETAPPCONFIGOVERRIDETESTS_SPEC1_28_PORTLETMODES_DECLARINGPORTLETMODES8;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 *
 */

@PortletConfiguration(
   portletName = "AnnotationPortletAppConfigOverrideTests_SPEC1_28_PortletModes",
   supports={
      @Supports(portletModes={"view", "custom1", "custom2"})   
   }
)
public class AnnotationPortletAppConfigOverrideTests_SPEC1_28_PortletModes implements Portlet {

   @Override
   public void init(PortletConfig config) throws PortletException {}

   @Override
   public void destroy() {}

   @Override
   public void processAction(ActionRequest portletReq, ActionResponse portletResp) throws PortletException, IOException {}

   @Override
   public void render(RenderRequest portletReq, RenderResponse portletResp) throws PortletException, IOException {

      PrintWriter writer = portletResp.getWriter();
      ModuleTestCaseDetails tcd = new ModuleTestCaseDetails();

      /* TestCase: V3AnnotationPortletAppConfigOverrideTests_SPEC1_28_PortletModes_declaringPortletModes7 */
      /* Details: "A custom portlet mode declared in the @PortletApplication        */
      /* annotation could be overridden by deployment descriptor portlet.xml"       */
      {
         TestResult result = tcd.getTestResultFailed(V3ANNOTATIONPORTLETAPPCONFIGOVERRIDETESTS_SPEC1_28_PORTLETMODES_DECLARINGPORTLETMODES7);
         if(portletReq.isPortletModeAllowed(new PortletMode("custom1"))){
            result.setTcSuccess(true);
         } else {
            result.appendTcDetail("Failed because custom1 portlet mode is not overridden by portlet.xml and is not allowed.");
         }
         result.writeTo(writer);
      }

      /* TestCase: V3AnnotationPortletAppConfigOverrideTests_SPEC1_28_PortletModes_declaringPortletModes8 */
      /* Details: "The portlet container merges the portlet modes declared in the   */
      /* @PortletApplication annotation and deployment descriptor portlet.xml"      */
      {
         TestResult result = tcd.getTestResultFailed(V3ANNOTATIONPORTLETAPPCONFIGOVERRIDETESTS_SPEC1_28_PORTLETMODES_DECLARINGPORTLETMODES8);
         if(portletReq.isPortletModeAllowed(new PortletMode("custom1"))
               && portletReq.isPortletModeAllowed(new PortletMode("custom2"))){
            result.setTcSuccess(true);
         } else {
            result.appendTcDetail("Failed because custom1 or custom2 portlet mode is not overridden by portlet.xml and is not allowed.");
         }
         result.writeTo(writer);
      }

   }

}
