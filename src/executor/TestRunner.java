package executor;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import testing.NumericPalindromeTest;

public class TestRunner {
    public void numericPalindromeRun() {

        Result result = JUnitCore.runClasses(NumericPalindromeTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

    }
}
