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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Exercise;

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
 * PlagiarismResultTextSubmissionElement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class PlagiarismResultTextSubmissionElement {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_EXERCISE = "exercise";
  @SerializedName(SERIALIZED_NAME_EXERCISE)
  private Exercise exercise;

  public static final String SERIALIZED_NAME_SIMILARITY_DISTRIBUTION = "similarityDistribution";
  @SerializedName(SERIALIZED_NAME_SIMILARITY_DISTRIBUTION)
  private List<Integer> similarityDistribution = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public PlagiarismResultTextSubmissionElement() {
    this.type = this.getClass().getSimpleName();
  }

  public PlagiarismResultTextSubmissionElement id(Long id) {
    
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


  public PlagiarismResultTextSubmissionElement duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public PlagiarismResultTextSubmissionElement exercise(Exercise exercise) {
    
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


  public PlagiarismResultTextSubmissionElement similarityDistribution(List<Integer> similarityDistribution) {
    
    this.similarityDistribution = similarityDistribution;
    return this;
  }

  public PlagiarismResultTextSubmissionElement addSimilarityDistributionItem(Integer similarityDistributionItem) {
    if (this.similarityDistribution == null) {
      this.similarityDistribution = new ArrayList<>();
    }
    this.similarityDistribution.add(similarityDistributionItem);
    return this;
  }

   /**
   * Get similarityDistribution
   * @return similarityDistribution
  **/
  @javax.annotation.Nullable

  public List<Integer> getSimilarityDistribution() {
    return similarityDistribution;
  }


  public void setSimilarityDistribution(List<Integer> similarityDistribution) {
    this.similarityDistribution = similarityDistribution;
  }


  public PlagiarismResultTextSubmissionElement type(String type) {
    
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
    PlagiarismResultTextSubmissionElement plagiarismResultTextSubmissionElement = (PlagiarismResultTextSubmissionElement) o;
    return Objects.equals(this.id, plagiarismResultTextSubmissionElement.id) &&
        Objects.equals(this.duration, plagiarismResultTextSubmissionElement.duration) &&
        Objects.equals(this.exercise, plagiarismResultTextSubmissionElement.exercise) &&
        Objects.equals(this.similarityDistribution, plagiarismResultTextSubmissionElement.similarityDistribution) &&
        Objects.equals(this.type, plagiarismResultTextSubmissionElement.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, duration, exercise, similarityDistribution, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlagiarismResultTextSubmissionElement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    similarityDistribution: ").append(toIndentedString(similarityDistribution)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("exercise");
    openapiFields.add("similarityDistribution");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlagiarismResultTextSubmissionElement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlagiarismResultTextSubmissionElement.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlagiarismResultTextSubmissionElement is not found in the empty JSON string", PlagiarismResultTextSubmissionElement.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PlagiarismResultTextSubmissionElement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlagiarismResultTextSubmissionElement` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlagiarismResultTextSubmissionElement.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlagiarismResultTextSubmissionElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlagiarismResultTextSubmissionElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlagiarismResultTextSubmissionElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlagiarismResultTextSubmissionElement.class));

       return (TypeAdapter<T>) new TypeAdapter<PlagiarismResultTextSubmissionElement>() {
           @Override
           public void write(JsonWriter out, PlagiarismResultTextSubmissionElement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlagiarismResultTextSubmissionElement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlagiarismResultTextSubmissionElement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlagiarismResultTextSubmissionElement
  * @throws IOException if the JSON string is invalid with respect to PlagiarismResultTextSubmissionElement
  */
  public static PlagiarismResultTextSubmissionElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlagiarismResultTextSubmissionElement.class);
  }

 /**
  * Convert an instance of PlagiarismResultTextSubmissionElement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

