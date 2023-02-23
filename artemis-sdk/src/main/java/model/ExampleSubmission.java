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
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.Exercise;
import org.openapitools.client.model.GetAllTextSubmissions200ResponseInner;
import org.openapitools.client.model.TutorParticipation;

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
 * ExampleSubmission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class ExampleSubmission {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_USED_FOR_TUTORIAL = "usedForTutorial";
  @SerializedName(SERIALIZED_NAME_USED_FOR_TUTORIAL)
  private Boolean usedForTutorial;

  public static final String SERIALIZED_NAME_EXERCISE = "exercise";
  @SerializedName(SERIALIZED_NAME_EXERCISE)
  private Exercise exercise;

  public static final String SERIALIZED_NAME_SUBMISSION = "submission";
  @SerializedName(SERIALIZED_NAME_SUBMISSION)
  private GetAllTextSubmissions200ResponseInner submission;

  public static final String SERIALIZED_NAME_TUTOR_PARTICIPATIONS = "tutorParticipations";
  @SerializedName(SERIALIZED_NAME_TUTOR_PARTICIPATIONS)
  private Set<TutorParticipation> tutorParticipations = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ASSESSMENT_EXPLANATION = "assessmentExplanation";
  @SerializedName(SERIALIZED_NAME_ASSESSMENT_EXPLANATION)
  private String assessmentExplanation;

  public ExampleSubmission() {
  }

  public ExampleSubmission id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ExampleSubmission usedForTutorial(Boolean usedForTutorial) {
    
    this.usedForTutorial = usedForTutorial;
    return this;
  }

   /**
   * Get usedForTutorial
   * @return usedForTutorial
  **/
  @javax.annotation.Nullable

  public Boolean getUsedForTutorial() {
    return usedForTutorial;
  }


  public void setUsedForTutorial(Boolean usedForTutorial) {
    this.usedForTutorial = usedForTutorial;
  }


  public ExampleSubmission exercise(Exercise exercise) {
    
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @javax.annotation.Nullable

  public Exercise getExercise() {
    return exercise;
  }


  public void setExercise(Exercise exercise) {
    this.exercise = exercise;
  }


  public ExampleSubmission submission(GetAllTextSubmissions200ResponseInner submission) {
    
    this.submission = submission;
    return this;
  }

   /**
   * Get submission
   * @return submission
  **/
  @javax.annotation.Nullable

  public GetAllTextSubmissions200ResponseInner getSubmission() {
    return submission;
  }


  public void setSubmission(GetAllTextSubmissions200ResponseInner submission) {
    this.submission = submission;
  }


  public ExampleSubmission tutorParticipations(Set<TutorParticipation> tutorParticipations) {
    
    this.tutorParticipations = tutorParticipations;
    return this;
  }

  public ExampleSubmission addTutorParticipationsItem(TutorParticipation tutorParticipationsItem) {
    if (this.tutorParticipations == null) {
      this.tutorParticipations = new LinkedHashSet<>();
    }
    this.tutorParticipations.add(tutorParticipationsItem);
    return this;
  }

   /**
   * Get tutorParticipations
   * @return tutorParticipations
  **/
  @javax.annotation.Nullable

  public Set<TutorParticipation> getTutorParticipations() {
    return tutorParticipations;
  }


  public void setTutorParticipations(Set<TutorParticipation> tutorParticipations) {
    this.tutorParticipations = tutorParticipations;
  }


  public ExampleSubmission assessmentExplanation(String assessmentExplanation) {
    
    this.assessmentExplanation = assessmentExplanation;
    return this;
  }

   /**
   * Get assessmentExplanation
   * @return assessmentExplanation
  **/
  @javax.annotation.Nullable

  public String getAssessmentExplanation() {
    return assessmentExplanation;
  }


  public void setAssessmentExplanation(String assessmentExplanation) {
    this.assessmentExplanation = assessmentExplanation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleSubmission exampleSubmission = (ExampleSubmission) o;
    return Objects.equals(this.id, exampleSubmission.id) &&
        Objects.equals(this.usedForTutorial, exampleSubmission.usedForTutorial) &&
        Objects.equals(this.exercise, exampleSubmission.exercise) &&
        Objects.equals(this.submission, exampleSubmission.submission) &&
        Objects.equals(this.tutorParticipations, exampleSubmission.tutorParticipations) &&
        Objects.equals(this.assessmentExplanation, exampleSubmission.assessmentExplanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, usedForTutorial, exercise, submission, tutorParticipations, assessmentExplanation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleSubmission {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    usedForTutorial: ").append(toIndentedString(usedForTutorial)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    tutorParticipations: ").append(toIndentedString(tutorParticipations)).append("\n");
    sb.append("    assessmentExplanation: ").append(toIndentedString(assessmentExplanation)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("usedForTutorial");
    openapiFields.add("exercise");
    openapiFields.add("submission");
    openapiFields.add("tutorParticipations");
    openapiFields.add("assessmentExplanation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExampleSubmission
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExampleSubmission.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExampleSubmission is not found in the empty JSON string", ExampleSubmission.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExampleSubmission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExampleSubmission` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `exercise`
      if (jsonObj.get("exercise") != null && !jsonObj.get("exercise").isJsonNull()) {
        Exercise.validateJsonObject(jsonObj.getAsJsonObject("exercise"));
      }
      // validate the optional field `submission`
      if (jsonObj.get("submission") != null && !jsonObj.get("submission").isJsonNull()) {
        GetAllTextSubmissions200ResponseInner.validateJsonObject(jsonObj.getAsJsonObject("submission"));
      }
      if (jsonObj.get("tutorParticipations") != null && !jsonObj.get("tutorParticipations").isJsonNull()) {
        JsonArray jsonArraytutorParticipations = jsonObj.getAsJsonArray("tutorParticipations");
        if (jsonArraytutorParticipations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tutorParticipations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tutorParticipations` to be an array in the JSON string but got `%s`", jsonObj.get("tutorParticipations").toString()));
          }

          // validate the optional field `tutorParticipations` (array)
          for (int i = 0; i < jsonArraytutorParticipations.size(); i++) {
            TutorParticipation.validateJsonObject(jsonArraytutorParticipations.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("assessmentExplanation") != null && !jsonObj.get("assessmentExplanation").isJsonNull()) && !jsonObj.get("assessmentExplanation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assessmentExplanation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assessmentExplanation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExampleSubmission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExampleSubmission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExampleSubmission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExampleSubmission.class));

       return (TypeAdapter<T>) new TypeAdapter<ExampleSubmission>() {
           @Override
           public void write(JsonWriter out, ExampleSubmission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExampleSubmission read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExampleSubmission given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExampleSubmission
  * @throws IOException if the JSON string is invalid with respect to ExampleSubmission
  */
  public static ExampleSubmission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExampleSubmission.class);
  }

 /**
  * Convert an instance of ExampleSubmission to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

