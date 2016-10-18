package ru.lezhnin.critbuilder;

class ParameterHolder<T> implements Parameter<T> {
    private T value;

    public ParameterHolder() {
        this(null);
    }

    public ParameterHolder(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        if (nonEmpty()) {
            return value;
        }
        throw new EmptyParameterError();
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
