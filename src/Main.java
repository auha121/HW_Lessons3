import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        box1.addFruitMass(new Apple(1));
        box1.addFruitMass(new Apple(1));
        box1.addFruitMass(new Apple(1));
        box1.addFruitMass(new Apple(1));
        System.out.println("Bec коробки box1 = " + box1.getWeight());
        System.out.println(box1.getFruitMass());
        System.out.println();

        Box<Orange> box2 = new Box<>();
        box2.addFruitMass(new Orange(1.5f));
        box2.addFruitMass(new Orange(1.5f));
        box2.addFruitMass(new Orange(1.5f));
        System.out.println("Bec коробки box2 = " + box2.getWeight());
        System.out.println(box2.getFruitMass().toString());
        System.out.println();

        System.out.println("Равенство коробок box1 и box2: " + box1.compare(box2));
        System.out.println();

        Box<Apple> box3 = new Box<>();
        box3.addFruitMass(new Apple(1));
        box3.addFruitMass(new Apple(1));
        box3.addFruitMass(new Apple(1));
        System.out.println("Bec коробки box3 = " + box3.getWeight());
        System.out.println(box3.getFruitMass());
        System.out.println();


        box3.pourOver(box1);
        System.out.println("Коробка box3 " + box3.getFruitMass());
        System.out.println("Коробка box1 " + box1.getFruitMass());

    }
}
