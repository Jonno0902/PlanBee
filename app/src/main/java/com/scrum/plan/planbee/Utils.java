package com.scrum.plan.planbee;


public class Utils {

    private Utils() {

    }

    /**
     * Gets timestamp in millis and converts it to HH:mm (e.g. 16:44).
     */
    public static String formatTime(long timeInMillis) {
        return new java.text.SimpleDateFormat("dd/MM HH:mm")
                .format(new java.util.Date (timeInMillis*1000));
    }



}
