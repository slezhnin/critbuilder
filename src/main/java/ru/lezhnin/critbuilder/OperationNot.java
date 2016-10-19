package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

class OperationNOT extends UnaryOperation {
    public OperationNOT(@Nonnull Operation operand) {
        super(operand);
    }

    @Override
    public Boolean call() throws Exception {
        return !getOperand().call();
    }
}
