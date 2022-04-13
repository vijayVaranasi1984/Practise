import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main (String args [ ] )
    {
        List<Integer> llist = new ArrayList<>();

        llist.add(11);
        llist.add(10);
        llist.add(9);
        llist.add(6);
        llist.add(9);
        llist.add(11);
        llist.add(0);

        int freq = Collections.frequency(llist,11);
        System.out.println(freq);

        Set<Integer> unique =  new HashSet<>(llist);
        //unique.forEach(i -> System.out.println(i));


        //public static int frequency(Collection c, Object o)
        //parameters:
        //c: Collection in which to determine the frequency of o.
        //o: Object whose frequency is to be determined.
        //It throws Null Pointer Exception if the Collection c is null


        System.out.println(llist.stream()
                .filter(i -> Collections.frequency(llist, i)==1)
                .mapToInt(Integer::intValue)
                .sum());

        System.out.println(llist.stream()
                .filter(i -> Collections.frequency(llist, i)>1)
                .collect(Collectors.toSet()));
    }
}
