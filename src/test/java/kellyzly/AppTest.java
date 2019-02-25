package kellyzly;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    private App app = new App(new Publisher(), new Observer());
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
     * test the case
     * //We trust/use the last trading date and delivery date from the LME exchange over that of PRIME.
     */
    public void testApp() {
        assertTrue(true);
        StockData stockData_prime = new StockData("15-03-2018",
                "17-03-2018", "PB", "Lead 13 March 2018", SystemType.PRIME
        );

        StockData stockData_lme = new StockData("14-03-2018",
                "16-03-2018", "PB", "Lead 13 March 2018", SystemType.LME
        );
        String exchangeCode = "PB_03_2018";
        Publisher publisher = new Publisher();
        publisher.setObserver(new Observer());
        app.setPublisher(publisher);
        app.notifyStockData(exchangeCode,stockData_prime);
        Assert.assertEquals(app.getPublisher().getObserver().getMemoryStore().get(exchangeCode).getLAST_TRADING_DATE(),"15-03-2018");
        app.notifyStockData(exchangeCode, stockData_lme);
        Assert.assertEquals(app.getPublisher().getObserver().getMemoryStore().get(exchangeCode).getLAST_TRADING_DATE(),"14-03-2018");

    }

    }