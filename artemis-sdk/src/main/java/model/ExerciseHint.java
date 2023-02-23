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
import org.openapitools.client.model.CodeHint;
import org.openapitools.client.model.ProgrammingExercise;
import org.openapitools.client.model.ProgrammingExerciseTask;

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
 * ExerciseHint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class ExerciseHint {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_EXERCISE = "exercise";
  @SerializedName(SERIALIZED_NAME_EXERCISE)
  private ProgrammingExercise exercise;

  public static final String SERIALIZED_NAME_DISPLAY_THRESHOLD = "displayThreshold";
  @SerializedName(SERIALIZED_NAME_DISPLAY_THRESHOLD)
  private Integer displayThreshold;

  public static final String SERIALIZED_NAME_PROGRAMMING_EXERCISE_TASK = "programmingExerciseTask";
  @SerializedName(SERIALIZED_NAME_PROGRAMMING_EXERCISE_TASK)
  private ProgrammingExerciseTask programmingExerciseTask;

  public static final String SERIALIZED_NAME_CURRENT_USER_RATING = "currentUserRating";
  @SerializedName(SERIALIZED_NAME_CURRENT_USER_RATING)
  private Integer currentUserRating;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public ExerciseHint() {
    this.type = this.getClass().getSimpleName();
  }

  public ExerciseHint id(Long id) {
    
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


  public ExerciseHint title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ExerciseHint description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ExerciseHint content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ExerciseHint exercise(ProgrammingExercise exercise) {
    
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @javax.annotation.Nullable

  public ProgrammingExercise getExercise() {
    return exercise;
  }


  public void setExercise(ProgrammingExercise exercise) {
    this.exercise = exercise;
  }


  public ExerciseHint displayThreshold(Integer displayThreshold) {
    
    this.displayThreshold = displayThreshold;
    return this;
  }

   /**
   * Get displayThreshold
   * minimum: 0
   * maximum: 100
   * @return displayThreshold
  **/
  @javax.annotation.Nullable

  public Integer getDisplayThreshold() {
    return displayThreshold;
  }


  public void setDisplayThreshold(Integer displayThreshold) {
    this.displayThreshold = displayThreshold;
  }


  public ExerciseHint programmingExerciseTask(ProgrammingExerciseTask programmingExerciseTask) {
    
    this.programmingExerciseTask = programmingExerciseTask;
    return this;
  }

   /**
   * Get programmingExerciseTask
   * @return programmingExerciseTask
  **/
  @javax.annotation.Nullable

  public ProgrammingExerciseTask getProgrammingExerciseTask() {
    return programmingExerciseTask;
  }


  public void setProgrammingExerciseTask(ProgrammingExerciseTask programmingExerciseTask) {
    this.programmingExerciseTask = programmingExerciseTask;
  }


  public ExerciseHint currentUserRating(Integer currentUserRating) {
    
    this.currentUserRating = currentUserRating;
    return this;
  }

   /**
   * Get currentUserRating
   * @return currentUserRating
  **/
  @javax.annotation.Nullable

  public Integer getCurrentUserRating() {
    return currentUserRating;
  }


  public void setCurrentUserRating(Integer currentUserRating) {
    this.currentUserRating = currentUserRating;
  }


  public ExerciseHint type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExerciseHint exerciseHint = (ExerciseHint) o;
    return Objects.equals(this.id, exerciseHint.id) &&
        Objects.equals(this.title, exerciseHint.title) &&
        Objects.equals(this.description, exerciseHint.description) &&
        Objects.equals(this.content, exerciseHint.content) &&
        Objects.equals(this.exercise, exerciseHint.exercise) &&
        Objects.equals(this.displayThreshold, exerciseHint.displayThreshold) &&
        Objects.equals(this.programmingExerciseTask, exerciseHint.programmingExerciseTask) &&
        Objects.equals(this.currentUserRating, exerciseHint.currentUserRating) &&
        Objects.equals(this.type, exerciseHint.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, content, exercise, displayThreshold, programmingExerciseTask, currentUserRating, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExerciseHint {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    displayThreshold: ").append(toIndentedString(displayThreshold)).append("\n");
    sb.append("    programmingExerciseTask: ").append(toIndentedString(programmingExerciseTask)).append("\n");
    sb.append("    currentUserRating: ").append(toIndentedString(currentUserRating)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("content");
    openapiFields.add("exercise");
    openapiFields.add("displayThreshold");
    openapiFields.add("programmingExerciseTask");
    openapiFields.add("currentUserRating");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExerciseHint
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExerciseHint.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExerciseHint is not found in the empty JSON string", ExerciseHint.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("type").getAsString();
      switch (discriminatorValue) {
        case "CodeHint":
          CodeHint.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of ExerciseHint given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExerciseHint
  * @throws IOException if the JSON string is invalid with respect to ExerciseHint
  */
  public static ExerciseHint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExerciseHint.class);
  }

 /**
  * Convert an instance of ExerciseHint to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

