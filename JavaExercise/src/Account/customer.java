package Account;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class customer {

    private int id;
    private String name;
    private char gender;

    public customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer: " + name + "(" + id + ")";
    }
}
