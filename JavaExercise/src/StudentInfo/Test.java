/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentInfo;

/**
 *
 * @author Xuan Thanh
 */
public class Test {
    public static void main(String[] args) {
        Studentt s = new Studentt("1811505410131", "Nguyen Xuan Thanh", "n.xuanthanhh@gmail.com", "Quang Binh", "0763156709");
        s.doFinaltest("math");
        s.doHomework("math");
        s.goSchool();
        s.payFee("physics", 1000);
        System.out.println(s);
        
        s.setAddress("Da Nang");
        s.getAddress();
        System.out.println(s.getAddress());
        
        Studentt st = new Studentt("1811505410131", "Nguyen Xuan Thanh");
        System.out.println(st);
    }
}
