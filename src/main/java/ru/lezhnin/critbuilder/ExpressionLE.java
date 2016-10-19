package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

class ExpressionLE<T extends Comparable<T>> extends ExpressionCompare<T> {
    ExpressionLE(@Nonnull Value<T> left, @Nonnull Value<T> right) {
        super(left, right);
    }

    @Override
    public Boolean call() throws Exception {
        return getLeft().getValue().compareTo(getRight().getValue()) <= 0;
    }
}
