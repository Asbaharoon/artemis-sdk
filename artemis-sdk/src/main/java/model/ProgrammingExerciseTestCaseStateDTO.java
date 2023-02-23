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
 * ProgrammingExerciseTestCaseStateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class ProgrammingExerciseTestCaseStateDTO {
  public static final String SERIALIZED_NAME_RELEASED = "released";
  @SerializedName(SERIALIZED_NAME_RELEASED)
  private Boolean released;

  public static final String SERIALIZED_NAME_HAS_STUDENT_RESULT = "hasStudentResult";
  @SerializedName(SERIALIZED_NAME_HAS_STUDENT_RESULT)
  private Boolean hasStudentResult;

  public static final String SERIALIZED_NAME_TEST_CASES_CHANGED = "testCasesChanged";
  @SerializedName(SERIALIZED_NAME_TEST_CASES_CHANGED)
  private Boolean testCasesChanged;

  public static final String SERIALIZED_NAME_BUILD_AND_TEST_STUDENT_SUBMISSIONS_AFTER_DUE_DATE = "buildAndTestStudentSubmissionsAfterDueDate";
  @SerializedName(SERIALIZED_NAME_BUILD_AND_TEST_STUDENT_SUBMISSIONS_AFTER_DUE_DATE)
  private OffsetDateTime buildAndTestStudentSubmissionsAfterDueDate;

  public ProgrammingExerciseTestCaseStateDTO() {
  }

  public ProgrammingExerciseTestCaseStateDTO released(Boolean released) {
    
    this.released = released;
    return this;
  }

   /**
   * Get released
   * @return released
  **/
  @javax.annotation.Nullable

  public Boolean getReleased() {
    return released;
  }


  public void setReleased(Boolean released) {
    this.released = released;
  }


  public ProgrammingExerciseTestCaseStateDTO hasStudentResult(Boolean hasStudentResult) {
    
    this.hasStudentResult = hasStudentResult;
    return this;
  }

   /**
   * Get hasStudentResult
   * @return hasStudentResult
  **/
  @javax.annotation.Nullable

  public Boolean getHasStudentResult() {
    return hasStudentResult;
  }


  public void setHasStudentResult(Boolean hasStudentResult) {
    this.hasStudentResult = hasStudentResult;
  }


  public ProgrammingExerciseTestCaseStateDTO testCasesChanged(Boolean testCasesChanged) {
    
    this.testCasesChanged = testCasesChanged;
    return this;
  }

   /**
   * Get testCasesChanged
   * @return testCasesChanged
  **/
  @javax.annotation.Nullable

  public Boolean getTestCasesChanged() {
    return testCasesChanged;
  }


  public void setTestCasesChanged(Boolean testCasesChanged) {
    this.testCasesChanged = testCasesChanged;
  }


  public ProgrammingExerciseTestCaseStateDTO buildAndTestStudentSubmissionsAfterDueDate(OffsetDateTime buildAndTestStudentSubmissionsAfterDueDate) {
    
    this.buildAndTestStudentSubmissionsAfterDueDate = buildAndTestStudentSubmissionsAfterDueDate;
    return this;
  }

   /**
   * Get buildAndTestStudentSubmissionsAfterDueDate
   * @return buildAndTestStudentSubmissionsAfterDueDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getBuildAndTestStudentSubmissionsAfterDueDate() {
    return buildAndTestStudentSubmissionsAfterDueDate;
  }


  public void setBuildAndTestStudentSubmissionsAfterDueDate(OffsetDateTime buildAndTestStudentSubmissionsAfterDueDate) {
    this.buildAndTestStudentSubmissionsAfterDueDate = buildAndTestStudentSubmissionsAfterDueDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammingExerciseTestCaseStateDTO programmingExerciseTestCaseStateDTO = (ProgrammingExerciseTestCaseStateDTO) o;
    return Objects.equals(this.released, programmingExerciseTestCaseStateDTO.released) &&
        Objects.equals(this.hasStudentResult, programmingExerciseTestCaseStateDTO.hasStudentResult) &&
        Objects.equals(this.testCasesChanged, programmingExerciseTestCaseStateDTO.testCasesChanged) &&
        Objects.equals(this.buildAndTestStudentSubmissionsAfterDueDate, programmingExerciseTestCaseStateDTO.buildAndTestStudentSubmissionsAfterDueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(released, hasStudentResult, testCasesChanged, buildAndTestStudentSubmissionsAfterDueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammingExerciseTestCaseStateDTO {\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    hasStudentResult: ").append(toIndentedString(hasStudentResult)).append("\n");
    sb.append("    testCasesChanged: ").append(toIndentedString(testCasesChanged)).append("\n");
    sb.append("    buildAndTestStudentSubmissionsAfterDueDate: ").append(toIndentedString(buildAndTestStudentSubmissionsAfterDueDate)).append("\n");
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
    openapiFields.add("released");
    openapiFields.add("hasStudentResult");
    openapiFields.add("testCasesChanged");
    openapiFields.add("buildAndTestStudentSubmissionsAfterDueDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProgrammingExerciseTestCaseStateDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProgrammingExerciseTestCaseStateDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProgrammingExerciseTestCaseStateDTO is not found in the empty JSON string", ProgrammingExerciseTestCaseStateDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProgrammingExerciseTestCaseStateDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProgrammingExerciseTestCaseStateDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProgrammingExerciseTestCaseStateDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProgrammingExerciseTestCaseStateDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProgrammingExerciseTestCaseStateDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProgrammingExerciseTestCaseStateDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ProgrammingExerciseTestCaseStateDTO>() {
           @Override
           public void write(JsonWriter out, ProgrammingExerciseTestCaseStateDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProgrammingExerciseTestCaseStateDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProgrammingExerciseTestCaseStateDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProgrammingExerciseTestCaseStateDTO
  * @throws IOException if the JSON string is invalid with respect to ProgrammingExerciseTestCaseStateDTO
  */
  public static ProgrammingExerciseTestCaseStateDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProgrammingExerciseTestCaseStateDTO.class);
  }

 /**
  * Convert an instance of ProgrammingExerciseTestCaseStateDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

