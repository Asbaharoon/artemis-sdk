/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * RepositoryExportOptionsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class RepositoryExportOptionsDTO {
  public static final String SERIALIZED_NAME_EXPORT_ALL_PARTICIPANTS = "exportAllParticipants";
  @SerializedName(SERIALIZED_NAME_EXPORT_ALL_PARTICIPANTS)
  private Boolean exportAllParticipants;

  public static final String SERIALIZED_NAME_FILTER_LATE_SUBMISSIONS = "filterLateSubmissions";
  @SerializedName(SERIALIZED_NAME_FILTER_LATE_SUBMISSIONS)
  private Boolean filterLateSubmissions;

  public static final String SERIALIZED_NAME_FILTER_LATE_SUBMISSIONS_INDIVIDUAL_DUE_DATE = "filterLateSubmissionsIndividualDueDate";
  @SerializedName(SERIALIZED_NAME_FILTER_LATE_SUBMISSIONS_INDIVIDUAL_DUE_DATE)
  private Boolean filterLateSubmissionsIndividualDueDate;

  public static final String SERIALIZED_NAME_FILTER_LATE_SUBMISSIONS_DATE = "filterLateSubmissionsDate";
  @SerializedName(SERIALIZED_NAME_FILTER_LATE_SUBMISSIONS_DATE)
  private OffsetDateTime filterLateSubmissionsDate;

  public static final String SERIALIZED_NAME_ADD_PARTICIPANT_NAME = "addParticipantName";
  @SerializedName(SERIALIZED_NAME_ADD_PARTICIPANT_NAME)
  private Boolean addParticipantName;

  public static final String SERIALIZED_NAME_COMBINE_STUDENT_COMMITS = "combineStudentCommits";
  @SerializedName(SERIALIZED_NAME_COMBINE_STUDENT_COMMITS)
  private Boolean combineStudentCommits;

  public static final String SERIALIZED_NAME_ANONYMIZE_STUDENT_COMMITS = "anonymizeStudentCommits";
  @SerializedName(SERIALIZED_NAME_ANONYMIZE_STUDENT_COMMITS)
  private Boolean anonymizeStudentCommits;

  public static final String SERIALIZED_NAME_NORMALIZE_CODE_STYLE = "normalizeCodeStyle";
  @SerializedName(SERIALIZED_NAME_NORMALIZE_CODE_STYLE)
  private Boolean normalizeCodeStyle;

  public static final String SERIALIZED_NAME_HIDE_STUDENT_NAME_IN_ZIPPED_FOLDER = "hideStudentNameInZippedFolder";
  @SerializedName(SERIALIZED_NAME_HIDE_STUDENT_NAME_IN_ZIPPED_FOLDER)
  private Boolean hideStudentNameInZippedFolder;

  public RepositoryExportOptionsDTO() {
  }

  public RepositoryExportOptionsDTO exportAllParticipants(Boolean exportAllParticipants) {
    
    this.exportAllParticipants = exportAllParticipants;
    return this;
  }

   /**
   * Get exportAllParticipants
   * @return exportAllParticipants
  **/
  @javax.annotation.Nullable

  public Boolean getExportAllParticipants() {
    return exportAllParticipants;
  }


  public void setExportAllParticipants(Boolean exportAllParticipants) {
    this.exportAllParticipants = exportAllParticipants;
  }


  public RepositoryExportOptionsDTO filterLateSubmissions(Boolean filterLateSubmissions) {
    
    this.filterLateSubmissions = filterLateSubmissions;
    return this;
  }

   /**
   * Get filterLateSubmissions
   * @return filterLateSubmissions
  **/
  @javax.annotation.Nullable

  public Boolean getFilterLateSubmissions() {
    return filterLateSubmissions;
  }


  public void setFilterLateSubmissions(Boolean filterLateSubmissions) {
    this.filterLateSubmissions = filterLateSubmissions;
  }


  public RepositoryExportOptionsDTO filterLateSubmissionsIndividualDueDate(Boolean filterLateSubmissionsIndividualDueDate) {
    
    this.filterLateSubmissionsIndividualDueDate = filterLateSubmissionsIndividualDueDate;
    return this;
  }

   /**
   * Get filterLateSubmissionsIndividualDueDate
   * @return filterLateSubmissionsIndividualDueDate
  **/
  @javax.annotation.Nullable

  public Boolean getFilterLateSubmissionsIndividualDueDate() {
    return filterLateSubmissionsIndividualDueDate;
  }


  public void setFilterLateSubmissionsIndividualDueDate(Boolean filterLateSubmissionsIndividualDueDate) {
    this.filterLateSubmissionsIndividualDueDate = filterLateSubmissionsIndividualDueDate;
  }


  public RepositoryExportOptionsDTO filterLateSubmissionsDate(OffsetDateTime filterLateSubmissionsDate) {
    
    this.filterLateSubmissionsDate = filterLateSubmissionsDate;
    return this;
  }

   /**
   * Get filterLateSubmissionsDate
   * @return filterLateSubmissionsDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getFilterLateSubmissionsDate() {
    return filterLateSubmissionsDate;
  }


  public void setFilterLateSubmissionsDate(OffsetDateTime filterLateSubmissionsDate) {
    this.filterLateSubmissionsDate = filterLateSubmissionsDate;
  }


  public RepositoryExportOptionsDTO addParticipantName(Boolean addParticipantName) {
    
    this.addParticipantName = addParticipantName;
    return this;
  }

   /**
   * Get addParticipantName
   * @return addParticipantName
  **/
  @javax.annotation.Nullable

  public Boolean getAddParticipantName() {
    return addParticipantName;
  }


  public void setAddParticipantName(Boolean addParticipantName) {
    this.addParticipantName = addParticipantName;
  }


  public RepositoryExportOptionsDTO combineStudentCommits(Boolean combineStudentCommits) {
    
    this.combineStudentCommits = combineStudentCommits;
    return this;
  }

   /**
   * Get combineStudentCommits
   * @return combineStudentCommits
  **/
  @javax.annotation.Nullable

  public Boolean getCombineStudentCommits() {
    return combineStudentCommits;
  }


  public void setCombineStudentCommits(Boolean combineStudentCommits) {
    this.combineStudentCommits = combineStudentCommits;
  }


  public RepositoryExportOptionsDTO anonymizeStudentCommits(Boolean anonymizeStudentCommits) {
    
    this.anonymizeStudentCommits = anonymizeStudentCommits;
    return this;
  }

   /**
   * Get anonymizeStudentCommits
   * @return anonymizeStudentCommits
  **/
  @javax.annotation.Nullable

  public Boolean getAnonymizeStudentCommits() {
    return anonymizeStudentCommits;
  }


  public void setAnonymizeStudentCommits(Boolean anonymizeStudentCommits) {
    this.anonymizeStudentCommits = anonymizeStudentCommits;
  }


  public RepositoryExportOptionsDTO normalizeCodeStyle(Boolean normalizeCodeStyle) {
    
    this.normalizeCodeStyle = normalizeCodeStyle;
    return this;
  }

   /**
   * Get normalizeCodeStyle
   * @return normalizeCodeStyle
  **/
  @javax.annotation.Nullable

  public Boolean getNormalizeCodeStyle() {
    return normalizeCodeStyle;
  }


  public void setNormalizeCodeStyle(Boolean normalizeCodeStyle) {
    this.normalizeCodeStyle = normalizeCodeStyle;
  }


  public RepositoryExportOptionsDTO hideStudentNameInZippedFolder(Boolean hideStudentNameInZippedFolder) {
    
    this.hideStudentNameInZippedFolder = hideStudentNameInZippedFolder;
    return this;
  }

   /**
   * Get hideStudentNameInZippedFolder
   * @return hideStudentNameInZippedFolder
  **/
  @javax.annotation.Nullable

  public Boolean getHideStudentNameInZippedFolder() {
    return hideStudentNameInZippedFolder;
  }


  public void setHideStudentNameInZippedFolder(Boolean hideStudentNameInZippedFolder) {
    this.hideStudentNameInZippedFolder = hideStudentNameInZippedFolder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryExportOptionsDTO repositoryExportOptionsDTO = (RepositoryExportOptionsDTO) o;
    return Objects.equals(this.exportAllParticipants, repositoryExportOptionsDTO.exportAllParticipants) &&
        Objects.equals(this.filterLateSubmissions, repositoryExportOptionsDTO.filterLateSubmissions) &&
        Objects.equals(this.filterLateSubmissionsIndividualDueDate, repositoryExportOptionsDTO.filterLateSubmissionsIndividualDueDate) &&
        Objects.equals(this.filterLateSubmissionsDate, repositoryExportOptionsDTO.filterLateSubmissionsDate) &&
        Objects.equals(this.addParticipantName, repositoryExportOptionsDTO.addParticipantName) &&
        Objects.equals(this.combineStudentCommits, repositoryExportOptionsDTO.combineStudentCommits) &&
        Objects.equals(this.anonymizeStudentCommits, repositoryExportOptionsDTO.anonymizeStudentCommits) &&
        Objects.equals(this.normalizeCodeStyle, repositoryExportOptionsDTO.normalizeCodeStyle) &&
        Objects.equals(this.hideStudentNameInZippedFolder, repositoryExportOptionsDTO.hideStudentNameInZippedFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportAllParticipants, filterLateSubmissions, filterLateSubmissionsIndividualDueDate, filterLateSubmissionsDate, addParticipantName, combineStudentCommits, anonymizeStudentCommits, normalizeCodeStyle, hideStudentNameInZippedFolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryExportOptionsDTO {\n");
    sb.append("    exportAllParticipants: ").append(toIndentedString(exportAllParticipants)).append("\n");
    sb.append("    filterLateSubmissions: ").append(toIndentedString(filterLateSubmissions)).append("\n");
    sb.append("    filterLateSubmissionsIndividualDueDate: ").append(toIndentedString(filterLateSubmissionsIndividualDueDate)).append("\n");
    sb.append("    filterLateSubmissionsDate: ").append(toIndentedString(filterLateSubmissionsDate)).append("\n");
    sb.append("    addParticipantName: ").append(toIndentedString(addParticipantName)).append("\n");
    sb.append("    combineStudentCommits: ").append(toIndentedString(combineStudentCommits)).append("\n");
    sb.append("    anonymizeStudentCommits: ").append(toIndentedString(anonymizeStudentCommits)).append("\n");
    sb.append("    normalizeCodeStyle: ").append(toIndentedString(normalizeCodeStyle)).append("\n");
    sb.append("    hideStudentNameInZippedFolder: ").append(toIndentedString(hideStudentNameInZippedFolder)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("exportAllParticipants");
    openapiFields.add("filterLateSubmissions");
    openapiFields.add("filterLateSubmissionsIndividualDueDate");
    openapiFields.add("filterLateSubmissionsDate");
    openapiFields.add("addParticipantName");
    openapiFields.add("combineStudentCommits");
    openapiFields.add("anonymizeStudentCommits");
    openapiFields.add("normalizeCodeStyle");
    openapiFields.add("hideStudentNameInZippedFolder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RepositoryExportOptionsDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RepositoryExportOptionsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepositoryExportOptionsDTO is not found in the empty JSON string", RepositoryExportOptionsDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RepositoryExportOptionsDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RepositoryExportOptionsDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepositoryExportOptionsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepositoryExportOptionsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepositoryExportOptionsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepositoryExportOptionsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<RepositoryExportOptionsDTO>() {
           @Override
           public void write(JsonWriter out, RepositoryExportOptionsDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RepositoryExportOptionsDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RepositoryExportOptionsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepositoryExportOptionsDTO
  * @throws IOException if the JSON string is invalid with respect to RepositoryExportOptionsDTO
  */
  public static RepositoryExportOptionsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepositoryExportOptionsDTO.class);
  }

 /**
  * Convert an instance of RepositoryExportOptionsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

