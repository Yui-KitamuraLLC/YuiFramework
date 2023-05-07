package pro.eng.yui.yuiframe.utils.impl;

import org.junit.jupiter.api.Test;
import pro.eng.yui.yuiframe.YuiFrame;
import pro.eng.yui.yuiframe.utils.IStringUtil;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    /* ** eq ** */
    @Test
    public void testStrEq1(){
        assertTrue(YuiFrame.StringUtil.eq(null, null));
    }
    @Test
    public void testStrEq2(){
        assertFalse(YuiFrame.StringUtil.eq(null, IStringUtil.EMPTY));
    }
    @Test
    public void testStrEq3(){
        assertFalse(YuiFrame.StringUtil.eq(IStringUtil.EMPTY, null));
    }
    @Test
    public void testStrEq4(){
        assertTrue(YuiFrame.StringUtil.eq(IStringUtil.EMPTY, IStringUtil.EMPTY));
    }
    @Test
    public void testStrEq5(){
        assertFalse(YuiFrame.StringUtil.eq(IStringUtil.EMPTY, IStringUtil.SPACE));
    }

    @Test
    public void testStrEqIgCase1(){
        // this case returns TRUE
        assertTrue(YuiFrame.StringUtil.eq("ABC", "abc"));
    }
    @Test
    public void testStrEqIgCase2(){
        String first = new String("aBc");
        String second = new String("aBc");
        assertTrue(YuiFrame.StringUtil.eq(first, second));
    }
    @Test
    public void testStrEqIgCase3(){
        String first = "aBc";
        String second = "abC";
        assertTrue(YuiFrame.StringUtil.eq(first, second));
    }
    @Test
    public void testStrEqIgCase4(){
        String first = "abCd";
        String second = "wxYz";
        assertFalse(YuiFrame.StringUtil.eq(first, second));
    }
    @Test
    public void testStrEqIgCase5(){
        // does not trim
        String first = "aBc";
        String second = "abC"+ IStringUtil.SPACE;
        assertFalse(YuiFrame.StringUtil.eq(first, second));
    }


}