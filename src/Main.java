import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Main {

    static boolean stop = false;
    public static void main(String[] args) {


        Thread timer = new Thread(){
            @Override
            public void run() {
                    long startTime = System.currentTimeMillis();
                    while (!stop){
                        long timeSession = (System.currentTimeMillis() - startTime);
                        long timeSessionSecond = TimeUnit.MILLISECONDS.toSeconds(timeSession);
                        System.out.println("Время ссесии: " + timeSessionSecond + " секунд");

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }

            }
        };

        Thread message = new Thread(){

            @Override
            public void run() {
                int count = 0;
                while (!stop){
                    if (count % 5 == 0 && count != 0){
                        System.out.println("Прошло " + count + " секунд");
                    }
                    count++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }


                }
            }
        };

        timer.start();
        message.start();


        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        stop = true;


    }
}