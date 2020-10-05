public class Cat extends Animals {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    void doRun(int length) {
        boolean b;
        if (length <= 200) {
            b = true;
        } else b = false;
        showResult(name,"." +
                "doRun",b,length);
    }


    @Override
    void doJumpLet(double height) {
        boolean b;
        if (height <= 2.0) {
            b = true;
        } else b = false;
        showResult(name, ".doJumpLet",b,height);
    }
}
