package rom1.org.where;

public class BooleanOperatorBuilder {

    private final String value;
    private LeftWhereBuilder leftOnBuilder;

    public BooleanOperatorBuilder(String operator) {
        this.value = operator;
    }

    public LeftWhereBuilder left(String name) {
        this.leftOnBuilder = new LeftWhereBuilder(name);
        return leftOnBuilder;
    }

    public String toSQL() {
        return System.lineSeparator() +  value + " " + this.leftOnBuilder.toSQL() ;
    }
}
