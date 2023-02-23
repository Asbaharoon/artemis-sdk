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
import org.openapitools.client.model.IPAddressNetworkObjectObjectObjectObjectObject;

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
 * IPAddressSegment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class IPAddressSegment {
  public static final String SERIALIZED_NAME_UPPER_BYTES = "upperBytes";
  @SerializedName(SERIALIZED_NAME_UPPER_BYTES)
  private List<byte[]> upperBytes = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public static final String SERIALIZED_NAME_UPPER_VALUE = "upperValue";
  @SerializedName(SERIALIZED_NAME_UPPER_VALUE)
  private Integer upperValue;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_LOWER = "lower";
  @SerializedName(SERIALIZED_NAME_LOWER)
  private IPAddressSegment lower;

  public static final String SERIALIZED_NAME_UPPER = "upper";
  @SerializedName(SERIALIZED_NAME_UPPER)
  private IPAddressSegment upper;

  public static final String SERIALIZED_NAME_UPPER_SEGMENT_VALUE = "upperSegmentValue";
  @SerializedName(SERIALIZED_NAME_UPPER_SEGMENT_VALUE)
  private Integer upperSegmentValue;

  public static final String SERIALIZED_NAME_UPPER_DIVISION_VALUE = "upperDivisionValue";
  @SerializedName(SERIALIZED_NAME_UPPER_DIVISION_VALUE)
  private Long upperDivisionValue;

  public static final String SERIALIZED_NAME_DIVISION_VALUE = "divisionValue";
  @SerializedName(SERIALIZED_NAME_DIVISION_VALUE)
  private Long divisionValue;

  public static final String SERIALIZED_NAME_VALUE_COUNT = "valueCount";
  @SerializedName(SERIALIZED_NAME_VALUE_COUNT)
  private Integer valueCount;

  public static final String SERIALIZED_NAME_PREFIX_VALUE_COUNT = "prefixValueCount";
  @SerializedName(SERIALIZED_NAME_PREFIX_VALUE_COUNT)
  private Integer prefixValueCount;

  public static final String SERIALIZED_NAME_IPV4 = "ipv4";
  @SerializedName(SERIALIZED_NAME_IPV4)
  private Boolean ipv4;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private IPAddressNetworkObjectObjectObjectObjectObject network;

  public static final String SERIALIZED_NAME_ITERABLE = "iterable";
  @SerializedName(SERIALIZED_NAME_ITERABLE)
  private Object iterable;

  /**
   * Gets or Sets ipversion
   */
  @JsonAdapter(IpversionEnum.Adapter.class)
  public enum IpversionEnum {
    IPV4("IPv4"),
    
    IPV6("IPv6");

    private String value;

    IpversionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IpversionEnum fromValue(String value) {
      for (IpversionEnum b : IpversionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IpversionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IpversionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IpversionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IpversionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IPVERSION = "ipversion";
  @SerializedName(SERIALIZED_NAME_IPVERSION)
  private IpversionEnum ipversion;

  public static final String SERIALIZED_NAME_PREFIX_BLOCK = "prefixBlock";
  @SerializedName(SERIALIZED_NAME_PREFIX_BLOCK)
  private Boolean prefixBlock;

  public static final String SERIALIZED_NAME_SEGMENT_PREFIX_LENGTH = "segmentPrefixLength";
  @SerializedName(SERIALIZED_NAME_SEGMENT_PREFIX_LENGTH)
  private Integer segmentPrefixLength;

  public static final String SERIALIZED_NAME_MIN_PREFIX_LENGTH_FOR_BLOCK = "minPrefixLengthForBlock";
  @SerializedName(SERIALIZED_NAME_MIN_PREFIX_LENGTH_FOR_BLOCK)
  private Integer minPrefixLengthForBlock;

  public static final String SERIALIZED_NAME_SEGMENT_VALUE = "segmentValue";
  @SerializedName(SERIALIZED_NAME_SEGMENT_VALUE)
  private Integer segmentValue;

  public static final String SERIALIZED_NAME_IPV6 = "ipv6";
  @SerializedName(SERIALIZED_NAME_IPV6)
  private Boolean ipv6;

  public static final String SERIALIZED_NAME_MAX_VALUE = "maxValue";
  @SerializedName(SERIALIZED_NAME_MAX_VALUE)
  private Long maxValue;

  public static final String SERIALIZED_NAME_MULTIPLE = "multiple";
  @SerializedName(SERIALIZED_NAME_MULTIPLE)
  private Boolean multiple;

  public static final String SERIALIZED_NAME_MAX_SEGMENT_VALUE = "maxSegmentValue";
  @SerializedName(SERIALIZED_NAME_MAX_SEGMENT_VALUE)
  private Integer maxSegmentValue;

  public static final String SERIALIZED_NAME_BYTES = "bytes";
  @SerializedName(SERIALIZED_NAME_BYTES)
  private List<byte[]> bytes = new ArrayList<>();

  public static final String SERIALIZED_NAME_ZERO = "zero";
  @SerializedName(SERIALIZED_NAME_ZERO)
  private Boolean zero;

  public static final String SERIALIZED_NAME_BYTE_COUNT = "byteCount";
  @SerializedName(SERIALIZED_NAME_BYTE_COUNT)
  private Integer byteCount;

  public static final String SERIALIZED_NAME_BIT_COUNT = "bitCount";
  @SerializedName(SERIALIZED_NAME_BIT_COUNT)
  private Integer bitCount;

  public static final String SERIALIZED_NAME_PREFIX_LENGTH_FOR_SINGLE_BLOCK = "prefixLengthForSingleBlock";
  @SerializedName(SERIALIZED_NAME_PREFIX_LENGTH_FOR_SINGLE_BLOCK)
  private Integer prefixLengthForSingleBlock;

  public static final String SERIALIZED_NAME_FULL_RANGE = "fullRange";
  @SerializedName(SERIALIZED_NAME_FULL_RANGE)
  private Boolean fullRange;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Boolean max;

  public static final String SERIALIZED_NAME_STRING = "string";
  @SerializedName(SERIALIZED_NAME_STRING)
  private String string;

  public static final String SERIALIZED_NAME_DIVISION_PREFIX_LENGTH = "divisionPrefixLength";
  @SerializedName(SERIALIZED_NAME_DIVISION_PREFIX_LENGTH)
  private Integer divisionPrefixLength;

  public static final String SERIALIZED_NAME_WILDCARD_STRING = "wildcardString";
  @SerializedName(SERIALIZED_NAME_WILDCARD_STRING)
  private String wildcardString;

  public static final String SERIALIZED_NAME_PREFIXED = "prefixed";
  @SerializedName(SERIALIZED_NAME_PREFIXED)
  private Boolean prefixed;

  public static final String SERIALIZED_NAME_SINGLE_PREFIX_BLOCK = "singlePrefixBlock";
  @SerializedName(SERIALIZED_NAME_SINGLE_PREFIX_BLOCK)
  private Boolean singlePrefixBlock;

  public IPAddressSegment() {
  }

  public IPAddressSegment upperBytes(List<byte[]> upperBytes) {
    
    this.upperBytes = upperBytes;
    return this;
  }

  public IPAddressSegment addUpperBytesItem(byte[] upperBytesItem) {
    if (this.upperBytes == null) {
      this.upperBytes = new ArrayList<>();
    }
    this.upperBytes.add(upperBytesItem);
    return this;
  }

   /**
   * Get upperBytes
   * @return upperBytes
  **/
  @javax.annotation.Nullable

  public List<byte[]> getUpperBytes() {
    return upperBytes;
  }


  public void setUpperBytes(List<byte[]> upperBytes) {
    this.upperBytes = upperBytes;
  }


  public IPAddressSegment value(Integer value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable

  public Integer getValue() {
    return value;
  }


  public void setValue(Integer value) {
    this.value = value;
  }


  public IPAddressSegment upperValue(Integer upperValue) {
    
    this.upperValue = upperValue;
    return this;
  }

   /**
   * Get upperValue
   * @return upperValue
  **/
  @javax.annotation.Nullable

  public Integer getUpperValue() {
    return upperValue;
  }


  public void setUpperValue(Integer upperValue) {
    this.upperValue = upperValue;
  }


  public IPAddressSegment count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public IPAddressSegment lower(IPAddressSegment lower) {
    
    this.lower = lower;
    return this;
  }

   /**
   * Get lower
   * @return lower
  **/
  @javax.annotation.Nullable

  public IPAddressSegment getLower() {
    return lower;
  }


  public void setLower(IPAddressSegment lower) {
    this.lower = lower;
  }


  public IPAddressSegment upper(IPAddressSegment upper) {
    
    this.upper = upper;
    return this;
  }

   /**
   * Get upper
   * @return upper
  **/
  @javax.annotation.Nullable

  public IPAddressSegment getUpper() {
    return upper;
  }


  public void setUpper(IPAddressSegment upper) {
    this.upper = upper;
  }


  public IPAddressSegment upperSegmentValue(Integer upperSegmentValue) {
    
    this.upperSegmentValue = upperSegmentValue;
    return this;
  }

   /**
   * Get upperSegmentValue
   * @return upperSegmentValue
  **/
  @javax.annotation.Nullable

  public Integer getUpperSegmentValue() {
    return upperSegmentValue;
  }


  public void setUpperSegmentValue(Integer upperSegmentValue) {
    this.upperSegmentValue = upperSegmentValue;
  }


  public IPAddressSegment upperDivisionValue(Long upperDivisionValue) {
    
    this.upperDivisionValue = upperDivisionValue;
    return this;
  }

   /**
   * Get upperDivisionValue
   * @return upperDivisionValue
  **/
  @javax.annotation.Nullable

  public Long getUpperDivisionValue() {
    return upperDivisionValue;
  }


  public void setUpperDivisionValue(Long upperDivisionValue) {
    this.upperDivisionValue = upperDivisionValue;
  }


  public IPAddressSegment divisionValue(Long divisionValue) {
    
    this.divisionValue = divisionValue;
    return this;
  }

   /**
   * Get divisionValue
   * @return divisionValue
  **/
  @javax.annotation.Nullable

  public Long getDivisionValue() {
    return divisionValue;
  }


  public void setDivisionValue(Long divisionValue) {
    this.divisionValue = divisionValue;
  }


  public IPAddressSegment valueCount(Integer valueCount) {
    
    this.valueCount = valueCount;
    return this;
  }

   /**
   * Get valueCount
   * @return valueCount
  **/
  @javax.annotation.Nullable

  public Integer getValueCount() {
    return valueCount;
  }


  public void setValueCount(Integer valueCount) {
    this.valueCount = valueCount;
  }


  public IPAddressSegment prefixValueCount(Integer prefixValueCount) {
    
    this.prefixValueCount = prefixValueCount;
    return this;
  }

   /**
   * Get prefixValueCount
   * @return prefixValueCount
  **/
  @javax.annotation.Nullable

  public Integer getPrefixValueCount() {
    return prefixValueCount;
  }


  public void setPrefixValueCount(Integer prefixValueCount) {
    this.prefixValueCount = prefixValueCount;
  }


  public IPAddressSegment ipv4(Boolean ipv4) {
    
    this.ipv4 = ipv4;
    return this;
  }

   /**
   * Get ipv4
   * @return ipv4
  **/
  @javax.annotation.Nullable

  public Boolean getIpv4() {
    return ipv4;
  }


  public void setIpv4(Boolean ipv4) {
    this.ipv4 = ipv4;
  }


  public IPAddressSegment network(IPAddressNetworkObjectObjectObjectObjectObject network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable

  public IPAddressNetworkObjectObjectObjectObjectObject getNetwork() {
    return network;
  }


  public void setNetwork(IPAddressNetworkObjectObjectObjectObjectObject network) {
    this.network = network;
  }


  public IPAddressSegment iterable(Object iterable) {
    
    this.iterable = iterable;
    return this;
  }

   /**
   * Get iterable
   * @return iterable
  **/
  @javax.annotation.Nullable

  public Object getIterable() {
    return iterable;
  }


  public void setIterable(Object iterable) {
    this.iterable = iterable;
  }


  public IPAddressSegment ipversion(IpversionEnum ipversion) {
    
    this.ipversion = ipversion;
    return this;
  }

   /**
   * Get ipversion
   * @return ipversion
  **/
  @javax.annotation.Nullable

  public IpversionEnum getIpversion() {
    return ipversion;
  }


  public void setIpversion(IpversionEnum ipversion) {
    this.ipversion = ipversion;
  }


  public IPAddressSegment prefixBlock(Boolean prefixBlock) {
    
    this.prefixBlock = prefixBlock;
    return this;
  }

   /**
   * Get prefixBlock
   * @return prefixBlock
  **/
  @javax.annotation.Nullable

  public Boolean getPrefixBlock() {
    return prefixBlock;
  }


  public void setPrefixBlock(Boolean prefixBlock) {
    this.prefixBlock = prefixBlock;
  }


  public IPAddressSegment segmentPrefixLength(Integer segmentPrefixLength) {
    
    this.segmentPrefixLength = segmentPrefixLength;
    return this;
  }

   /**
   * Get segmentPrefixLength
   * @return segmentPrefixLength
  **/
  @javax.annotation.Nullable

  public Integer getSegmentPrefixLength() {
    return segmentPrefixLength;
  }


  public void setSegmentPrefixLength(Integer segmentPrefixLength) {
    this.segmentPrefixLength = segmentPrefixLength;
  }


  public IPAddressSegment minPrefixLengthForBlock(Integer minPrefixLengthForBlock) {
    
    this.minPrefixLengthForBlock = minPrefixLengthForBlock;
    return this;
  }

   /**
   * Get minPrefixLengthForBlock
   * @return minPrefixLengthForBlock
  **/
  @javax.annotation.Nullable

  public Integer getMinPrefixLengthForBlock() {
    return minPrefixLengthForBlock;
  }


  public void setMinPrefixLengthForBlock(Integer minPrefixLengthForBlock) {
    this.minPrefixLengthForBlock = minPrefixLengthForBlock;
  }


  public IPAddressSegment segmentValue(Integer segmentValue) {
    
    this.segmentValue = segmentValue;
    return this;
  }

   /**
   * Get segmentValue
   * @return segmentValue
  **/
  @javax.annotation.Nullable

  public Integer getSegmentValue() {
    return segmentValue;
  }


  public void setSegmentValue(Integer segmentValue) {
    this.segmentValue = segmentValue;
  }


  public IPAddressSegment ipv6(Boolean ipv6) {
    
    this.ipv6 = ipv6;
    return this;
  }

   /**
   * Get ipv6
   * @return ipv6
  **/
  @javax.annotation.Nullable

  public Boolean getIpv6() {
    return ipv6;
  }


  public void setIpv6(Boolean ipv6) {
    this.ipv6 = ipv6;
  }


  public IPAddressSegment maxValue(Long maxValue) {
    
    this.maxValue = maxValue;
    return this;
  }

   /**
   * Get maxValue
   * @return maxValue
  **/
  @javax.annotation.Nullable

  public Long getMaxValue() {
    return maxValue;
  }


  public void setMaxValue(Long maxValue) {
    this.maxValue = maxValue;
  }


  public IPAddressSegment multiple(Boolean multiple) {
    
    this.multiple = multiple;
    return this;
  }

   /**
   * Get multiple
   * @return multiple
  **/
  @javax.annotation.Nullable

  public Boolean getMultiple() {
    return multiple;
  }


  public void setMultiple(Boolean multiple) {
    this.multiple = multiple;
  }


  public IPAddressSegment maxSegmentValue(Integer maxSegmentValue) {
    
    this.maxSegmentValue = maxSegmentValue;
    return this;
  }

   /**
   * Get maxSegmentValue
   * @return maxSegmentValue
  **/
  @javax.annotation.Nullable

  public Integer getMaxSegmentValue() {
    return maxSegmentValue;
  }


  public void setMaxSegmentValue(Integer maxSegmentValue) {
    this.maxSegmentValue = maxSegmentValue;
  }


  public IPAddressSegment bytes(List<byte[]> bytes) {
    
    this.bytes = bytes;
    return this;
  }

  public IPAddressSegment addBytesItem(byte[] bytesItem) {
    if (this.bytes == null) {
      this.bytes = new ArrayList<>();
    }
    this.bytes.add(bytesItem);
    return this;
  }

   /**
   * Get bytes
   * @return bytes
  **/
  @javax.annotation.Nullable

  public List<byte[]> getBytes() {
    return bytes;
  }


  public void setBytes(List<byte[]> bytes) {
    this.bytes = bytes;
  }


  public IPAddressSegment zero(Boolean zero) {
    
    this.zero = zero;
    return this;
  }

   /**
   * Get zero
   * @return zero
  **/
  @javax.annotation.Nullable

  public Boolean getZero() {
    return zero;
  }


  public void setZero(Boolean zero) {
    this.zero = zero;
  }


  public IPAddressSegment byteCount(Integer byteCount) {
    
    this.byteCount = byteCount;
    return this;
  }

   /**
   * Get byteCount
   * @return byteCount
  **/
  @javax.annotation.Nullable

  public Integer getByteCount() {
    return byteCount;
  }


  public void setByteCount(Integer byteCount) {
    this.byteCount = byteCount;
  }


  public IPAddressSegment bitCount(Integer bitCount) {
    
    this.bitCount = bitCount;
    return this;
  }

   /**
   * Get bitCount
   * @return bitCount
  **/
  @javax.annotation.Nullable

  public Integer getBitCount() {
    return bitCount;
  }


  public void setBitCount(Integer bitCount) {
    this.bitCount = bitCount;
  }


  public IPAddressSegment prefixLengthForSingleBlock(Integer prefixLengthForSingleBlock) {
    
    this.prefixLengthForSingleBlock = prefixLengthForSingleBlock;
    return this;
  }

   /**
   * Get prefixLengthForSingleBlock
   * @return prefixLengthForSingleBlock
  **/
  @javax.annotation.Nullable

  public Integer getPrefixLengthForSingleBlock() {
    return prefixLengthForSingleBlock;
  }


  public void setPrefixLengthForSingleBlock(Integer prefixLengthForSingleBlock) {
    this.prefixLengthForSingleBlock = prefixLengthForSingleBlock;
  }


  public IPAddressSegment fullRange(Boolean fullRange) {
    
    this.fullRange = fullRange;
    return this;
  }

   /**
   * Get fullRange
   * @return fullRange
  **/
  @javax.annotation.Nullable

  public Boolean getFullRange() {
    return fullRange;
  }


  public void setFullRange(Boolean fullRange) {
    this.fullRange = fullRange;
  }


  public IPAddressSegment max(Boolean max) {
    
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @javax.annotation.Nullable

  public Boolean getMax() {
    return max;
  }


  public void setMax(Boolean max) {
    this.max = max;
  }


  public IPAddressSegment string(String string) {
    
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @javax.annotation.Nullable

  public String getString() {
    return string;
  }


  public void setString(String string) {
    this.string = string;
  }


  public IPAddressSegment divisionPrefixLength(Integer divisionPrefixLength) {
    
    this.divisionPrefixLength = divisionPrefixLength;
    return this;
  }

   /**
   * Get divisionPrefixLength
   * @return divisionPrefixLength
  **/
  @javax.annotation.Nullable

  public Integer getDivisionPrefixLength() {
    return divisionPrefixLength;
  }


  public void setDivisionPrefixLength(Integer divisionPrefixLength) {
    this.divisionPrefixLength = divisionPrefixLength;
  }


  public IPAddressSegment wildcardString(String wildcardString) {
    
    this.wildcardString = wildcardString;
    return this;
  }

   /**
   * Get wildcardString
   * @return wildcardString
  **/
  @javax.annotation.Nullable

  public String getWildcardString() {
    return wildcardString;
  }


  public void setWildcardString(String wildcardString) {
    this.wildcardString = wildcardString;
  }


  public IPAddressSegment prefixed(Boolean prefixed) {
    
    this.prefixed = prefixed;
    return this;
  }

   /**
   * Get prefixed
   * @return prefixed
  **/
  @javax.annotation.Nullable

  public Boolean getPrefixed() {
    return prefixed;
  }


  public void setPrefixed(Boolean prefixed) {
    this.prefixed = prefixed;
  }


  public IPAddressSegment singlePrefixBlock(Boolean singlePrefixBlock) {
    
    this.singlePrefixBlock = singlePrefixBlock;
    return this;
  }

   /**
   * Get singlePrefixBlock
   * @return singlePrefixBlock
  **/
  @javax.annotation.Nullable

  public Boolean getSinglePrefixBlock() {
    return singlePrefixBlock;
  }


  public void setSinglePrefixBlock(Boolean singlePrefixBlock) {
    this.singlePrefixBlock = singlePrefixBlock;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAddressSegment ipAddressSegment = (IPAddressSegment) o;
    return Objects.equals(this.upperBytes, ipAddressSegment.upperBytes) &&
        Objects.equals(this.value, ipAddressSegment.value) &&
        Objects.equals(this.upperValue, ipAddressSegment.upperValue) &&
        Objects.equals(this.count, ipAddressSegment.count) &&
        Objects.equals(this.lower, ipAddressSegment.lower) &&
        Objects.equals(this.upper, ipAddressSegment.upper) &&
        Objects.equals(this.upperSegmentValue, ipAddressSegment.upperSegmentValue) &&
        Objects.equals(this.upperDivisionValue, ipAddressSegment.upperDivisionValue) &&
        Objects.equals(this.divisionValue, ipAddressSegment.divisionValue) &&
        Objects.equals(this.valueCount, ipAddressSegment.valueCount) &&
        Objects.equals(this.prefixValueCount, ipAddressSegment.prefixValueCount) &&
        Objects.equals(this.ipv4, ipAddressSegment.ipv4) &&
        Objects.equals(this.network, ipAddressSegment.network) &&
        Objects.equals(this.iterable, ipAddressSegment.iterable) &&
        Objects.equals(this.ipversion, ipAddressSegment.ipversion) &&
        Objects.equals(this.prefixBlock, ipAddressSegment.prefixBlock) &&
        Objects.equals(this.segmentPrefixLength, ipAddressSegment.segmentPrefixLength) &&
        Objects.equals(this.minPrefixLengthForBlock, ipAddressSegment.minPrefixLengthForBlock) &&
        Objects.equals(this.segmentValue, ipAddressSegment.segmentValue) &&
        Objects.equals(this.ipv6, ipAddressSegment.ipv6) &&
        Objects.equals(this.maxValue, ipAddressSegment.maxValue) &&
        Objects.equals(this.multiple, ipAddressSegment.multiple) &&
        Objects.equals(this.maxSegmentValue, ipAddressSegment.maxSegmentValue) &&
        Objects.equals(this.bytes, ipAddressSegment.bytes) &&
        Objects.equals(this.zero, ipAddressSegment.zero) &&
        Objects.equals(this.byteCount, ipAddressSegment.byteCount) &&
        Objects.equals(this.bitCount, ipAddressSegment.bitCount) &&
        Objects.equals(this.prefixLengthForSingleBlock, ipAddressSegment.prefixLengthForSingleBlock) &&
        Objects.equals(this.fullRange, ipAddressSegment.fullRange) &&
        Objects.equals(this.max, ipAddressSegment.max) &&
        Objects.equals(this.string, ipAddressSegment.string) &&
        Objects.equals(this.divisionPrefixLength, ipAddressSegment.divisionPrefixLength) &&
        Objects.equals(this.wildcardString, ipAddressSegment.wildcardString) &&
        Objects.equals(this.prefixed, ipAddressSegment.prefixed) &&
        Objects.equals(this.singlePrefixBlock, ipAddressSegment.singlePrefixBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upperBytes, value, upperValue, count, lower, upper, upperSegmentValue, upperDivisionValue, divisionValue, valueCount, prefixValueCount, ipv4, network, iterable, ipversion, prefixBlock, segmentPrefixLength, minPrefixLengthForBlock, segmentValue, ipv6, maxValue, multiple, maxSegmentValue, bytes, zero, byteCount, bitCount, prefixLengthForSingleBlock, fullRange, max, string, divisionPrefixLength, wildcardString, prefixed, singlePrefixBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddressSegment {\n");
    sb.append("    upperBytes: ").append(toIndentedString(upperBytes)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    upperValue: ").append(toIndentedString(upperValue)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    lower: ").append(toIndentedString(lower)).append("\n");
    sb.append("    upper: ").append(toIndentedString(upper)).append("\n");
    sb.append("    upperSegmentValue: ").append(toIndentedString(upperSegmentValue)).append("\n");
    sb.append("    upperDivisionValue: ").append(toIndentedString(upperDivisionValue)).append("\n");
    sb.append("    divisionValue: ").append(toIndentedString(divisionValue)).append("\n");
    sb.append("    valueCount: ").append(toIndentedString(valueCount)).append("\n");
    sb.append("    prefixValueCount: ").append(toIndentedString(prefixValueCount)).append("\n");
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    iterable: ").append(toIndentedString(iterable)).append("\n");
    sb.append("    ipversion: ").append(toIndentedString(ipversion)).append("\n");
    sb.append("    prefixBlock: ").append(toIndentedString(prefixBlock)).append("\n");
    sb.append("    segmentPrefixLength: ").append(toIndentedString(segmentPrefixLength)).append("\n");
    sb.append("    minPrefixLengthForBlock: ").append(toIndentedString(minPrefixLengthForBlock)).append("\n");
    sb.append("    segmentValue: ").append(toIndentedString(segmentValue)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
    sb.append("    maxSegmentValue: ").append(toIndentedString(maxSegmentValue)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    zero: ").append(toIndentedString(zero)).append("\n");
    sb.append("    byteCount: ").append(toIndentedString(byteCount)).append("\n");
    sb.append("    bitCount: ").append(toIndentedString(bitCount)).append("\n");
    sb.append("    prefixLengthForSingleBlock: ").append(toIndentedString(prefixLengthForSingleBlock)).append("\n");
    sb.append("    fullRange: ").append(toIndentedString(fullRange)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    divisionPrefixLength: ").append(toIndentedString(divisionPrefixLength)).append("\n");
    sb.append("    wildcardString: ").append(toIndentedString(wildcardString)).append("\n");
    sb.append("    prefixed: ").append(toIndentedString(prefixed)).append("\n");
    sb.append("    singlePrefixBlock: ").append(toIndentedString(singlePrefixBlock)).append("\n");
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
    openapiFields.add("upperBytes");
    openapiFields.add("value");
    openapiFields.add("upperValue");
    openapiFields.add("count");
    openapiFields.add("lower");
    openapiFields.add("upper");
    openapiFields.add("upperSegmentValue");
    openapiFields.add("upperDivisionValue");
    openapiFields.add("divisionValue");
    openapiFields.add("valueCount");
    openapiFields.add("prefixValueCount");
    openapiFields.add("ipv4");
    openapiFields.add("network");
    openapiFields.add("iterable");
    openapiFields.add("ipversion");
    openapiFields.add("prefixBlock");
    openapiFields.add("segmentPrefixLength");
    openapiFields.add("minPrefixLengthForBlock");
    openapiFields.add("segmentValue");
    openapiFields.add("ipv6");
    openapiFields.add("maxValue");
    openapiFields.add("multiple");
    openapiFields.add("maxSegmentValue");
    openapiFields.add("bytes");
    openapiFields.add("zero");
    openapiFields.add("byteCount");
    openapiFields.add("bitCount");
    openapiFields.add("prefixLengthForSingleBlock");
    openapiFields.add("fullRange");
    openapiFields.add("max");
    openapiFields.add("string");
    openapiFields.add("divisionPrefixLength");
    openapiFields.add("wildcardString");
    openapiFields.add("prefixed");
    openapiFields.add("singlePrefixBlock");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IPAddressSegment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IPAddressSegment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IPAddressSegment is not found in the empty JSON string", IPAddressSegment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IPAddressSegment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IPAddressSegment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("upperBytes") != null && !jsonObj.get("upperBytes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `upperBytes` to be an array in the JSON string but got `%s`", jsonObj.get("upperBytes").toString()));
      }
      // validate the optional field `lower`
      if (jsonObj.get("lower") != null && !jsonObj.get("lower").isJsonNull()) {
        IPAddressSegment.validateJsonObject(jsonObj.getAsJsonObject("lower"));
      }
      // validate the optional field `upper`
      if (jsonObj.get("upper") != null && !jsonObj.get("upper").isJsonNull()) {
        IPAddressSegment.validateJsonObject(jsonObj.getAsJsonObject("upper"));
      }
      // validate the optional field `network`
      if (jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) {
        IPAddressNetworkObjectObjectObjectObjectObject.validateJsonObject(jsonObj.getAsJsonObject("network"));
      }
      if ((jsonObj.get("ipversion") != null && !jsonObj.get("ipversion").isJsonNull()) && !jsonObj.get("ipversion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipversion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipversion").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bytes") != null && !jsonObj.get("bytes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytes` to be an array in the JSON string but got `%s`", jsonObj.get("bytes").toString()));
      }
      if ((jsonObj.get("string") != null && !jsonObj.get("string").isJsonNull()) && !jsonObj.get("string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string").toString()));
      }
      if ((jsonObj.get("wildcardString") != null && !jsonObj.get("wildcardString").isJsonNull()) && !jsonObj.get("wildcardString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wildcardString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wildcardString").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IPAddressSegment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IPAddressSegment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IPAddressSegment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IPAddressSegment.class));

       return (TypeAdapter<T>) new TypeAdapter<IPAddressSegment>() {
           @Override
           public void write(JsonWriter out, IPAddressSegment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IPAddressSegment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IPAddressSegment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IPAddressSegment
  * @throws IOException if the JSON string is invalid with respect to IPAddressSegment
  */
  public static IPAddressSegment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IPAddressSegment.class);
  }

 /**
  * Convert an instance of IPAddressSegment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

