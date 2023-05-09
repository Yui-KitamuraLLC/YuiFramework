package pro.eng.yui.yuiframe.utils.impl;

import org.junit.jupiter.api.Test;
import pro.eng.yui.yuiframe.YuiFrame;
import pro.eng.yui.yuiframe.utils.IDateUtil;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilsTest {

    private final Date d20200229_123456987;
    private final Calendar c20200229_123456987;

    public DateUtilsTest(){
        Calendar c20200229_123456987 = Calendar.getInstance();
        c20200229_123456987.set(2020,Calendar.FEBRUARY,29,12,34,56);
        c20200229_123456987.set(Calendar.MILLISECOND, 987);
        this.c20200229_123456987 = c20200229_123456987;
        d20200229_123456987 = c20200229_123456987.getTime();

    }

    /* ** now ** */
    @Test
    public void testNow1(){
        Calendar instanceA = Calendar.getInstance();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            fail(e);
        }
        assertNotEquals(instanceA, YuiFrame.DateUtil.now());
    }
    @Test
    public void testNow2(){
        Calendar instanceA = Calendar.getInstance();
        Calendar instanceB = YuiFrame.DateUtil.now();
        assertEquals(
            Math.floor(instanceA.getTimeInMillis()/100d),
            Math.floor(instanceB.getTimeInMillis()/100d)
        );
    }

    /* ** toDate ** */
    @Test
    public void testToDate1(){
        Calendar calIns = YuiFrame.DateUtil.now();
        Date manCvt = calIns.getTime();
        assertEquals(manCvt, YuiFrame.DateUtil.toDate(calIns));
    }

    @Test
    public void testToDate2(){
        assertNull(YuiFrame.DateUtil.toDate(null));
    }

    /* ** toCal ** */
    @Test
    public void testToCal1(){
        Date org = new Date();
        Calendar manCvt = Calendar.getInstance();
        manCvt.setTime(org);
        assertEquals(manCvt, YuiFrame.DateUtil.toCal(org));
    }

    @Test
    public void testToCal2(){
        assertNull(YuiFrame.DateUtil.toCal(null));
    }

    /* ** toStr ** */

    /**
     * {@linkplain pro.eng.yui.yuiframe.utils.IDateUtil#toStr(Calendar, IDateUtil.Formats)} calls
     * {@linkplain IDateUtil#toDate(Calendar)} then {@linkplain IDateUtil#toStr(Date, IDateUtil.Formats)}.
     * So, test patterns covered only in {@link IDateUtil#toStr(Date, IDateUtil.Formats)}.
     */
    @Test
    public void testToStr1(){
        String expected = "20200229";
        assertEquals(expected, YuiFrame.DateUtil.toStr(d20200229_123456987, IDateUtil.Formats.YYYYMMDD));
    }
    @Test
    public void testToStr2(){
        String expected = "2020/02/29";
        assertEquals(expected, YuiFrame.DateUtil.toStr(d20200229_123456987, IDateUtil.Formats.YYYYMMDD_slash));
    }
    @Test
    public void testToStr3(){
        String expected = "2020-02-29";
        assertEquals(expected, YuiFrame.DateUtil.toStr(d20200229_123456987, IDateUtil.Formats.YYYYMMDD_hyphen));
    }
    @Test
    public void testToStr4(){
        String expected = "20200229123456";
        assertEquals(expected, YuiFrame.DateUtil.toStr(d20200229_123456987, IDateUtil.Formats.YMDHMS));
    }
    @Test
    public void testToStr5(){
        String expected = "2020/02/29 12:34:56";
        assertEquals(expected, YuiFrame.DateUtil.toStr(d20200229_123456987, IDateUtil.Formats.YMDHMS_slSpCr));
    }
    @Test
    public void testToStr6(){
        String expected = "123456987";
        assertEquals(expected, YuiFrame.DateUtil.toStr(d20200229_123456987, IDateUtil.Formats.HHMMSSsss));
    }
    @Test
    public void testToStr7(){
        String expected = "12:34:56";
        assertEquals(expected, YuiFrame.DateUtil.toStr(d20200229_123456987, IDateUtil.Formats.HHMMSS_coron));
    }
    @Test
    public void testToStr8(){
        String expected = "123456";
        assertEquals(expected, YuiFrame.DateUtil.toStr(d20200229_123456987, IDateUtil.Formats.HHMMSS));
    }
    @Test
    public void testToStr9(){
        String expected = "12:34:56.987";
        assertEquals(expected, YuiFrame.DateUtil.toStr(d20200229_123456987, IDateUtil.Formats.HHMMSS_cr_sss));
    }
    @Test
    public void testToStr10(){
        assertNull(YuiFrame.DateUtil.toStr((Date)null, IDateUtil.Formats.HHMMSS_cr_sss));
    }
    @Test
    public void testToStrCal1(){
        String expected = "2020/02/29 12:34:56";
        assertEquals(expected, YuiFrame.DateUtil.toStr(c20200229_123456987, IDateUtil.Formats.YMDHMS_slSpCr));
    }
    @Test
    public void testToStrCal2(){
        assertNull(YuiFrame.DateUtil.toStr((Calendar) null, IDateUtil.Formats.HHMMSS_cr_sss));
    }

    /* ** toTS ** */
    @Test
    public void testTpTs1(){
        Timestamp expected = new Timestamp(d20200229_123456987.getTime());
        assertEquals(expected, YuiFrame.DateUtil.toTS(d20200229_123456987));
    }
    @Test
    public void testTpTs2(){
        assertNull(YuiFrame.DateUtil.toTS((Date)null));
    }
    @Test
    public void testTpTsCal1(){
        Timestamp expected = new Timestamp(c20200229_123456987.getTimeInMillis());
        assertEquals(expected, YuiFrame.DateUtil.toTS(c20200229_123456987));
    }
    @Test
    public void testTpTsCal2(){
        assertNull(YuiFrame.DateUtil.toTS((Calendar) null));
    }


}