package pro.eng.yui.yuiframe.utils.impl;

import pro.eng.yui.yuiframe.utils.IDateUtil;

/**
 * 汎用的な日付に対する操作の実装
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
