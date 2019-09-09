import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HistoryAcceptanceTest {

    private History history = mock(History.class);
    private Account account = new Account(history);
    private OperationTime operationTime = mock(OperationTime.class);

    @Test
    public void deposit_are_added_to_history() {
        Amount depositAmount = new Amount(new BigDecimal(2000));

        account.add(depositAmount, operationTime);

        verify(history).saveDeposit(depositAmount, operationTime);
    }

}
