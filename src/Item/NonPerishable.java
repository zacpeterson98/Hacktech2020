package Item;

public class NonPerishable extends Type {
    @Override
    public int returnType() {
        return 0;
    }

    public int returnWeight(){
        return 2;
    }

    @Override
    public String toString() {
        return "Non-Perishable";
    }
}
