package JavaExcersice2;

import java.math.BigInteger;

/**
 *
 * @author Nguyễn Xuân Thành 
 * Thao tac voi so lon
 */
public class Bai2_14 {

    public static void main(String[] args) {
        BigInteger number1, number2;
        number1 = new BigInteger("99999999999999999999999999999999999999999999999999");
        number2 = new BigInteger("88888888888888888888888888888888888888888888888888888888888");

        System.out.println("Tong: " + number1.add(number2));
        System.out.println("Hieu: " + number1.subtract(number2));
        System.out.println("Tich: " + number1.multiply(number2));
        System.out.println("Thuong: " + number2.divide(number1));

    }
}
