package rom1.org.where;

public class LeftWhereBuilder {
    private final String value;
    private OperatorWhereBuilder operatorWhereBuilder;

    public LeftWhereBuilder(String s) {
        this.value = s;
    }

    public OperatorWhereBuilder operator(String s) {
        this.operatorWhereBuilder = new OperatorWhereBuilder(s);
        return operatorWhereBuilder;
    }

    public String toSQL() {
        return this.value + " " + this.operatorWhereBuilder.toSQL();
    }
}
