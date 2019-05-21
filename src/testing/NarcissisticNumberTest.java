package testing;

import numbersExercises.KaprekarNumber;
import numbersExercises.NarcissisticNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NarcissisticNumberTest {
    public NarcissisticNumber narcissisticNumber;

    @Before
    public void init (){
        narcissisticNumber = new NarcissisticNumber();
    }
    @Test
    public void test1 () {
        assertTrue(narcissisticNumber.checkNarcissistic(9));
    }
    @Test
    public void test2 () {
        assertTrue(narcissisticNumber.checkNarcissistic(407));
    }
    @Test
    public void test3 () {
        assertFalse(narcissisticNumber.checkNarcissistic(545));
    }
}