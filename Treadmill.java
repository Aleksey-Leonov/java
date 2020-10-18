public class Treadmill implements Run {
    private int lengthTreadmill;

    public Treadmill(int lengthTreadmill) {
        this.lengthTreadmill = lengthTreadmill;
    }

    public int getLengthTreadmill() {
        return lengthTreadmill;
    }

    @Override
    public int doRunTreadmill(int lengthTreadmill) {
        return lengthTreadmill;
    }
}
