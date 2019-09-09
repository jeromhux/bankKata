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

    public static Amount of(double val) {
        return new Amount(new BigDecimal(val));
    }


    public Amount sum(Amount otherAmount) {
        return new Amount(value.add(otherAmount.getValue()));
    }

    public Amount deduction(Amount otherAmount) {
        return new Amount(value.subtract(otherAmount.getValue()));
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
