public class Time {
    private int minutes;
    private int seconds;
    private int hours;

    public void Time(int min, int sec, int hr) {
        minutes = min;
        seconds = sec;
        hours = hr;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int min) {
        minutes = min;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hr) {
        hours = hr;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int sec) {
        seconds = sec;
    }

}
