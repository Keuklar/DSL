package rom1.org.from;

public class OnBuilder {

    private LeftOnBuilder leftOnBuilder;

    public LeftOnBuilder left(String s) {
        this.leftOnBuilder = new LeftOnBuilder(s);
        return leftOnBuilder;
    }

    public String toSQL() {
        return "on " + this.leftOnBuilder.toSQL();
    }
}
