package pro.eng.yui.yuiframe.utils;

import org.jetbrains.annotations.Contract;
import pro.eng.yui.yuiframe.utils.impl.StringUtils;

/**
 * Define common String operations
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public interface IStringUtil {

    /** test the two strings are equal. <code>null</code>-safe
     * @see String#equalsIgnoreCase(String)  */
    @Contract("null,null -> true; null,!null -> false; !null,null -> false; _,_ -> _")
    boolean eq(final String first, final String second);
    /** test the two strings are equal in Case-sensitive. <code>null</code>-safe
     * @see String#equals(Object)   */
    @Contract("null,null -> true; null,!null -> false; !null,null -> false; _,_ -> _")
    boolean eqCase(final String first, final String second);

    /**
     * test the two objects String value are equal.
     * @param first first object to be string value
     * @param second second object to be string value
     * @return if two string value are same then <code>true</code>
     * @see String#equalsIgnoreCase(String)
     */
    @Contract("null,null -> true; null,!null -> false; !null,null -> false; _,_ -> _")
    boolean eq(final Object first, final Object second);
    /**
     * test the two objects String value are equal in Case-sensitive.
     * @param first first object to be string value
     * @param second second object to be string value
     * @return if two string value are same then <code>true</code>
     * @see String#equals(Object)
     */
    @Contract("null,null -> true; null,!null -> false; !null,null -> false; _,_ -> _")
    boolean eqCase(final Object first, final Object second);

    /**
     * get joined string
     * @param arg any list or arrays to concat
     * @return single string value that joined all arguments
     */
    @Contract("_ -> new")
    String concat(Iterable<? extends CharSequence> arg);
    /** @see IStringUtil#concat(Iterable) */
    @Contract("_ -> new")
    String concat(CharSequence... arg);

    /**
     * get joined string that each separated with delimiter
     * @param delimiter joint string. if <code>null</code> then one-space
     * @param arg any list or arrays to concat
     * @return single string value that joined all arguments each separated with delimiter
     */
    @Contract("_,_ -> new")
    String concatWithDelimiter(CharSequence delimiter, Iterable<? extends CharSequence> arg);
    /** @see IStringUtil#concatWithDelimiter(CharSequence, Iterable) */
    @Contract("_,_ -> new")
    String concatWithDelimiter(CharSequence delimiter, CharSequence... arg);

    /**
     * Check the value is empty.
     * @param value the value that you want to test
     * @return if <code>null</code> or length is 0 then <code>true</code>, otherwise <code>false</code>
     */
    @Contract("null -> true; !null -> _")
    boolean isEmpty(String value);
    /**
     * Check the objects string representation is empty.
     * @param obj the object that you want to test
     * @return <code>true</code> when null or the {@link Object#toString()} value is empty
     * @see StringUtils#isEmpty(String)
     */
    @Contract("null -> true; !null -> _")
    boolean isEmpty(Object obj);

    /**
     * if the value is null then return <code>""</code>(Empty string)
     * @param value the String object or null value
     * @return if the value is <code>null</code> then empty string(<code>""</code>). Other case, same as original value
     */
    @Contract("_ -> !null")
    String nullToEmpty(final String value);

}
