package testcases;

import org.example.CronFieldType;
import org.example.IllegalCronFieldException;

public enum CronFieldInValidTestCases {

    // Generic
    INVALID_NULL_INPUT(null, CronFieldType.minutes),
    INVALID_NULL_INPUT_AND_TYPE(null, null),
    // Minutes
    INVALID_MINUTE_STAR_INPUT("**", CronFieldType.minutes),
    INVALID_MINUTE_STAR_INCREMENTAL_INPUT("*/*", CronFieldType.minutes),
    INVALID_MINUTE_STAR_RANGE_INPUT("*-*", CronFieldType.minutes),
    INVALID_MINUTE_STAR_COMMA_INPUT("*,*", CronFieldType.minutes),
    INVALID_MINUTE_MULTIPLE_STAR_INCREMENTAL_INPUT("**/5", CronFieldType.minutes),
    INVALID_MINUTE_MULTIPLE_STAR_SPACE_INCREMENTAL_INPUT("* * */5", CronFieldType.minutes),
    INVALID_MINUTE_START_END_RANGE_INPUT("10-4", CronFieldType.minutes),
    INVALID_MINUTE_START_RANGE_INPUT("81-90", CronFieldType.minutes),
    INVALID_MINUTE_RANGE_INPUT("2-80", CronFieldType.minutes),
    INVALID_MINUTE_RANGE_STAR_INPUT("2-*", CronFieldType.minutes),
    INVALID_MINUTE_MULTIPLE_RANGE_INPUT("2--80", CronFieldType.minutes),
    INVALID_MINUTE_MULTIPLE_RANGES_INPUT("2-5 3-5", CronFieldType.minutes),
    INVALID_MINUTE_COMMA_SEPARATED_INPUT("2,5,81,92,100", CronFieldType.minutes),
    INVALID_MINUTE_COMMA_SPACE_INPUT("2,5,7,   9", CronFieldType.minutes),
    INVALID_MINUTE_MULTIPLE_COMMA_INPUT("9,,3,,,2,5,7", CronFieldType.minutes),
    INVALID_MINUTE_INCREMENTAL_INPUT("2//5", CronFieldType.minutes),
    INVALID_MINUTE_QUESTION_MARK_INPUT("?", CronFieldType.minutes),
    INVALID_MINUTE_STAR_QUESTION_MARK_INPUT("*?", CronFieldType.minutes),
    INVALID_MINUTE_INPUT("70", CronFieldType.minutes),

    // hours
    INVALID_HOUR_STAR_INPUT("**", CronFieldType.hours),
    INVALID_HOUR_STAR_INCREMENTAL_INPUT("*/*", CronFieldType.hours),
    INVALID_HOUR_STAR_RANGE_INPUT("*-*", CronFieldType.hours),
    INVALID_HOUR_STAR_COMMA_INPUT("*,*", CronFieldType.hours),
    INVALID_HOUR_MULTIPLE_STAR_INCREMENTAL_INPUT("**/5", CronFieldType.hours),
    INVALID_HOUR_MULTIPLE_STAR_SPACE_INCREMENTAL_INPUT("* * */5", CronFieldType.hours),
    INVALID_HOUR_START_END_RANGE_INPUT("10-4", CronFieldType.hours),
    INVALID_HOUR_START_RANGE_INPUT("81-90", CronFieldType.hours),
    INVALID_HOUR_RANGE_INPUT("2-80", CronFieldType.hours),
    INVALID_HOUR_RANGE_STAR_INPUT("2-*", CronFieldType.hours),
    INVALID_HOUR_MULTIPLE_RANGE_INPUT("2--80", CronFieldType.hours),
    INVALID_HOUR_MULTIPLE_RANGES_INPUT("2-5 3-5", CronFieldType.hours),
    INVALID_HOUR_COMMA_SEPARATED_INPUT("2,5,81,92,100", CronFieldType.hours),
    INVALID_HOUR_COMMA_SPACE_INPUT("2,5,7,   9", CronFieldType.hours),
    INVALID_HOUR_MULTIPLE_COMMA_INPUT("9,,3,,,2,5,7", CronFieldType.hours),
    INVALID_HOUR_INCREMENTAL_INPUT("2//5", CronFieldType.hours),
    INVALID_HOUR_QUESTION_MARK_INPUT("?", CronFieldType.hours),
    INVALID_HOUR_STAR_QUESTION_MARK_INPUT("*?", CronFieldType.hours),
    INVALID_HOUR_INPUT("70", CronFieldType.hours),

    // days
    INVALID_DAY_STAR_INPUT("**", CronFieldType.days),
    INVALID_DAY_STAR_INCREMENTAL_INPUT("*/*", CronFieldType.days),
    INVALID_DAY_STAR_RANGE_INPUT("*-*", CronFieldType.days),
    INVALID_DAY_STAR_COMMA_INPUT("*,*", CronFieldType.days),
    INVALID_DAY_MULTIPLE_STAR_INCREMENTAL_INPUT("**/5", CronFieldType.days),
    INVALID_DAY_MULTIPLE_STAR_SPACE_INCREMENTAL_INPUT("* * */5", CronFieldType.days),
    INVALID_DAY_START_END_RANGE_INPUT("10-4", CronFieldType.days),
    INVALID_DAY_START_RANGE_INPUT("81-90", CronFieldType.days),
    INVALID_DAY_RANGE_INPUT("2-80", CronFieldType.days),
    INVALID_DAY_RANGE_STAR_INPUT("2-*", CronFieldType.days),
    INVALID_DAY_MULTIPLE_RANGE_INPUT("2--80", CronFieldType.days),
    INVALID_DAY_MULTIPLE_RANGES_INPUT("2-5 3-5", CronFieldType.days),
    INVALID_DAY_COMMA_SEPARATED_INPUT("2,5,81,92,100", CronFieldType.days),
    INVALID_DAY_COMMA_SPACE_INPUT("2,5,7,   9", CronFieldType.days),
    INVALID_DAY_MULTIPLE_COMMA_INPUT("9,,3,,,2,5,7", CronFieldType.days),
    INVALID_DAY_INCREMENTAL_INPUT("2//5", CronFieldType.days),
    INVALID_DAY_QUESTION_MARK_INPUT("?", CronFieldType.days),
    INVALID_DAY_STAR_QUESTION_MARK_INPUT("*?", CronFieldType.days),
    INVALID_DAY_INPUT("70", CronFieldType.days),

    // weeks
    INVALID_WEEK_STAR_INPUT("**", CronFieldType.weeks),
    INVALID_WEEK_STAR_INCREMENTAL_INPUT("*/*", CronFieldType.weeks),
    INVALID_WEEK_STAR_RANGE_INPUT("*-*", CronFieldType.weeks),
    INVALID_WEEK_STAR_COMMA_INPUT("*,*", CronFieldType.weeks),
    INVALID_WEEK_MULTIPLE_STAR_INCREMENTAL_INPUT("**/5", CronFieldType.weeks),
    INVALID_WEEK_MULTIPLE_STAR_SPACE_INCREMENTAL_INPUT("* * */5", CronFieldType.weeks),
    INVALID_WEEK_START_END_RANGE_INPUT("10-4", CronFieldType.weeks),
    INVALID_WEEK_START_RANGE_INPUT("81-90", CronFieldType.weeks),
    INVALID_WEEK_RANGE_INPUT("2-80", CronFieldType.weeks),
    INVALID_WEEK_RANGE_STAR_INPUT("2-*", CronFieldType.weeks),
    INVALID_WEEK_MULTIPLE_RANGE_INPUT("2--80", CronFieldType.weeks),
    INVALID_WEEK_MULTIPLE_RANGES_INPUT("2-5 3-5", CronFieldType.weeks),
    INVALID_WEEK_COMMA_SEPARATED_INPUT("2,5,81,92,100", CronFieldType.weeks),
    INVALID_WEEK_COMMA_SPACE_INPUT("2,5,7,   9", CronFieldType.weeks),
    INVALID_WEEK_MULTIPLE_COMMA_INPUT("9,,3,,,2,5,7", CronFieldType.weeks),
    INVALID_WEEK_INCREMENTAL_INPUT("2//5", CronFieldType.weeks),
    INVALID_WEEK_QUESTION_MARK_INPUT("??", CronFieldType.weeks),
    INVALID_WEEK_STAR_QUESTION_MARK_INPUT("*?", CronFieldType.weeks),
    INVALID_WEEK_INPUT("70", CronFieldType.weeks),

    // months
    INVALID_MONTH_STAR_INPUT("**", CronFieldType.months),
    INVALID_MONTH_STAR_INCREMENTAL_INPUT("*/*", CronFieldType.months),
    INVALID_MONTH_STAR_RANGE_INPUT("*-*", CronFieldType.months),
    INVALID_MONTH_STAR_COMMA_INPUT("*,*", CronFieldType.months),
    INVALID_MONTH_MULTIPLE_STAR_INCREMENTAL_INPUT("**/5", CronFieldType.months),
    INVALID_MONTH_MULTIPLE_STAR_SPACE_INCREMENTAL_INPUT("* * */5", CronFieldType.months),
    INVALID_MONTH_START_END_RANGE_INPUT("10-4", CronFieldType.months),
    INVALID_MONTH_START_RANGE_INPUT("81-90", CronFieldType.months),
    INVALID_MONTH_RANGE_INPUT("2-80", CronFieldType.months),
    INVALID_MONTH_RANGE_STAR_INPUT("2-*", CronFieldType.months),
    INVALID_MONTH_MULTIPLE_RANGE_INPUT("2--80", CronFieldType.months),
    INVALID_MONTH_MULTIPLE_RANGES_INPUT("2-5 3-5", CronFieldType.months),
    INVALID_MONTH_COMMA_SEPARATED_INPUT("2,5,81,92,100", CronFieldType.months),
    INVALID_MONTH_COMMA_SPACE_INPUT("2,5,7,   9", CronFieldType.months),
    INVALID_MONTH_MULTIPLE_COMMA_INPUT("9,,3,,,2,5,7", CronFieldType.months),
    INVALID_MONTH_INCREMENTAL_INPUT("2//5", CronFieldType.months),
    INVALID_MONTH_QUESTION_MARK_INPUT("??", CronFieldType.months),
    INVALID_MONTH_STAR_QUESTION_MARK_INPUT("*?", CronFieldType.months),
    INVALID_MONTH_INPUT("70", CronFieldType.months);


    public String input;
    public CronFieldType type;

    CronFieldInValidTestCases(String input, CronFieldType type) {
        this.input = input;
        this.type = type;
    }
}