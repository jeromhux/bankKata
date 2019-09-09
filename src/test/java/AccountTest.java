import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void balance_should_grows_when_deposit() {
        Account account = new Account();
        Amount expectedBalance = amountOf(1200);

        account.add(amountOf(1200));

        assertEquals(expectedBalance, account.checkBalance());
    }

    private Amount amountOf(int val) {
        return new Amount(new BigDecimal(val));
    }
}
