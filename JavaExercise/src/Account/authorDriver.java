package Account;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class authorDriver {

    public static void main(String[] args) {
        author author = new author("Nguyễn Xuân Thành", " thanhtrungvp8@gmail.com", 'm');
        book b1 = new book("straw hat", 4000, author);
        System.out.println(b1);
    }
}
