public class Human implements Specifications {
    private int maxRunLength;
    private double maxJumpHeight;
    private String name;

    public Human(int maxRunLength, double maxJumpHeight, String name) {
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
        this.name = name;
    }

    @Override
    public void doRun(Treadmill treadmill) {
        if (treadmill.doRunTreadmill(treadmill.getLengthTreadmill()) <= maxRunLength) {
            System.out.println(name + " успешно пробежал дорожку ");
        }
        else System.out.println(name +" может пробежать только "+ maxRunLength + " м, Неудача." );
    }

    @Override
    public void doJump(Wall wall) {
        if (wall.doJumpWall(wall.getHeightWall())<maxJumpHeight)  {
            System.out.println(name + " успешно перепрыгивает препятствие. ");
        }
        else System.out.println("Неудача, " + name + " может прыгнуть только " + maxJumpHeight + " м");
    }
}
