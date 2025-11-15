package homework.medicalCentre.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {

    private static final SimpleDateFormat REGISTERDATATIME = new SimpleDateFormat("dd//MM//yyyy");

    public static String fromDateToStr(Date date){
        return REGISTERDATATIME.format(date);
    }
}
