public class Message implements Runnable{

    –°hronometer chronometer;

    Message(–°hronometer chronometer) {
        this.chronometer = chronometer;
    }

    @Override
    public void run() {
        while (!Main.stop){
            chronometer.message();
        }

    }
}
