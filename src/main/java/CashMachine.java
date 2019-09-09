public class CashMachine {

    private Account account;

    private CashMachine(Account account) {
        this.account = account;
    }

    public static CashMachine connexion(Account account) {
        return new CashMachine(account);
    }

    public void deposit(Amount amount, OperationTime operationTime) {
        account.add(amount);
    }

    public void withdrawal(Amount amount, OperationTime operationTime) {
        account.subtract(amount);
    }
}
