package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary > 20000) {
            salary = 20 * salary / 100;
            System.out.println(salary);
        } else if (salary > 10000) {
            salary = 18 * salary / 100;
            System.out.println(salary);
        } else if (salary > 0 && salary < 10000) {
            salary = 15 * salary / 100;
            System.out.println(salary);
        } else {
            System.out.println("wrong input");
        }
    }
}