import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {
    String time;
    public int day;
    protected int month;
    public int year;

    public void printDateAndTime(){
        GregorianCalendar calendar = new GregorianCalendar();
        time = calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND);
        day = calendar.get(Calendar.DAY_OF_MONTH) ;
        month = calendar.get(Calendar.MONTH)+1;
        year = calendar.get(Calendar.YEAR);
        System.out.println("Time: "+time);
        System.out.println("Date: "+month+ " "+day+" "+year);
    }

    public String getTime() {
        return time;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
