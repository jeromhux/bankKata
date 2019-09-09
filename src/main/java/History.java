
import java.util.ArrayList;
import java.util.List;

public class History {

    private List<Operation> operations;

    public History() {
        this.operations = new ArrayList<>();
    }

    public void saveDeposit(Amount depositAmount, OperationTime operationTime) {
        operations.add(Operation.of("DEPOSIT", depositAmount, operationTime));
    }

    public List<Operation> latestOperations() {
        return operations;
    }
}
