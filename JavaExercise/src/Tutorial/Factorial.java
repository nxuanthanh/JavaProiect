package Tutorial;

/**
 *
 * @author Admin
 */
public class Factorial {

    public static long fact(int n) {
        //tinh n gia thua
        int kq = 1;
        for (int i = 2; i <= n; i++) {
            kq *= i;
        }
        return kq;
    }

    public static void main(String[] args) {
        long S = fact(7) + fact(10) + fact(12) + fact(14);
        System.out.println("Sum = " + S);
    }
}
