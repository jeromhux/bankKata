import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HistoryTest {

    @Test
    public void deposit_should_be_save_in_history() {
        History history = new History();
        OperationTime operationTime = OperationTime.of(2021, 06, 12, 10, 0);
        Amount amount = Amount.of(1000);
        Operation deposit = Operation.of("DEPOSIT", amount, operationTime);

        history.saveDeposit(amount, operationTime);

        assertTrue(history.latestOperations().contains(deposit));
    }
}
