package lab3.task5;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid time.");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    @Override
    public int compareTo(Time other) {
        return Integer.compare(this.toSeconds(), other.toSeconds());
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
