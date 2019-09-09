import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    History history = new History();
    OperationTime operationTime = OperationTime.of(2019, 11, 11, 11, 0);

    @Test
    public void balance_should_grows_when_deposit() {
        Account account = new Account(history);
        Amount expectedBalance = Amount.of(1200);

        account.add(Amount.of(1200), operationTime);

        assertEquals(expectedBalance, account.checkBalance());
    }

    @Test
    public void balance_should_grows_when_deposit_twice() {
        Account account = new Account(history);
        Amount expectedBalance = Amount.of(2000);
        account.add(Amount.of(1200), operationTime);
        account.add(Amount.of(800), operationTime);

        Amount actual = account.checkBalance();

        assertEquals(expectedBalance, actual);
    }

    @Test
    public void balance_should_decrease_when_withdrawal() {
        Account account = new Account(history);
        Amount expectedBalance = Amount.of(1000);
        account.add(Amount.of(1200), operationTime);
        account.subtract(Amount.of(200), operationTime);

        Amount actual = account.checkBalance();

        assertEquals(expectedBalance, actual);
    }

}
