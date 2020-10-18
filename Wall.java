public class Wall implements Jump {
    private double heightWall;

    public Wall(double heightWall) {
        this.heightWall = heightWall;
    }

    public double getHeightWall() {
        return heightWall;
    }

    @Override
    public double doJumpWall(double heightWall) {
        return heightWall;
    }
}
