package ArraysTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NextNumber {

    public static void main(String[] args) {

        int[] inp = {11, 13, 21, 3};
        List<List<Integer>> output = new ArrayList<>();

        int next = 0;
        for (int i = 0; i < inp.length; i++) {
            next = -1;
            for (int j = i+1; j < inp.length; j++) {


                if(inp[i] < inp[j]){
                    next = inp[j];
                    break;
                }

            }
            System.out.println(inp[i]+" -- "+next);
        }






    }
}
