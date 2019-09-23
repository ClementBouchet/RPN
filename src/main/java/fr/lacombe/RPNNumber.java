package fr.lacombe;

import java.util.Objects;

public class RPNNumber {

    Integer integer;
    String operator;

    private RPNNumber(Integer integer, String operator) {
        this.integer = integer;
        this.operator = operator;
    }

    public static RPNNumber integer(Integer integer) {
        return new RPNNumber(integer,null);
    }

    public static RPNNumber operator(String operator) {
        return new RPNNumber(null, operator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RPNNumber rpnInput = (RPNNumber) o;
        return Objects.equals(integer, rpnInput.integer) &&
                Objects.equals(operator, rpnInput.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, operator);
    }
}
