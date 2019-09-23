package fr.lacombe;

import java.util.Objects;

public class RPNInput {

    Integer integer;
    String operator;

    public RPNInput(Integer integer, String operator) {

        this.integer = integer;
        this.operator = operator;
    }

    public static RPNInput integer(Integer integer) {
        return new RPNInput(integer,null);
    }

    public static RPNInput operator(String operator) {
        return new RPNInput(null, operator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RPNInput rpnInput = (RPNInput) o;
        return Objects.equals(integer, rpnInput.integer) &&
                Objects.equals(operator, rpnInput.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, operator);
    }
}
