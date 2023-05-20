package pro.eng.yui.yuiframe.consts;

/**
 * Const string value class.
 * Use via {@link pro.eng.yui.yuiframe.YuiFrame#StrConst}
 */
public final class StringConst {

    private final static StringConst instance;
    private StringConst(){
        // singleton
    }
    static {
        instance = new StringConst();
    }
    public static StringConst getInstance(){
        return instance;
    }

    /** Empty string <code>""</code> */
    public final String EMPTY = "";
    /** One Space string <code>" "</code> */
    public final String SPACE = " ";

}
