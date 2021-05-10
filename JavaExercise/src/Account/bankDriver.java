package Account;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class bankDriver {

    public static void main(String[] args) {
        customer k1 = new customer(410131, " Nguyễn văn Tý", 'm');
        customer k2 = new customer(1811505, " Lý Văn Tèo", 'n');
        Account taikhoan1 = new Account(410131, k1, 2266);
        Account taikhoan2 = new Account(1811505, k2, 6387);
        System.out.println(taikhoan1.toString());
        System.out.println(taikhoan2.toString());
    }
}
