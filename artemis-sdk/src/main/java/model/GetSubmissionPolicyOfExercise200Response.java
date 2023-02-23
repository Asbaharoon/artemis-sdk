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
import org.openapitools.client.model.LockRepositoryPolicy;
import org.openapitools.client.model.ProgrammingExercise;
import org.openapitools.client.model.SubmissionPenaltyPolicy;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class GetSubmissionPolicyOfExercise200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetSubmissionPolicyOfExercise200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetSubmissionPolicyOfExercise200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetSubmissionPolicyOfExercise200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LockRepositoryPolicy> adapterLockRepositoryPolicy = gson.getDelegateAdapter(this, TypeToken.get(LockRepositoryPolicy.class));
            final TypeAdapter<SubmissionPenaltyPolicy> adapterSubmissionPenaltyPolicy = gson.getDelegateAdapter(this, TypeToken.get(SubmissionPenaltyPolicy.class));

            return (TypeAdapter<T>) new TypeAdapter<GetSubmissionPolicyOfExercise200Response>() {
                @Override
                public void write(JsonWriter out, GetSubmissionPolicyOfExercise200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `LockRepositoryPolicy`
                    if (value.getActualInstance() instanceof LockRepositoryPolicy) {
                        JsonObject obj = adapterLockRepositoryPolicy.toJsonTree((LockRepositoryPolicy)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SubmissionPenaltyPolicy`
                    if (value.getActualInstance() instanceof SubmissionPenaltyPolicy) {
                        JsonObject obj = adapterSubmissionPenaltyPolicy.toJsonTree((SubmissionPenaltyPolicy)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: LockRepositoryPolicy, SubmissionPenaltyPolicy");
                }

                @Override
                public GetSubmissionPolicyOfExercise200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize LockRepositoryPolicy
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LockRepositoryPolicy.validateJsonObject(jsonObject);
                        actualAdapter = adapterLockRepositoryPolicy;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'LockRepositoryPolicy'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for LockRepositoryPolicy failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'LockRepositoryPolicy'", e);
                    }

                    // deserialize SubmissionPenaltyPolicy
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SubmissionPenaltyPolicy.validateJsonObject(jsonObject);
                        actualAdapter = adapterSubmissionPenaltyPolicy;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SubmissionPenaltyPolicy'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SubmissionPenaltyPolicy failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SubmissionPenaltyPolicy'", e);
                    }

                    if (match == 1) {
                        GetSubmissionPolicyOfExercise200Response ret = new GetSubmissionPolicyOfExercise200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetSubmissionPolicyOfExercise200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetSubmissionPolicyOfExercise200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public GetSubmissionPolicyOfExercise200Response(LockRepositoryPolicy o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetSubmissionPolicyOfExercise200Response(SubmissionPenaltyPolicy o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("LockRepositoryPolicy", new GenericType<LockRepositoryPolicy>() {
        });
        schemas.put("SubmissionPenaltyPolicy", new GenericType<SubmissionPenaltyPolicy>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetSubmissionPolicyOfExercise200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * LockRepositoryPolicy, SubmissionPenaltyPolicy
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof LockRepositoryPolicy) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SubmissionPenaltyPolicy) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be LockRepositoryPolicy, SubmissionPenaltyPolicy");
    }

    /**
     * Get the actual instance, which can be the following:
     * LockRepositoryPolicy, SubmissionPenaltyPolicy
     *
     * @return The actual instance (LockRepositoryPolicy, SubmissionPenaltyPolicy)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `LockRepositoryPolicy`. If the actual instance is not `LockRepositoryPolicy`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LockRepositoryPolicy`
     * @throws ClassCastException if the instance is not `LockRepositoryPolicy`
     */
    public LockRepositoryPolicy getLockRepositoryPolicy() throws ClassCastException {
        return (LockRepositoryPolicy)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SubmissionPenaltyPolicy`. If the actual instance is not `SubmissionPenaltyPolicy`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubmissionPenaltyPolicy`
     * @throws ClassCastException if the instance is not `SubmissionPenaltyPolicy`
     */
    public SubmissionPenaltyPolicy getSubmissionPenaltyPolicy() throws ClassCastException {
        return (SubmissionPenaltyPolicy)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetSubmissionPolicyOfExercise200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with LockRepositoryPolicy
    try {
      LockRepositoryPolicy.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LockRepositoryPolicy failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SubmissionPenaltyPolicy
    try {
      SubmissionPenaltyPolicy.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SubmissionPenaltyPolicy failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GetSubmissionPolicyOfExercise200Response with oneOf schemas: LockRepositoryPolicy, SubmissionPenaltyPolicy. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetSubmissionPolicyOfExercise200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetSubmissionPolicyOfExercise200Response
  * @throws IOException if the JSON string is invalid with respect to GetSubmissionPolicyOfExercise200Response
  */
  public static GetSubmissionPolicyOfExercise200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSubmissionPolicyOfExercise200Response.class);
  }

 /**
  * Convert an instance of GetSubmissionPolicyOfExercise200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

