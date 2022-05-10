package rom1.org;

import rom1.org.from.JOINTYPE;

public class Application {

    public static void main(String[] args) {
        SQLBuilder sqlBuilder = new SQLBuilder();

        sqlBuilder
                .select()
                    .field()
                        .table("T")
                        .name("x")
                    .nextField()
                        .table("T")
                        .name("u")
                    .nextField()
                        .table("T")
                        .name("n")
                    .nextField()
                        .name("oneMoreField")
                .from()
                    .table("T")
                    .joining(JOINTYPE.INNER_JOIN)
                        .table("S")
                        .on()
                        .left("A")
                        .operator("==")
                        .right("B")
                    .joining(JOINTYPE.LEFT_JOIN)
                        .table("X")
                        .on()
                        .left("A")
                        .operator("==")
                        .right("B")
                .where()
                    .predicate()
                        .left("age")
                        .operator(">=")
                        .right("10")
                    .nextPredicate()
                        .booleanOperator("and")
                        .left("name")
                        .operator("=")
                        .right("'toyoast'")
                    .nextPredicate()
                        .booleanOperator("OR")
                        .left("3")
                        .operator("=")
                        .right("2 + 1");

        System.out.println(sqlBuilder.toSQL());

    }
}
