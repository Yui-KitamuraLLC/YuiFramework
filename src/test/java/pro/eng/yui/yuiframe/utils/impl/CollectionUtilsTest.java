package pro.eng.yui.yuiframe.utils.impl;

import org.junit.jupiter.api.Test;
import pro.eng.yui.yuiframe.YuiFrame;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("ConstantValue")
class CollectionUtilsTest {

    /* ** toList ** */
    @Test
    public void testToLst1(){
        List<String> exp = new ArrayList<>();
        exp.add("one");
        exp.add("two");
        assertEquals(exp, YuiFrame.CollectionUtil.toList("one", "two"));
    }
    @Test
    public void testToLst2(){
        List<MyCls> exp = new ArrayList<>();
        exp.add(new MyCls(1));
        assertEquals(exp, YuiFrame.CollectionUtil.toList(new MyCls(1)));
    }
    @Test
    public void testToLst3(){
        List<MyCls> exp = new ArrayList<>();
        exp.add(new MyCls(1));
        exp.add(new MyCls(2));
        exp.add(new MyCls(3));
        assertEquals(exp, YuiFrame.CollectionUtil.toList(clsAry3));
    }
    @Test
    public void testToLst4(){
        assertNull(YuiFrame.CollectionUtil.toList((Object[]) null));
    }
    @Test
    public void testToLst4a(){
        assertNotNull(YuiFrame.CollectionUtil.toList((Object) null));
    }
    @Test
    public void testToLst5(){
        List<MyCls> exp = new ArrayList<>();
        exp.add(null);
        exp.add(null);
        assertEquals(exp, YuiFrame.CollectionUtil.toList((MyCls)null, (MyCls)null));
    }

    /* ** toArrayList ** */
    @Test
    public void testToAryLst1(){
        ArrayList<String> exp = new ArrayList<>();
        exp.add("one");
        exp.add("two");
        assertEquals(exp, YuiFrame.CollectionUtil.toArrayList("one", "two"));
    }
    @Test
    public void testToAryLst2(){
        List<MyCls> exp = new ArrayList<>();
        exp.add(new MyCls(1));
        assertEquals(exp, YuiFrame.CollectionUtil.toArrayList(new MyCls(1)));
    }
    @Test
    public void testToAryLst3(){
        List<MyCls> exp = new ArrayList<>();
        exp.add(new MyCls(1));
        exp.add(new MyCls(2));
        exp.add(new MyCls(3));
        assertEquals(exp, YuiFrame.CollectionUtil.toArrayList(clsAry3));
    }
    @Test
    public void testToAryLst4(){
        assertNull(YuiFrame.CollectionUtil.toArrayList((Object[]) null));
    }
    @Test
    public void testToAryLst4a(){
        assertNotNull(YuiFrame.CollectionUtil.toArrayList((Object) null));
    }
    @Test
    public void testToAryLst5(){
        List<MyCls> exp = new ArrayList<>();
        exp.add(null);
        exp.add(null);
        assertEquals(exp, YuiFrame.CollectionUtil.toArrayList((MyCls)null, (MyCls)null));
    }

    /* ** isEmpty(ary) ** */
    @Test
    public void testIsEmptyAry1(){
        String[] ary = null;
        assertTrue(YuiFrame.CollectionUtil.isEmpty(ary));
    }
    @Test
    public void testIsEmptyAry2(){
        String[] ary = {null};
        assertFalse(YuiFrame.CollectionUtil.isEmpty(ary));
    }
    @Test
    public void testIsEmptyAry3(){
        String[] ary = {"str1", "str2"};
        assertFalse(YuiFrame.CollectionUtil.isEmpty(ary));
    }

    /* ** isEmpty(collection) ** */
    @Test
    public void testIsEmptyCol1(){
        List<String> col = null;
        assertTrue(YuiFrame.CollectionUtil.isEmpty(col));
    }
    @Test
    public void testIsEmptyCol2(){
        List<String> col = new ArrayList<>(3);
        assertTrue(YuiFrame.CollectionUtil.isEmpty(col));
    }
    @Test
    public void testIsEmptyCol3(){
        List<String> col = YuiFrame.CollectionUtil.toArrayList("str1","str2");
        assertFalse(YuiFrame.CollectionUtil.isEmpty(col));
    }

    /* ** toString(col) ** */
    private static class MyCls{
        private final int val;
        public MyCls(int value){
            val = value;
        }
        @Override
        public String toString() {
            return "MyCls-No."+ val;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof MyCls mc){
                return this.val == mc.val;
            }
            return false;
        }
    }
    private final MyCls[] clsAry3 = {new MyCls(1), new MyCls(2), new MyCls(3)};
    private static final List<String> nullCollection = null;
    private static final List<String> emptyCollection = new ArrayList<>(3);
    private final List<String> collection = YuiFrame.CollectionUtil.toArrayList("str1","str2", null, "str4");
    private final List<List<MyCls>> inCol = YuiFrame.CollectionUtil.toList(
            YuiFrame.CollectionUtil.toList(new MyCls(1), new MyCls(2), new MyCls(3)),
            YuiFrame.CollectionUtil.toList(new MyCls(4), new MyCls(5)),
            YuiFrame.CollectionUtil.toList(new MyCls(6))
    );
    private final List<MyCls[]> inAry = YuiFrame.CollectionUtil.toList(clsAry3,clsAry3);
    private static final String crlf = System.lineSeparator();

    @Test
    public void testToString1(){
        assertEquals("null", YuiFrame.CollectionUtil.toString(nullCollection));
    }
    @Test
    public void testToString2(){
        assertEquals("[]", YuiFrame.CollectionUtil.toString(emptyCollection));
    }
    @Test
    public void testToString3(){
        assertEquals("[str1,str2,null,str4]", YuiFrame.CollectionUtil.toString(collection));
    }
    @Test
    public void testToString4(){
        assertEquals(
                "[[MyCls-No.1,MyCls-No.2,MyCls-No.3],[MyCls-No.4,MyCls-No.5],[MyCls-No.6]]",
                YuiFrame.CollectionUtil.toString(inCol)
        );
    }
    @Test
    public void testToString5(){
        assertEquals(
                "[[MyCls-No.1,MyCls-No.2,MyCls-No.3],[MyCls-No.1,MyCls-No.2,MyCls-No.3]]",
                YuiFrame.CollectionUtil.toString(inAry)
        );
    }

    /* ** toString(ary) ** */
    @Test
    public void testToString6(){
        assertEquals("[MyCls-No.1,MyCls-No.2,MyCls-No.3]", YuiFrame.CollectionUtil.toString(clsAry3));
    }
    @Test
    public void testToString7(){
        assertEquals("null", YuiFrame.CollectionUtil.toString((MyCls[])null));
    }

    /* ** toStrMeta(col) ** */
    @Test
    public void testToStrMeta1(){
        assertEquals("null", YuiFrame.CollectionUtil.toStrMeta(nullCollection));
    }
    @Test
    public void testToStrMeta2(){
        assertEquals("{size:0,data:[]}", YuiFrame.CollectionUtil.toStrMeta(emptyCollection));
    }
    @Test
    public void testToStrMeta3(){
        assertEquals("{size:4,data:[str1,str2,null,str4]}", YuiFrame.CollectionUtil.toStrMeta(collection));
    }
    @Test
    public void testToStrMeta3a(){
        List<String> cln = new ArrayList<>();
        cln.add(null);
        assertEquals("{size:1,data:[null]}", YuiFrame.CollectionUtil.toStrMeta(cln));
    }
    @Test
    public void testToStrMeta3b(){
        List<String> cln = new ArrayList<>();
        assertEquals("{size:0,data:[]}", YuiFrame.CollectionUtil.toStrMeta(cln));
    }
    @Test
    public void testToStrMeta3c(){
        List<String[]> cln = new ArrayList<>();
        cln.add(null);
        assertEquals("{size:1,data:[null]}", YuiFrame.CollectionUtil.toStrMeta(cln));
    }
    @Test
    public void testToStrMeta3d(){
        List<String[]> cln = new ArrayList<>();
        assertEquals("{size:0,data:[]}", YuiFrame.CollectionUtil.toStrMeta(cln));
    }
    @Test
    public void testToStrMeta4(){
        assertEquals(
                "{size:3,data:[{size:3,data:[MyCls-No.1,MyCls-No.2,MyCls-No.3]},"+
                        "{size:2,data:[MyCls-No.4,MyCls-No.5]},{size:1,data:[MyCls-No.6]}]}",
                YuiFrame.CollectionUtil.toStrMeta(inCol)
        );
    }
    @Test
    public void testToStrMeta5(){
        assertEquals(
                "{size:2,data:[{size:3,data:[MyCls-No.1,MyCls-No.2,MyCls-No.3]}"+
                ",{size:3,data:[MyCls-No.1,MyCls-No.2,MyCls-No.3]}]}",
                YuiFrame.CollectionUtil.toStrMeta(inAry)
        );
    }

    /* ** toString(ary) ** */
    @Test
    public void testToStrMeta6(){
        assertEquals(
                "{size:3,data:[MyCls-No.1,MyCls-No.2,MyCls-No.3]}",
                YuiFrame.CollectionUtil.toStrMeta(clsAry3)
        );
    }
    @Test
    public void testToStrMeta7(){
        assertEquals("null", YuiFrame.CollectionUtil.toStrMeta((MyCls[])null));
    }

    /* ** toStringBr(col) ** */
    @Test
    public void testToStringBr1(){
        assertEquals("null", YuiFrame.CollectionUtil.toStringBr(nullCollection));
    }
    @Test
    public void testToStringBr2(){
        assertEquals("["+crlf+"]", YuiFrame.CollectionUtil.toStringBr(emptyCollection));
    }
    @Test
    public void testToStringBr3(){
        assertEquals(
                YuiFrame.StringUtil.concat("[",crlf,"str1,",crlf,"str2,",crlf,"null,",crlf,"str4",crlf,"]"),
                YuiFrame.CollectionUtil.toStringBr(collection)
        );
    }
    @Test
    public void testToStringBr4(){
        assertEquals(
                YuiFrame.StringUtil.concat(
                        "[",crlf,"[",crlf,"MyCls-No.1,",crlf,"MyCls-No.2,",crlf,"MyCls-No.3",crlf,"],",crlf,
                        "[",crlf,"MyCls-No.4,",crlf,"MyCls-No.5",crlf,"],",crlf,
                        "[",crlf,"MyCls-No.6",crlf,"]",crlf,"]"),
                YuiFrame.CollectionUtil.toStringBr(inCol)
        );
    }
    @Test
    public void testToStringBr5(){
        assertEquals(
                YuiFrame.StringUtil.concat(
                    "[",crlf,"[",crlf,"MyCls-No.1,",crlf,"MyCls-No.2,",crlf,"MyCls-No.3",crlf,"],",crlf
                        ,"[",crlf,"MyCls-No.1,",crlf,"MyCls-No.2,",crlf,"MyCls-No.3",crlf,"]",crlf,"]"),
                YuiFrame.CollectionUtil.toStringBr(inAry)
        );
    }

    /* ** toString(ary) ** */
    @Test
    public void testToStringBr6(){
        assertEquals(
                YuiFrame.StringUtil.concat("[",crlf,"MyCls-No.1,",crlf,"MyCls-No.2,",crlf,"MyCls-No.3",crlf,"]"),
                YuiFrame.CollectionUtil.toStringBr(clsAry3)
        );
    }
    @Test
    public void testToStringBr7(){
        assertEquals("null", YuiFrame.CollectionUtil.toStringBr((MyCls[])null));
    }

    /* ** toStringMetaBr(col) ** */


}