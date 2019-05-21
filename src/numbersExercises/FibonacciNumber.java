package numbersExercises;

public class FibonacciNumber {
    public boolean checkFibonacci (int number) {

        int i = 1;
        int fibNumber = isFibonacci(i++);
        while (fibNumber != number){
            if (fibNumber > number) return false;
            fibNumber = isFibonacci(i++);
        }
        return true;
    }



    public int isFibonacci (int seriesPosition) {
        if (seriesPosition == 1 || seriesPosition == 2) {
            return 1;
        } else {
            return isFibonacci(seriesPosition - 1) + isFibonacci(seriesPosition - 2);
        }
    }
}
