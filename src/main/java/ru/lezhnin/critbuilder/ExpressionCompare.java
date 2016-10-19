package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

abstract class ExpressionCompare<T extends Comparable<T>> extends BinaryExpression<T, T> {
    ExpressionCompare(@Nonnull Value<T> left, @Nonnull Value<T> right) {
        super(left, right);
    }
}
