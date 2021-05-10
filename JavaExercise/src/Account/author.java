package Account;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class author {

    private String name;
    private String email;
    private char gender;

    public author() {
    }

    public author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}
