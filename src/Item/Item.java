package Item;

public class Item {
    private String name;
    private int quantity;
    private String unit;
    private Type type;

    public Item(String name, int quantity, String unit, Type type){
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.type = type;
    }

    public Item(String name, int quantity, String unit){
        this(name, quantity, unit, null);
    }

    public Item(String name, int quantity){
        this(name, quantity, "lbs");
    }

    public Item(String name){
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getUnit() {
        return unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setUnit(String unit) {
        this.unit = unit;
    }

    private void setType(Type type) {
        this.type = type;
    }

    //TODO: Implement
    public void changeQuantityAndUnits(int quantity, String unit){

    }
}
