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
 * PointCounter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class PointCounter {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_RATED_COUNTER = "ratedCounter";
  @SerializedName(SERIALIZED_NAME_RATED_COUNTER)
  private Integer ratedCounter;

  public static final String SERIALIZED_NAME_UN_RATED_COUNTER = "unRatedCounter";
  @SerializedName(SERIALIZED_NAME_UN_RATED_COUNTER)
  private Integer unRatedCounter;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Double points;

  public PointCounter() {
  }

  public PointCounter id(Long id) {
    
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


  public PointCounter ratedCounter(Integer ratedCounter) {
    
    this.ratedCounter = ratedCounter;
    return this;
  }

   /**
   * Get ratedCounter
   * @return ratedCounter
  **/
  @javax.annotation.Nullable

  public Integer getRatedCounter() {
    return ratedCounter;
  }


  public void setRatedCounter(Integer ratedCounter) {
    this.ratedCounter = ratedCounter;
  }


  public PointCounter unRatedCounter(Integer unRatedCounter) {
    
    this.unRatedCounter = unRatedCounter;
    return this;
  }

   /**
   * Get unRatedCounter
   * @return unRatedCounter
  **/
  @javax.annotation.Nullable

  public Integer getUnRatedCounter() {
    return unRatedCounter;
  }


  public void setUnRatedCounter(Integer unRatedCounter) {
    this.unRatedCounter = unRatedCounter;
  }


  public PointCounter points(Double points) {
    
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @javax.annotation.Nullable

  public Double getPoints() {
    return points;
  }


  public void setPoints(Double points) {
    this.points = points;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointCounter pointCounter = (PointCounter) o;
    return Objects.equals(this.id, pointCounter.id) &&
        Objects.equals(this.ratedCounter, pointCounter.ratedCounter) &&
        Objects.equals(this.unRatedCounter, pointCounter.unRatedCounter) &&
        Objects.equals(this.points, pointCounter.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ratedCounter, unRatedCounter, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointCounter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ratedCounter: ").append(toIndentedString(ratedCounter)).append("\n");
    sb.append("    unRatedCounter: ").append(toIndentedString(unRatedCounter)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
    openapiFields.add("ratedCounter");
    openapiFields.add("unRatedCounter");
    openapiFields.add("points");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PointCounter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PointCounter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PointCounter is not found in the empty JSON string", PointCounter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PointCounter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PointCounter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PointCounter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PointCounter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PointCounter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PointCounter.class));

       return (TypeAdapter<T>) new TypeAdapter<PointCounter>() {
           @Override
           public void write(JsonWriter out, PointCounter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PointCounter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PointCounter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PointCounter
  * @throws IOException if the JSON string is invalid with respect to PointCounter
  */
  public static PointCounter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PointCounter.class);
  }

 /**
  * Convert an instance of PointCounter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

