package REVERSE;

public class Employee/* implements Comparable*/{

    String empname;
    int empid;
    int empdept;

    public Employee(String empname, int empid, int empdept) {
        this.empname = empname;
        this.empid = empid;
        this.empdept = empdept;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getEmpdept() {
        return empdept;
    }

    public void setEmpdept(int empdept) {
        this.empdept = empdept;
    }


//    @Override
//    public int compareTo(Object o) {
//        return 1;
//    }
}
