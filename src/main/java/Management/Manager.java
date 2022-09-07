package Management;
import Staff.Employee;

public class Manager extends Employee {
    private String deptName;


    public Manager(String name, String nni, int salary, String deptName) {
        super(name, nni, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
