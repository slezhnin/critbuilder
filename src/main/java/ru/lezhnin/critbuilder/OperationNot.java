package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

class OperationNot extends UnaryOperation {
    public OperationNot(@Nonnull Operation operand) {
        super(operand);
    }

    @Override
    public Boolean call() throws Exception {
        return !getOperand().call();
    }
}
