public class Timer implements Runnable {

    –°hronometer chronometer;

    Timer(–°hronometer chronometer) {
        this.chronometer = chronometer;
    }

    @Override
    public void run() {
        while (!Main.stop){
            chronometer.timer();
        }

    }
}
