package rom1.org.where;

public class NextPredicateBuilder {
    private BooleanOperatorBuilder booleanOperator;

    public BooleanOperatorBuilder booleanOperator(String operator) {
        this.booleanOperator = new BooleanOperatorBuilder(operator);
        return booleanOperator;
    }

    public String toSQL() {
        return this.booleanOperator != null ? this.booleanOperator.toSQL() : "";
    }

}
