package pro.eng.yui.yuiframe.utils.impl;

import org.junit.jupiter.api.Test;
import pro.eng.yui.yuiframe.YuiFrame;

import java.util.ArrayList;

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


    /* ** toStrMeta(col) ** */


    /* ** toStringBr(col) ** */


    /* ** toStringMetaBr(col) ** */


}