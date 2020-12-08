import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        FuelStation fuelStation = new FuelStation();
        Truck truck1 = new Truck("re184r86",fuelStation );
        Truck truck2 = new Truck("qw123er", fuelStation);
        Truck truck3 = new Truck("re183211d6", fuelStation);
        Truck truck4 = new Truck("rre1241rw", fuelStation);
        Car car1 = new Car("0023f", fuelStation);
        Car car2 = new Car("dsvsd91", fuelStation);
        Car car3 = new Car("fsdv234", fuelStation);
        Bus bus1 = new Bus("afasd141", fuelStation);
        Bus bus2 = new Bus("a55555", fuelStation);
        Bus bus3 = new Bus("777777", fuelStation);

        executorService.submit(truck1);
        executorService.submit(truck2);
        executorService.submit(truck3);
        executorService.submit(truck4);
        executorService.submit(car1);
        executorService.submit(car2);
        executorService.submit(car3);
        executorService.submit(bus1);
        executorService.submit(bus2);
        executorService.submit(bus3);

        executorService.shutdown();




    }
}
