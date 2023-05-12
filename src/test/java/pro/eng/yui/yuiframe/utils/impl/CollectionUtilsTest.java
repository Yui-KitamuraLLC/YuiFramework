package pro.eng.yui.yuiframe.utils.impl;

import org.junit.jupiter.api.Test;
import pro.eng.yui.yuiframe.YuiFrame;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionUtilsTest {

    /* ** toList ** */


    /* ** toArrayList ** */
    @Test
    public void testToAryLst1(){
        ArrayList<String> exp = new ArrayList<>();
        exp.add("one");
        exp.add("two");
        assertEquals(exp, YuiFrame.CollectionUtil.toArrayList("one", "two"));
    }

    /* ** isEmpty(ary) ** */


    /* ** isEmpty(collection) ** */


    /* ** toString(col) ** */
    private static class MyCls{
        private int val;
        public MyCls(int value){
            val = value;
        }
        @Override
        public String toString() {
            return "this is MyCls No."+ val;
        }
    }
    private final List<String> nullCollection = null;
    private final List<String> emptyCollection = new ArrayList<>(3);
    private final List<String> collection = YuiFrame.CollectionUtil.toArrayList("str1","str2", null, "str4");
    private final List<List<MyCls>> inCol = YuiFrame.CollectionUtil.toList(
            YuiFrame.CollectionUtil.toList(new MyCls(1), new MyCls(2), new MyCls(3)),
            YuiFrame.CollectionUtil.toList(new MyCls(4), new MyCls(5)),
            YuiFrame.CollectionUtil.toList(new MyCls(6))
    );


    /* ** toStrMeta(col) ** */


    /* ** toStringBr(col) ** */


    /* ** toStringMetaBr(col) ** */


}