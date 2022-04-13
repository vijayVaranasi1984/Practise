package MAP;

public class Department {
    String department;
    int departId;

    public Department(String department, int departId) {
        this.department = department;
        this.departId = departId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getDepartId() {
        return departId;
    }

    public void setDepartId(int departId) {
        this.departId = departId;
    }
}
