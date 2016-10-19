package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

abstract class UnaryExpression<T> implements Operation {
    private final @Nonnull Value<T> operand;

    public UnaryExpression(@Nonnull Value<T> operand) {
        this.operand = operand;
    }

    @Nonnull
    public Value<T> getOperand() {
        return operand;
    }
}
