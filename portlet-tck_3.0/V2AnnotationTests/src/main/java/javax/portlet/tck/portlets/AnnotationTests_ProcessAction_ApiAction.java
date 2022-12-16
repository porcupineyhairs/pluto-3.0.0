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

import static javax.portlet.PortletSession.APPLICATION_SCOPE;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2ANNOTATIONTESTS_PROCESSACTION_APIACTION_NAME;
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
 * This portlet implements several test cases for the JSR 362 TCK. The test case names are defined
 * in the /src/main/resources/xml-resources/additionalTCs.xml file. The build process will integrate
 * the test case names defined in the additionalTCs.xml file into the complete list of test case
 * names for execution by the driver.
 *
 * This is the main portlet for the test cases. If the test cases call for events, this portlet will
 * initiate the events, but not process them. The processing is done in the companion portlet
 * AnnotationTests_ProcessAction_ApiAction_event
 *
 */
public class AnnotationTests_ProcessAction_ApiAction implements Portlet {

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

    StringWriter writer = new StringWriter();

    JSR286ApiTestCaseDetails tcd = new JSR286ApiTestCaseDetails();

    /* TestCase: V2AnnotationTests_ProcessAction_ApiAction_name */
    /* Details: "Method name(): On an action request, the method is */
    /* executed if the parameter \"javax.portlet.action\" matches the */
    /* name field" */
    TestResult tr0 = tcd.getTestResultFailed(V2ANNOTATIONTESTS_PROCESSACTION_APIACTION_NAME);
    String nme = portletReq.getParameter(ActionRequest.ACTION_NAME);
    if (nme.equals(V2ANNOTATIONTESTS_PROCESSACTION_APIACTION_NAME)) {
      tr0.setTcSuccess(true);
    } else {
      tr0.setTcSuccess(false);
    }
    tr0.writeTo(writer);

    portletReq.getPortletSession().setAttribute(
        Constants.RESULT_ATTR_PREFIX + "AnnotationTests_ProcessAction_ApiAction", writer.toString(),
        APPLICATION_SCOPE);
  }

  @Override
  public void render(RenderRequest portletReq, RenderResponse portletResp)
      throws PortletException, IOException {

    long tid = Thread.currentThread().getId();
    portletReq.setAttribute(THREADID_ATTR, tid);

    PrintWriter writer = portletResp.getWriter();

    PortletSession ps = portletReq.getPortletSession();
    String msg =
        (String) ps.getAttribute(RESULT_ATTR_PREFIX + "AnnotationTests_ProcessAction_ApiAction",
            APPLICATION_SCOPE);
    if (msg != null) {
      writer.write("<p>" + msg + "</p><br/>\n");
      ps.removeAttribute(RESULT_ATTR_PREFIX + "AnnotationTests_ProcessAction_ApiAction",
          APPLICATION_SCOPE);
    }

    /* TestCase: V2AnnotationTests_ProcessAction_ApiAction_name */
    /* Details: "Method name(): On an action request, the method is */
    /* executed if the parameter \"javax.portlet.action\" matches the */
    /* name field" */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameter(ActionRequest.ACTION_NAME, V2ANNOTATIONTESTS_PROCESSACTION_APIACTION_NAME);
      TestButton tb = new TestButton(V2ANNOTATIONTESTS_PROCESSACTION_APIACTION_NAME, aurl);
      tb.writeTo(writer);
    }

  }

}
