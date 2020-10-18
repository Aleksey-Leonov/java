public class Main {

    public static void main(String[] args) {
        Specifications[] participant = {new Cat(1030, 3, "Барсик"),
                new Robot(10000, 5, "Терминатор"),
                new Human(1600, 1.3, "Василий")};

        Obstacles[] obstacles = {new Treadmill(2000), new Wall(1.2)};


        for (int i = 0; i < participant.length ; i++) {
            participant[i].doRun((Treadmill) obstacles[0]);
            participant[i].doJump((Wall) obstacles[1]);
        }

    }
}

