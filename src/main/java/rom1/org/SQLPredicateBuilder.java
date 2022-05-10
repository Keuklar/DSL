package rom1.org;

import java.util.Objects;

public class SQLPredicateBuilder {
    private String booleanOperator;
    private String left;
    private String right;
    private String operator;


    public SQLPredicateBuilder withBooleanOperator(String booleanOperator){
        this.booleanOperator = booleanOperator;
        return this;
    }
    public SQLPredicateBuilder withLeft(String left){
        this.left = left;
        return this;
    }
    public SQLPredicateBuilder withRight(String right){
        this.right = right;
        return this;
    }
    public SQLPredicateBuilder withOperator(String operator){
        this.operator = operator;
        return this;
    }

    public SQLPredicate build() {
        String booleanOperator = Objects.isNull(this.booleanOperator) ? "" : this.booleanOperator;
        return new SQLPredicate(booleanOperator, this.left, this.right, this.operator);
    }
}
