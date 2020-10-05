public class Dog extends Animals {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    void doRun(int length) {
        boolean b;
        if (length <= 500) {
            b = true;
        } else b = false;
        showResult(name,".doRun", b, length);
    }


    @Override
    void doJumpLet(double height) {
        boolean b;
        if (height <= 0.5) {
            b = true;
        } else b = false;
        showResult(name,".doJumpLet", b, height);
    }


    void swim(int length) {
        boolean b;
        if (length <= 10) {
            b = true;
        } else b = false;
        showResult(name,".swim", b, length);
    }
}
