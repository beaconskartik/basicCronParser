package org.example;

public class CronParser {

    // <minutes> <hours> <day-of-month> <month> <day-of-week> <command>
    private CronField minutes;
    private CronField hours;
    private CronField dayOfMonth;
    private CronField month;
    private CronField dayOfWeek;
    private String command;

    public CronParser(String arg) throws IllegalCronFieldException {
        String [] splitValues = arg.split(" ");

        if (splitValues.length != 6) {
            throw new IllegalCronFieldException("Expected <minutes> <hours> <day-of-month> <month> <day-of-week> <command> but got: " + arg);
        }

        minutes = new CronField(splitValues[0], CronFieldType.minutes);
        hours = new CronField(splitValues[1], CronFieldType.hours);
        dayOfMonth = new CronField(splitValues[2], CronFieldType.days);
        month = new CronField(splitValues[3], CronFieldType.months);
        dayOfWeek = new CronField(splitValues[4], CronFieldType.weeks);
        command = splitValues[5];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%-14s%s\n", "minutes", minutes.toString()));
        builder.append(String.format("%-14s%s\n", "hours", hours.toString()));
        builder.append(String.format("%-14s%s\n", "dayofMonth", dayOfMonth.toString()));
        builder.append(String.format("%-14s%s\n", "month", month.toString()));
        builder.append(String.format("%-14s%s\n", "dayOfWeek", dayOfWeek.toString()));
        builder.append(String.format("%-14s%s", "command", command));
        return builder.toString();
    }
}
