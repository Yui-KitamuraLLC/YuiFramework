package pro.eng.yui.yuiframe.utils;

/**
 * Define common Object operations
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public interface IObjectUtil {

    /**
     * Check the object is <code>null</code>
     * @param obj check target instance or null value
     * @return if the object is <code>null</code> then <code>true</code>
     */
    boolean isNull(final Object obj);

    /**
     * null-safe equality test.
     * Almost same as <code>first.equals(second)</code>, but safe to null.
     * <ul>
     *     <li><code>null,null</code> then <code>true</code> </li>
     *     <li><code>null,NOT-null</code> then <code>false</code></li>
     *     <li><code>NOT-null,null</code> then <code>false</code></li>
     *     <li><code>NOT-null,NOT-null</code> then same to {@link Object#equals(Object)}</li>
     * </ul>
     * @param first first object
     * @param second second object
     * @return almost same to {@link Object#equals(Object)}. See the document body
     */
    boolean equals(final Object first, final Object second);
}
