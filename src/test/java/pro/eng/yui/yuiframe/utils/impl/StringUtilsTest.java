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

    /* ** concat ** */
    @Test
    public void testStrConcat1(){
        List<String> data = new ArrayList<>();
        data.add("abc");
        data.add("def");
        data.add("uvw");
        data.add("xyz");
        assertEquals("abcdefuvwxyz", YuiFrame.StringUtil.concat(data));
    }
    @Test
    public void testStrConcat2(){
        assertEquals("abcdefuvwxyz", YuiFrame.StringUtil.concat("abc","def","uvw","xyz"));
    }
    @Test
    public void testStrConcat3(){
        // null replaced to space
        List<String> data = new ArrayList<>();
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        assertEquals("    ", YuiFrame.StringUtil.concat(data));
    }
    @Test
    public void testStrConcat4(){
        assertEquals("    ", YuiFrame.StringUtil.concat(null,null,null,null));
    }
    @Test
    public void testStrConcatDelimit1(){
        List<String> data = new ArrayList<>();
        data.add("abc");
        data.add("def");
        data.add("uvw");
        data.add("xyz");
        assertEquals("abc,def,uvw,xyz", YuiFrame.StringUtil.concatWithDelimiter(",", data));
    }
    @Test
    public void testStrConcatDelimit2(){
        assertEquals("abc,def,uvw,xyz", YuiFrame.StringUtil.concatWithDelimiter(",","abc","def","uvw","xyz"));
    }
    @Test
    public void testStrConcatDelimit3(){
        List<String> data = new ArrayList<>();
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        assertEquals(" , , , ", YuiFrame.StringUtil.concatWithDelimiter(",", data));
    }
    @Test
    public void testStrConcatDelimit4(){
        assertEquals(" , , , ", YuiFrame.StringUtil.concatWithDelimiter(",",null,null,null,null));
    }
    @Test
    public void testStrConcatDelimit5(){
        List<String> data = new ArrayList<>();
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        assertEquals("       ", YuiFrame.StringUtil.concatWithDelimiter(null, data));
    }
    @Test
    public void testStrConcatDelimit6(){
        assertEquals("       ", YuiFrame.StringUtil.concatWithDelimiter(null,null,null,null,null));
    }

    /* ** isEmpty ** */
    @Test
    public void testStrIsEmpty1(){
        assertTrue(YuiFrame.StringUtil.isEmpty(null));
    }
    @Test
    public void testStrIsEmpty2(){
        assertTrue(YuiFrame.StringUtil.isEmpty(IStringUtil.EMPTY));
    }
    @Test
    public void testStrIsEmpty3(){
        assertFalse(YuiFrame.StringUtil.isEmpty(IStringUtil.SPACE));
    }
    @Test
    public void testStrIsEmpty4(){
        assertFalse(YuiFrame.StringUtil.isEmpty("  "));
    }
    /* ** isEmpty#object ** */
    static class EmptyObj{
        @Override
        public String toString() {
            return IStringUtil.EMPTY;
        }
    }
    @Test
    public void testStrIsEmptyObj1(){
        assertTrue(YuiFrame.StringUtil.isEmpty((Object)null));
    }
    @Test
    public void testStrIsEmptyObj2(){
        assertTrue(YuiFrame.StringUtil.isEmpty(new EmptyObj()));
    }
    @Test
    public void testStrIsEmptyObj3(){
        assertFalse(YuiFrame.StringUtil.isEmpty(new Object()));
    }
    @Test
    public void testStrIsEmptyObj4(){
        assertTrue(YuiFrame.StringUtil.isEmpty(new StringBuffer()));
    }
    @Test
    public void testStrIsEmptyObj5(){
        StringBuffer sb = new StringBuffer();
        sb.append(new EmptyObj());
        assertTrue(YuiFrame.StringUtil.isEmpty(sb));
    }
    @Test
    public void testStrIsEmptyObj6(){
        StringBuffer sb = new StringBuffer(IStringUtil.SPACE);
        assertFalse(YuiFrame.StringUtil.isEmpty(sb));
    }

}