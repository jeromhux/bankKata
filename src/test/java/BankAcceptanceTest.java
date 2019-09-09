import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BankAcceptanceTest {

    private Account account = mock(Account.class);
    private CashMachine cashMachine = CashMachine.connexion(account);
    private OperationTime operationTime = mock(OperationTime.class);

    @Test
    public void deposit_add_amount_on_client_account() {
        Amount amount = new Amount(new BigDecimal(100));

        cashMachine.deposit(amount, operationTime);

        verify(account).add(amount, operationTime);
    }

    @Test
    public void withdrawal_subtract_amount_on_client_account() {
        Amount amount = new Amount(new BigDecimal(1000));

        cashMachine.withdrawal(amount, operationTime);

        verify(account).subtract(amount, operationTime);
    }

}
