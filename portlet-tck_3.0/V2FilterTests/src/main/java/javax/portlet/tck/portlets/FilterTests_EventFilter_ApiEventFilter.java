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

import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_CANBECONFIGURED1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_CANBECONFIGURED2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_DOFILTERISCALLED;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_DOFILTERPROCESSEVENT1;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_DOFILTERPROCESSEVENT2;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_DOFILTERBLOCK;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_DOFILTEREXAMINE;
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
 * FilterTests_EventFilter_ApiEventFilter_event
 *
 */
public class FilterTests_EventFilter_ApiEventFilter implements Portlet {

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

    String action = portletReq.getParameter("inputval");
    if (action.equals("V2FilterTests_EventFilter_ApiEventFilter_doFilterBlock")) {
      QName eventQName_tr5 = new QName(TCKNAMESPACE, "FilterTests_EventFilter_ApiEventFilter_tr5");
      portletResp.setEvent(eventQName_tr5, "Hi!");
    }
    QName eventQName = new QName(TCKNAMESPACE, "FilterTests_EventFilter_ApiEventFilter");
    portletResp.setEvent(eventQName, "Hi!");
  }

  @Override
  public void render(RenderRequest portletReq, RenderResponse portletResp)
      throws PortletException, IOException {

    long tid = Thread.currentThread().getId();
    portletReq.setAttribute(THREADID_ATTR, tid);

    PrintWriter writer = portletResp.getWriter();

    /* TestCase: V2FilterTests_EventFilter_ApiEventFilter_canBeConfigured1 */
    /* Details: "An EventFilter can be configured in the portlet */
    /* descriptor" */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb =
          new TestButton(V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_CANBECONFIGURED1, aurl);
      tb.writeTo(writer);
    }

    /* TestCase: V2FilterTests_EventFilter_ApiEventFilter_canBeConfigured2 */
    /* Details: "Multiple EventFilter classes can be configured in the */
    /* portlet descriptor" */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb =
          new TestButton(V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_CANBECONFIGURED2, aurl);
      tb.writeTo(writer);
    }

    /* TestCase: V2FilterTests_EventFilter_ApiEventFilter_doFilterIsCalled */
    /* Details: "The doFilter(EventRequest, EventResponse, FilterChain): */
    /* method is called before the processEvent method for the portlet" */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb =
          new TestButton(V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_DOFILTERISCALLED, aurl);
      tb.writeTo(writer);
    }

    /* TestCase: V2FilterTests_EventFilter_ApiEventFilter_doFilterProcessEvent1 */
    /* Details: "After the doFilter(EventRequest, EventResponse, */
    /* FilterChain): method has sucessfully completed and invokes the */
    /* next filter, the processEventMethod is called" */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb =
          new TestButton(V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_DOFILTERPROCESSEVENT1, aurl);
      tb.writeTo(writer);
    }

    /* TestCase: V2FilterTests_EventFilter_ApiEventFilter_doFilterProcessEvent2 */
    /* Details: "After the doFilter(EventRequest, EventResponse, */
    /* FilterChain): method has sucessfully completed and invokes the */
    /* next filter, the next filter in the chain is called if multiple */
    /* filters are defined" */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb =
          new TestButton(V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_DOFILTERPROCESSEVENT2, aurl);
      tb.writeTo(writer);
    }

    /* TestCase: V2FilterTests_EventFilter_ApiEventFilter_doFilterBlock */
    /* Details: "If the doFilter(EventRequest, EventResponse, */
    /* FilterChain): method does not invoke the next filter, processEvent */
    /* is not called" */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb =
          new TestButton(V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_DOFILTERBLOCK, aurl);
      tb.writeTo(writer);
    }

    /* TestCase: V2FilterTests_EventFilter_ApiEventFilter_doFilterExamine */
    /* Details: "Method doFilter(EventRequest, EventResponse, */
    /* FilterChain): After the next filter has been successfully invoked, */
    /* the EventResponse may be examined" */
    {
      PortletURL aurl = portletResp.createActionURL();
      aurl.setParameters(portletReq.getPrivateParameterMap());
      TestButton tb =
          new TestButton(V2FILTERTESTS_EVENTFILTER_APIEVENTFILTER_DOFILTEREXAMINE, aurl);
      tb.writeTo(writer);
    }

  }

}
