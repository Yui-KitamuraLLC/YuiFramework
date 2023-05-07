package pro.eng.yui.yuiframe.utils.impl;

import pro.eng.yui.yuiframe.utils.ICollectionUtil;

import java.util.List;

/**
 * Implement of common operation for Collections
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public class CollectionUtils implements ICollectionUtil {

    /* *** singleton *** */
    private static final CollectionUtils instance;
    static{
        instance = new CollectionUtils();
    }
    public static CollectionUtils getInstance(){
        return instance;
    }
    private CollectionUtils(){
        // private constructor
    }

    // fields

    // methods
    @Override
    public <T> List<T> toList(T... aryObj) {
        return List.of(aryObj);
    }
}
