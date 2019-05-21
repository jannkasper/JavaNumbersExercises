package numbersExercises;

public class NumericPalindrome {
    public boolean checkIfPalindrome(int number){

        if (number < 1) {
            number = Math.abs(number);
        }

        int digit, sum = 0, temp = number;
        while( temp > 0){
            digit = temp%10;
            sum = (sum*10)+digit;
            temp = temp/10;
        }
        return (number == sum) ? true : false;
    }
}
