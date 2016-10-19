package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

class ExpressionStringIsEmpty extends UnaryExpression<String> {
    ExpressionStringIsEmpty(@Nonnull Value<String> operand) {
        super(operand);
    }

    @Override
    public Boolean call() throws Exception {
        return getOperand().getValue().isEmpty();
    }
}
