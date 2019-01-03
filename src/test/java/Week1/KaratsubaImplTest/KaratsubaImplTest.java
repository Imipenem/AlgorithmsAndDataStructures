package test.java.Week1.KaratsubaImplTest;

import main.java.Week1.Week1_DivideAndConquer.KaratsubaImpl;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Karatsuba-algorithm implementation.
 * More testcases can be found at: https://github.com/beaunus/stanford-algs/tree/master/testCases/course1/assignment1Multiplication
 */

class KaratsubaImplTest {


    @Test
    void karatsubaWithZeroOnly() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("0");
        BigInteger y = new BigInteger("0");
        assertEquals(test.karatsuba(x,y), BigInteger.ZERO);
    }
    @Test
    void karatsubaMultiplyWithZero() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("0");
        BigInteger y = new BigInteger("24");
        assertEquals(test.karatsuba(x,y), BigInteger.ZERO);
    }
    @Test
    void karatsubaWithSingleDigits() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("8");
        BigInteger y = new BigInteger("3");
        assertEquals(test.karatsuba(x,y), BigInteger.valueOf(24));
    }
    @Test
    void karatsubaWithSmallNumbers() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("12");
        BigInteger y = new BigInteger("15");
        assertEquals(test.karatsuba(x,y), BigInteger.valueOf(180));
    }
    @Test
    void karatsubaWithFewDigits() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("1234");
        BigInteger y = new BigInteger("3456");
        assertEquals(test.karatsuba(x,y), BigInteger.valueOf(4264704));
    }
    @Test
    void karatsubaWithLargerNumbers() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("14977670");
        BigInteger y = new BigInteger("84664984");
        assertEquals(test.karatsuba(x,y), new BigInteger("1268084190907280"));
    }
    @Test
    void karatsubaWithLargerNumbers2() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("90109928");
        BigInteger y = new BigInteger("95084501");
        assertEquals(test.karatsuba(x,y), new BigInteger("8568057539025928"));
    }
    @Test
    void karatsubaWithLargerNumbers3() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("3708846298640594");
        BigInteger y = new BigInteger("9081685595280321");
        assertEquals(test.karatsuba(x,y), new BigInteger("33682576005473018115324659950674"));
    }
    @Test
    void karatsubaWithVeryLargeNumbers() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("99615790486094417376090801668169164966124889237191368396003822190453363522518069831766512078559950872531851587461689758377693490");
        BigInteger y = new BigInteger("85846470797846424040727649083188111668669506401258790859272612286556399320873443068516991447037214833598518508798979965495812015");
        assertEquals(test.karatsuba(x,y), new BigInteger("8551664048968892035764827310621985700104429181183039862339115181632334111008566449981139303677102152475615977150451813908707880217676806490783762930161151350713342129833506462421020497489849585329787664605997284508284088644995587365910055827035190329282350"));
    }
    @Test
    void karatsubaWithVeryLargeSingleDigitNumbers() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        BigInteger y = new BigInteger("22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        assertEquals(test.karatsuba(x,y), new BigInteger("246913580246913580246913580246913580246913580246913580246913580246913580246913580246913580246913580246913580246913580246913580246913577777777777775308641975308641975308641975308641975308641975308641975308641975308641975308641975308641975308641975308641975308641975308641975308642"));
    }
    @Test
    void karatsubaWithVeryLargeNumbersWithDifferentDigits() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("54912929456625402256174854408349005059747367418045281224869677103460587001371838509047325775339825409089700424382586661886548455");
        BigInteger y = new BigInteger("46159761840763928340146255755371712831239294454920928659343103820160462080093196044837908676121279113445132081834876936121057294");
        assertEquals(test.karatsuba(x,y), new BigInteger("2534767745696498721291598226410808420875926624404989594109011804054230420328163716811636469827804550673802278410568911221048870743264706668346786117132264407551450821426489441139772838020127634525234251586349419324977858145598895358201970734412370962180770"));
    }
    @Test
    void karatsubaWithNumbersOfDifferentLength() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("77");
        BigInteger y = new BigInteger("123456789");
        assertEquals(test.karatsuba(x,y), new BigInteger("9506172753"));
    }
    @Test
    void karatsubaWithNumbersOfDifferentLength2() {
        KaratsubaImpl test = new KaratsubaImpl();
        BigInteger x = new BigInteger("2");
        BigInteger y = new BigInteger("565656565656565656565656");
        assertEquals(test.karatsuba(x,y), new BigInteger("1131313131313131313131312"));
    }
}