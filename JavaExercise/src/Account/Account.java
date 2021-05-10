package Account;

/**
 *
 * @author Admin
 */
public class Account {
    private int id;
    private customer customer;
    private double balance = 0;

    public Account(int id, customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credit(double amount) {
        balance = amount + balance;
        return balance;
    }

    public double debit(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public double transferTo(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id= " + id + ", name=" + customer.getName() + ", balance= " + balance + "]";
    }

}

