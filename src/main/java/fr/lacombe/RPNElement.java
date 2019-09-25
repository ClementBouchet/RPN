package fr.lacombe;

import java.util.Objects;

public class RPNElement {

    Integer integer;
    String operator;

    private RPNElement(Integer integer, String operator) {
        this.integer = integer;
        this.operator = operator;
    }

    public static RPNElement integer(Integer integer) {
        return new RPNElement(integer,null);
    }

    public static RPNElement operator(String operator) {
        return new RPNElement(null, operator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RPNElement rpnInput = (RPNElement) o;
        return Objects.equals(integer, rpnInput.integer) &&
                Objects.equals(operator, rpnInput.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, operator);
    }
}
