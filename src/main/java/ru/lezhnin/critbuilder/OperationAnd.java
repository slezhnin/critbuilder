package ru.lezhnin.critbuilder;

class OperationAnd implements Operation {
    private final Operation left;
    private final Operation right;

    public OperationAnd(Operation left, Operation right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Boolean call() throws Exception {
        return left.call() && right.call();
    }
}
