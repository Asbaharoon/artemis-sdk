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
 * QuizQuestionStatistic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class QuizQuestionStatistic {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_PARTICIPANTS_RATED = "participantsRated";
  @SerializedName(SERIALIZED_NAME_PARTICIPANTS_RATED)
  private Integer participantsRated;

  public static final String SERIALIZED_NAME_PARTICIPANTS_UNRATED = "participantsUnrated";
  @SerializedName(SERIALIZED_NAME_PARTICIPANTS_UNRATED)
  private Integer participantsUnrated;

  public static final String SERIALIZED_NAME_RATED_CORRECT_COUNTER = "ratedCorrectCounter";
  @SerializedName(SERIALIZED_NAME_RATED_CORRECT_COUNTER)
  private Integer ratedCorrectCounter;

  public static final String SERIALIZED_NAME_UN_RATED_CORRECT_COUNTER = "unRatedCorrectCounter";
  @SerializedName(SERIALIZED_NAME_UN_RATED_CORRECT_COUNTER)
  private Integer unRatedCorrectCounter;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public QuizQuestionStatistic() {
    this.type = this.getClass().getSimpleName();
  }

  public QuizQuestionStatistic id(Long id) {
    
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


  public QuizQuestionStatistic participantsRated(Integer participantsRated) {
    
    this.participantsRated = participantsRated;
    return this;
  }

   /**
   * Get participantsRated
   * @return participantsRated
  **/
  @javax.annotation.Nullable

  public Integer getParticipantsRated() {
    return participantsRated;
  }


  public void setParticipantsRated(Integer participantsRated) {
    this.participantsRated = participantsRated;
  }


  public QuizQuestionStatistic participantsUnrated(Integer participantsUnrated) {
    
    this.participantsUnrated = participantsUnrated;
    return this;
  }

   /**
   * Get participantsUnrated
   * @return participantsUnrated
  **/
  @javax.annotation.Nullable

  public Integer getParticipantsUnrated() {
    return participantsUnrated;
  }


  public void setParticipantsUnrated(Integer participantsUnrated) {
    this.participantsUnrated = participantsUnrated;
  }


  public QuizQuestionStatistic ratedCorrectCounter(Integer ratedCorrectCounter) {
    
    this.ratedCorrectCounter = ratedCorrectCounter;
    return this;
  }

   /**
   * Get ratedCorrectCounter
   * @return ratedCorrectCounter
  **/
  @javax.annotation.Nullable

  public Integer getRatedCorrectCounter() {
    return ratedCorrectCounter;
  }


  public void setRatedCorrectCounter(Integer ratedCorrectCounter) {
    this.ratedCorrectCounter = ratedCorrectCounter;
  }


  public QuizQuestionStatistic unRatedCorrectCounter(Integer unRatedCorrectCounter) {
    
    this.unRatedCorrectCounter = unRatedCorrectCounter;
    return this;
  }

   /**
   * Get unRatedCorrectCounter
   * @return unRatedCorrectCounter
  **/
  @javax.annotation.Nullable

  public Integer getUnRatedCorrectCounter() {
    return unRatedCorrectCounter;
  }


  public void setUnRatedCorrectCounter(Integer unRatedCorrectCounter) {
    this.unRatedCorrectCounter = unRatedCorrectCounter;
  }


  public QuizQuestionStatistic type(String type) {
    
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
    QuizQuestionStatistic quizQuestionStatistic = (QuizQuestionStatistic) o;
    return Objects.equals(this.id, quizQuestionStatistic.id) &&
        Objects.equals(this.participantsRated, quizQuestionStatistic.participantsRated) &&
        Objects.equals(this.participantsUnrated, quizQuestionStatistic.participantsUnrated) &&
        Objects.equals(this.ratedCorrectCounter, quizQuestionStatistic.ratedCorrectCounter) &&
        Objects.equals(this.unRatedCorrectCounter, quizQuestionStatistic.unRatedCorrectCounter) &&
        Objects.equals(this.type, quizQuestionStatistic.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, participantsRated, participantsUnrated, ratedCorrectCounter, unRatedCorrectCounter, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizQuestionStatistic {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    participantsRated: ").append(toIndentedString(participantsRated)).append("\n");
    sb.append("    participantsUnrated: ").append(toIndentedString(participantsUnrated)).append("\n");
    sb.append("    ratedCorrectCounter: ").append(toIndentedString(ratedCorrectCounter)).append("\n");
    sb.append("    unRatedCorrectCounter: ").append(toIndentedString(unRatedCorrectCounter)).append("\n");
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
    openapiFields.add("participantsRated");
    openapiFields.add("participantsUnrated");
    openapiFields.add("ratedCorrectCounter");
    openapiFields.add("unRatedCorrectCounter");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QuizQuestionStatistic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!QuizQuestionStatistic.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuizQuestionStatistic is not found in the empty JSON string", QuizQuestionStatistic.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QuizQuestionStatistic.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuizQuestionStatistic` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QuizQuestionStatistic.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuizQuestionStatistic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuizQuestionStatistic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuizQuestionStatistic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuizQuestionStatistic.class));

       return (TypeAdapter<T>) new TypeAdapter<QuizQuestionStatistic>() {
           @Override
           public void write(JsonWriter out, QuizQuestionStatistic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuizQuestionStatistic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuizQuestionStatistic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuizQuestionStatistic
  * @throws IOException if the JSON string is invalid with respect to QuizQuestionStatistic
  */
  public static QuizQuestionStatistic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuizQuestionStatistic.class);
  }

 /**
  * Convert an instance of QuizQuestionStatistic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

