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
public class Studentt {

    private String ID;
    private String FullName;
    private String Email;
    private String Address;
    private String phone;

    public Studentt() {
    }

    public Studentt(String ID, String FullName) {
        this.ID = ID;
        this.FullName = FullName;
    }

    public Studentt(String ID, String FullName, String Email, String Address, String phone) {
        this.ID = ID;
        this.FullName = FullName;
        this.Email = Email;
        this.Address = Address;
        this.phone = phone;
    }

    public void goSchool() {
        System.out.println("i'm going to School");
    }

    public void doHomework(String Subject) {
        System.out.println("I'm going my " + Subject + " homework");
    }

    public void payFee(String Subject, float amount) {
        System.out.println("pay fee for " + Subject + ", Fee: " + amount);
    }

    public boolean doFinaltest(String Subject) {
        if (Subject != null && Subject.toLowerCase().compareTo("math") == 0) {
            return true;
        }
        return false;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Studentt{" + "ID = " + ID + ", FullName = " + FullName
                + ", Email = " + Email + ", Address = " + Address + ", phone = " + phone + '}';
    }

}
