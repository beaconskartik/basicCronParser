package org.example;

public enum CronFieldType {

    minutes (0, 59),
    hours(0, 23),
    days (1, 31),
    months (1, 12),
    weeks(1, 7);
    public int max;
    public int min;

    CronFieldType(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
