package com.epam.unit06.task02;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = validateHour(hour);
        this.minute = validateMinute(minute);
        this.second = validateSecond(second);
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = validateHour(hour);
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = validateMinute(minute);
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = validateSecond(second);
    }

    private int validateHour(int hour) {
        return hour <= 24 && hour >= 0 ? hour : 0;
    }

    private int validateMinute(int minute) {
        return minute <= 60 && minute >= 0 ? minute : 0;
    }

    private int validateSecond(int second) {
        return second <= 60 && second >= 0 ? second : 0;
    }

    private int parseHourToSeconds(int hour) {
        return validateHour(hour) == 0 ? 0 : hour * 60 * 60;
    }

    private int parseMinuteToSeconds(int minute) {
        return validateMinute(minute) == 0 ? 0 : minute * 60;
    }

    public Time deduct(int hour, int minute, int second) {
        System.out.println("\nCurrent time = " + this.hour + "h " + this.minute + "m " + this.second + "s");
        System.out.println("Deduct time = " + hour + "h " + minute + "m " + second + "s");
        int currentTime = parseHourToSeconds(this.hour) + parseMinuteToSeconds(this.minute) + this.second;
        int addTime = parseHourToSeconds(validateHour(hour)) + parseMinuteToSeconds(validateMinute(minute)) + validateSecond(second);
        int commonTime = currentTime - addTime;
        int resultTime = Math.max(commonTime, 0);
        setNewTime(resultTime);
        System.out.println("Result time = " + this.hour + "h " + this.minute + "m " + this.second + "s");
        return this;
    }

    public Time add(int hour, int minute, int second) {
        System.out.println("\nCurrent time = " + this.hour + "h " + this.minute + "m " + this.second + "s");
        System.out.println("Add time = " + hour + "h " + minute + "m " + second + "s");
        int currentTime = parseHourToSeconds(this.hour) + parseMinuteToSeconds(this.minute) + this.second;
        int addTime = parseHourToSeconds(validateHour(hour)) + parseMinuteToSeconds(validateMinute(minute)) + validateSecond(second);
        int commonTime = currentTime + addTime;
        int resultTime = commonTime > 86400 ? commonTime - 86400 : commonTime;
        setNewTime(resultTime);
        System.out.println("Result time = " + this.hour + "h " + this.minute + "m " + this.second + "s");
        return this;
    }

    public void setNewTime(int resultTime) {
        int resultHour = resultTime / (60 * 60);
        int resultMinute = (resultTime - resultHour * 60 * 60) / 60;
        int resultSecond = resultTime - resultHour * 60 * 60 - resultMinute * 60;
        this.hour = resultHour;
        this.minute = resultMinute;
        this.second = resultSecond;
    }

}
