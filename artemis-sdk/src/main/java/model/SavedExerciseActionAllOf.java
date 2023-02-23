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
 * SavedExerciseActionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class SavedExerciseActionAllOf {
  public static final String SERIALIZED_NAME_FORCED = "forced";
  @SerializedName(SERIALIZED_NAME_FORCED)
  private Boolean forced;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private Boolean failed;

  public static final String SERIALIZED_NAME_AUTOMATICALLY = "automatically";
  @SerializedName(SERIALIZED_NAME_AUTOMATICALLY)
  private Boolean automatically;

  public static final String SERIALIZED_NAME_SUBMISSION_ID = "submissionId";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_ID)
  private Long submissionId;

  public static final String SERIALIZED_NAME_EXERCISE_ID = "exerciseId";
  @SerializedName(SERIALIZED_NAME_EXERCISE_ID)
  private Long exerciseId;

  public SavedExerciseActionAllOf() {
  }

  public SavedExerciseActionAllOf forced(Boolean forced) {
    
    this.forced = forced;
    return this;
  }

   /**
   * Get forced
   * @return forced
  **/
  @javax.annotation.Nullable

  public Boolean getForced() {
    return forced;
  }


  public void setForced(Boolean forced) {
    this.forced = forced;
  }


  public SavedExerciseActionAllOf failed(Boolean failed) {
    
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @javax.annotation.Nullable

  public Boolean getFailed() {
    return failed;
  }


  public void setFailed(Boolean failed) {
    this.failed = failed;
  }


  public SavedExerciseActionAllOf automatically(Boolean automatically) {
    
    this.automatically = automatically;
    return this;
  }

   /**
   * Get automatically
   * @return automatically
  **/
  @javax.annotation.Nullable

  public Boolean getAutomatically() {
    return automatically;
  }


  public void setAutomatically(Boolean automatically) {
    this.automatically = automatically;
  }


  public SavedExerciseActionAllOf submissionId(Long submissionId) {
    
    this.submissionId = submissionId;
    return this;
  }

   /**
   * Get submissionId
   * @return submissionId
  **/
  @javax.annotation.Nullable

  public Long getSubmissionId() {
    return submissionId;
  }


  public void setSubmissionId(Long submissionId) {
    this.submissionId = submissionId;
  }


  public SavedExerciseActionAllOf exerciseId(Long exerciseId) {
    
    this.exerciseId = exerciseId;
    return this;
  }

   /**
   * Get exerciseId
   * @return exerciseId
  **/
  @javax.annotation.Nullable

  public Long getExerciseId() {
    return exerciseId;
  }


  public void setExerciseId(Long exerciseId) {
    this.exerciseId = exerciseId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedExerciseActionAllOf savedExerciseActionAllOf = (SavedExerciseActionAllOf) o;
    return Objects.equals(this.forced, savedExerciseActionAllOf.forced) &&
        Objects.equals(this.failed, savedExerciseActionAllOf.failed) &&
        Objects.equals(this.automatically, savedExerciseActionAllOf.automatically) &&
        Objects.equals(this.submissionId, savedExerciseActionAllOf.submissionId) &&
        Objects.equals(this.exerciseId, savedExerciseActionAllOf.exerciseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forced, failed, automatically, submissionId, exerciseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedExerciseActionAllOf {\n");
    sb.append("    forced: ").append(toIndentedString(forced)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    automatically: ").append(toIndentedString(automatically)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
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
    openapiFields.add("forced");
    openapiFields.add("failed");
    openapiFields.add("automatically");
    openapiFields.add("submissionId");
    openapiFields.add("exerciseId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SavedExerciseActionAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SavedExerciseActionAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SavedExerciseActionAllOf is not found in the empty JSON string", SavedExerciseActionAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SavedExerciseActionAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SavedExerciseActionAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SavedExerciseActionAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SavedExerciseActionAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SavedExerciseActionAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SavedExerciseActionAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SavedExerciseActionAllOf>() {
           @Override
           public void write(JsonWriter out, SavedExerciseActionAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SavedExerciseActionAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SavedExerciseActionAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SavedExerciseActionAllOf
  * @throws IOException if the JSON string is invalid with respect to SavedExerciseActionAllOf
  */
  public static SavedExerciseActionAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SavedExerciseActionAllOf.class);
  }

 /**
  * Convert an instance of SavedExerciseActionAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

