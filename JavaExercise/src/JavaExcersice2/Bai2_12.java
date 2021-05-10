package JavaExcersice2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành
 * Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ
cơ số b bất kì (2 < b ≤ 36)
 */
public class Bai2_12 {
    public static final String Base ="0123456789ABCDEFGHIJKLMNOPQRSTUVXYZW";
    public static String result(int n, int m){
        StringBuilder stb = new StringBuilder();
        int x =0;
        while (n>0) {            
            x = n%m;
            n /= m;
            stb.append(Base.charAt(x));
            
        }
        return stb.reverse().toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Nhap gia tri, co so: ");
        n = sc.nextInt();
        m = sc.nextInt();
        
        System.out.println("Ket qua: " + result(n, m));
        
    }
}
