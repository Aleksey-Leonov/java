import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void add(T fruit){
        fruits.add(fruit);
    }

    public void moveTo (Box<T> otherBox){
    fruits.forEach(fruit -> otherBox.add(fruit));
    }

    public boolean compare(Box<? extends Fruit> otherBox){
        return otherBox.getWeight() == getWeight();
    }

    public float getWeight(){
        float weight = 0;
       for (Fruit f: fruits){
          weight += f.getWeight();
       }
        return weight;

    }
}

