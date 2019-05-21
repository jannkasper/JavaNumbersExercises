package numbersExercises;

//      Narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits.
//      Example (153)
//      153 == 1^3 + 5^3 + 3^3

public class NarcissisticNumber {
    public boolean checkNarcissistic (int number) {
        int length = Integer.toString(number).length();
        int sum = 0, copyNumber = number;
        for (int i = 0; i<length; i++){
            sum += Math.pow(copyNumber%10, length);
            copyNumber /= 10;
        }

        return (number == sum) ? true : false;
    }
}
