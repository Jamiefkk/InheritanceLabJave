package Staff;

public abstract class Employee {

    protected String name;
    protected String nni;
    protected int salary;

    public Employee(String name, String nni, int salary) {
        this.name = name;
        this.nni = nni;
        this.salary = salary;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public String getNni() {
        return nni;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double payRise){
        if (payRise>=0){
            this.salary += payRise;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
