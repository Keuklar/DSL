package rom1.org.where;

public class PredicateBuilder {
    private LeftWhereBuilder leftWhereBuilder;

    public LeftWhereBuilder left(String s) {
        this.leftWhereBuilder = new LeftWhereBuilder(s);
        return leftWhereBuilder;
    }

    public String toSQL() {
        return this.leftWhereBuilder.toSQL();
    }
}
