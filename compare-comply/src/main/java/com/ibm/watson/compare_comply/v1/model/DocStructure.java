/*
 * (C) Copyright IBM Corp. 2018, 2020.
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
package com.ibm.watson.compare_comply.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import java.util.List;

/** The structure of the input document. */
public class DocStructure extends GenericModel {

  @SerializedName("section_titles")
  protected List<SectionTitles> sectionTitles;

  @SerializedName("leading_sentences")
  protected List<LeadingSentence> leadingSentences;

  protected List<Paragraphs> paragraphs;

  /**
   * Gets the sectionTitles.
   *
   * <p>An array containing one object per section or subsection identified in the input document.
   *
   * @return the sectionTitles
   */
  public List<SectionTitles> getSectionTitles() {
    return sectionTitles;
  }

  /**
   * Gets the leadingSentences.
   *
   * <p>An array containing one object per section or subsection, in parallel with the
   * `section_titles` array, that details the leading sentences in the corresponding section or
   * subsection.
   *
   * @return the leadingSentences
   */
  public List<LeadingSentence> getLeadingSentences() {
    return leadingSentences;
  }

  /**
   * Gets the paragraphs.
   *
   * <p>An array containing one object per paragraph, in parallel with the `section_titles` and
   * `leading_sentences` arrays.
   *
   * @return the paragraphs
   */
  public List<Paragraphs> getParagraphs() {
    return paragraphs;
  }
}
