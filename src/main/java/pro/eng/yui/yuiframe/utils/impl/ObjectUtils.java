package pro.eng.yui.yuiframe.utils.impl;

import pro.eng.yui.yuiframe.utils.IObjectUtil;

/**
 * Implement of common operation for Objects
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public class ObjectUtils implements IObjectUtil {

    /* *** singleton *** */
    private static final ObjectUtils instance;
    static{
        instance = new ObjectUtils();
    }
    public static ObjectUtils getInstance(){
        return instance;
    }
    private ObjectUtils(){
        // private constructor
    }

    // fields

    // methods


    @Override
    public boolean isNull(final Object obj) {
        return obj == null;
    }

    @Override
    public boolean isNotNull(Object obj) {
        return obj != null;
    }

    @Override
    public boolean equals(final Object first, final Object second) {
        if(first == null && second == null){
            return true;
        }
        if( first == null /* && second != null */ ||
            /* first != null */ second == null){
            return false;
        }
        return first.equals(second);
    }

    @Override
    public boolean isTypeOf(final Object instance, final Class superClz) {
        return superClz.isInstance(instance);
    }
}
