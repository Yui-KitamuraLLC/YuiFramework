package pro.eng.yui.yuiframe.consts;

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
