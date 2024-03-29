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
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import javax.portlet.tck.constants.Constants;

/**
 * Encapsulates test results containint the test case name, the test case detail description, and the test case result (
 * <code>true</code> = success, <code>false</code> = failure).
 * 
 * @author nick
 */
public class TestResult {

   private String  tcName;
   private String  tcDetail;
   private boolean tcSuccess;

   /**
    * Creates an empty test result.
    */
   public TestResult() {
      this.tcName = "";
      this.tcDetail = "";
      this.tcSuccess = false;
   }

   /**
    * Creates a test result initialized according to the parameters.
    * 
    * @param tcName
    *           test case name
    * @param tcSuccess
    *           test case result
    * @param tcDetail
    *           test case detail description
    */
   public TestResult(String tcName, boolean tcSuccess, String tcDetail) {
      this.tcName = tcName;
      this.tcDetail = tcDetail;
      this.tcSuccess = tcSuccess;
   }

   public String getTcName() {
      return tcName;
   }

   public void setTcName(String tcName) {
      this.tcName = tcName;
   }

   public String getTcDetail() {
      return tcDetail;
   }

   public void setTcDetail(String tcDetail) {
      this.tcDetail = tcDetail;
   }

   public boolean isTcSuccess() {
      return tcSuccess;
   }

   public void setTcSuccess(boolean tcSuccess) {
      this.tcSuccess = tcSuccess;
   }

   /**
    * Appends error message to the test case detail string to indicate what went wrong when a test fails.
    * 
    * @param tcDetail
    *           String containing detailed error message
    */
   public void appendTcDetail(String tcDetail) {
      if (!this.tcDetail.endsWith("."))
         this.tcDetail += ".";
      this.tcDetail += " " + tcDetail;
   }

   /**
    * Appends error message to the test case detail string to indicate what went wrong when a test fails.
    * 
    * @param t
    *           the throwable
    */
   public void appendTcDetail(Throwable t) {
      if (!this.tcDetail.endsWith("."))
         this.tcDetail += ".";
      this.tcDetail += " " + t.toString();

      StringWriter sw = new StringWriter();
      PrintWriter pw = new PrintWriter(sw);
      t.printStackTrace(pw);
      pw.flush();
      this.tcDetail += sw.toString().replaceAll("\\n", "<br>");
   }

   /**
    * Generates HTML markup representing the test result.
    * 
    * Note that the div element containing the item that is to be acted upon by the client must have an id equal to the
    * test case name.
    * 
    * @return HTML markup representing the test result
    */
   @Override
   public String toString() {
      final String resId = tcName + Constants.RESULT_ID;
      final String detId = tcName + Constants.DETAIL_ID;
      final String resStr = tcSuccess ? Constants.SUCCESS : Constants.FAILURE;

      StringBuilder sb = new StringBuilder();
      sb.append("<div class='portletTCKTestcase' name='");
      sb.append(tcName);
      sb.append("'>\n");
      sb.append("<h4>\n");
      sb.append(tcName);
      sb.append(" results:");
      sb.append("</h4>\n");
      sb.append("<p class='portletTCKResult' id='");
      sb.append(resId);
      sb.append("'>Test ");
      sb.append(resStr);
      sb.append("</p>\n");
      sb.append("<p class='portletTCKDetail' id='");
      sb.append(detId);
      sb.append("'>Details: ");
      sb.append(tcDetail);
      sb.append("</p>\n");
      sb.append("</div>\n");

      return sb.toString();
   }

   /**
    * Generates HTML markup representing the test results and writes them to the writer provided.
    * 
    * @param writer
    *           Writer to which the string is written
    */
   public void writeTo(Writer writer) throws IOException {
      writer.write(this.toString());
   }

}
