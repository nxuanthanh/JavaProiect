package JavaOOP;

import java.util.Scanner;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Arrays;

public class StudentManagement {

    // dÃ¹ng Ä‘á»ƒ chá»©a danh sÃ¡ch sinh viÃªn
    Vector list = new Vector();

    public StudentManagement() {
        while (true) {
            System.out.println("*-CHUONG TRINH QUAN LI SINH VIEN-*");
            System.out.println("*-Chuc nang chinh cua chuong trinh-*");
            System.out.println("    1. Nhap danh sach sinh vien. ");
            System.out.println("    2. Xem danh sach sinh vien.");
            System.out.println("    3. Sap xep danh sach sinh vien tang dan diem trung binh.");
            System.out.println("    4. Tim sinh vien theo ten.");
            System.out.println("    5. Thoat.");
            System.out.println("    ------------------------------------");

            // Nhap mot so tu ban phim
            int num;
            Scanner keyboard = new Scanner(System.in);
            System.out.print("    Nhap mot so de chon chuc nang: ");
            num = keyboard.nextInt();

            switch (num) {
                case 1:
                    this.input();
                    break;
                case 2:
                    this.view();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.out.print("---- Chuong trinh ket thuc ----");
                    return;
            }

        }
    }

    // nhap danh sach sinh vien
    public void input() {
        int num;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("    Nhap so luong sinh vien: ");
        num = keyboard.nextInt();

        // Nhap thong tin cho moi sinh vien
        for (int i = 1; i <= num; i++) {
            System.out.println("    Nhap thong tin cho sinh vien thu: " + i);
            System.out.print("    ID: ");
            int id = Integer.parseInt(keyboard.next());
            keyboard.nextLine();
            System.out.print("    Ten: ");
            String name = keyboard.nextLine();
            System.out.print("  Diem trung binh: ");
            float aver = keyboard.nextFloat();

            // Sau khi nhap thong tin, tao doi tuong sinh vien
            Student st = new Student(id, name, aver);

            /* luu doi tuong vao danh sach sinh vien */
            list.add(st);
        }
        System.out.println("\n--------------------\n");
    }

    // Xem danh sach sinh vien
    public void view() {
        /* hien thi danh sach sinh vien */
        System.out.println("    Thong tin danh sach sinh vien");
        // lay sinh vien tu danh sach(vector) va luu tru o vEnum
        Enumeration vEnum = list.elements();

        // duyet tung phan tu cua vEnum
        int i = 1;
        // chÆ°a háº¿t pháº§n tá»­
        while (vEnum.hasMoreElements()) {
            // láº¥y pháº§n tá»­ tá»« vEnum Ã©p láº¡i kiá»ƒu Student
            Student sts = (Student) vEnum.nextElement();
            // hiá»ƒn thá»‹ thÃ´ng tin sinh viÃªn
            System.out.println("    " + i + ". ID = " + sts.getId() + ", Ten = " + sts.getName()
                    + ", Diem trung binh = " + sts.getAver());
            i++;
        }
        System.out.println("\n-----------\n");

    }

    public void sort() {

        Student[] sts = new Student[list.size()];
        int index = 0;
        Enumeration vEnum = list.elements();
        while (vEnum.hasMoreElements()) {
            sts[index] = (Student) vEnum.nextElement();
            index++;
        }
        // sap xep mang
        Arrays.sort(sts);
        System.out.println("\n--Danh sach sinh vien sau khi sap xep--");
        for (index = 0; index < sts.length; index++) {
            // hiá»ƒn thá»‹ thÃ´ng tin sinh viÃªn sau khi sap xep
            System.out.println("    " + (index + 1) + ". ID = " + sts[index].getId() + ", Ten = " + sts[index].getName()
                    + ", Diem trung binh = " + sts[index].getAver());
        }
        System.out.println("\n--------------\n");

    }

    // Tim kiem sinh vien theo ten
    public void search() {
        // Nhap ten sinh vien can tim kiem
        Scanner keyboard = new Scanner(System.in);
        System.out.print(" Nhap ten sinh vien can tim: ");
        String name = keyboard.nextLine();
        // duyet tung phan tu cá»§a mnagr Ä‘á»ƒ so sÃ¡nh
        Enumeration vEnum = list.elements();
        System.out.println("\n--Thong tin tim kiem  dc--");

        while (vEnum.hasMoreElements()) {
            Student sts = (Student) vEnum.nextElement();
            // Náº¿u tÃªn sinh viÃªn chá»©a chuá»•i nháº­p vÃ o thÃ¬ hiá»ƒn thá»‹ thÃ´ng tin chá»©a Ä‘á»‘i tÆ°á»£ng
            // sinh viÃªn
            if (sts.getName().indexOf(name) != -1) {
                System.out.println(
                        " ID = " + sts.getId() + ", Ten = " + sts.getName() + ", Diem trung binh =" + sts.getAver());
            }
        }
        System.out.println("\n-------------\n");
    }

    public static void main(String[] args) {
        // khÃ´i tao chuong trinh
        new StudentManagement();
    }
}

// XÃ¢y dá»±ng lá»›p student thá»±c hiá»‡n interface Comparable, Ä‘á»‹nh nghÄ©a cá»¥ thá»ƒ hÃ m
// compareTo Ä‘á»ƒ phá»¥c vá»¥ sáº¯p xáº¿p
class Student implements Comparable {

    private int id;
    private String name;
    private float aver;

    // Ham khoi tao mac dinh
    public Student() {
        name = new String("");
        id = 0;
        aver = 0;
    }

    // HÃ m khá»Ÿi táº¡o ba Ä‘á»‘i sá»‘
    public Student(int i, String n, float a) {
        id = i;
        name = n;
        aver = a;
    }

    // HÃ m láº¥y giÃ¡ trá»‹ name
    public String getName() {
        return name;
    }

    // HÃ m láº¥y giÃ¡ trá»‹ id
    public int getId() {
        return id;
    }

    // HÃ m láº¥y giÃ¡ trá»‹ aver
    public float getAver() {
        return aver;
    }

    // HÃ m so sÃ¡nh 2 Ä‘á»‘i tÆ°á»£ng Student phá»¥c vá»¥ sáº¯p xÃªp
    public int compareTo(Object other) {
        Student otherRect = (Student) other;
        return (int) (this.aver - otherRect.aver);
    }
}
