package com.epam.unit06.task01;

public class Counter {
    private int minValue;
    private int maxValue;
    private int value1;
    private int value2;

    public Counter() {
    }

    public Counter(int _minValue, int _maxValue) {
        if (_minValue >= _maxValue) {
            throw new RuntimeException("Invalid parameters for the counter.");
        }
        minValue = _minValue;
        maxValue = _maxValue;
    }


    public int increase() {
        int increseValue = minValue + 1;
        if (increseValue <= maxValue) {
            value1 = increseValue;
        } else {
            throw new RuntimeException("Invalid parameters for the counter.");
        }
        return value1;
    }

    public int decrease() {
        int decreaseValue = maxValue - 1;
        if (decreaseValue >= minValue) {
            value2 = decreaseValue;
        } else {
            throw new RuntimeException("Invalid parameters for the counter.");
        }
        return value2;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getValueIncrease() {
        return value1;
    }

    public int getValueDecrease() {
        return value2;
    }

}
