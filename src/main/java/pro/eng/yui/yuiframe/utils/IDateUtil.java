package pro.eng.yui.yuiframe.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Define common Date/Calendar operations
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public interface IDateUtil {

    /** DateFormats */
    @SuppressWarnings("SpellCheckingInspection")
    enum Formats{
        /** <code>yyyyMMdd</code> style format */
        YYYYMMDD(new SimpleDateFormat("yyyyMMdd")),
        /** <code>yyyy/MM/dd</code> style format */
        YYYYMMDD_slash(new SimpleDateFormat("yyyy/MM/dd")),
        /** <code>yyyy-MM-dd</code> style format */
        YYYYMMDD_hyphen(new SimpleDateFormat("yyyy-MM-dd")),
        /** <code>yyyyMMddHHmmss</code>(14digit) style format */
        YMDHMS(new SimpleDateFormat("yyyyMMddHHmmss")),
        /** <code>yyyy/MM/dd HH:mm:ss</code> style format */
        YMDHMS_slSpCl(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")),
        /** <code>HHmmssSSS</code> style format */
        HHMMSSsss(new SimpleDateFormat("HHmmssSSS")),
        /** <code>HH:mm:ss</code> style format */
        HHMMSS_coron(new SimpleDateFormat("HH:mm:ss")),
        /** <code>HHmmss</code> style format */
        HHMMSS(new SimpleDateFormat("HHmmss")),
        /** <code>HH:mm:ss.SSS</code> style format */
        HHMMSS_sss(new SimpleDateFormat("HH:mm:ss.SSS"));

        private final SimpleDateFormat value;
        Formats(SimpleDateFormat format){
            value = format;
        }
        public SimpleDateFormat getSDF(){
            return value;
        }
    }

    // methods

    /**
     * Get Calendar instance of current DateTime.
     * @return instance of current DateTime
     */
    Calendar now();

    /**
     * Convert {@link java.util.Calendar} to {@link java.util.Date}
     * @param calendar original instance of Calendar
     * @return the Date instance that has same timestamp with parameter
     */
    Date toDate(Calendar calendar);

    /**
     * Convert {@link java.util.Date} to {@link java.util.Calendar}
     * @param date original instance of Date
     * @return the Calendar instance that has same timestamp with parameter
     */
    Calendar toCal(Date date);

    /**
     * String formatter with {@link pro.eng.yui.yuiframe.utils.IDateUtil.Formats}
     * @param calendar Calendar instance to be formatted
     * @param format the output format that you want to get
     * @return the string value which the argument of calendar formatted with selected format
     */
    String toStr(Calendar calendar, IDateUtil.Formats format);

    /**
     * String formatter with {@link pro.eng.yui.yuiframe.utils.IDateUtil.Formats}
     * @param date Date instance to be formatted
     * @param format the output format that you want to get
     * @return the string value which the argument of date formatted with selected format
     */
    String toStr(Date date, IDateUtil.Formats format);

    /**
     * Convert {@link java.util.Calendar} to {@link java.sql.Timestamp}
     * @param calendar original Calendar instance
     * @return the Timestamp instance that has same DateTime with argument
     */
    Timestamp toTS(Calendar calendar);

    /**
     * Convert {@link java.util.Date} to {@link java.sql.Timestamp}
     * @param date original Date instance
     * @return the Timestamp instance that has same DateTime with argument
     */
    Timestamp toTS(Date date);
}
