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

/**
 * This bean encapsulates a single test result. When converted to a string or 
 * written to a writer, it generates HTML markup containing elements and IDs
 * that can be read by the TCK test driver. 
 * 
 * The TCK test driver works by accessing the page containing the test portlet,
 * clicking a link for the test if one is present, and reading the test output.
 * 
 * The test case is identified by a unique name string that contains no blanks. 
 * The test case name is used to generate ID's for the HTML result elements.
 * The following IDs are generated by this bean:
 * 
 * (TestCaseName)-success     - indicates general test case success or failure
 * (TestCaseName)-detail      - a detailed message about the test     
 * 
 */
package javax.portlet.tck.beans;

import java.io.IOException;
import java.io.Writer;

import javax.portlet.tck.constants.Constants;

/**
 * Formats a submit button in a form for a test case. When clicked, an HTTP POST request is sent.
 * 
 * @author nick
 */
public class TestButtonAsync {

   protected String     tcName;
   protected String     actId;
   protected String     notreadyId;
   protected String     title = " Execute Button:";
   protected String     testcase;


   /**
    * Creates an empty test result.
    */
   public TestButtonAsync() {
      tcName = "";
      actId = "";
      notreadyId = "";
      testcase = "";
   }

   /**
    * Creates a test button initialized according to the parameters for 
    * portlet hub testing.
    * 
    * @param tcName
    *           test case name
    */
   public TestButtonAsync(String tcName) {
      this.tcName = tcName;
      this.testcase = tcName;
      this.actId = tcName + Constants.CLICK_ID;
      this.notreadyId = tcName + Constants.NOTREADY_ID;
   }

   /**
    * Generates HTML markup representing the test link.
    * 
    * Note that the div element containing the item that is to be acted upon by the client must have an id equal to the
    * test case name.
    * 
    * @return HTML markup representing the test link
    */
   @Override
   public String toString() {

      StringBuilder sb = new StringBuilder();
      sb.append("<div class='portletTCKTestcase' name='");
      sb.append(tcName);
      sb.append("'>\n");
      sb.append("<div id='");       // is removed by JS code after loading is complete
      sb.append(notreadyId);
      sb.append("'></div>\n");
      sb.append("<h4>\n");
      sb.append(tcName);
      sb.append(title);
      sb.append("</h4>\n");
      sb.append("<form  class='portletTCKButton'" + " onsubmit='return false;' method='post' enctype='application/x-www-form-urlencoded'>\n");
      sb.append("<input type='submit' value='").append(testcase);
      sb.append("'  name='").append(Constants.BUTTON_PARAM_NAME);
      sb.append("'  id='").append(actId);
      sb.append("'/>\n");
      sb.append("<input type='hidden' value='").append(testcase);
      sb.append("'  name='formParam'");
      sb.append("'/>\n");
      sb.append("</form>\n");
      sb.append("</div>\n");

      return sb.toString();
   }

   /**
    * Generates HTML markup representing the test link and writes them to the writer provided.
    * 
    * @param writer
    *           Writer to which the string is written
    */
   public void writeTo(Writer writer) throws IOException {
      writer.write(this.toString());
   }

}
