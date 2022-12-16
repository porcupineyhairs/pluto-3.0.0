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

import static javax.portlet.PortletSession.APPLICATION_SCOPE;
import static javax.portlet.tck.constants.Constants.ATTR_DISPATCH_ACTION;
import static javax.portlet.tck.constants.Constants.ATTR_DISPATCH_TARGET;
import static javax.portlet.tck.constants.Constants.EXTRA_PATH;
import static javax.portlet.tck.constants.Constants.QUERY_STRING;
import static javax.portlet.tck.constants.Constants.RESULT_ATTR_PREFIX;
import static javax.portlet.tck.constants.Constants.SERVLET_PREFIX;
import static javax.portlet.tck.constants.Constants.THREADID_ATTR;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.EventPortlet;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.ResourceServingPortlet;

/**
 * This is the event processing portlet for the test cases. This portlet processes events, but does not publish them.
 * Events are published in the main portlet for the test cases.
 */
public class DispatcherTests6_SPEC2_19_FwdThenForwardServletEvent_event implements Portlet, EventPortlet,
      ResourceServingPortlet {

   private PortletConfig portletConfig = null;

   @Override
   public void init(PortletConfig config) throws PortletException {
      this.portletConfig = config;
   }

   @Override
   public void destroy() {
   }

   @Override
   public void processAction(ActionRequest portletReq, ActionResponse portletResp) throws PortletException, IOException {
   }

   @Override
   public void serveResource(ResourceRequest portletReq, ResourceResponse portletResp) throws PortletException,
         IOException {
   }

   @Override
   public void processEvent(EventRequest portletReq, EventResponse portletResp) throws PortletException, IOException {

      portletResp.setRenderParameters(portletReq);

      long tid = Thread.currentThread().getId();
      portletReq.setAttribute(THREADID_ATTR, tid);

      new StringWriter();

      // Multilevel forward / include
      portletReq.setAttribute(ATTR_DISPATCH_ACTION, "forward");
      String targ = SERVLET_PREFIX + "DispatcherTests6_SPEC2_19_FwdThenForwardServletEvent_servlet" + EXTRA_PATH + "?"
            + QUERY_STRING;
      portletReq.setAttribute(ATTR_DISPATCH_TARGET, targ);

      // Now do the actual dispatch
      String target = "/IncluderForwarderServlet" + "?" + QUERY_STRING;
      PortletRequestDispatcher rd = portletConfig.getPortletContext().getRequestDispatcher(target);
      rd.forward(portletReq, portletResp);

   }

   @Override
   public void render(RenderRequest portletReq, RenderResponse portletResp) throws PortletException, IOException {

      portletResp.setContentType("text/html");
      PrintWriter writer = portletResp.getWriter();
      writer.write("<h3>Event Companion Portlet </h3>\n");
      writer.write("<p>DispatcherTests6_SPEC2_19_FwdThenForwardServletEvent_event</p>\n");

      String msg = (String) portletReq.getPortletSession().getAttribute(
            RESULT_ATTR_PREFIX + "DispatcherTests6_SPEC2_19_FwdThenForwardServletEvent", APPLICATION_SCOPE);
      msg = (msg == null) ? "Not ready. click test case link." : msg;
      writer.write("<p>" + msg + "</p>\n");

   }

}
