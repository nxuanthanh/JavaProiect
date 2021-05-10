package JavaOOP;

/**
 *
 * @author Admin
 */
class Person {

    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Nhan vien: " + name + ", " + age + " tuoi, dia chi: " + address);
    }
}

public class Employee extends Person {

    private float salry;
    private float rate;

    public Employee(String name, int age, String address, float salry, float rate) {
        super(name, age, address);
        this.salry = salry;
        this.rate = rate;
    }

    public float totalSalary() {
        return salry * rate;
    }

    public void display() {
        super.display();
        System.out.println("Co tong luong la: " + totalSalary());
    }

    public static void main(String[] args) {
        Employee A = new Employee("Thanh", 30, "Quang Binh", 11050, 3.66f);
        A.display();
    }

}
