package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

interface Parameter<T> extends Value<T> {

	@Nonnull
	String getName();

	void setValue(T value);

	Boolean isEmpty();

	Boolean nonEmpty();
}
