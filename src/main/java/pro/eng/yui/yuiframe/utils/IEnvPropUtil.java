package pro.eng.yui.yuiframe.utils;

/**
 * Define common Environment and Properties operations
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public interface IEnvPropUtil {
    /* Environment */

    /**
     * Get System Environment Value stored with <code>key</code>
     * @param key system environment variables key
     * @return if exists, then that value, else <code>""(Empty string)</code>
     */
    String getEnv(String key);

    /**
     * Get System Environment Value stored with <code>key</code>.
     * If not exists, then return the <code>defaultValue</code>
     * @param key system environment variables key
     * @param defaultValue default value when the variables not exists
     * @return if exists, then that value, else the <code>defaultValue</code>
     */
    String getEnv(String key, String defaultValue);

    /* Properties */

    /**
     * Get properties value.
     * @param key properties key
     * @return if exists, then that value, else <code>""(Empty string)</code>
     */
    String getProp(String key);

    /**
     * Get properties value.
     * If not exists, then return the <code>defaultValue</code>
     * @param key properties key
     * @param defaultValue default value when the properties not exists
     * @return if exists, then that properties value, else the <code>defaultValue</code>
     */
    String getProp(String key, String defaultValue);

    /**
     * Set properties value. If already exist, then throw exception.
     * @param key properties key
     * @param value set value
     * @throws IllegalStateException Already properties key-value set exists
     */
    void setProp(String key, String value) throws IllegalStateException;

    /**
     * Set properties value. If already exist, then overwrite the value.
     * @param key properties key
     * @param value set value
     * @return <code>true</code> when overwrite
     */
    boolean setPropForce(String key, String value);


}
