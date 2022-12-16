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
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.tck.beans.TestButton;
import javax.xml.namespace.QName;

import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSEVENT_EVENTREQUEST_SIGEVENT_HASGETEVENT;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSEVENT_EVENTREQUEST_SIGEVENT_HASGETEVENTRETURNS;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSEVENT_EVENTREQUEST_SIGEVENT_HASGETMETHOD;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSEVENT_EVENTREQUEST_SIGEVENT_HASGETMETHODRETURNS;
import static javax.portlet.tck.beans.JSR286SignatureTestCaseDetails.V2SIGTESTSEVENT_EVENTREQUEST_SIGEVENT_IMPLEMENTSPORTLETREQUEST;
import static javax.portlet.tck.constants.Constants.THREADID_ATTR;
import static javax.portlet.tck.constants.Constants.TCKNAMESPACE;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names are defined
 * in the /src/main/resources/xml-resources/additionalTCs.xml file. The build process will integrate
 * the test case names defined in the additionalTCs.xml file into the complete list of test case
 * names for execution by the driver.
 *
 * This is the main portlet for the test cases. If the test cases call for events, this portlet will
 * initiate the events, but not process them. The processing is done in the companion portlet
 * SigTestsEvent_EventRequest_SIGEvent_event
 *
 */
public class SigTestsEvent_EventRequest_SIGEvent implements Portlet {

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

    QName eventQName = new QName(TCKNAMESPACE, "SigTestsEvent_EventRequest_SIGEvent");
    portletResp.setEvent(eventQName, "Hi!");
  }

  @Override
  public void render(RenderRequest portletReq, RenderResponse portletResp)
      throws PortletException, IOException {

    long tid = Thread.currentThread().getId();
    portletReq.setAttribute(THREADID_ATTR, tid);

    PrintWriter writer = portletResp.getWriter();

    /* TestCase: V2SigTestsEvent_EventRequest_SIGEvent_hasGetEvent */
    /* Details: "EventRequest has a getEvent()  method " */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb = new TestButton(V2SIGTESTSEVENT_EVENTREQUEST_SIGEVENT_HASGETEVENT, aurl);
      tb.writeTo(writer);
    }

    /* TestCase: V2SigTestsEvent_EventRequest_SIGEvent_hasGetEventReturns */
    /* Details: "EventRequest method getEvent() returns Event " */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb =
          new TestButton(V2SIGTESTSEVENT_EVENTREQUEST_SIGEVENT_HASGETEVENTRETURNS, aurl);
      tb.writeTo(writer);
    }

    /* TestCase: V2SigTestsEvent_EventRequest_SIGEvent_hasGetMethod */
    /* Details: "EventRequest has a getMethod()  method " */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb = new TestButton(V2SIGTESTSEVENT_EVENTREQUEST_SIGEVENT_HASGETMETHOD, aurl);
      tb.writeTo(writer);
    }

    /* TestCase: V2SigTestsEvent_EventRequest_SIGEvent_hasGetMethodReturns */
    /* Details: "EventRequest method getMethod() returns String " */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb =
          new TestButton(V2SIGTESTSEVENT_EVENTREQUEST_SIGEVENT_HASGETMETHODRETURNS, aurl);
      tb.writeTo(writer);
    }

    /* TestCase: V2SigTestsEvent_EventRequest_SIGEvent_implementsPortletRequest */
    /* Details: "EventRequest implements PortletRequest " */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb =
          new TestButton(V2SIGTESTSEVENT_EVENTREQUEST_SIGEVENT_IMPLEMENTSPORTLETREQUEST, aurl);
      tb.writeTo(writer);
    }

  }

}
