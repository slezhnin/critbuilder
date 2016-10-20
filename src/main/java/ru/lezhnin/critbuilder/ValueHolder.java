package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

class ValueHolder<T> implements Value<T> {

	@Nonnull
	private final T value;

	ValueHolder(@Nonnull T value) {
		this.value = value;
	}

	@Nonnull
	@Override
	public T getValue() {
		return value;
	}
}
