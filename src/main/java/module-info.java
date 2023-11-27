/**
 * The pro.eng.yui.YuiFramework module.
 * It exports several packages for working with
 * user interface components, constants, and utility classes.
 *
 * <p>
 * The module exports the following packages:</p>
 * <ul>
 *     <li>pro.eng.yui.yuiframe</li>
 *     <li>pro.eng.yui.yuiframe.consts</li>
 *     <li>pro.eng.yui.yuiframe.utils</li>
 * </ul>
 *
 * <p>
 * usage:</p>
 * <pre>
 * import pro.eng.yui.yuiframe.YuiFrame;
 * // methods usage
 * YuiFrame.StringUtil.eq(str1, str2);
 * // const usage
 * YuiFrame.StrConst.EMPTY;
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