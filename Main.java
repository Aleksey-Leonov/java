import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber;
        Scanner scanner = new Scanner(System.in);
        int attempt = 3;
        int answer;
        boolean play = true;

        while (play) {
            randomNumber = random.nextInt(10);

            while (attempt > 0) {

                System.out.println("Отадайте число от 1 до 9");
                answer = scanner.nextInt();

                if (answer == randomNumber) {
                    System.out.println("Поздравляем вы победили");
                    break;
                } else if (answer < randomNumber) {
                    System.out.println("Загаданное число больше");
                } else if (answer > randomNumber) {
                    System.out.println("Загаданное число меньше");
                }
                attempt = attempt - 1;
                if (attempt == 0) {
                    System.out.println("Вы проиграли");
                    break;
                }
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
            answer = scanner.nextInt();
            if (answer == 1) {
                attempt = 3;
            } else if (answer == 0) {
                play = false;
            }
        }


    }
}

