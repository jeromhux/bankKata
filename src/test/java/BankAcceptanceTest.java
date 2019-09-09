import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BankAcceptanceTest {

    private CashMachine cashMachine = mock(CashMachine.class);
    private Account account = mock(Account.class);

    @Test
    public void deposit_add_amount_on_client_account() {
        Amount amount = new Amount(1000.0);

        cashMachine.deposit(amount, account);

        verify(account).add(amount);
    }
}
