package pro.eng.yui.yuiframe.consts.impl;

import pro.eng.yui.yuiframe.consts.IStrConst;

/**
 * Const string value class.
 * Use via {@link pro.eng.yui.yuiframe.YuiFrame#StrConst}
 */
public final class StringConst implements IStrConst {

    private final static StringConst instance;
    private StringConst(){
        // singleton
    }
    static {
        instance = new StringConst();
    }
    /** Do NOT use. Use this class via {@link pro.eng.yui.yuiframe.YuiFrame#StrConst} */
    public static StringConst getInstance(){
        return instance;
    }

    // see all constant values in Interface

}
