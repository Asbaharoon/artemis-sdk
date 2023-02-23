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
 * GuidedTourSetting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class GuidedTourSetting {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_GUIDED_TOUR_KEY = "guidedTourKey";
  @SerializedName(SERIALIZED_NAME_GUIDED_TOUR_KEY)
  private String guidedTourKey;

  public static final String SERIALIZED_NAME_GUIDED_TOUR_STEP = "guidedTourStep";
  @SerializedName(SERIALIZED_NAME_GUIDED_TOUR_STEP)
  private Integer guidedTourStep;

  /**
   * Gets or Sets guidedTourState
   */
  @JsonAdapter(GuidedTourStateEnum.Adapter.class)
  public enum GuidedTourStateEnum {
    STARTED("STARTED"),
    
    FINISHED("FINISHED");

    private String value;

    GuidedTourStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GuidedTourStateEnum fromValue(String value) {
      for (GuidedTourStateEnum b : GuidedTourStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GuidedTourStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GuidedTourStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GuidedTourStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GuidedTourStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GUIDED_TOUR_STATE = "guidedTourState";
  @SerializedName(SERIALIZED_NAME_GUIDED_TOUR_STATE)
  private GuidedTourStateEnum guidedTourState;

  public GuidedTourSetting() {
  }

  public GuidedTourSetting id(Long id) {
    
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


  public GuidedTourSetting guidedTourKey(String guidedTourKey) {
    
    this.guidedTourKey = guidedTourKey;
    return this;
  }

   /**
   * Get guidedTourKey
   * @return guidedTourKey
  **/
  @javax.annotation.Nullable

  public String getGuidedTourKey() {
    return guidedTourKey;
  }


  public void setGuidedTourKey(String guidedTourKey) {
    this.guidedTourKey = guidedTourKey;
  }


  public GuidedTourSetting guidedTourStep(Integer guidedTourStep) {
    
    this.guidedTourStep = guidedTourStep;
    return this;
  }

   /**
   * Get guidedTourStep
   * @return guidedTourStep
  **/
  @javax.annotation.Nullable

  public Integer getGuidedTourStep() {
    return guidedTourStep;
  }


  public void setGuidedTourStep(Integer guidedTourStep) {
    this.guidedTourStep = guidedTourStep;
  }


  public GuidedTourSetting guidedTourState(GuidedTourStateEnum guidedTourState) {
    
    this.guidedTourState = guidedTourState;
    return this;
  }

   /**
   * Get guidedTourState
   * @return guidedTourState
  **/
  @javax.annotation.Nullable

  public GuidedTourStateEnum getGuidedTourState() {
    return guidedTourState;
  }


  public void setGuidedTourState(GuidedTourStateEnum guidedTourState) {
    this.guidedTourState = guidedTourState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTourSetting guidedTourSetting = (GuidedTourSetting) o;
    return Objects.equals(this.id, guidedTourSetting.id) &&
        Objects.equals(this.guidedTourKey, guidedTourSetting.guidedTourKey) &&
        Objects.equals(this.guidedTourStep, guidedTourSetting.guidedTourStep) &&
        Objects.equals(this.guidedTourState, guidedTourSetting.guidedTourState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, guidedTourKey, guidedTourStep, guidedTourState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTourSetting {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    guidedTourKey: ").append(toIndentedString(guidedTourKey)).append("\n");
    sb.append("    guidedTourStep: ").append(toIndentedString(guidedTourStep)).append("\n");
    sb.append("    guidedTourState: ").append(toIndentedString(guidedTourState)).append("\n");
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
    openapiFields.add("guidedTourKey");
    openapiFields.add("guidedTourStep");
    openapiFields.add("guidedTourState");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GuidedTourSetting
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GuidedTourSetting.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GuidedTourSetting is not found in the empty JSON string", GuidedTourSetting.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GuidedTourSetting.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GuidedTourSetting` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("guidedTourKey") != null && !jsonObj.get("guidedTourKey").isJsonNull()) && !jsonObj.get("guidedTourKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guidedTourKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guidedTourKey").toString()));
      }
      if ((jsonObj.get("guidedTourState") != null && !jsonObj.get("guidedTourState").isJsonNull()) && !jsonObj.get("guidedTourState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guidedTourState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guidedTourState").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GuidedTourSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GuidedTourSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GuidedTourSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GuidedTourSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<GuidedTourSetting>() {
           @Override
           public void write(JsonWriter out, GuidedTourSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GuidedTourSetting read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GuidedTourSetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GuidedTourSetting
  * @throws IOException if the JSON string is invalid with respect to GuidedTourSetting
  */
  public static GuidedTourSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GuidedTourSetting.class);
  }

 /**
  * Convert an instance of GuidedTourSetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

