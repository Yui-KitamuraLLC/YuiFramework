package pro.eng.yui.yuiframe.utils;

import java.text.SimpleDateFormat;

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
}
