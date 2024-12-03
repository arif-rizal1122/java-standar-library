package dateAndCalender.app;

import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {


        Date date = new Date();
        long milisecond = date.getTime();

        System.out.println(date);
        System.out.println(milisecond);
        System.out.println("============================================");

        Calendar calendar = Calendar.getInstance();
        // jika mau set sendiri
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);

        Date date1 = calendar.getTime();
        long miliisecond = date1.getTime();
        System.out.println(miliisecond);
        System.out.println();

    }
}
