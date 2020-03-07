package Item;

public class Seasoning implements Type {

    @Override
    public int returnType() {
        return -1;
    }

    public int returnWeight(){
        return 1;
    }

    @Override
    public String toString() {
        return "Item.Seasoning";
    }
}
