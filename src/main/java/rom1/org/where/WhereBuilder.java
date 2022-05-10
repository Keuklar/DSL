package rom1.org.where;

public class WhereBuilder {
    private PredicateBuilder predicateBuilder;

    public PredicateBuilder predicate() {
        this.predicateBuilder = new PredicateBuilder();
        return predicateBuilder;
    }

    public String toSQL() {
        return System.lineSeparator() + "where " + this.predicateBuilder.toSQL();
    }
}
