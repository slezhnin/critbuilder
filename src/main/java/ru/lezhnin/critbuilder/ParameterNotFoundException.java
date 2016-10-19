package ru.lezhnin.critbuilder;

public class ParameterNotFoundException extends Exception {
    public ParameterNotFoundException(String name) {
        super("Parameter \"" + name + "\" is not found!");
    }
}
