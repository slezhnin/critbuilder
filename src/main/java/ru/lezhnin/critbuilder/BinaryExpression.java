package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

abstract class BinaryExpression<L, R> implements Operation {

	@Nonnull
	private final Value<L> left;
	@Nonnull
	private final Value<R> right;

	BinaryExpression(@Nonnull Value<L> left, @Nonnull Value<R> right) {
		this.left = left;
		this.right = right;
	}

	@Nonnull
	Value<L> getLeft() {
		return left;
	}

	@Nonnull
	Value<R> getRight() {
		return right;
	}
}
