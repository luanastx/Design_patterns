package Five;

public class Five_salary {
    public double salary;
    public final double minsalary = 1320;

    public Five_salary(double salary) {
        this.salary = salary;
    }

    public void quantSalary(){
        System.out.println("A quantidade de salarios minimos é: "+(salary/minsalary));
    }
}
