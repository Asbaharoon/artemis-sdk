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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.Attachment;
import org.openapitools.client.model.Course;
import org.openapitools.client.model.DueDateStat;
import org.openapitools.client.model.ExampleSubmission;
import org.openapitools.client.model.Exercise;
import org.openapitools.client.model.ExerciseGroup;
import org.openapitools.client.model.GradingCriterion;
import org.openapitools.client.model.PlagiarismCase;
import org.openapitools.client.model.Post;
import org.openapitools.client.model.StudentParticipation;
import org.openapitools.client.model.Team;
import org.openapitools.client.model.TeamAssignmentConfig;
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
 * FileUploadExercise
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class FileUploadExercise extends Exercise {
  public static final String SERIALIZED_NAME_EXAMPLE_SOLUTION = "exampleSolution";
  @SerializedName(SERIALIZED_NAME_EXAMPLE_SOLUTION)
  private String exampleSolution;

  public static final String SERIALIZED_NAME_FILE_PATTERN = "filePattern";
  @SerializedName(SERIALIZED_NAME_FILE_PATTERN)
  private String filePattern;

  public FileUploadExercise() {
    this.type = this.getClass().getSimpleName();
  }

  public FileUploadExercise exampleSolution(String exampleSolution) {
    
    this.exampleSolution = exampleSolution;
    return this;
  }

   /**
   * Get exampleSolution
   * @return exampleSolution
  **/
  @javax.annotation.Nullable

  public String getExampleSolution() {
    return exampleSolution;
  }


  public void setExampleSolution(String exampleSolution) {
    this.exampleSolution = exampleSolution;
  }


  public FileUploadExercise filePattern(String filePattern) {
    
    this.filePattern = filePattern;
    return this;
  }

   /**
   * Get filePattern
   * @return filePattern
  **/
  @javax.annotation.Nullable

  public String getFilePattern() {
    return filePattern;
  }


  public void setFilePattern(String filePattern) {
    this.filePattern = filePattern;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadExercise fileUploadExercise = (FileUploadExercise) o;
    return Objects.equals(this.exampleSolution, fileUploadExercise.exampleSolution) &&
        Objects.equals(this.filePattern, fileUploadExercise.filePattern) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exampleSolution, filePattern, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadExercise {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exampleSolution: ").append(toIndentedString(exampleSolution)).append("\n");
    sb.append("    filePattern: ").append(toIndentedString(filePattern)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("shortName");
    openapiFields.add("maxPoints");
    openapiFields.add("bonusPoints");
    openapiFields.add("assessmentType");
    openapiFields.add("releaseDate");
    openapiFields.add("startDate");
    openapiFields.add("dueDate");
    openapiFields.add("assessmentDueDate");
    openapiFields.add("exampleSolutionPublicationDate");
    openapiFields.add("difficulty");
    openapiFields.add("mode");
    openapiFields.add("allowComplaintsForAutomaticAssessments");
    openapiFields.add("allowManualFeedbackRequests");
    openapiFields.add("includedInOverallScore");
    openapiFields.add("problemStatement");
    openapiFields.add("gradingInstructions");
    openapiFields.add("categories");
    openapiFields.add("teamAssignmentConfig");
    openapiFields.add("teams");
    openapiFields.add("presentationScoreEnabled");
    openapiFields.add("secondCorrectionEnabled");
    openapiFields.add("course");
    openapiFields.add("exerciseGroup");
    openapiFields.add("gradingCriteria");
    openapiFields.add("studentParticipations");
    openapiFields.add("tutorParticipations");
    openapiFields.add("exampleSubmissions");
    openapiFields.add("attachments");
    openapiFields.add("posts");
    openapiFields.add("plagiarismCases");
    openapiFields.add("numberOfAssessmentsOfCorrectionRounds");
    openapiFields.add("totalNumberOfAssessments");
    openapiFields.add("averageRating");
    openapiFields.add("numberOfRatings");
    openapiFields.add("numberOfSubmissions");
    openapiFields.add("numberOfOpenComplaints");
    openapiFields.add("numberOfComplaints");
    openapiFields.add("numberOfOpenMoreFeedbackRequests");
    openapiFields.add("numberOfMoreFeedbackRequests");
    openapiFields.add("exerciseType");
    openapiFields.add("studentAssignedTeamId");
    openapiFields.add("studentAssignedTeamIdComputed");
    openapiFields.add("gradingInstructionFeedbackUsed");
    openapiFields.add("numberOfParticipations");
    openapiFields.add("exampleSolutionPublished");
    openapiFields.add("released");
    openapiFields.add("testRunParticipationsExist");
    openapiFields.add("teamMode");
    openapiFields.add("visibleToStudents");
    openapiFields.add("type");
    openapiFields.add("exampleSolution");
    openapiFields.add("filePattern");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FileUploadExercise
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FileUploadExercise.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileUploadExercise is not found in the empty JSON string", FileUploadExercise.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FileUploadExercise.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileUploadExercise` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FileUploadExercise.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileUploadExercise.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileUploadExercise' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileUploadExercise> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileUploadExercise.class));

       return (TypeAdapter<T>) new TypeAdapter<FileUploadExercise>() {
           @Override
           public void write(JsonWriter out, FileUploadExercise value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileUploadExercise read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileUploadExercise given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileUploadExercise
  * @throws IOException if the JSON string is invalid with respect to FileUploadExercise
  */
  public static FileUploadExercise fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileUploadExercise.class);
  }

 /**
  * Convert an instance of FileUploadExercise to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

