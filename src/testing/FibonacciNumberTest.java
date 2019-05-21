package testing;

import numbersExercises.FibonacciNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumberTest {
    public FibonacciNumber fibonacciNumber;

    @Before
    public void init (){
        fibonacciNumber = new FibonacciNumber();
    }
    @Test
    public void test1 () {
        assertTrue(fibonacciNumber.checkFibonacci(3));
    }
    @Test
    public void test2 () {
        assertTrue(fibonacciNumber.checkFibonacci(1597));
    }
    @Test
    public void test3 () {
        assertFalse(fibonacciNumber.checkFibonacci(1111));
    }

}