/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SamplePackage;

import JavaClasses.EasyMaths;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brendan.Watson
 */
public class EasyMathsTest {
    
    public EasyMathsTest() {
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

    /**
     * Test of equal method, of class EasyMaths.
     */
   

    /**
     * Test of scalarMultiplication method, of class EasyMaths.
     */
    @Test (expected=IllegalArgumentException.class)
    public void testScalarMultiplication() {
        System.out.println("scalarMultiplication");
        int[] array1 = null;
        int[] array2 = null;
        int expResult = 0;
        EasyMaths obj = new EasyMaths();
        int result = obj.scalarMultiplication(array1, array2);
        assertEquals(expResult, result);
       
    }
    
}
