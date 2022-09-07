package Management;

public class Director extends Manager{
    private double budget;

    public Director(String name, String nni, int salary, String deptName, double budget) {
        super(name, nni, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
    public double payBonus(){
        return this.salary * 0.02;
    }
}
