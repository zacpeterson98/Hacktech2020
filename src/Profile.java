import Item.Item;

import java.util.ArrayList;

public class Profile {
    private String name;
    private ArrayList<Item> ingredients;
    private ArrayList<Item> allergens;
    //TODO: Add a list of previously used recipes

    public Profile(String name, ArrayList<Item> ingredients, ArrayList<Item> allergens){
        this.name = name;
        this.ingredients = ingredients;
        this.allergens = allergens;
    }

    public Profile(String name){
        this(name, new ArrayList<Item>(), new ArrayList<Item>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getIngredients() {
        return ingredients;
    }

    public ArrayList<Item> getAllergens() {
        return allergens;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                ingredients.toString() + "\n" +
                allergens.toString() + "\n";
    }
}
