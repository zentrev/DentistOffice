package Controller;


import java.util.Calendar;

public enum Interval {
    DAY,
    Week,
    Month,
    Year;

    public int getInterval(){
        switch(this){
            case DAY:
                return Calendar.DATE;
            case Week:
                return Calendar.WEEK_OF_MONTH;
            case Month:
                return Calendar.MONTH;
            case Year:
                return Calendar.YEAR;
        }
        throw new IllegalArgumentException("Invalid Interval");
    }
}
