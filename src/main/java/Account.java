public class Account {

    private Amount balance;

    public Account() {
        this.balance = Amount.zero();
    }

    public Amount checkBalance() {
        return balance;
    }

    public void add(Amount amount) {
        balance = balance.sum(amount);
    }
}
