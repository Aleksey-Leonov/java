public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        System.out.println(name + " собирается покушать");
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.println("Кот не может съесть столько еды! т.к. осталось всего " + p.getFood() + " единиц");
        }
    }

    public void satietyInfo() {
        if (satiety = true) System.out.println(name + " сытый");
        else System.out.println(name + " голодный");
    }
}
