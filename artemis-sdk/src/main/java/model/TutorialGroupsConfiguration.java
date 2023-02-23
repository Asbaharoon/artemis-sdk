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
import org.openapitools.client.model.TutorialGroupFreePeriod;

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
 * TutorialGroupsConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class TutorialGroupsConfiguration {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_TUTORIAL_PERIOD_START_INCLUSIVE = "tutorialPeriodStartInclusive";
  @SerializedName(SERIALIZED_NAME_TUTORIAL_PERIOD_START_INCLUSIVE)
  private String tutorialPeriodStartInclusive;

  public static final String SERIALIZED_NAME_TUTORIAL_PERIOD_END_INCLUSIVE = "tutorialPeriodEndInclusive";
  @SerializedName(SERIALIZED_NAME_TUTORIAL_PERIOD_END_INCLUSIVE)
  private String tutorialPeriodEndInclusive;

  public static final String SERIALIZED_NAME_TUTORIAL_GROUP_FREE_PERIODS = "tutorialGroupFreePeriods";
  @SerializedName(SERIALIZED_NAME_TUTORIAL_GROUP_FREE_PERIODS)
  private Set<TutorialGroupFreePeriod> tutorialGroupFreePeriods = new LinkedHashSet<>();

  public TutorialGroupsConfiguration() {
  }

  public TutorialGroupsConfiguration id(Long id) {
    
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


  public TutorialGroupsConfiguration tutorialPeriodStartInclusive(String tutorialPeriodStartInclusive) {
    
    this.tutorialPeriodStartInclusive = tutorialPeriodStartInclusive;
    return this;
  }

   /**
   * Get tutorialPeriodStartInclusive
   * @return tutorialPeriodStartInclusive
  **/
  @javax.annotation.Nonnull

  public String getTutorialPeriodStartInclusive() {
    return tutorialPeriodStartInclusive;
  }


  public void setTutorialPeriodStartInclusive(String tutorialPeriodStartInclusive) {
    this.tutorialPeriodStartInclusive = tutorialPeriodStartInclusive;
  }


  public TutorialGroupsConfiguration tutorialPeriodEndInclusive(String tutorialPeriodEndInclusive) {
    
    this.tutorialPeriodEndInclusive = tutorialPeriodEndInclusive;
    return this;
  }

   /**
   * Get tutorialPeriodEndInclusive
   * @return tutorialPeriodEndInclusive
  **/
  @javax.annotation.Nonnull

  public String getTutorialPeriodEndInclusive() {
    return tutorialPeriodEndInclusive;
  }


  public void setTutorialPeriodEndInclusive(String tutorialPeriodEndInclusive) {
    this.tutorialPeriodEndInclusive = tutorialPeriodEndInclusive;
  }


  public TutorialGroupsConfiguration tutorialGroupFreePeriods(Set<TutorialGroupFreePeriod> tutorialGroupFreePeriods) {
    
    this.tutorialGroupFreePeriods = tutorialGroupFreePeriods;
    return this;
  }

  public TutorialGroupsConfiguration addTutorialGroupFreePeriodsItem(TutorialGroupFreePeriod tutorialGroupFreePeriodsItem) {
    if (this.tutorialGroupFreePeriods == null) {
      this.tutorialGroupFreePeriods = new LinkedHashSet<>();
    }
    this.tutorialGroupFreePeriods.add(tutorialGroupFreePeriodsItem);
    return this;
  }

   /**
   * Get tutorialGroupFreePeriods
   * @return tutorialGroupFreePeriods
  **/
  @javax.annotation.Nullable

  public Set<TutorialGroupFreePeriod> getTutorialGroupFreePeriods() {
    return tutorialGroupFreePeriods;
  }


  public void setTutorialGroupFreePeriods(Set<TutorialGroupFreePeriod> tutorialGroupFreePeriods) {
    this.tutorialGroupFreePeriods = tutorialGroupFreePeriods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TutorialGroupsConfiguration tutorialGroupsConfiguration = (TutorialGroupsConfiguration) o;
    return Objects.equals(this.id, tutorialGroupsConfiguration.id) &&
        Objects.equals(this.tutorialPeriodStartInclusive, tutorialGroupsConfiguration.tutorialPeriodStartInclusive) &&
        Objects.equals(this.tutorialPeriodEndInclusive, tutorialGroupsConfiguration.tutorialPeriodEndInclusive) &&
        Objects.equals(this.tutorialGroupFreePeriods, tutorialGroupsConfiguration.tutorialGroupFreePeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tutorialPeriodStartInclusive, tutorialPeriodEndInclusive, tutorialGroupFreePeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TutorialGroupsConfiguration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tutorialPeriodStartInclusive: ").append(toIndentedString(tutorialPeriodStartInclusive)).append("\n");
    sb.append("    tutorialPeriodEndInclusive: ").append(toIndentedString(tutorialPeriodEndInclusive)).append("\n");
    sb.append("    tutorialGroupFreePeriods: ").append(toIndentedString(tutorialGroupFreePeriods)).append("\n");
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
    openapiFields.add("tutorialPeriodStartInclusive");
    openapiFields.add("tutorialPeriodEndInclusive");
    openapiFields.add("tutorialGroupFreePeriods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tutorialPeriodStartInclusive");
    openapiRequiredFields.add("tutorialPeriodEndInclusive");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TutorialGroupsConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TutorialGroupsConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TutorialGroupsConfiguration is not found in the empty JSON string", TutorialGroupsConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TutorialGroupsConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TutorialGroupsConfiguration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TutorialGroupsConfiguration.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("tutorialPeriodStartInclusive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tutorialPeriodStartInclusive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tutorialPeriodStartInclusive").toString()));
      }
      if (!jsonObj.get("tutorialPeriodEndInclusive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tutorialPeriodEndInclusive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tutorialPeriodEndInclusive").toString()));
      }
      if (jsonObj.get("tutorialGroupFreePeriods") != null && !jsonObj.get("tutorialGroupFreePeriods").isJsonNull()) {
        JsonArray jsonArraytutorialGroupFreePeriods = jsonObj.getAsJsonArray("tutorialGroupFreePeriods");
        if (jsonArraytutorialGroupFreePeriods != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tutorialGroupFreePeriods").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tutorialGroupFreePeriods` to be an array in the JSON string but got `%s`", jsonObj.get("tutorialGroupFreePeriods").toString()));
          }

          // validate the optional field `tutorialGroupFreePeriods` (array)
          for (int i = 0; i < jsonArraytutorialGroupFreePeriods.size(); i++) {
            TutorialGroupFreePeriod.validateJsonObject(jsonArraytutorialGroupFreePeriods.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TutorialGroupsConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TutorialGroupsConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TutorialGroupsConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TutorialGroupsConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<TutorialGroupsConfiguration>() {
           @Override
           public void write(JsonWriter out, TutorialGroupsConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TutorialGroupsConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TutorialGroupsConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TutorialGroupsConfiguration
  * @throws IOException if the JSON string is invalid with respect to TutorialGroupsConfiguration
  */
  public static TutorialGroupsConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TutorialGroupsConfiguration.class);
  }

 /**
  * Convert an instance of TutorialGroupsConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

