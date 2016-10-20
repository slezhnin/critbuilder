package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

abstract class BinaryOperation implements Operation {

	@Nonnull
	private final Operation left;
	@Nonnull
	private final Operation right;

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
