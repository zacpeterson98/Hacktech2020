import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import java.util.*;
import com.spoonacular.client.ApiException;
import java.math.BigDecimal;
import java.io.File;
import com.spoonacular.client.model.InlineObject8;


public class Parser {
    private final static com.spoonacular.DefaultApi api = new com.spoonacular.DefaultApi();
    private final static String requestString = "https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/find" +
            "ByIngredients?number=5&ranking=1&ingredients=";


    public static void getRecipes(String[] ingredients) {
        BigDecimal number = BigDecimal.ONE;
        boolean limitLicense = true;
        BigDecimal ranking = BigDecimal.ONE;
        boolean ignorePantry = false;

        for(int i = 0; i < ingredients.length; ++i) {
            Object response = null;
            try {
                response = api.searchRecipesByIngredients(ingredients[i], number, limitLicense, ranking, ignorePantry);
            } catch (ApiException e) {
                e.printStackTrace();
            }
            System.out.println(response);
        }
    }


}
