package executor;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import testing.*;

public class TestRunner {
    public void numericPalindromeRun() {

        Result result = JUnitCore.runClasses(NumericPalindromeTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

    }
    public void fibonacciNumberRun() {

        Result result = JUnitCore.runClasses(FibonacciNumberTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

    }
    public void kaprekarNumberRun() {

        Result result = JUnitCore.runClasses(KaprekarNumberTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

    }

    public void happyNumberRun () {

        Result result = JUnitCore.runClasses(HappyNumberTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

    public void narcissisticNumberRun () {

        Result result = JUnitCore.runClasses(NarcissisticNumberTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
