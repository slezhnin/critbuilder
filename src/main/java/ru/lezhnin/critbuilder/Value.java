package ru.lezhnin.critbuilder;

import javax.annotation.Nonnull;

interface Value<T> {
    @Nonnull
    T getValue() throws EmptyParameterError;
}
