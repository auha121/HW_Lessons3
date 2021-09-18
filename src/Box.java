import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruitMass = new ArrayList<>();

    public Box() {
    }

    public ArrayList<T> getFruitMass() {
        return fruitMass;
    }

    public void setFruitMass(ArrayList<T> fruitMass) {
        this.fruitMass = fruitMass;
    }

    public float getWeight() {
        return fruitMass.size() * fruitMass.get(0).getWeight();
    }

    public boolean compare(Box<?> o) {
        return getWeight() - o.getWeight() == 0;
    }

    public void pourOver(Box<T> box) {
        box.getFruitMass().addAll(fruitMass);
        fruitMass.clear();
    }

    public void addFruitMass(T Fruit) {
        fruitMass.add(Fruit);
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitMass =" + fruitMass +
                '}';
    }
}
