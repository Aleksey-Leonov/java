import java.util.Scanner;

public class Plate {
    private int food;
    private Scanner scanner = new Scanner(System.in);

    public Plate(int food) {
        this.food = food;
    }

    public void addFood() {
        int s;
        System.out.println("Введите количество еды, которое хотите добавить в миску");
        s = scanner.nextInt();
        food = food + s;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }
}

