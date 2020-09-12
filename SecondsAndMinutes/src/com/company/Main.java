package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {

        System.out.println(getDurationString(-161, 36));
        System.out.println(getDurationString(3984));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || (seconds < 0 || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }

        int hour = minutes / 60;
        int hourToMinutes = minutes % 60;

        String hoursString = hour + "h";
        if (hour < 10){
            hoursString = "0" + hoursString;
        }

        String minuteString = hourToMinutes + "m";
        if (hourToMinutes < 10){
            minuteString = "0" + minuteString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + " "+ minuteString + " " + secondsString;
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);

    }
}
