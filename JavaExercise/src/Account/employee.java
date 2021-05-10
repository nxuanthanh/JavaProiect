package Account;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class employee {

    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public employee() {
    }

    public employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double raiseSalary(int per) {
        salary = salary + salary * per / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[" + " id=" + id + "|" + " name=" + firstName + " " + lastName + "| "
                + "salary=" + salary + ']';
    }
}
