package persistentCoding;

import java.util.*;
import java.util.stream.Collectors;

public class Persistent2D {
    public static void main(String[] args) {

        Integer[] inp = {1,2,1,2,1,4};
        List<List<Integer>> output =  new ArrayList<>();

        List<Integer> input = Arrays.asList(inp).stream().sorted().collect(Collectors.toList());

        List<Integer> distinct = input.stream().distinct().collect(Collectors.toList());

        for (Integer ex: distinct) {
            output.add(Arrays.asList(ex, Collections.frequency(input,ex)));
       }

        output.forEach(System.out::println);

    }
}
