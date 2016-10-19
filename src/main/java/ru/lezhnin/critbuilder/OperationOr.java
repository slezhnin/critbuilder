package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

class OperationOr extends BinaryOperation {
    public OperationOr(@Nonnull Operation left, @Nonnull Operation right) {
        super(left, right);
    }

    @Override
    public Boolean call() throws Exception {
        return getLeft().call() || getRight().call();
    }
}
