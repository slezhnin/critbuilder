package ru.lezhnin.critbuilder;

public class ParameterEmptyException extends Exception {
    public ParameterEmptyException(String name) {
        super("Parameter \"" + name + "\" is empty!");
    }
}
