package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

class ParameterHolder<T> implements Parameter<T> {
    private @Nonnull String name;
    private T value;

    public ParameterHolder(@Nonnull String name) {
        this(name, null);
    }

    public ParameterHolder(@Nonnull String name, T value) {
        this.name = name;
        this.value = value;
    }

    @Nonnull
    @Override
    public T getValue() throws EmptyParameterError {
        if (nonEmpty()) {
            return value;
        }
        throw new EmptyParameterError(getName());
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
