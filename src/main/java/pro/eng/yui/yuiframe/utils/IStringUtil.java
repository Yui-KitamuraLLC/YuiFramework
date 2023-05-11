package pro.eng.yui.yuiframe.utils;

import pro.eng.yui.yuiframe.utils.impl.StringUtils;

/**
 * Define common String operations
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public interface IStringUtil {

    /** Empty string <code>""</code> */
    String EMPTY = "";
    /** one Space string <code>" "</code> */
    String SPACE = " ";

    /** test the two strings are equal. <code>null</code>-safe
     * @see String#equalsIgnoreCase(String)  */
    boolean eq(final String first, final String second);
    /** test the two strings are equal in Case-sensitive. <code>null</code>-safe
     * @see String#equals(Object)   */
    boolean eqCase(final String first, final String second);

    /**
     * test the two objects String value are equal.
     * @param first first object to be string value
     * @param second second object to be string value
     * @return if two string value are same then <code>true</code>
     * @see String#equalsIgnoreCase(String)
     */
    boolean eq(final Object first, final Object second);
    /**
     * test the two objects String value are equal in Case-sensitive.
     * @param first first object to be string value
     * @param second second object to be string value
     * @return if two string value are same then <code>true</code>
     * @see String#equals(Object)
     */
    boolean eqCase(final Object first, final Object second);

    /**
     * get joined string
     * @param arg any list or arrays to concat
     * @return single string value that joined all arguments
     */
    String concat(Iterable<? extends CharSequence> arg);
    /** @see IStringUtil#concat(Iterable) */
    String concat(CharSequence... arg);

    /**
     * get joined string that each separated with delimiter
     * @param delimiter joint string
     * @param arg any list or arrays to concat
     * @return single string value that joined all arguments each separated with delimiter
     */
    String concatWithDelimiter(CharSequence delimiter, Iterable<? extends CharSequence> arg);
    /** @see IStringUtil#concatWithDelimiter(CharSequence, Iterable) */
    String concatWithDelimiter(CharSequence delimiter, CharSequence... arg);

    /**
     * Check the value is empty.
     * @param value the value that you want to test
     * @return if <code>null</code> or length is 0 then <code>true</code>, otherwise <code>false</code>
     */
    boolean isEmpty(String value);
    /**
     * Check the objects string representation is empty.
     * @param obj the object that you want to test
     * @return <code>true</code> when null or the {@link Object#toString()} value is empty
     * @see StringUtils#isEmpty(String)
     */
    boolean isEmpty(Object obj);

    /**
     * if the value is null then return <code>""</code>(Empty string)
     * @param value the String object or null value
     * @return if the value is <code>null</code> then empty string(<code>""</code>). Other case, same as original value
     */
    String nullToEmpty(final String value);

}
