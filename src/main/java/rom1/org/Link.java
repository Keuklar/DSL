package rom1.org;

public class Link {
    private Field left;
    private Field right;
    private Operator operator;

    public Link(Field left, Field right, Operator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public String toSQL() {
        return this.left.toSQL() + this.operator.toSQL() + this.right.toSQL();
    }
}
