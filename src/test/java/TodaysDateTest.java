import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;


import static org.junit.jupiter.api.Assertions.assertEquals;

class TodaysDateTest {
    TodaysDate actual = new TodaysDate();

    @Test
    void testTime(){
        this.actual.printDateAndTime();
        GregorianCalendar calendar = new GregorianCalendar();
        assertEquals(calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND),actual.time);
    }

    @Test
    void testDay(){
        this.actual.printDateAndTime();
        GregorianCalendar calendar = new GregorianCalendar();
        assertEquals(calendar.get(Calendar.DATE),actual.day);
    }
    @Test
    void testYear(){
        this.actual.printDateAndTime();
        GregorianCalendar calendar = new GregorianCalendar();
        assertEquals(calendar.get(Calendar.YEAR),actual.year);
    }
    @Test
    void testMonth(){
        this.actual.printDateAndTime();
        GregorianCalendar calendar = new GregorianCalendar();
        assertEquals(calendar.get(Calendar.MONTH),actual.month-1);

    }
}