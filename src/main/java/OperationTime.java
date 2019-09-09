import java.time.LocalDateTime;

public class OperationTime {

    private LocalDateTime operationTime;

    public OperationTime(LocalDateTime operationTime) {
        this.operationTime = operationTime;
    }

    public static OperationTime of(int year, int month, int day, int hour, int minute) {
        return new OperationTime(LocalDateTime.of(year, month, day, hour, minute));
    }
}
