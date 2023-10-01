package testcases;

import org.example.CronFieldType;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum CronFieldValidTestCases {

    // Minutes
    VALID_MINUTE_STAR_INPUT("*", CronFieldType.minutes, IntStream.range(0, 60).mapToObj(String::valueOf).collect(Collectors.joining(" "))),
    VALID_MINUTE_STAR_INCREMENTAL_INPUT("*/5", CronFieldType.minutes, "0 5 10 15 20 25 30 35 40 45 50 55"),
    VALID_MINUTE_STAR_INCREMENTAL_OUT_OF_RANGE_INPUT("*/100", CronFieldType.minutes, "0"),
    VALID_MINUTE_RANGE_INPUT("2-5", CronFieldType.minutes, "2 3 4 5"),
    VALID_MINUTE_COMMA_SORTED_INPUT("2,5,7,9", CronFieldType.minutes, "2 5 7 9"),
    VALID_MINUTE_COMMA_UNSORTED_INPUT("9,3,2,5,7", CronFieldType.minutes, "2 3 5 7 9"),
    VALID_MINUTE_INCREMENTAL_INPUT("2/5", CronFieldType.minutes, "2 7 12 17 22 27 32 37 42 47 52 57"),
    VALID_MINUTE_INPUT("11", CronFieldType.minutes, "11"),

    // Hours
    VALID_HOUR_STAR_INPUT("*", CronFieldType.hours, IntStream.range(0, 24).mapToObj(String::valueOf).collect(Collectors.joining(" "))),
    VALID_HOUR_STAR_INCREMENTAL_INPUT("*/5", CronFieldType.hours, "0 5 10 15 20"),

    VALID_HOUR_STAR_INCREMENTAL_OUT_OF_RANGE_INPUT("*/100", CronFieldType.hours, "0"),
    VALID_HOUR_RANGE_INPUT("2-5", CronFieldType.hours, "2 3 4 5"),
    VALID_HOUR_COMMA_SORTED_INPUT("2,5,7,9", CronFieldType.hours, "2 5 7 9"),
    VALID_HOUR_COMMA_UNSORTED_INPUT("9,3,2,5,7", CronFieldType.hours, "2 3 5 7 9"),
    VALID_HOUR_INCREMENTAL_INPUT("2/5", CronFieldType.hours, "2 7 12 17 22"),
    VALID_HOUR_INPUT("11", CronFieldType.hours, "11"),

    // days
    VALID_DAY_STAR_INPUT("*", CronFieldType.days, IntStream.range(1, 32).mapToObj(String::valueOf).collect(Collectors.joining(" "))),
    VALID_DAY_STAR_INCREMENTAL_INPUT("*/5", CronFieldType.days, "1 6 11 16 21 26 31"),
    VALID_DAY_STAR_INCREMENTAL_OUT_OF_RANGE_INPUT("*/100", CronFieldType.days, "1"),
    VALID_DAY_RANGE_INPUT("2-5", CronFieldType.days, "2 3 4 5"),
    VALID_DAY_COMMA_SORTED_INPUT("2,5,7,9", CronFieldType.days, "2 5 7 9"),
    VALID_DAY_COMMA_UNSORTED_INPUT("9,3,2,5,7", CronFieldType.days, "2 3 5 7 9"),
    VALID_DAY_INCREMENTAL_INPUT("2/5", CronFieldType.days, "2 7 12 17 22 27"),
    VALID_DAY_INPUT("11", CronFieldType.days, "11"),

    // weeks
    VALID_WEEK_STAR_INPUT("*", CronFieldType.weeks, IntStream.range(1, 8).mapToObj(String::valueOf).collect(Collectors.joining(" "))),
    VALID_WEEK_STAR_INCREMENTAL_INPUT("*/5", CronFieldType.weeks, "1 6"),
    VALID_WEEK_STAR_INCREMENTAL_OUT_OF_RANGE_INPUT("*/100", CronFieldType.weeks, "1"),
    VALID_WEEK_RANGE_INPUT("2-5", CronFieldType.weeks, "2 3 4 5"),
    VALID_WEEK_COMMA_SORTED_INPUT("2,5,7", CronFieldType.weeks, "2 5 7"),
    VALID_WEEK_COMMA_UNSORTED_INPUT("3,2,5,7", CronFieldType.weeks, "2 3 5 7"),
    VALID_WEEK_INCREMENTAL_INPUT("2/5", CronFieldType.weeks, "2 7"),
    VALID_WEEK_QUESTION_MARK_INPUT("?", CronFieldType.weeks, "any [1 2 3 4 5 6 7]"),
    VALID_WEEK_INPUT("4", CronFieldType.weeks, "4"),


    // months
    VALID_MONTH_STAR_INPUT("*", CronFieldType.months, IntStream.range(1, 13).mapToObj(String::valueOf).collect(Collectors.joining(" "))),
    VALID_MONTH_STAR_INCREMENTAL_INPUT("*/5", CronFieldType.months, "1 6 11"),
    VALID_MONTH_STAR_INCREMENTAL_OUT_OF_RANGE_INPUT("*/100", CronFieldType.months, "1"),
    VALID_MONTH_RANGE_INPUT("2-5", CronFieldType.months, "2 3 4 5"),
    VALID_MONTH_COMMA_SORTED_INPUT("2,5,7,9", CronFieldType.months, "2 5 7 9"),
    VALID_MONTH_COMMA_UNSORTED_INPUT("9,3,2,5,7", CronFieldType.months, "2 3 5 7 9"),
    VALID_MONTH_INCREMENTAL_INPUT("2/5", CronFieldType.months, "2 7 12"),
    VALID_MONTH_QUESTION_MARK_INPUT("?", CronFieldType.months, "any [1 2 3 4 5 6 7 8 9 10 11 12]"),
    VALID_MONTH_INPUT("11", CronFieldType.months, "11");


    public String input;
    public CronFieldType type;
    public String expectedOutput;

    CronFieldValidTestCases(String input, CronFieldType type, String expectedOutput) {
        this.input = input;
        this.type = type;
        this.expectedOutput = expectedOutput;
    }
}