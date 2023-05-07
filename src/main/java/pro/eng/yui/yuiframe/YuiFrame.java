package pro.eng.yui.yuiframe;

import pro.eng.yui.yuiframe.utils.ICollectionUtil;
import pro.eng.yui.yuiframe.utils.IDateUtil;
import pro.eng.yui.yuiframe.utils.IObjectUtil;
import pro.eng.yui.yuiframe.utils.IStringUtil;
import pro.eng.yui.yuiframe.utils.impl.CollectionUtils;
import pro.eng.yui.yuiframe.utils.impl.DateUtils;
import pro.eng.yui.yuiframe.utils.impl.ObjectUtils;
import pro.eng.yui.yuiframe.utils.impl.StringUtils;

/**
 * フレームワークのメインクラス
 * @author yui-KITAMURA
 * @since 1.0.0
 * @version 1.0.0
 */
public final class YuiFrame {

    public final static ICollectionUtil ListUtil = CollectionUtils.getInstance();
    public final static IStringUtil StringUtil = StringUtils.getInstance();
    public final static IObjectUtil ObjectUtil = ObjectUtils.getInstance();
    public final static IDateUtil DateUtil = DateUtils.getInstance();

    private YuiFrame(){
        // do not create instance
    }

}
