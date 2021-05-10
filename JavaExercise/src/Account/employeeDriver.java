package Account;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class employeeDriver {

    public static void main(String[] args) {
        employee nv1 = new employee(410131, "Nguyễn Xuân", "Thành ", 2508);
        System.out.println(nv1);
        System.out.println("annuaSalary= " + nv1.getAnnualSalary());
        System.out.println("raiseSalary=" + nv1.raiseSalary(10));
    }
}
