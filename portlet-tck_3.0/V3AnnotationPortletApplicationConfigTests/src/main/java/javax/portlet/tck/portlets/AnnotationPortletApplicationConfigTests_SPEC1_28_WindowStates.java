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
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowState;
import javax.portlet.annotations.PortletConfiguration;
import javax.portlet.annotations.Supports;
import javax.portlet.tck.beans.TestResult;
import javax.portlet.tck.util.ModuleTestCaseDetails;

import static javax.portlet.tck.util.ModuleTestCaseDetails.V3ANNOTATIONPORTLETAPPLICATIONCONFIGTESTS_SPEC1_28_WINDOWSTATES_DECLARINGWINDOWSTATES1;
import static javax.portlet.tck.util.ModuleTestCaseDetails.V3ANNOTATIONPORTLETAPPLICATIONCONFIGTESTS_SPEC1_28_WINDOWSTATES_DECLARINGWINDOWSTATES2;
import static javax.portlet.tck.util.ModuleTestCaseDetails.V3ANNOTATIONPORTLETAPPLICATIONCONFIGTESTS_SPEC1_28_WINDOWSTATES_DECLARINGWINDOWSTATES3;
import static javax.portlet.tck.util.ModuleTestCaseDetails.V3ANNOTATIONPORTLETAPPLICATIONCONFIGTESTS_SPEC1_28_WINDOWSTATES_DECLARINGWINDOWSTATES4;


/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 *
 */

@PortletConfiguration(
   portletName = "AnnotationPortletApplicationConfigTests_SPEC1_28_WindowStates",
   supports={
      @Supports(windowStates={"custom1"})   
   },
   supportedLocales = {"en_US"}
)
public class AnnotationPortletApplicationConfigTests_SPEC1_28_WindowStates implements Portlet {

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

      /* TestCase: V3AnnotationPortletApplicationConfigTests_SPEC1_28_WindowStates_declaringWindowStates1 */
      /* Details: "Support for the NORMAL window state does not need to be declared */
      /* in the @PortletApplication annotation."                                    */
      {
         TestResult result = tcd.getTestResultFailed(V3ANNOTATIONPORTLETAPPLICATIONCONFIGTESTS_SPEC1_28_WINDOWSTATES_DECLARINGWINDOWSTATES1);
         if(portletReq.isWindowStateAllowed(WindowState.NORMAL)){
            result.setTcSuccess(true);
         } else {
            result.appendTcDetail("Failed because Normal window state is not allowed.");
         }
         result.writeTo(writer);
      }

      /* TestCase: V3AnnotationPortletApplicationConfigTests_SPEC1_28_WindowStates_declaringWindowStates2 */
      /* Details: "Support for the MINIMIZED window state does not need to be       */
      /* declared in the @PortletApplication annotation."                           */
      {
         TestResult result = tcd.getTestResultFailed(V3ANNOTATIONPORTLETAPPLICATIONCONFIGTESTS_SPEC1_28_WINDOWSTATES_DECLARINGWINDOWSTATES2);
         if(portletReq.isWindowStateAllowed(WindowState.MINIMIZED)){
            result.setTcSuccess(true);
         } else {
            result.appendTcDetail("Failed because Minimized window state is not allowed.");
         }
         result.writeTo(writer);
      }

      /* TestCase: V3AnnotationPortletApplicationConfigTests_SPEC1_28_WindowStates_declaringWindowStates3 */
      /* Details: "Support for the MAXIMIZED window state does not need to be       */
      /* declared in the @PortletApplication annotation."                           */
      {
         TestResult result = tcd.getTestResultFailed(V3ANNOTATIONPORTLETAPPLICATIONCONFIGTESTS_SPEC1_28_WINDOWSTATES_DECLARINGWINDOWSTATES3);
         if(portletReq.isWindowStateAllowed(WindowState.MAXIMIZED)){
            result.setTcSuccess(true);
         } else {
            result.appendTcDetail("Failed because Maximized window state is not allowed.");
         }
         result.writeTo(writer);
      }

      /* TestCase: V3AnnotationPortletApplicationConfigTests_SPEC1_28_WindowStates_declaringWindowStates4 */
      /* Details: "The PortletRequest.isWindowStateAllowed method must return FALSE */
      /* for a custom window state that is not supported by the portlet container." */
      {
         TestResult result = tcd.getTestResultFailed(V3ANNOTATIONPORTLETAPPLICATIONCONFIGTESTS_SPEC1_28_WINDOWSTATES_DECLARINGWINDOWSTATES4);
         if(!portletReq.isWindowStateAllowed(new WindowState("custom1"))){
            result.setTcSuccess(true);
         } else {
            result.appendTcDetail("Failed because custom1 window state is allowed.");
         }
         result.writeTo(writer);
      }

   }

}
