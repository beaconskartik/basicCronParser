package testcases;

public enum CronParserValidTestCases {

    // <minutes> <hours> <day-of-month> <month> <day-of-week> <command>
    TEST_SIMPLE_CRON_STRING("15 2 3 5 2 /bin/ls", "minutes       15\n" +
            "hours         2\n" +
            "dayofMonth    3\n" +
            "month         5\n" +
            "dayOfWeek     2\n" +
            "command       /bin/ls"),

    TEST_STAR_CRON_STRING("*/15 */2 */3 */5 */2 /bin/ls", "minutes       0 15 30 45\n" +
                                    "hours         0 2 4 6 8 10 12 14 16 18 20 22\n" +
                                    "dayofMonth    1 4 7 10 13 16 19 22 25 28 31\n" +
                                    "month         1 6 11\n" +
                                    "dayOfWeek     1 3 5 7\n" +
                                    "command       /bin/ls"),

    TEST_RANGE_CRON_STRING("1-5 2-7 23-31 5-7 2-6 /bin/ls", "minutes       1 2 3 4 5\n" +
                                  "hours         2 3 4 5 6 7\n" +
                                  "dayofMonth    23 24 25 26 27 28 29 30 31\n" +
                                  "month         5 6 7\n" +
                                  "dayOfWeek     2 3 4 5 6\n" +
                                  "command       /bin/ls"),

    TEST_COMMA_CRON_STRING("1,5 2,7,4 24,23,30,31 7,4,3,5 2,6,7,1 /bin/ls", "minutes       1 5\n" +
            "hours         2 4 7\n" +
            "dayofMonth    23 24 30 31\n" +
            "month         3 4 5 7\n" +
            "dayOfWeek     1 2 6 7\n" +
            "command       /bin/ls"),

    TEST_INCREMENTAL_CRON_STRING("5/15 4/2 5/3 3/5 4/2 /bin/ls", "minutes       5 20 35 50\n" +
                                   "hours         4 6 8 10 12 14 16 18 20 22\n" +
                                   "dayofMonth    5 8 11 14 17 20 23 26 29\n" +
                                   "month         3 8\n" +
                                   "dayOfWeek     4 6\n" +
                                   "command       /bin/ls"),

    TEST_STAR_COMMA_INCREMENT_CRON_STRING("*/15 0 1,15 * 1-5 /usr/bin/find", "minutes       0 15 30 45\n" +
                                         "hours         0\n" +
                                         "dayofMonth    1 15\n" +
                                         "month         1 2 3 4 5 6 7 8 9 10 11 12\n" +
                                         "dayOfWeek     1 2 3 4 5\n" +
                                         "command       /usr/bin/find");

    public String input;
    public String expectedOutput;

    CronParserValidTestCases(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }
}