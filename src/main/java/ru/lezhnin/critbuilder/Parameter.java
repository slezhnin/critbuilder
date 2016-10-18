package ru.lezhnin.critbuilder;

public interface Parameter<T> extends Value<T> {
    void setValue(T value);
    Boolean isEmpty();
    Boolean nonEmpty();
}
