package rom1.org.from;

public class LeftOnBuilder {
    private final String value;
    private OperatorBuilder operatorBuilder;

    public LeftOnBuilder(String s) {
        this.value = s;
    }

    public OperatorBuilder operator(String s) {
        this.operatorBuilder = new OperatorBuilder(s);
        return operatorBuilder;
    }

    public String toSQL() {
        return value + " " + this.operatorBuilder.toSQL();
    }
}
