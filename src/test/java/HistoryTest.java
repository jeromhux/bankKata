import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HistoryTest {

    private History history = new History();
    OperationTime operationTime = OperationTime.of(2021, 06, 12, 10, 0);

    @Test
    public void deposit_should_be_save_in_history() {
        Amount amount = Amount.of(1000);
        Operation deposit = Operation.of("DEPOSIT", amount, operationTime);

        history.saveDeposit(amount, operationTime);

        assertTrue(history.latestOperations().contains(deposit));
    }

    @Test
    public void withdrawal_should_be_save_in_history() {
        Amount amount = Amount.of(1000);
        Operation withdrawal = Operation.of("WITHDRAWAL", amount, operationTime);

        history.saveWithdrawal(amount, operationTime);

        assertTrue(history.latestOperations().contains(withdrawal));
    }
}
