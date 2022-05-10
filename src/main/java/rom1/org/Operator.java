package rom1.org;

public class Operator {
    private final String value;

    public Operator(String value) {
        this.value = value;
    }

    public String toSQL() {
        return value;
    }
}
