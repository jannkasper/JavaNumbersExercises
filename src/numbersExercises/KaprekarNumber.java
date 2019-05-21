package numbersExercises;

public class KaprekarNumber {
    public boolean checkKaprekar (long number) {
        String sqrNumber = Long.toString(number*number);
        for (int i =1; i<sqrNumber.length()/2+1;i++) {
            String[] parts = splitNumber(sqrNumber,i);
            if (Long.parseLong(parts[0]) + Long.parseLong(parts[1]) == number) return true;
        }
        
     return false;
    }
    public String[] splitNumber(String number, int index) {
        String[] result = new String[2];
        result[0] = number.substring(0,index);
        result[1] = number.substring(index);
        return result;
    }
}
