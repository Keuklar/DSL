package rom1.org;

public class Application {

    public static void main(String[] args) {
        SQLBuilder sqlBuilder = new SQLBuilder();
        SQLQuery sqlQuery = sqlBuilder
                .withSelect(new SelectBuilder()
                        .withField(new FieldBuilder()
                                .withField("x")
                                .withTable("T")
                                .build())
                        .withField(new FieldBuilder()
                                .withField("U")
                                .withTable("T")
                                .build())
                        .build())
                .withFrom(new FromBuilder()
                        .withFirstTable(new Table("T"))
                        .withJoin(new JoinBuilder()
                                .withJoinType(JOINTYPE.INNER_JOIN)
                                .withLink(new Link(new Field("A"), new Field("B"), new Operator("==")))
                                .withTable(new Table("S"))
                                .build())
                        .withJoin(new JoinBuilder()
                                .withJoinType(JOINTYPE.LEFT_JOIN)
                                .withLink(new Link(new Field("U"), new Field("V"), new Operator("!=")))
                                .withTable(new Table("X"))
                                .build())
                        .build())
                .withWhere(new WhereBuilder()
                        .withFirstSQLPredicate(new SQLPredicateBuilder()
                                .withLeft("age")
                                .withOperator(">=")
                                .withRight("10")
                                .build())
                        .build())
                .build();


        System.out.println(sqlQuery.toSQL());

    }
}
