package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

abstract class UnaryOperation implements Operation {
    private final @Nonnull Operation operand;

    public UnaryOperation(@Nonnull Operation operand) {
        this.operand = operand;
    }

    @Nonnull
    public Operation getOperand() {
        return operand;
    }
}
