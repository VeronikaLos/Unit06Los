package com.epam.unit06.task02;

public class TimeInspector {
    public static void main(String[] args) {
        Time time = new Time(22, 30, 30);
        time.add(5, 10, 10);

        Time time1 = new Time(5, 10, 30);
        time1.deduct(3, 20, 15);
    }
}
