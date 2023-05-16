/**
 * module of <q>YuiFramework</q>
 * Provides Utilities
 * <pre>
 *     // methods usage
 *     YuiFrame.StringUtil.eq(str1, str2);
 *     // const usage
 *     YuiFrame.StrConst.EMPTY;
 * </pre>
 * @author yui-KITAMURA
 * @since 1.0.0
 */
module pro.eng.yui.YuiFramework {

    //requires
    requires java.base;
    requires java.sql;

    // exports
    exports pro.eng.yui.yuiframe;
    exports pro.eng.yui.yuiframe.consts;
    exports pro.eng.yui.yuiframe.utils;

}