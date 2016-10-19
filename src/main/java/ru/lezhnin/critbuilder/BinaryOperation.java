package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

abstract class BinaryOperation implements Operation {
    private final @Nonnull Operation left;
    private final @Nonnull Operation right;

    BinaryOperation(@Nonnull Operation left, @Nonnull Operation right) {
        this.left = left;
        this.right = right;
    }

    @Nonnull
    Operation getLeft() {
        return left;
    }

    @Nonnull
    Operation getRight() {
        return right;
    }
}
