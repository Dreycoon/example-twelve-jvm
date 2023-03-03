public class Message implements Runnable{

    Сhronometer chronometer;

    Message(Сhronometer chronometer) {
        this.chronometer = chronometer;
    }

    @Override
    public void run() {
        while (!Main.stop){
            chronometer.message();
        }

    }
}
