public class Account {

    private History history;
    private Amount balance;

    public Account(History history) {
        this.history = history;
        this.balance = Amount.zero();
    }

    public Amount checkBalance() {
        return balance;
    }

    public void add(Amount amount, OperationTime operationTime) {
        balance = balance.sum(amount);
        history.saveDeposit(amount, operationTime);
    }

    public void subtract(Amount amount, OperationTime operationTime) {
        balance = balance.deduction(amount);
        history.saveWithdrawal(amount, operationTime);
    }
}
