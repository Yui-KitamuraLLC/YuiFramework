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

    /* ** toArrayList ** */
    @Test
    public void testToAryLst1(){
        ArrayList<String> exp = new ArrayList<>();
        exp.add("one");
        exp.add("two");
        assertEquals(exp, YuiFrame.CollectionUtil.toArrayList("one", "two"));
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
    private final List<String> nullCollection = null;
    private final List<String> emptyCollection = new ArrayList<>(3);
    private final List<String> collection = YuiFrame.CollectionUtil.toArrayList("str1","str2", null, "str4");
    private final List<List<MyCls>> inCol = YuiFrame.CollectionUtil.toList(
            YuiFrame.CollectionUtil.toList(new MyCls(1), new MyCls(2), new MyCls(3)),
            YuiFrame.CollectionUtil.toList(new MyCls(4), new MyCls(5)),
            YuiFrame.CollectionUtil.toList(new MyCls(6))
    );
    private final List<MyCls[]> inAry = YuiFrame.CollectionUtil.toList(clsAry3,clsAry3);

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

    /* ** toStrMeta(col) ** */


    /* ** toStringBr(col) ** */


    /* ** toStringMetaBr(col) ** */


}