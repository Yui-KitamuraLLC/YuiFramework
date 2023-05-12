package pro.eng.yui.yuiframe.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Define common Collection operations
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public interface ICollectionUtil {

    /**
     * Convert array to {@link java.util.List}
     * @param aryObj values array
     * @param <T>    Type of parameters
     * @return an {@link java.util.List} that contains all arguments
     * @see java.util.Arrays#asList(Object[])
     */
    <T> List<T> toList(final T... aryObj);

    /**
     * Convert array to {@link java.util.ArrayList}
     * @param aryObj values array
     * @param <T>    Type of parameters
     * @return an {@link java.util.List} that contains all arguments
     * @see java.util.List#of(Object[])
     */
    <T> ArrayList<T> toArrayList(final T... aryObj);

    /**
     * judge array is empty ( <code>null</code> or length is Zero )
     * @param array target
     * @return array is null or nothing in collection then <code>true</code>
     */
    boolean isEmpty(final Object[] array);
    /**
     * judge Collection is empty
     * @param list target instance
     * @return Collection is null or nothing in it then <code>true</code>
     */
    boolean isEmpty(final Collection<?> list);

    /**
     * Format collection instance to following format.
     * <pre>
     * [entity1.toString(), entity2.toString(), ...]
     * </pre>
     * For example, {@linkplain StringBuilder} then like
     * <pre>
     * [sb1sb1sb1, sb2sb2sb2]
     * </pre>
     * If the entity are the Collection,then call this method for recursively
     * @param collection a collection instance that format to string
     * @return single line string value
     */
    String toString(final Collection<?> collection);

    /**
     * Format collection instance to following format.
     * <pre>
     * {size: 2, data: [entity1.toString(), entity2.toString()]}
     * </pre>
     * @param collection a collection instance that format to string
     * @return single line string value
     */
    String toStrMeta(final Collection<?> collection);

    /**
     * Format collection instance to following format.
     * <pre>
     * [
     * entity1.toString(),
     * entity2.toString(),
     * ...
     * ]
     * </pre>
     * For example, {@linkplain StringBuilder} then like
     * <pre>
     * [
     * sb1sb1sb1,
     * sb2sb2sb2
     * ]
     * </pre>
     * If the entity are the Collection,then call this method for recursively
     * @param collection a collection instance that format to string
     * @return multiple line string value
     */
    String toStringBr(final Collection<?> collection);

    /**
     * Format collection instance to following format.
     * <pre>
     * {
     * size: 2,
     * data: [
     * entity1.toString(),
     * entity2.toString()
     * ]}
     * </pre>
     * @param collection a collection instance that format to string
     * @return multiple line string value
     */
    String toStrMetaBr(final Collection<?> collection);

}
