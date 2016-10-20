package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

class OperationAND extends BinaryOperation {

	OperationAND(@Nonnull final Operation left, @Nonnull final Operation right) {
		super(left, right);
	}

	@Override
	public Boolean call() throws Exception {
		return getLeft().call() && getRight().call();
	}
}
