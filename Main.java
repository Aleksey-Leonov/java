import com.sun.jdi.event.ExceptionEvent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        //Создать три потока, каждый из которых выводит определенну букву (A, B и C) 5 раз (порядок – ABСABСABС).
        // Используйте wait/notify/notifyAll.

        SinhronizedABC abc = new SinhronizedABC();
        Thread t1 = new Thread(abc::printA);
        Thread t2 = new Thread(abc::printB);
        Thread t3 = new Thread(abc::printC);

        ExecutorService executorService = Executors.newFixedThreadPool(3); //управляет множествами потоков
        //указываем 3 потока которые могут работать одновременно.
        executorService.submit(t1); //    добавляем метод
        executorService.submit(t2); //    добавляем метод
        executorService.submit(t3); //    добавляем метод
        executorService.shutdown();  // останавливаем работу сервиса



    }


}
