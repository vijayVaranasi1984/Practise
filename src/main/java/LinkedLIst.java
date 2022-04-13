import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedLIst {
    public static void main (String args [ ] )
    {
        LinkedList llist = new LinkedList();
        LinkedList<Integer> llist2 = new LinkedList<>();
        LinkedList<Integer> llist3 = new LinkedList<>();

        llist.push(11);
        llist.push(10);
        llist.push(9);
        llist.push(4);
        llist.push(6);
        llist.push(1);
        llist.push(0);



        llist2.add(11);
        llist2.add(10);
        llist2.add(9);
        llist2.add(6);
        llist2.add(4);
        llist2.add(1);
        llist2.add(0);

        //llist.forEach(l -> System.out.println(l));
        //System.out.println("\n");
        //llist2.forEach(l -> System.out.println(l));


        List<Integer> list = llist2.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        list.forEach(l -> System.out.println(l));
        System.out.println("\n");

        llist2.removeAll(list);

        llist2.forEach(l -> System.out.println(l));

    }
}
