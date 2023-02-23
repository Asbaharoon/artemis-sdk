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
import org.openapitools.client.model.PlagiarismComparisonTextSubmissionElement;

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
 * TextPlagiarismResultAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class TextPlagiarismResultAllOf {
  public static final String SERIALIZED_NAME_COMPARISONS = "comparisons";
  @SerializedName(SERIALIZED_NAME_COMPARISONS)
  private Set<PlagiarismComparisonTextSubmissionElement> comparisons = new LinkedHashSet<>();

  public TextPlagiarismResultAllOf() {
  }

  public TextPlagiarismResultAllOf comparisons(Set<PlagiarismComparisonTextSubmissionElement> comparisons) {
    
    this.comparisons = comparisons;
    return this;
  }

  public TextPlagiarismResultAllOf addComparisonsItem(PlagiarismComparisonTextSubmissionElement comparisonsItem) {
    if (this.comparisons == null) {
      this.comparisons = new LinkedHashSet<>();
    }
    this.comparisons.add(comparisonsItem);
    return this;
  }

   /**
   * Get comparisons
   * @return comparisons
  **/
  @javax.annotation.Nullable

  public Set<PlagiarismComparisonTextSubmissionElement> getComparisons() {
    return comparisons;
  }


  public void setComparisons(Set<PlagiarismComparisonTextSubmissionElement> comparisons) {
    this.comparisons = comparisons;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextPlagiarismResultAllOf textPlagiarismResultAllOf = (TextPlagiarismResultAllOf) o;
    return Objects.equals(this.comparisons, textPlagiarismResultAllOf.comparisons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextPlagiarismResultAllOf {\n");
    sb.append("    comparisons: ").append(toIndentedString(comparisons)).append("\n");
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
    openapiFields.add("comparisons");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TextPlagiarismResultAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TextPlagiarismResultAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TextPlagiarismResultAllOf is not found in the empty JSON string", TextPlagiarismResultAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TextPlagiarismResultAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TextPlagiarismResultAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("comparisons") != null && !jsonObj.get("comparisons").isJsonNull()) {
        JsonArray jsonArraycomparisons = jsonObj.getAsJsonArray("comparisons");
        if (jsonArraycomparisons != null) {
          // ensure the json data is an array
          if (!jsonObj.get("comparisons").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `comparisons` to be an array in the JSON string but got `%s`", jsonObj.get("comparisons").toString()));
          }

          // validate the optional field `comparisons` (array)
          for (int i = 0; i < jsonArraycomparisons.size(); i++) {
            PlagiarismComparisonTextSubmissionElement.validateJsonObject(jsonArraycomparisons.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TextPlagiarismResultAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TextPlagiarismResultAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TextPlagiarismResultAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TextPlagiarismResultAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<TextPlagiarismResultAllOf>() {
           @Override
           public void write(JsonWriter out, TextPlagiarismResultAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TextPlagiarismResultAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TextPlagiarismResultAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TextPlagiarismResultAllOf
  * @throws IOException if the JSON string is invalid with respect to TextPlagiarismResultAllOf
  */
  public static TextPlagiarismResultAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TextPlagiarismResultAllOf.class);
  }

 /**
  * Convert an instance of TextPlagiarismResultAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

