import lombok.Getter;

import java.math.BigDecimal;

public class Amount {

    @Getter
    private final BigDecimal value;

    public Amount(BigDecimal value) {
        this.value = value;
    }

    public static Amount zero() {
        return new Amount(new BigDecimal(0));
    }


    public Amount sum(Amount otherAmount) {
        return new Amount(value.add(otherAmount.getValue()));
    }

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amount amount = (Amount) o;

        return value != null ? value.equals(amount.value) : amount.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
