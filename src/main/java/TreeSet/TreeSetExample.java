package TreeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args){

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("vijay",1,2));
        empList.add(new Employee("vijay",1,2));



        //empList.forEach((x) -> System.out.println(x.getEmpname()));

        TreeSet<Employee> emptree = new TreeSet<Employee>();
        emptree.add(new Employee("vijay",1,2));
        emptree.add(new Employee("vijaydf",1,2));

                
        emptree.forEach((x) -> System.out.println(x.getEmpname()));


    }


}
