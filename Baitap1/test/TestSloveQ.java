/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import baitap1.Baitap1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phi
 */
public class TestSloveQ {
    
    public TestSloveQ() {
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
     public void testSlove() {
        double delta = 0.0001;
        double a = 1;
        double b = -3;
        double c = 2;
        double[] expectedResult = {1,2}; // x1 and x2
        double[] expectedResult2 = {1,-2}; 
        double[] result = Baitap1.solve(a, b, c);
        
        org.junit.Assert.assertArrayEquals(expectedResult, result, delta);
         
       
        
     
     }
}
