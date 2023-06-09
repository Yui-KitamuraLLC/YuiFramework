package pro.eng.yui.yuiframe;

import pro.eng.yui.yuiframe.consts.IStrConst;
import pro.eng.yui.yuiframe.consts.impl.StringConst;
import pro.eng.yui.yuiframe.utils.*;
import pro.eng.yui.yuiframe.utils.impl.*;

/**
 * フレームワークのメインクラス
 * @author yui-KITAMURA
 * @since 1.0.0
 * @version 1.0.0
 */
public final class YuiFrame {

    /* Const */
    /** Constant values with String */
    public final static IStrConst StrConst = StringConst.getInstance();

    /* Util */
    /** Utilities of Collection */
    public final static ICollectionUtil CollectionUtil = CollectionUtils.getInstance();
    /** Utilities of Strings */
    public final static IStringUtil StringUtil = StringUtils.getInstance();
    /** Utilities of Object */
    public final static IObjectUtil ObjectUtil = ObjectUtils.getInstance();
    /** Utilities of Date */
    public final static IDateUtil DateUtil = DateUtils.getInstance();
    /** Utilities of Environment or Properties */
    public final static IEnvPropUtil EnvPropUtil = EnvPropUtils.getInstance();

    /** do not be instanced. Use static fields */
    private YuiFrame(){
        // do not create instance
    }

}
