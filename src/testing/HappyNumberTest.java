package testing;

import numbersExercises.FibonacciNumber;
import numbersExercises.HappyNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {
    public HappyNumber happyNumber;

    @Before
    public void init (){
        happyNumber = new HappyNumber();
    }
    @Test
    public void test1 () {
        assertTrue(happyNumber.checkHappy(19));
    }
    @Test
    public void test2 () {
        assertTrue(happyNumber.checkHappy(31));
    }
    @Test
    public void test3 () {
        assertFalse(happyNumber.checkHappy(16));
    }

}