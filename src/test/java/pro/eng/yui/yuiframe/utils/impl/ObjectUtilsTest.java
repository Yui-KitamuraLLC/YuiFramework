package pro.eng.yui.yuiframe.utils.impl;

import org.junit.jupiter.api.Test;
import pro.eng.yui.yuiframe.YuiFrame;
import pro.eng.yui.yuiframe.utils.IObjectUtil;
import pro.eng.yui.yuiframe.utils.IStringUtil;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ObjectUtilsTest {

    /* ** isNull ** */
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

    /* ** equals ** */
    @Test
    void testEquals1(){
        Object obj1 = null;
        Object obj2 = null;
        assertTrue(YuiFrame.ObjectUtil.equals(obj1, obj2));
    }
    @Test
    void testEquals2(){
        Object obj1 = "null";
        Object obj2 = null;
        assertFalse(YuiFrame.ObjectUtil.equals(obj1, obj2));
    }
    @Test
    void testEquals3(){
        Object obj1 = null;
        Object obj2 = "null";
        assertFalse(YuiFrame.ObjectUtil.equals(obj1, obj2));
    }
    @Test
    void testEquals4(){
        Object obj1 = "null";
        Object obj2 = "null";
        assertTrue(YuiFrame.ObjectUtil.equals(obj1, obj2));
    }
    @Test
    void testEquals5(){
        Object obj1 = new StringBuffer("null");
        Object obj2 = "null";
        assertFalse(YuiFrame.ObjectUtil.equals(obj1, obj2));
    }

    static class DummyT{
        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }
    static class DummyF{
        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }
    @Test
    void testEquals6(){
        Object obj1 = new DummyT();
        Object obj2 = new DummyF();
        assertTrue(YuiFrame.ObjectUtil.equals(obj1, obj2));
    }
    @Test
    void testEquals7(){
        Object obj1 = new DummyF();
        Object obj2 = new DummyT();
        assertFalse(YuiFrame.ObjectUtil.equals(obj1, obj2));
    }

    /* ** isTypeOf ** */
    @Test
    void testIsTypeOf(){
        assertTrue(YuiFrame.ObjectUtil.isTypeOf(new Object(), Object.class));
    }
    @Test
    void testIsTypeOf2(){
        assertTrue(YuiFrame.ObjectUtil.isTypeOf("String", Object.class));
    }
    @Test
    void testIsTypeOf3(){
        assertFalse(YuiFrame.ObjectUtil.isTypeOf("String", Character.class));
    }
    @Test
    void testIsTypeOf3a(){
        assertTrue(YuiFrame.ObjectUtil.isTypeOf("String", CharSequence.class));
    }
    @Test
    void testIsTypeOf4(){
        assertTrue(YuiFrame.ObjectUtil.isTypeOf(0, Number.class));
    }
    @Test
    void testIsTypeOf5(){
        assertTrue(YuiFrame.ObjectUtil.isTypeOf(new ArrayList<String>(), Collection.class));
    }

}