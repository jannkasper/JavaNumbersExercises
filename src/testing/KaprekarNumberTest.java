package testing;

import numbersExercises.FibonacciNumber;
import numbersExercises.KaprekarNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KaprekarNumberTest {
    public KaprekarNumber kaprekarNumber;

    @Before
    public void init (){
        kaprekarNumber = new KaprekarNumber();
    }
    @Test
    public void test1 () {
        assertTrue(kaprekarNumber.checkKaprekar(45));
    }
    @Test
    public void test2 () {
        assertTrue(kaprekarNumber.checkKaprekar(2223));
    }
    @Test
    public void test3 () {
        assertFalse(kaprekarNumber.checkKaprekar(998));
    }

}