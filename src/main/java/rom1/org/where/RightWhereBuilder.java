package rom1.org.where;

public class RightWhereBuilder {
    private final String value;
    private NextPredicateBuilder nextPredicateBuilder;

    public RightWhereBuilder(String value) {
        this.value = value;
    }

    public NextPredicateBuilder nextPredicate() {
        this.nextPredicateBuilder = new NextPredicateBuilder();
        return nextPredicateBuilder;
    }

    public String toSQL() {
        return value + " " + (this.nextPredicateBuilder != null ? this.nextPredicateBuilder.toSQL() : "");
    }
}
