import static java.lang.Thread.sleep;

public class Сhronometer {
    private int time = 1;

    public synchronized void timer() {
        while (time % 5 == 0 || time % 7 == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Время ссесии: " + time + " секунд");
        time++;
        notifyAll();
    }

    public synchronized void message() {
        while (time % 5 != 0 && time % 7 != 0) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Прошло " + time + " секунд");
        time++;
        notifyAll();
    }
}
