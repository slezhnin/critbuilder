package ru.lezhnin.critbuilder;

class ValueHolder<T> implements Value<T> {
    private final T value;

    public ValueHolder(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }
}
