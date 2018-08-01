/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.assistant.v1.model;

import java.util.Map;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * DialogSuggestion.
 */
public class DialogSuggestion extends GenericModel {

  private String label;
  private DialogSuggestionValue value;
  private Map output;

  /**
   * Gets the label.
   *
   * The user-facing label for the disambiguation option. This label is taken from the **user_label** property of the
   * corresponding dialog node.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Gets the value.
   *
   * An object defining the message input, intents, and entities to be sent to the Watson Assistant service if the user
   * selects the corresponding disambiguation option.
   *
   * @return the value
   */
  public DialogSuggestionValue getValue() {
    return value;
  }

  /**
   * Gets the output.
   *
   * The dialog output that will be returned from the Watson Assistant service if the user selects the corresponding
   * option.
   *
   * @return the output
   */
  public Map getOutput() {
    return output;
  }

  /**
   * Sets the label.
   *
   * @param label the new label
   */
  public void setLabel(final String label) {
    this.label = label;
  }

  /**
   * Sets the value.
   *
   * @param value the new value
   */
  public void setValue(final DialogSuggestionValue value) {
    this.value = value;
  }

  /**
   * Sets the output.
   *
   * @param output the new output
   */
  public void setOutput(final Map output) {
    this.output = output;
  }
}
