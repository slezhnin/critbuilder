package ru.lezhnin.critbuilder;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

class ParameterBuilderImpl implements ParameterBuilder {

	private <T> Value<T> createOrReturn(@Nonnull String name, @Nonnull Map<String, Parameter<T>> map) {
		Parameter<T> parameter = map.get(name);
		if (parameter == null) {
			parameter = new ParameterHolder<>(name);
			map.put(name, parameter);
		}
		return parameter;
	}

	private <T> Value<T> createOrReturn(@Nonnull String name, T value, @Nonnull Map<String, Parameter<T>> map) {
		Parameter<T> parameter = map.get(name);
		if (parameter == null) {
			parameter = new ParameterHolder<>(name, value);
			map.put(name, parameter);
		}
		return parameter;
	}

	private <T> void setOrThrow(@Nonnull String name, @Nonnull T value, @Nonnull Map<String, Parameter<T>> map) throws ParameterNotFoundException {
		Parameter<T> parameter = map.get(name);
		if (parameter == null) {
			throw new ParameterNotFoundException(name);
		}
		parameter.setValue(value);
	}

	@Override
	public Value<String> getString(@Nonnull String name) {
		return createOrReturn(name, stringParameterMap);
	}

	@Override
	public Value<Integer> getInteger(@Nonnull String name) {
		return createOrReturn(name, integerParameterMap);
	}

	@Override
	public Value<Integer> getInteger(@Nonnull String name, Integer value) {
		return createOrReturn(name, value, integerParameterMap);
	}

	@Override
	public Value<Double> getDouble(@Nonnull String name) {
		return createOrReturn(name, doubleParameterMap);
	}

	@Override
	public Value<Boolean> getBoolean(@Nonnull String name) {
		return createOrReturn(name, booleanParameterMap);
	}

	@Override
	public void setParameter(@Nonnull String name, @Nonnull String value) throws ParameterNotFoundException {
		setOrThrow(name, value, stringParameterMap);
	}

	@Override
	public void setParameter(@Nonnull String name, @Nonnull Integer value) throws ParameterNotFoundException {
		setOrThrow(name, value, integerParameterMap);
	}

	@Override
	public void setParameter(@Nonnull String name, @Nonnull Double value) throws ParameterNotFoundException {
		setOrThrow(name, value, doubleParameterMap);
	}

	@Override
	public void setParameter(@Nonnull String name, @Nonnull Boolean value) throws ParameterNotFoundException {
		setOrThrow(name, value, booleanParameterMap);
	}

	private final Map<String, Parameter<String>> stringParameterMap = new HashMap<>();
	private final Map<String, Parameter<Integer>> integerParameterMap = new HashMap<>();
	private final Map<String, Parameter<Double>> doubleParameterMap = new HashMap<>();
	private final Map<String, Parameter<Boolean>> booleanParameterMap = new HashMap<>();
}
