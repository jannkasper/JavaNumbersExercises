package testing;

import numbersExercises.NumericPalindrome;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumericPalindromeTest {
    private NumericPalindrome numericPalindrome;

    @Before
    public void iniit () {
        numericPalindrome = new NumericPalindrome();
    }
    @Test
    public void test1() {
        assertTrue(numericPalindrome.checkIfPalindrome(-12721));
    }
    @Test
    public void test2() {
        assertTrue(numericPalindrome.checkIfPalindrome(1221));
    }

    @Test
    public void test3() {
        assertFalse(numericPalindrome.checkIfPalindrome(1234));
    }

}