import Item.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Profile implements Serializable {
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

    public void addIngredient(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingredient name: ");
        String name = input.next();

        System.out.print("Quantity: ");
        int quantity = input.nextInt();

        System.out.flush();
        System.out.print("Unit of Measurement: ");
        String unit = input.next();

        typeMenu();
        System.out.print("Select one: ");
        int selection = input.nextInt();

        switch (selection){
            case 1:
                ingredients.add(new Item(name, quantity, unit, new Perishable()));
                break;
            case 2:
                ingredients.add(new Item(name, quantity, unit, new NonPerishable()));
                break;
            case 3:
                ingredients.add(new Item(name, quantity, unit, new Seasoning()));
                break;
        }
    }

    public void addAllergen(){
        Scanner input = new Scanner(System.in);
        System.out.print("Allergen name: ");
        String name = input.nextLine();
        allergens.add(new Item(name));
    }

    private void typeMenu(){
        System.out.println("1. Perishable");
        System.out.println("2. Non-perishable");
        System.out.println("3. Seasoning");
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                ingredients.toString() + "\n" +
                allergens.toString() + "\n";
    }
}
