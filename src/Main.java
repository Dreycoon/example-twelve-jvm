import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Main {

    static boolean stop = false;
    public static void main(String[] args) {


        –°hronometer store=new –°hronometer();
        Timer timer = new Timer(store);
        Message message = new Message(store);
        new Thread(timer).start();
        new Thread(message).start();

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        stop = true;

    }
}