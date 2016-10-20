package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

abstract class UnaryOperation implements Operation {

	@Nonnull
	private final Operation operand;

	UnaryOperation(@Nonnull Operation operand) {
		this.operand = operand;
	}

	@Nonnull
	Operation getOperand() {
		return operand;
	}
}
