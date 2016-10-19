package ru.lezhnin.critbuilder.test;

import org.junit.Test;
import ru.lezhnin.critbuilder.Operation;
import ru.lezhnin.critbuilder.ParameterBuilder;

import static org.junit.Assert.assertTrue;
import static ru.lezhnin.critbuilder.ExpressionBuilder.*;

public class ExpressionBuilderTest {
    @Test
    public void testExpression() throws Exception {
        ParameterBuilder p = newParameterBuilder();
        Operation result = and(
                eq(val("test"), p.getString("test")),
                not(ne(val("test"), p.getString("test")))
        );
        p.setParameter("test", "test");
        assertTrue(result.call());
        result = or(
                eq(val("test"), p.getString("test")),
                ne(val("test"), p.getString("test"))
        );
        assertTrue(result.call());
        result = and(
                gt(val(3), p.getInteger("int")),
                lt(val(1), p.getInteger("int"))
        );
        p.setParameter("int", 2);
        assertTrue(result.call());
        result = and(
                ge(val(2), p.getInteger("int")),
                le(val(2), p.getInteger("int"))
        );
        assertTrue(result.call());
        result = and(
                ge(val(3), p.getInteger("int")),
                le(val(1), p.getInteger("int"))
        );
        assertTrue(result.call());
        result = and(
                not(isEmpty(p.getString("test"))),
                and(
                        eq(val("test"), p.getString("test")),
                        not(ne(val("test"), p.getString("test")))
                )
        );
        assertTrue(result.call());
    }

}
