package pro.eng.yui.yuiframe.utils.impl;

import org.junit.jupiter.api.Test;
import pro.eng.yui.yuiframe.YuiFrame;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void testStrEq1(){
        assertTrue(YuiFrame.StringUtil.eq(null, null));
    }

}