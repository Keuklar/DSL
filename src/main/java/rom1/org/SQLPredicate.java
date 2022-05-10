package rom1.org;

import static java.lang.String.join;

public class SQLPredicate {
    private String left;
    private String right;
    private String operator;
    private String booleanOperator;

    public SQLPredicate(String booleanOperator, String left, String right, String operator) {
        this.booleanOperator = booleanOperator;
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public String toSQL() {
        return join(" ", booleanOperator, left, operator, right);
    }
}
