package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

class ExpressionEQ<L, R> extends BinaryExpression<L, R> {
    ExpressionEQ(@Nonnull Value<L> left, @Nonnull Value<R> right) {
        super(left, right);
    }

    @Override
    public Boolean call() throws Exception {
        return getLeft().getValue().equals(getRight().getValue());
    }
}
