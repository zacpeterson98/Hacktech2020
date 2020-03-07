/*
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 80,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: david@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.spoonacular.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * InlineObject6
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-19T16:36:49.460+01:00[Europe/Berlin]")
public class InlineObject6 {
  public static final String SERIALIZED_NAME_INGREDIENT_LIST = "ingredientList";
  @SerializedName(SERIALIZED_NAME_INGREDIENT_LIST)
  private String ingredientList;

  public static final String SERIALIZED_NAME_SERVINGS = "servings";
  @SerializedName(SERIALIZED_NAME_SERVINGS)
  private BigDecimal servings;

  public static final String SERIALIZED_NAME_INCLUDE_NUTRITION = "includeNutrition";
  @SerializedName(SERIALIZED_NAME_INCLUDE_NUTRITION)
  private Boolean includeNutrition;

  public InlineObject6 ingredientList(String ingredientList) {
    this.ingredientList = ingredientList;
    return this;
  }

   /**
   * The ingredient list of the recipe, one ingredient per line.
   * @return ingredientList
  **/
  @ApiModelProperty(example = "3 oz pork shoulder", required = true, value = "The ingredient list of the recipe, one ingredient per line.")
  public String getIngredientList() {
    return ingredientList;
  }

  public void setIngredientList(String ingredientList) {
    this.ingredientList = ingredientList;
  }

  public InlineObject6 servings(BigDecimal servings) {
    this.servings = servings;
    return this;
  }

   /**
   * The number of servings that you can make from the ingredients.
   * @return servings
  **/
  @ApiModelProperty(example = "2", required = true, value = "The number of servings that you can make from the ingredients.")
  public BigDecimal getServings() {
    return servings;
  }

  public void setServings(BigDecimal servings) {
    this.servings = servings;
  }

  public InlineObject6 includeNutrition(Boolean includeNutrition) {
    this.includeNutrition = includeNutrition;
    return this;
  }

   /**
   * Whether nutrition data should be added to correctly parsed ingredients.
   * @return includeNutrition
  **/
  @ApiModelProperty(example = "false", value = "Whether nutrition data should be added to correctly parsed ingredients.")
  public Boolean getIncludeNutrition() {
    return includeNutrition;
  }

  public void setIncludeNutrition(Boolean includeNutrition) {
    this.includeNutrition = includeNutrition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject6 inlineObject6 = (InlineObject6) o;
    return Objects.equals(this.ingredientList, inlineObject6.ingredientList) &&
        Objects.equals(this.servings, inlineObject6.servings) &&
        Objects.equals(this.includeNutrition, inlineObject6.includeNutrition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingredientList, servings, includeNutrition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject6 {\n");
    sb.append("    ingredientList: ").append(toIndentedString(ingredientList)).append("\n");
    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
    sb.append("    includeNutrition: ").append(toIndentedString(includeNutrition)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

