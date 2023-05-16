package pro.eng.yui.yuiframe.utils.impl;

import org.junit.jupiter.api.Test;
import pro.eng.yui.yuiframe.YuiFrame;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static pro.eng.yui.yuiframe.YuiFrame.StrConst;

class StringUtilsTest {

    /* ** eq ** */
    @Test
    public void testStrEq1(){
        assertTrue(YuiFrame.StringUtil.eq(null, null));
    }
    @Test
    public void testStrEq2(){
        assertFalse(YuiFrame.StringUtil.eq(null, StrConst.EMPTY));
    }
    @Test
    public void testStrEq3(){
        assertFalse(YuiFrame.StringUtil.eq(StrConst.EMPTY, null));
    }
    @Test
    public void testStrEq4(){
        assertTrue(YuiFrame.StringUtil.eq(StrConst.EMPTY, StrConst.EMPTY));
    }
    @Test
    public void testStrEq5(){
        assertFalse(YuiFrame.StringUtil.eq(StrConst.EMPTY, StrConst.SPACE));
    }

    @Test
    public void testStrEqIgCase1(){
        // this case returns TRUE
        assertTrue(YuiFrame.StringUtil.eq("ABC", "abc"));
    }
    @SuppressWarnings("StringOperationCanBeSimplified")
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
        String second = "abC"+ StrConst.SPACE;
        assertFalse(YuiFrame.StringUtil.eq(first, second));
    }

    static class ToStrOne{
        @Override
        public String toString(){
            return "ONE";
        }
    }
    static class ToStrTwo{
        @Override
        public String toString(){
            return "TWO";
        }
    }
    @Test
    public void testStrEqObj1(){
        assertTrue(YuiFrame.StringUtil.eq(new ToStrOne(),"ONE"));
    }
    @Test
    public void testStrEqObj2(){
        assertFalse(YuiFrame.StringUtil.eq(new ToStrOne(),new ToStrTwo()));
    }

    /* ** eqCase ** */
    @Test
    public void testStrEqC1(){
        assertTrue(YuiFrame.StringUtil.eqCase(null, null));
    }
    @Test
    public void testStrEqC2(){
        assertFalse(YuiFrame.StringUtil.eqCase(null, StrConst.EMPTY));
    }
    @Test
    public void testStrEqC3(){
        assertFalse(YuiFrame.StringUtil.eqCase(StrConst.EMPTY, null));
    }
    @Test
    public void testStrEqC4(){
        assertTrue(YuiFrame.StringUtil.eqCase(StrConst.EMPTY, StrConst.EMPTY));
    }
    @Test
    public void testStrEqC5(){
        assertFalse(YuiFrame.StringUtil.eqCase(StrConst.EMPTY, StrConst.SPACE));
    }
    @Test
    public void testStrEqCase1(){
        assertFalse(YuiFrame.StringUtil.eqCase("ABC", "abc"));
    }
    @SuppressWarnings("StringOperationCanBeSimplified")
    @Test
    public void testStrEqCase2(){
        String first = new String("aBc");
        String second = new String("aBc");
        assertTrue(YuiFrame.StringUtil.eqCase(first, second));
    }
    @Test
    public void testStrEqCase3(){
        String first = "aBc";
        String second = "abC";
        assertFalse(YuiFrame.StringUtil.eqCase(first, second));
    }
    @Test
    public void testStrEqCase4(){
        String first = "abCd";
        String second = "wxYz";
        assertFalse(YuiFrame.StringUtil.eqCase(first, second));
    }
    @Test
    public void testStrEqCase5(){
        // does not trim
        String first = "aBc";
        String second = "aBc"+ StrConst.SPACE;
        assertFalse(YuiFrame.StringUtil.eqCase(first, second));
    }

    @Test
    public void testStrEqCaseObj1(){
        assertFalse(YuiFrame.StringUtil.eqCase(new ToStrOne(),"one"));
    }
    @Test
    public void testStrEqCaseObj2(){
        assertTrue(YuiFrame.StringUtil.eqCase(new ToStrOne(),"ONE"));
    }
    @Test
    public void testStrEqCaseObj3(){
        assertFalse(YuiFrame.StringUtil.eqCase(new ToStrOne(),new ToStrTwo()));
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
        assertTrue(YuiFrame.StringUtil.isEmpty(StrConst.EMPTY));
    }
    @Test
    public void testStrIsEmpty3(){
        assertFalse(YuiFrame.StringUtil.isEmpty(StrConst.SPACE));
    }
    @Test
    public void testStrIsEmpty4(){
        assertFalse(YuiFrame.StringUtil.isEmpty("  "));
    }
    /* ** isEmpty#object ** */
    static class EmptyObj{
        @Override
        public String toString() {
            return StrConst.EMPTY;
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
        StringBuffer sb = new StringBuffer(StrConst.SPACE);
        assertFalse(YuiFrame.StringUtil.isEmpty(sb));
    }

    /* ** nullToEmpty ** */
    @Test
    void testN2E1(){
        String str = null;
        assertEquals(StrConst.EMPTY, YuiFrame.StringUtil.nullToEmpty(str));
    }
    @Test
    void testN2E2(){
        String str = "null";
        assertEquals(str, YuiFrame.StringUtil.nullToEmpty(str));
    }

}