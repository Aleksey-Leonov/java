public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }


    public void eat(Plate p) {
        System.out.println(name + " собирается покушать");
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " сыт");
        } else {
            System.out.println("Кот не может съесть столько еды! т.к. осталось всего " + p.getFood() + " единиц");
            satiety = false;
            System.out.println(name + " голоден");
        }

    }


}