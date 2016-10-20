package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

class ParameterHolder<T> implements Parameter<T> {

	@Nonnull
	private final String name;
	@Nullable
	private T value;

	ParameterHolder(@Nonnull String name) {
		this(name, null);
	}

	ParameterHolder(@Nonnull String name, @Nullable T value) {
		this.name = name;
		this.value = value;
	}

	@Nonnull
	@Override
	public T getValue() throws ParameterEmptyException {
		if (value != null) {
			return value;
		}
		throw new ParameterEmptyException(getName());
	}

	@Nonnull
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public Boolean isEmpty() {
		return null == value;
	}

	@Override
	public Boolean nonEmpty() {
		return null != value;
	}
}
