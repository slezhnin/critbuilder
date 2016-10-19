package ru.lezhnin.critbuilder;

public class EmptyParameterError extends Exception {
    public EmptyParameterError(String name) {
        super("Parameter \"" + name + "\" is empty!");
    }
}
