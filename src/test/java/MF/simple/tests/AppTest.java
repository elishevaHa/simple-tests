package MF.simple.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAppA()
    {
        TimeUnit.SECONDS.sleep(10);
        TimeUnit.SECONDS.sleep(10);
        TimeUnit.SECONDS.sleep(10);
        TimeUnit.SECONDS.sleep(10);
        assertTrue( false );
    }

    public void testSleep()
    {
        TimeUnit.SECONDS.sleep(10);
        assertTrue( false );
    }

    public void testAppB()
    {
        TimeUnit.SECONDS.sleep(10);
        assertTrue( true );
    }

    public void testAppC()
    {
        assertTrue( true );
    }

    public void testAlwaysFail()
    {
        assertTrue( true );
    }
}
