package org.example;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("Expected <minutes> <hours> <day-of-month> <month> <day-of-week> <command> as input param");
            return;
        }
        try {
            CronParser parser = new CronParser(args[0]);
            System.out.println(parser.toString());
        } catch (IllegalCronFieldException e) {
            throw new RuntimeException(e);
        }
    }
}