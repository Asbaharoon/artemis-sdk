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
 * PlagiarismMatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class PlagiarismMatch {
  public static final String SERIALIZED_NAME_START_A = "startA";
  @SerializedName(SERIALIZED_NAME_START_A)
  private Integer startA;

  public static final String SERIALIZED_NAME_START_B = "startB";
  @SerializedName(SERIALIZED_NAME_START_B)
  private Integer startB;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public PlagiarismMatch() {
  }

  public PlagiarismMatch startA(Integer startA) {
    
    this.startA = startA;
    return this;
  }

   /**
   * Get startA
   * @return startA
  **/
  @javax.annotation.Nullable

  public Integer getStartA() {
    return startA;
  }


  public void setStartA(Integer startA) {
    this.startA = startA;
  }


  public PlagiarismMatch startB(Integer startB) {
    
    this.startB = startB;
    return this;
  }

   /**
   * Get startB
   * @return startB
  **/
  @javax.annotation.Nullable

  public Integer getStartB() {
    return startB;
  }


  public void setStartB(Integer startB) {
    this.startB = startB;
  }


  public PlagiarismMatch length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @javax.annotation.Nullable

  public Integer getLength() {
    return length;
  }


  public void setLength(Integer length) {
    this.length = length;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlagiarismMatch plagiarismMatch = (PlagiarismMatch) o;
    return Objects.equals(this.startA, plagiarismMatch.startA) &&
        Objects.equals(this.startB, plagiarismMatch.startB) &&
        Objects.equals(this.length, plagiarismMatch.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startA, startB, length);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlagiarismMatch {\n");
    sb.append("    startA: ").append(toIndentedString(startA)).append("\n");
    sb.append("    startB: ").append(toIndentedString(startB)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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
    openapiFields.add("startA");
    openapiFields.add("startB");
    openapiFields.add("length");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlagiarismMatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlagiarismMatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlagiarismMatch is not found in the empty JSON string", PlagiarismMatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PlagiarismMatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlagiarismMatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlagiarismMatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlagiarismMatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlagiarismMatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlagiarismMatch.class));

       return (TypeAdapter<T>) new TypeAdapter<PlagiarismMatch>() {
           @Override
           public void write(JsonWriter out, PlagiarismMatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlagiarismMatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlagiarismMatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlagiarismMatch
  * @throws IOException if the JSON string is invalid with respect to PlagiarismMatch
  */
  public static PlagiarismMatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlagiarismMatch.class);
  }

 /**
  * Convert an instance of PlagiarismMatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

