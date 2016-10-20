package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

public interface ParameterBuilder {

	Value<String> getString(@Nonnull String name);

	Value<Integer> getInteger(@Nonnull String name);

	Value<Integer> getInteger(@Nonnull String name, Integer value);

	Value<Double> getDouble(@Nonnull String name);

	Value<Boolean> getBoolean(@Nonnull String name);

	void setParameter(@Nonnull String name, @Nonnull String value) throws ParameterNotFoundException;

	void setParameter(@Nonnull String name, @Nonnull Integer value) throws ParameterNotFoundException;

	void setParameter(@Nonnull String name, @Nonnull Double value) throws ParameterNotFoundException;

	void setParameter(@Nonnull String name, @Nonnull Boolean value) throws ParameterNotFoundException;
}
