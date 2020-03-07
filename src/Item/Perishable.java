package Item;

public class Perishable implements Type {
    @Override
    public int returnType() {
        return 1;
    }

    public int returnWeight(){
        return 3;
    }

    @Override
    public String toString() {
        return "Perishable";
    }
}
