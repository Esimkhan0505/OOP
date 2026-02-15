package Prac2;



public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // если хочешь как в примере new Time(23,5,6) — всё ок
    // invalid input -> ставим 0:0:0
    public void setTime(int hour, int minute, int second) {
        if (isValid(hour, minute, second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    private boolean isValid(int h, int m, int s) {
        return (h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int h = hour % 12;
        if (h == 0) h = 12;
        String ampm = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", h, minute, second, ampm);
    }

    // instance method add (как в примере)
    public void add(Time other) {
        int totalSeconds = this.second + other.second;
        int carryMin = totalSeconds / 60;
        this.second = totalSeconds % 60;

        int totalMinutes = this.minute + other.minute + carryMin;
        int carryHour = totalMinutes / 60;
        this.minute = totalMinutes % 60;

        int totalHours = this.hour + other.hour + carryHour;
        this.hour = totalHours % 24;
    }

    @Override
    public String toString() {
        return toUniversal();
    }
}
