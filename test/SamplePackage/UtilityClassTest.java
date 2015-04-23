/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SamplePackage;

import JavaClasses.UtilityClass;
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
public class UtilityClassTest {
    
    public UtilityClassTest() {
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

   
       @Test
  public void concatWords_inputStringsHelloWorld_OutputsOneString() {
        System.out.println("concatWords");
         UtilityClass obj = new UtilityClass();
        String result = obj.concatWords("Hello", ", ", "world", "!");
        String expResult = "Hello, world!";
         assertEquals(expResult, result);
    }
      @Test
    public void computeFactorial_Factorial5_Is120(){
    System.out.println("ComputeFactorial 5");
     UtilityClass obj = new UtilityClass();
    assertEquals("120",obj.computeFactorial(5));
    }

 @Test (expected=IllegalArgumentException.class)
    public void computeFactorial_FactorialNegative5_ThrowsException() {
    System.out.println("computeFactorial of -5");
    final int factorialOf = -5;
    UtilityClass obj = new UtilityClass();
    System.out.println(factorialOf + "! = " + obj.computeFactorial(factorialOf));
}

}
