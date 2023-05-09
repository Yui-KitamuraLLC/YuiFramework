package pro.eng.yui.yuiframe.utils.impl;

import org.junit.jupiter.api.Test;
import pro.eng.yui.yuiframe.YuiFrame;
import pro.eng.yui.yuiframe.utils.IObjectUtil;
import pro.eng.yui.yuiframe.utils.IStringUtil;

import static org.junit.jupiter.api.Assertions.*;

class ObjectUtilsTest {

    @Test
    void testIsNull1() {
        assertTrue(YuiFrame.ObjectUtil.isNull(null));
    }
    @Test
    void testIsNull2(){
        assertFalse(YuiFrame.ObjectUtil.isNull(IStringUtil.EMPTY));
    }
    @Test
    void testIsNull3(){
        assertFalse(YuiFrame.ObjectUtil.isNull(IObjectUtil.class));
    }
}