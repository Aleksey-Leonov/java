import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class GasPool {
    private final ReentrantReadWriteLock reentrantLock = new ReentrantReadWriteLock();
    private final float maxFuel = 200f;
    private float size = 200F;

    public float request(float amount) {
        reentrantLock.writeLock().lock();
        if (amount > size) {
            return 0F;
        }
        try {
            Thread.sleep(1500);
            size -= amount;
            return amount;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {

            reentrantLock.writeLock().unlock();
        }
        return 0f;
    }

    @Override
    public String toString() {
        return "GasPool{" +
                "maxFuel=" + maxFuel +
                ", size=" + size +
                '}';
    }
}
