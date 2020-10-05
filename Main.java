public class Main {

    public static void main(String[] args) {
        Animals cat1 = new Cat("cat1");
        Dog dog1 = new Dog("dog1");

        cat1.doJumpLet(10);
        cat1.doRun(200);
        dog1.swim(11);
        dog1.doRun(450);
        dog1.doJumpLet(0.5);


    }
}
