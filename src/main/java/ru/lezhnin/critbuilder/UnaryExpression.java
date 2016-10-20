package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

abstract class UnaryExpression<T> implements Operation {

	@Nonnull
	private final Value<T> operand;

	UnaryExpression(@Nonnull Value<T> operand) {
		this.operand = operand;
	}

	@Nonnull
	Value<T> getOperand() {
		return operand;
	}
}
