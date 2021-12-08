package com.geekbrains.lesson2.theory;

public class Calendar {
    /*
    public static final int MONTH_JANUARY = 1;
    public static final int MONTH_FEBRUARY = 2;

    int month = MONTH_JANUARY;

     */
    Months month = Months.AUGUST;

    /*
    public static final int MONTH_AUGUST = 8;
    public static final int MONTH_DAYS_COUNT_AUGUST = 31;

     */
    public void currentDateInfo() {
        System.out.println(month.getNumber() + " " /*+ month.getTitle()*/);
    }
}
