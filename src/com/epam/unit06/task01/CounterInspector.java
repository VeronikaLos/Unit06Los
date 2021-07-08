package com.epam.unit06.task01;

public class CounterInspector {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Counter counter1 = new Counter(20, 50);

        System.out.println("Counter default min and max values = " + counter.getMinValue() + " and " + counter.getMaxValue());
        System.out.println("\nCounter fix Min value = " + counter1.getMinValue());
        System.out.println("Counter fix Max value = " + counter1.getMaxValue());

        counter1.increase();
        counter1.decrease();

        System.out.println("\nCurrent value = min value + 1 = " + counter1.getValueIncrease());
        System.out.println("Current value = max value - 1 = " + counter1.getValueDecrease());

    }
}
