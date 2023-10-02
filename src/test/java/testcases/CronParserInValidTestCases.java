package testcases;

public enum CronParserInValidTestCases {

    // <minutes> <hours> <day-of-month> <month> <day-of-week> <command>
    INVALID_TEST_SIMPLE_CRON_STRING("75 2 3 5 2 /bin/ls"),

    INVALID_TEST_STAR_CRON_STRING("*/15 */2 */3 */5 **/2 /bin/ls"),

    INVALID_TEST_RANGE_CRON_STRING("1-5 28-7 23-31 5--7 2-6 /bin/ls"),

    INVALID_TEST_COMMA_CRON_STRING("1,5 2,7,4 24,23,30,,,,31 7,4,3,5 2,6,7,1 /bin/ls"),

    INVALID_TEST_INCREMENTAL_CRON_STRING("5/15 4//2 5/3 3//5 4/2 /bin///ls"),

    INVALID_TEST_STAR_COMMA_INCREMENT_CRON_STRING("*/* 0 1,15 ** 1-5 /usr/bin/find");

    public String input;

    CronParserInValidTestCases(String input) {
        this.input = input;
    }
}