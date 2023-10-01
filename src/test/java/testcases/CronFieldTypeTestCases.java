package testcases;

import org.example.CronFieldType;

public enum CronFieldTypeTestCases {

    minutes (CronFieldType.minutes,0, 59),
    hours(CronFieldType.hours,0, 23),
    days (CronFieldType.days,1, 31),
    months (CronFieldType.months,1, 12),
    weeks(CronFieldType.weeks, 1, 7);

    public CronFieldType type;
    public int max;
    public int min;

    CronFieldTypeTestCases(CronFieldType type, int min, int max) {
        this.type = type;
        this.min = min;
        this.max = max;
    }
}