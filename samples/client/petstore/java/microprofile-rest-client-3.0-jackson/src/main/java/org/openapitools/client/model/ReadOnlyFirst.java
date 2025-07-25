/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonPropertyOrder({
  ReadOnlyFirst.JSON_PROPERTY_BAR,
  ReadOnlyFirst.JSON_PROPERTY_BAZ
})

public class ReadOnlyFirst  {
  
  public static final String JSON_PROPERTY_BAR = "bar";
  
  private String bar;

  public static final String JSON_PROPERTY_BAZ = "baz";
  
  private String baz;


  public ReadOnlyFirst() {
  }

 @JsonCreator
  public ReadOnlyFirst(
    @JsonProperty(value = JSON_PROPERTY_BAR) String bar
  ) {
    this.bar = bar;
  }
  
  /**
   * Get bar
   * @return bar
   **/
  @JsonProperty(JSON_PROPERTY_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBar() {
    return bar;
  }


  /**
   * Get baz
   * @return baz
   **/
  @JsonProperty(JSON_PROPERTY_BAZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBaz() {
    return baz;
  }

  /**
   * Set baz
   */
  @JsonProperty(JSON_PROPERTY_BAZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaz(String baz) {
    this.baz = baz;
  }

  public ReadOnlyFirst baz(String baz) {
    this.baz = baz;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadOnlyFirst {\n");
    
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("    baz: ").append(toIndentedString(baz)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

