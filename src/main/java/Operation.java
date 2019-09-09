class Operation {

    private String deposit;
    private Amount amount;
    private OperationTime operationTime;

    public Operation(String deposit, Amount amount, OperationTime operationTime) {
        this.deposit = deposit;
        this.amount = amount;
        this.operationTime = operationTime;
    }

    public static Operation of(String deposit, Amount amount, OperationTime operationTime) {
        return new Operation(deposit, amount, operationTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operation operation = (Operation) o;

        if (deposit != null ? !deposit.equals(operation.deposit) : operation.deposit != null) return false;
        if (amount != null ? !amount.equals(operation.amount) : operation.amount != null) return false;
        return operationTime != null ? operationTime.equals(operation.operationTime) : operation.operationTime == null;
    }

    @Override
    public int hashCode() {
        int result = deposit != null ? deposit.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (operationTime != null ? operationTime.hashCode() : 0);
        return result;
    }
}
