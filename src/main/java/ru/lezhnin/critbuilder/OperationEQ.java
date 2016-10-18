package ru.lezhnin.critbuilder;

class OperationEQ<L, R> implements Operation {
    private final Value<L> left;
    private final Value<R> right;

    public OperationEQ(Value<L> left, Value<R> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Boolean call() throws Exception {
        return left.getValue().equals(right.getValue());
    }
}
