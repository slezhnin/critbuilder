package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

abstract class BinaryExpression<L, R> implements Operation {
    private final @Nonnull Value<L> left;
    private final @Nonnull Value<R> right;

    public BinaryExpression(@Nonnull Value<L> left, @Nonnull Value<R> right) {
        this.left = left;
        this.right = right;
    }

    @Nonnull
    public Value<L> getLeft() {
        return left;
    }

    @Nonnull
    public Value<R> getRight() {
        return right;
    }
}
