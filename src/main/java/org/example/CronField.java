package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CronField {

    private String value;
    private CronFieldType type;
    private String result;

    public CronField(String value, CronFieldType type) throws IllegalCronFieldException {
        if (value == null || type == null) {
            throw new IllegalCronFieldException("Null input or Type");
        }
        // <minutes> <hours> <day-of-month> <month> <day-of-week>
        // Case 1 => "*"
        // Case 2 => "*/x"
        // Case 3 => "?" [any value]
        // Case 4 => "x,y"
        // Case 5 => "x-y"
        // Case 6 => "x/y"
        // Case 7 => "x"
        this.value = value;
        this.type = type;
        this.result = parse();
    }

    public String toString() {
        return result;
    }

    private String parse() throws IllegalCronFieldException {
        if (value.startsWith("*")) {
            return handleStarValue(value);
        } else if (value.contains("?")) {
            return handleQuestionMark(value);
        } else if (value.contains(",")) {
            return handleComma(value);
        } else if (value.contains("/")) {
            return handleSlash(value);
        } else if (value.contains("-")) {
            return handleDash(value);
        } else {
            int val = convertStringToInt(value);
            return toString(fill(val, val, 1));
        }
    }

    private String toString(List<Integer> list) {
        return list.stream().map(Objects::toString).collect(Collectors.joining(" "));
    }

    // handle case 1 and 2
    private String handleStarValue(String value) throws IllegalCronFieldException {
        String [] splitValues = value.split("/");
        if (splitValues.length > 2) {
            throw new IllegalCronFieldException("Cron Field" + type.toString() + " for value: " + value + " has invalid parameters " + value);
        }
        int increment = 1;

        if (splitValues.length == 2) {
            increment = convertStringToInt(splitValues[1]);
        }
        if (!splitValues[0].equals("*")) {
            throw new IllegalCronFieldException("Cron Field" + type.toString() + " for value: " + value + " has invalid input");
        }
        return toString(fill(type.min, type.max, increment));
    }

    private String handleQuestionMark(String value) throws IllegalCronFieldException {
        if ((type == CronFieldType.months || type == CronFieldType.weeks) && value.equals("?")) {
            String res = toString(fill(type.min, type.max, 1));
            return "any [" + res + "]";
        } else {
            throw new IllegalCronFieldException("? Can only be used with " + CronFieldType.months + " and " + CronFieldType.weeks + " However, it is used with " + type.toString());
        }
    }

    private String handleDash(String value) throws IllegalCronFieldException {
        String [] splitValues = value.split("-");
        if (splitValues.length > 2) {
            throw new IllegalCronFieldException("Cron Field" + type.toString() + " for value: " + value + " has invalid parameters " + value);
        }

        return toString(fill(convertStringToInt(splitValues[0]), convertStringToInt(splitValues[1]), 1));
    }

    private String handleSlash(String value) throws IllegalCronFieldException {
        String [] splitValues = value.split("/");

        if (splitValues.length > 2) {
            throw new IllegalCronFieldException("Cron Field" + type.toString() + " for value: " + value + " has invalid parameters " + value);
        }

        return toString(fill(convertStringToInt(splitValues[0]), type.max, convertStringToInt(splitValues[1])));
    }

    private String handleComma(String value) throws IllegalCronFieldException {
        String [] splitValues = value.split(",");
        Set<Integer> values = new TreeSet<>();

        for (String splitValue : splitValues) {
            int val = convertStringToInt(splitValue);
            values.addAll(fill(val, val, 1));
        }
        return values.stream().map(Objects::toString).collect(Collectors.joining(" "));
    }

    private List<Integer> fill (int min, int max, int increment) throws IllegalCronFieldException {
        if (increment == 0) throw new IllegalCronFieldException("Cron Field" + type.toString() + " for value: " + value + " has zero interval");
        if (min > max) throw new IllegalCronFieldException("Cron Field" + type.toString() + " for value: " + value + " has starting " + min + " greater than" + max);
        if (type.min > min || min > type.max) throw new IllegalCronFieldException("Cron Field" + type.toString() + " for value: " + value + " invalid range");
        if (max > type.max)  throw new IllegalCronFieldException("Cron Field" + type.toString() + " for value: " + value + " invalid range");

        List<Integer> res = new ArrayList<>();
        for (int i = min; i <= max; i += increment) res.add(i);
        return res;
    }


    int convertStringToInt(String number) throws IllegalCronFieldException {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException ex) {
            throw new IllegalCronFieldException("Invalid number is used in the Cron Parser number: " + number);
        }
    }
}
