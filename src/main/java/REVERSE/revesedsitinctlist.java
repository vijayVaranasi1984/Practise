package REVERSE;



import java.util.*;
import java.util.stream.Collectors;

public class revesedsitinctlist {

    public static void main(String[] args) {
        List<String> arrlst = new ArrayList<String>();
        List<String> Distarrlst = new ArrayList<String>();

        // populate the list
        arrlst.add("A");
        arrlst.add("A");
        arrlst.add("C");
        arrlst.add("E");
        arrlst.add("D");
        arrlst.add("B");

        System.out.println("The initial list is :"+arrlst);

        TreeSet<String> tree =  new TreeSet<>(arrlst);
        LinkedHashSet<String> link =  new LinkedHashSet<>(arrlst);
        //NavigableSet<String> nav =  new NavigableSet<>(arrlst);//'NavigableSet' is abstract; cannot be instantiated

        System.out.println("The TreeSet set is :"+tree);

        System.out.println("The LinkedHashSet set is :"+link);

        Set<String> set = arrlst.stream().collect(Collectors.toSet());
        System.out.println("The  set is :"+set);
        // reverse the list
        Collections.reverse(arrlst);

        System.out.println("The Reverse List is :"+arrlst);

        Distarrlst = arrlst.stream().distinct().collect(Collectors.toList());

        System.out.println("The distinct List is :"+Distarrlst);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("vijay",1,2));
        empList.add(new Employee("vijay2",1,2));

        Collections.reverse(empList);
        empList.forEach((x) -> System.out.println(x.getEmpname()));

    }
}
