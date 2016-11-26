package date.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dotcom on 22/11/16.
 */
public class Jeep {


    public static void main(String args[]){

        Date date = new Date();

        SimpleDateFormat simpleDateForm = new SimpleDateFormat("E yyyy.MM.dd '@' hh:mm:ss a zzz");

        String dateTime = simpleDateForm.format(date);

        System.out.println(dateTime);

    }
}
