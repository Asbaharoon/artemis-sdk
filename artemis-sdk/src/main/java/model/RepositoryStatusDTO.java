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
 * RepositoryStatusDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class RepositoryStatusDTO {
  /**
   * Gets or Sets repositoryStatus
   */
  @JsonAdapter(RepositoryStatusEnum.Adapter.class)
  public enum RepositoryStatusEnum {
    CLEAN("CLEAN"),
    
    CONFLICT("CONFLICT"),
    
    UNCOMMITTED_CHANGES("UNCOMMITTED_CHANGES");

    private String value;

    RepositoryStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RepositoryStatusEnum fromValue(String value) {
      for (RepositoryStatusEnum b : RepositoryStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RepositoryStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RepositoryStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RepositoryStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RepositoryStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REPOSITORY_STATUS = "repositoryStatus";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_STATUS)
  private RepositoryStatusEnum repositoryStatus;

  public RepositoryStatusDTO() {
  }

  public RepositoryStatusDTO repositoryStatus(RepositoryStatusEnum repositoryStatus) {
    
    this.repositoryStatus = repositoryStatus;
    return this;
  }

   /**
   * Get repositoryStatus
   * @return repositoryStatus
  **/
  @javax.annotation.Nullable

  public RepositoryStatusEnum getRepositoryStatus() {
    return repositoryStatus;
  }


  public void setRepositoryStatus(RepositoryStatusEnum repositoryStatus) {
    this.repositoryStatus = repositoryStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryStatusDTO repositoryStatusDTO = (RepositoryStatusDTO) o;
    return Objects.equals(this.repositoryStatus, repositoryStatusDTO.repositoryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryStatusDTO {\n");
    sb.append("    repositoryStatus: ").append(toIndentedString(repositoryStatus)).append("\n");
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
    openapiFields.add("repositoryStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RepositoryStatusDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RepositoryStatusDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepositoryStatusDTO is not found in the empty JSON string", RepositoryStatusDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RepositoryStatusDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RepositoryStatusDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("repositoryStatus") != null && !jsonObj.get("repositoryStatus").isJsonNull()) && !jsonObj.get("repositoryStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repositoryStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repositoryStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepositoryStatusDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepositoryStatusDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepositoryStatusDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepositoryStatusDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<RepositoryStatusDTO>() {
           @Override
           public void write(JsonWriter out, RepositoryStatusDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RepositoryStatusDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RepositoryStatusDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepositoryStatusDTO
  * @throws IOException if the JSON string is invalid with respect to RepositoryStatusDTO
  */
  public static RepositoryStatusDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepositoryStatusDTO.class);
  }

 /**
  * Convert an instance of RepositoryStatusDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

