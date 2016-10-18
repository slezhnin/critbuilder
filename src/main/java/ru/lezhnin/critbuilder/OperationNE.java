package ru.lezhnin.critbuilder;

class OperationNE<L, R> extends OperationEQ<L, R> {

    public OperationNE(Value<L> left, Value<R> right) {
        super(left, right);
    }

    @Override
    public Boolean call() throws Exception {
        return !super.call();
    }
}
