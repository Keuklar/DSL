package rom1.org.from;

public class OperatorBuilder {
    private final String value;
    private RightOnBuilder rightOnBuilder;

    public OperatorBuilder(String s) {
        this.value = s;
    }


    public RightOnBuilder right(String s) {
        this.rightOnBuilder = new RightOnBuilder(s);
        return rightOnBuilder;
    }

    public String toSQL() {
        return this.value + " " + this.rightOnBuilder.toSQL();
    }
}
