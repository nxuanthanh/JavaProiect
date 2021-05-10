package JavaOOP;

/**
 *
 * @author Admin
 */
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        setTime(h, m, s);
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        hour = ((h >= 0 && h < 24) ? h : 0);
    }

    public void setMinute(int m) {
        minute = ((m >= 0 && m < 60) ? m : 0);
    }

    public void setSecond(int s) {
        second = ((s >= 0 && s < 60) ? s : 0);
    }

    public String toString() {
        return ((hour == 12 || hour == 0 ? 12 : hour % 12)
                + ":" + (minute < 10 ? "0" : "") + minute
                + ":" + (second < 10 ? "0" : "") + second
                + (hour < 12 ? " AM" : " PM"));
    }

    public void tick() {
        setSecond(second + 1);
        if (second == 0) {
            incrementMinute();
        }
    }

    public void incrementMinute() {
        setMinute(minute + 1);
        if (minute == 0) {
            incrementHour();
        }
    }

    public void incrementHour() {
        setHour(hour + 1);
    }

    public static void main(String[] args) {
        Time A = new Time(7, 0, 0);
        System.out.println("Thoi gian da thiet lap: " + A.toString());
        while (true) {
            System.out.println(A.toString());
            try {
                Thread.sleep(1000);
                A.tick();
            } catch (Exception e) {
            }
        }
    }

}
