package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

public class ExpressionStringIsEmpty extends UnaryExpression<String> {
    public ExpressionStringIsEmpty(@Nonnull Value<String> operand) {
        super(operand);
    }

    @Override
    public Boolean call() throws Exception {
        return getOperand().getValue().isEmpty();
    }
}
