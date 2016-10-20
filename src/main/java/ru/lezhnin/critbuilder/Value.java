package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

public interface Value<T> {

	@Nonnull
	T getValue() throws ParameterEmptyException;
}
