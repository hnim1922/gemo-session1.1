/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pricing.Coffee;

/**
 *
 * @author AN515
 */
public class PricingTest {

    public PricingTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCase1() {
        Coffee coffee1 = new Coffee("Hot", "M", false, 0, false);
        double price1 = coffee1.calculatePrice2();
        assertEquals(2.5, price1, 0.001);
    }
    
    public void testCase2() {
        Coffee coffee1 = new Coffee("Hot", "M", false, 0, false);
        double price1 = coffee1.calculatePrice2();
        assertEquals(2.5, price1, 0.001);
    }
    
    public void testCase3() {
        Coffee coffee1 = new Coffee("Hot", "L", false, 0, false);
        double price1 = coffee1.calculatePrice2();
        assertEquals(0.0, price1, 0.001);
    }
    
}
