package numbersExercises;

import java.util.HashSet;
import java.util.Set;

//        HappyNumber Example (19)
//        1^2 + 9^2=82
//        8^2 + 2^2=68
//        6^2 + 8^2=100
//        1^2 + 0^2 + 0^2 = 1

public class HappyNumber {
    public boolean checkHappy (int number) {
        Set<Integer> store = new HashSet<>();
        store.add(number);
        while(!store.contains(1)){
            number = numSquareSum(number);
            if(store.contains(number)) return false;    //when loop existing
            store.add(number);
        }
        return true;
    }

    public int numSquareSum ( int number) {
        int squareSum = 0;
        while(number != 0) {
            squareSum += (number%10)*(number%10);
            number /= 10;
        }
        return squareSum;
    }
}
