package pro.eng.yui.yuiframe.utils;

import java.util.List;

/**
 * Define common Collection operations
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public interface ICollectionUtil {

    <T> List<T> toList(T... aryObj);
}
