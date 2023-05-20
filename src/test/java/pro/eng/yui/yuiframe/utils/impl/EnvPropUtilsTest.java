package pro.eng.yui.yuiframe.utils.impl;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pro.eng.yui.yuiframe.YuiFrame;

import java.io.*;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;


class EnvPropUtilsTest {

    @BeforeAll
    static void loadProp(){
        try(FileInputStream fis = new FileInputStream("src/test/resources/TestValue.properties");){
            Properties prop = new Properties();
            prop.load(fis);
            System.setProperties(prop);
        } catch (FileNotFoundException e) {
            fail(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void getEnv1() {
        String javaHome = System.getenv("JAVA_HOME");
        assertEquals(javaHome, YuiFrame.EnvPropUtil.getEnv("JAVA_HOME"));
    }
    @Test
    void getEnv2() {
        String javaHome = System.getenv("JAVA_HOME____");
        String result = YuiFrame.EnvPropUtil.getEnv("JAVA_HOME____");
        assertAll(
                () -> assertNotEquals(javaHome, result),
                () -> assertNull(javaHome),
                () -> assertNotNull(result),
                () -> assertEquals(YuiFrame.StrConst.EMPTY, result)
        );
    }

    @Test
    void testGetEnvDef1() {
        String javaHome = System.getenv("JAVA_HOME");
        assertEquals(javaHome, YuiFrame.EnvPropUtil.getEnv("JAVA_HOME", "1234"));
    }
    @Test
    void testGetEnvDef2() {
        String javaHome = System.getenv("JAVA_HOME____");
        String result = YuiFrame.EnvPropUtil.getEnv("JAVA_HOME____", "1234");
        assertAll(
                () -> assertNotEquals(javaHome, result),
                () -> assertNull(javaHome),
                () -> assertNotNull(result),
                () -> assertEquals("1234", result)
        );
    }

    @Test
    void getProp1() {
        String propValue = System.getProperty("key1");
        assertEquals(propValue, YuiFrame.EnvPropUtil.getProp("key1"));
    }
    @Test
    void getProp2() {
        assertEquals(YuiFrame.StrConst.EMPTY, YuiFrame.EnvPropUtil.getProp("keyN"));
    }
    @Test
    void getProp3(){
        // Case sensitive
        assertEquals(YuiFrame.StrConst.EMPTY, YuiFrame.EnvPropUtil.getProp("KeY1"));
    }

    @Test
    void getPropDef1() {
        String propValue = "test1";
        assertEquals(propValue, YuiFrame.EnvPropUtil.getProp("key1", "def"));
    }
    @Test
    void getPropDef2(){
        String def = "def";
        assertEquals(def, YuiFrame.EnvPropUtil.getProp("keyN", def));
    }

    @Test
    void setProp1() {
        assertAll(
                () -> {assertDoesNotThrow(() -> YuiFrame.EnvPropUtil.setProp("key3", "newValue"));},
                () -> {assertEquals("newValue", System.getProperty("key3"));}
        );
    }
    @Test
    void setProp2(){
            IllegalStateException ise = assertThrows(
                    IllegalStateException.class, () -> {YuiFrame.EnvPropUtil.setProp("key2","already");});
            assertEquals("the prop already set as test2", ise.getMessage());
    }

    @Test
    void setPropForce1() {
        assertAll(
                () -> {assertDoesNotThrow(() -> YuiFrame.EnvPropUtil.setPropForce("key4", "newValue"));},
                () -> {assertEquals("newValue", System.getProperty("key4"));}
        );
    }

    @Test
    void setPropForce2(){
        assertAll(
                () -> {assertDoesNotThrow(() -> YuiFrame.EnvPropUtil.setPropForce("keyM", "forceValue"));},
                () -> {assertEquals("forceValue", System.getProperty("keyM"));}
        );
    }
}