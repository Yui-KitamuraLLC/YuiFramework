package pro.eng.yui.yuiframe.utils.impl;

import pro.eng.yui.yuiframe.utils.IDateUtil;

/**
 * Implement of common operation for Dates/Calendar
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
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

}
