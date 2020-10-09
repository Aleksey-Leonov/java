public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 5, false);
        cats[1] = new Cat("Lutik", 6, false);
        cats[2] = new Cat("Monson", 13, false);
        Plate plate = new Plate(0);
        plate.info();
        plate.addFood();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();
            System.out.println();
        }
        plate.info();
        plate.addFood();
        plate.info();
    }

}
