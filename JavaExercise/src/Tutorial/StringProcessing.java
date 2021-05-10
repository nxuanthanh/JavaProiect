package Tutorial;

/**
 *
 * @author Admin
 */
public class StringProcessing {

    public static void main(String[] args) {
        String s = "Write a Java program very easily";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("So luong ki tu a co trong chuoi la: " + count);
        int index = s.indexOf("Java");
        if (index >= 0) {
            System.out.println("Tu Java dau tien cua chuoi o vi tri " + index);
        } else {
            System.out.println("Chuoi khong chua tu Java");
        }
        if (s.startsWith("Write") == true) {
            System.out.println("Chuoi bat dau voi tu Write");
        } else {
            System.out.println("Tu Write Khong bat dau chuoi");
        }
        if (s.endsWith("easily") == true) {
            System.out.println("tu easily ket thuc chuoi");
        } else {
            System.out.println("Tu easily khong bat dau chuoi");
        }
    }
}
