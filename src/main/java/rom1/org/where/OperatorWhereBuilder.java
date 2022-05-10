package rom1.org.where;

public class OperatorWhereBuilder {

    private final String value;
    private RightWhereBuilder rightWhereBuilder;

    public OperatorWhereBuilder(String s) {
        value = s;
    }

    public RightWhereBuilder right(String value) {
        this.rightWhereBuilder = new RightWhereBuilder(value);
        return rightWhereBuilder;
    }

    public String toSQL() {
        return this.value + " " + this.rightWhereBuilder.toSQL();
    }
}
