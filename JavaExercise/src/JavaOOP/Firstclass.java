package JavaOOP;

/**
 *
 * @author Admin
 */
public class Firstclass {

    private String msg;

    public Firstclass(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static void main(String[] args) {
        Firstclass f = new Firstclass("Hello");
        String msg = f.getMsg();
        System.out.println(msg);
        msg = msg + " Java";
        f.setMsg(msg);
        System.out.println(f.getMsg());
    }
}
