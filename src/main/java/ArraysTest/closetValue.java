package ArraysTest;

public class closetValue {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 6;
        numbers[5] = 7;
        numbers[6] = 8;
        numbers[7] = 34;
        numbers[8] = 23;
        numbers[9] = 32;

        int myNumber = 20;
        int distance = Math.abs(numbers[0] - myNumber);
        int idx = 0;
        for(int c = 1; c < numbers.length; c++){
            int cdistance = Math.abs(numbers[c] - myNumber);
            if(cdistance < distance){
                idx = c;
                distance = cdistance;
            }
        }
        int theNumber = numbers[idx];
        System.out.println(theNumber);
    }
}
