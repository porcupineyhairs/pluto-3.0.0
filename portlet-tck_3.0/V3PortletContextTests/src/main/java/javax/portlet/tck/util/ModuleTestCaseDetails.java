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

package javax.portlet.tck.util;

import java.util.HashMap;
import java.util.Map;

import javax.portlet.tck.beans.TestCaseDetails;

/**
 * Defines constants for the test case names and test case details 
 * for the JSR 286 API compatibility tests.
 * 
 * Note that the backing map is static and not threadsafe. Operations
 * that change the map such as put, remove, etc., should not be used
 * in portlets.
 * 
 * @author nick
 */
public class ModuleTestCaseDetails extends TestCaseDetails {

   public final static String V3PORTLETCONTEXTTESTS_CONTEXT_GETCLASSLOADER = "V3PortletContextTests_Context_getClassLoader";
   public final static String V3PORTLETCONTEXTTESTS_CONTEXT_GETCONTEXTPATH = "V3PortletContextTests_Context_getContextPath";
   public final static String V3PORTLETCONTEXTTESTS_CONTEXT_GETEFFECTIVEMINORVERSION = "V3PortletContextTests_Context_getEffectiveMinorVersion";
   public final static String V3PORTLETCONTEXTTESTS_CONTEXT_GETEFFECTIVEMAJORVERSION = "V3PortletContextTests_Context_getEffectiveMajorVersion";

   
   private final static Map<String, String> tcd = new HashMap<String, String>();
   static {

      tcd.put(V3PORTLETCONTEXTTESTS_CONTEXT_GETCLASSLOADER, "The PortletContext.getClassLoader method returns the class loader for this portlet application.");
      tcd.put(V3PORTLETCONTEXTTESTS_CONTEXT_GETCONTEXTPATH, "The PortletContext.getContextPath method returns the context path for this portlet application.");
      tcd.put(V3PORTLETCONTEXTTESTS_CONTEXT_GETEFFECTIVEMINORVERSION, "The PortletContext.getEffectiveMinorVersion method returns the minor version of the Portlet API used by the portlet application running in this PortletContext. ");
      tcd.put(V3PORTLETCONTEXTTESTS_CONTEXT_GETEFFECTIVEMAJORVERSION, "The PortletContext.getEffectiveMajorVersion method returns the major version of the Portlet API used by the portlet application running in this PortletContext. ");

   }

   /**
    * Constructor.
    * 
    * Passes the static test case names - details map to the superclass
    * 
    * Note that the backing map is static and not threadsafe. Operations
    * that change the map such as put, remove, etc., should not be used
    * in portlets.
    */
   public ModuleTestCaseDetails() {
     super(tcd); 
   }

}
