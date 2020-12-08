public class Car implements Runnable{
    private final float capasity = 20f;
    private float volume = 20f;
    private float fuelConsumption = 2.5f;
    private String licencePlate;
    private FuelStation fuelStation;

    public Car(String licencePlate, FuelStation fuelStation) {
        this.licencePlate = licencePlate;
        this.fuelStation = fuelStation;
    }

    public void drive () {
        System.out.println(String.format("is on the road" + " " + licencePlate));
        try {
           while (volume > 3){
               Thread.sleep(3000);
               volume -= fuelConsumption;
               System.out.println(String.format("remaining fuel..." + " " + licencePlate+ " " + volume));
           }
            float refuel = fuelStation.refuel(capasity - volume);
           if (refuel == 0F){
               System.out.println(String.format("is stuck without fuel ..." + " " +  licencePlate));
               return;
           }
           volume += refuel;

            System.out.println(String.format("fuel is not" + " " + licencePlate +" " + volume));

        } catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        drive();
    }
}
