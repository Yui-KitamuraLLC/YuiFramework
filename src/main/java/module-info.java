/**
 * module of <q>YuiFramework</q>
 * Provides Utilities
 * <pre>
 *     import pro.eng.yui.yuiframe.YuiFrame;
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
    requires org.jetbrains.annotations;

    // exports
    exports pro.eng.yui.yuiframe;
    exports pro.eng.yui.yuiframe.consts;
    exports pro.eng.yui.yuiframe.utils;

}