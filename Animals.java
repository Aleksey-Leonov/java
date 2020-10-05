public abstract class Animals {


    abstract void doRun(int length);

    abstract void doJumpLet(double height);

    void showResult(String name, String methodName, boolean b, int value) {
        System.out.println(name + methodName + " : " + value + " " + b);
    }

    void showResult(String name, String methodName, boolean b, double value) {
        System.out.println(name  + methodName + " : " + value + " " + b);
    }



}
