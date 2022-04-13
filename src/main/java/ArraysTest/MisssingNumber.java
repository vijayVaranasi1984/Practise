package ArraysTest;

import java.util.Arrays;

public class MisssingNumber {
    public static void main(String[] args) {
        int[] inp = {1,2,3,4,5,7};
        int n = inp.length;
        int miss = 0;
//        System.out.println("Enter (n-1) numbers: ");
//        for(int i=0; i<=n-2; i++) {
//            System.out.println(inp[i]);
//        }

        //Finding the missing number
        int sumOfAll = (n*(n+1))/2;
        int sumOfArray = 0;
        for(int i=0; i<=n-2; i++) {
            sumOfArray = sumOfArray+inp[i];
        }
        int missingNumber = sumOfAll-sumOfArray;
        System.out.println("Missing number is: "+missingNumber);

    }
}
