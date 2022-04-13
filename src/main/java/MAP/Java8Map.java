package MAP;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Map {
    public static void main (String[] args){

        Map<Integer,String> map = Map.of(201,"JavaFX",102,"Hibernate",503,"Spring MVC");

//        for(Map.Entry<Integer, String> m : map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }

        Map<Integer,String> sortedmap = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        for(Map.Entry<Integer, String> m : sortedmap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("vijay", new Department("dept1",1),10000));
        employees.add(new Employee("dss", new Department("dept2",2),40000));
        employees.add(new Employee("sdsd", new Department("dept1",1),60000));

        Department dept = new Department("dept1",1);



        Map<Department, Integer> totalByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)));



        totalByDept.forEach((key, value) -> {
            System.out.println("Key : " + key + " Value : " + value);
        });




        // key = id, value - websites
        Map<String, Integer> result1 = employees.stream().collect(
                Collectors.toMap(Employee::getEname, Employee::getSalary));




        result1.forEach((key, value) -> {
            System.out.println("Key : " + key + " Value : " + value);
        });








    }

}
