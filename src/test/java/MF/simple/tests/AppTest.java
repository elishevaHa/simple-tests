package MF.simple.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testAppA() {
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;
        assertTrue(true);
    }

    public void testSleep() {
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;for (int i = 0; i < 1000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;


        assertTrue(true);
    }

    public void testAppB() {
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;
        for (int i = 0; i < 10000000; i++) ;

        assertTrue(true);
    }

    public void testAppC() {
        assertTrue(true);
    }

    public void testAlwaysFail() {
        assertTrue(false);
    }
}
