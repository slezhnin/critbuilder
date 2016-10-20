package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

public class ExpressionBuilder {

	public static ParameterBuilder newParameterBuilder() {
		return new ParameterBuilderImpl();
	}

	@Nonnull
	public static Value<String> val(@Nonnull String value) {
		return new ValueHolder<>(value);
	}

	@Nonnull
	public static Value<Integer> val(@Nonnull Integer value) {
		return new ValueHolder<>(value);
	}

	@Nonnull
	public static Value<Double> val(@Nonnull Double value) {
		return new ValueHolder<>(value);
	}

	@Nonnull
	public static Value<Boolean> val(@Nonnull Boolean value) {
		return new ValueHolder<>(value);
	}

	@Nonnull
	public static Operation and(@Nonnull Operation left, @Nonnull Operation right) {
		return new OperationAND(left, right);
	}

	@Nonnull
	public static Operation or(@Nonnull Operation left, @Nonnull Operation right) {
		return new OperationOR(left, right);
	}

	@Nonnull
	public static Operation not(@Nonnull Operation operand) {
		return new OperationNOT(operand);
	}

	@Nonnull
	public static <L, R> Operation eq(@Nonnull Value<L> left, @Nonnull Value<R> right) {
		return new ExpressionEQ<>(left, right);
	}

	@Nonnull
	public static <L, R> Operation ne(@Nonnull Value<L> left, @Nonnull Value<R> right) {
		return new ExpressionNE<>(left, right);
	}

	@Nonnull
	public static <T extends Comparable<T>> Operation ge(@Nonnull Value<T> left, @Nonnull Value<T> right) {
		return new ExpressionGE<>(left, right);
	}

	@Nonnull
	public static <T extends Comparable<T>> Operation gt(@Nonnull Value<T> left, @Nonnull Value<T> right) {
		return new ExpressionGT<>(left, right);
	}

	@Nonnull
	public static <T extends Comparable<T>> Operation le(@Nonnull Value<T> left, @Nonnull Value<T> right) {
		return new ExpressionLE<>(left, right);
	}

	@Nonnull
	public static <T extends Comparable<T>> Operation lt(@Nonnull Value<T> left, @Nonnull Value<T> right) {
		return new ExpressionLT<>(left, right);
	}

	@Nonnull
	public static Operation isEmpty(@Nonnull Value<String> operand) {
		return new ExpressionStringIsEmpty(operand);
	}
}
