public class Timer implements Runnable {

    Сhronometer chronometer;

    Timer(Сhronometer chronometer) {
        this.chronometer = chronometer;
    }

    @Override
    public void run() {
        while (!Main.stop){
            chronometer.timer();
        }

    }
}
