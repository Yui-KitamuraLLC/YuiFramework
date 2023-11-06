package pro.eng.yui.yuiframe.utils.impl;

import pro.eng.yui.yuiframe.YuiFrame;
import pro.eng.yui.yuiframe.utils.IEnvPropUtil;

/**
 * Implement of common operation for Environment and Properties
 * @since 1.0.0
 * @author yui-KITAMURA
 * @version 1.0.0
 */
public class EnvPropUtils implements IEnvPropUtil {

    /* *** singleton *** */
    private static final EnvPropUtils instance;
    static{
        instance = new EnvPropUtils();
    }
    public static EnvPropUtils getInstance(){
        return instance;
    }
    private EnvPropUtils(){
        // private constructor
    }

    // fields

    // methods

    /* Environment */
    @Override
    public String getEnv(String key){
        return getEnv(key, YuiFrame.StrConst.EMPTY);
    }
    @Override
    public String getEnv(String key, String defaultValue){
        if(key == null){
            throw new IllegalArgumentException("given environment key is Null");
        }
        String val = System.getenv(key);
        return val == null ? defaultValue : val;
    }

    /* Properties */
    @Override
    public String getProp(String key){
        return getProp(key, YuiFrame.StrConst.EMPTY);
    }
    @Override
    public String getProp(String key, String defaultValue){
        if(key == null){
            throw new IllegalArgumentException("given properties key is Null");
        }
        return System.getProperty(key, defaultValue);
    }
    @Override
    public void setProp(String key, String value){
        String val = getProp(key, null);
        if( YuiFrame.ObjectUtil.isNotNull(val)){
            throw new IllegalStateException("the prop already set as "+ val);
        }
        setPropForce(key, value);
    }
    @Override
    public boolean setPropForce(String key, String value){
        boolean overwrite = YuiFrame.ObjectUtil.isNotNull(getProp(key, null));
        System.setProperty(key, value);
        return overwrite;
    }

}
