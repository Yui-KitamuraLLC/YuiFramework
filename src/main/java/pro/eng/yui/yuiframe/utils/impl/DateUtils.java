package pro.eng.yui.yuiframe.utils.impl;

import pro.eng.yui.yuiframe.YuiFrame;
import pro.eng.yui.yuiframe.utils.IDateUtil;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * Implement of common operation for Dates/Calendar
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.1.0
 */
public class DateUtils implements IDateUtil {

    /* *** singleton *** */
    private static final DateUtils instance;
    static{
        instance = new DateUtils();
    }
    public static DateUtils getInstance(){
        return instance;
    }
    private DateUtils(){
        // private constructor
    }

    // fields

    // methods

    @Override
    public Calendar now(){
        return Calendar.getInstance();
    }

    @Override
    public Date toDate(Calendar calendar){
        if(YuiFrame.ObjectUtil.isNull(calendar)){
            return null;
        }
        return calendar.getTime();
    }

    @Override
    public Calendar toCal(Date date){
        if(YuiFrame.ObjectUtil.isNull(date)){
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    @Override
    public String toStr(Calendar calendar, IDateUtil.Formats format){
        return toStr(toDate(calendar), format);
    }

    @Override
    public String toStr(Date date, IDateUtil.Formats format){
        if(YuiFrame.ObjectUtil.isNull(date)){
            return null;
        }
        return format.getSDF().format(date);
    }

    @Override
    public Calendar fromStr(String input, IDateUtil.Formats format){
        if(YuiFrame.ObjectUtil.isNull(input)){
            return null;
        }
        try {
            return toCal(format.getSDF().parse(input));
        }catch(ParseException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Timestamp toTS(Calendar calendar){
        if(YuiFrame.ObjectUtil.isNull(calendar)){
            return null;
        }
        return new Timestamp(calendar.getTimeInMillis());
    }

    @Override
    public Timestamp toTS(Date date){
        if(YuiFrame.ObjectUtil.isNull(date)){
            return null;
        }
        return new Timestamp(date.getTime());
    }

}
