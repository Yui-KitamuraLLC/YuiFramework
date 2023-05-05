package pro.eng.yui.yuiframe.utils.impl;

import pro.eng.yui.yuiframe.utils.IStringUtil;

/**
 * 汎用的な文字列操作の実装
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public class StringUtils implements IStringUtil {

    /* *** singleton *** */
    private static final StringUtils instance;
    static{
        instance = new StringUtils();
    }
    public static StringUtils getInstance(){
        return instance;
    }
    private StringUtils(){
        // private constructor
    }

    // fields

    // methods

}
