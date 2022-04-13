import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayExamples {
    public static void main(String[] args){
        int[] intArray = new int[] {1,2,2,5,5,8,4};


        int[] array = new int[4+intArray.length];

        List<Integer> intlist = Arrays.stream(intArray).distinct()// IntStream
                .boxed() // Stream<Integer>
                .collect(Collectors.toList());

        int j = 0;
        for (int i=0;i< intArray.length-1;i++)
            if (intArray[i] != intArray[i+1])
                intArray[j++] = intArray[i];

        intArray[j++] = intArray[intArray.length-1];

        for (int each:
                intArray) {
            System.out.println(each);

        }

        //intlist.forEach((a) -> System.out.println(a));

        Object[] intArray4 = new Object[] {1,2,2,5,5,8,4};

        int[] intArray2 = {1,2,2,5,5,8,4};

        Integer[] intArray5 = {1,2,2,5,5,8,4};

        String [] str = {"123", "345", "437", "894"};


        List<String> stringList = Arrays.asList(str);

        List<Integer> intList = Arrays.asList(intArray5);

        int[] intArray3 = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();//String[] to int[]

        List<Integer> intList2 =  new ArrayList<>();

        for(String each:str){
            intList2.add(Integer.parseInt(each));
        }
        //intList2.forEach((a) -> System.out.println(a));

        List<Integer> list = Arrays.stream(intArray2)// IntStream
                .boxed() // Stream<Integer>
                .collect(Collectors.toList());

        IntStream intStream1 =Arrays.stream(intArray).distinct();
        IntStream intStream2 =Arrays.stream(intArray).sorted();


        //intStream1.forEach((a) -> System.out.println(a));//{1,2,5,8,4}
        //System.out.println("\n");
        //intStream2.forEach((a) -> System.out.println(a));//[1,2,2,4,5,5,8]
        System.out.println("\n");
        //list.forEach((a) -> System.out.println(a));
        System.out.println("\n");
        Collections.reverse(list);
        //list.forEach((a) -> System.out.println(a));

//        for (int i = 0; i < intArray4.length / 2; i++) {
//            Object temp = intArray4[i];
//            intArray4[i] = intArray4[intArray4.length - 1 - i];
//            intArray4[intArray4.length - 1 - i] = temp;
//        }

        for (int i = intArray4.length - 1; i >= 0; i--)
            //System.out.print(intArray4[i]);//reverse


        System.out.println("\n");
        for (Object each:
                intArray4) {
            //System.out.println(each);
        }
        String input = "GeeksforGeeks";
        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--){
            //System.out.print(try1[i]);
        }


        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1 = input1.reverse();
        System.out.println("\n");
        // print reversed String
        //System.out.println(input1);

    }
}
