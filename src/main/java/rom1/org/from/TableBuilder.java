package rom1.org.from;

public class TableBuilder {
    private final String name;
    private JoinBuilder joinBuilder;

    public TableBuilder(String tableName) {
        this.name = tableName;
    }

    public JoinBuilder joining(JOINTYPE innerJoin) {
        this.joinBuilder = new JoinBuilder(innerJoin);
        return joinBuilder;
    }

    public String toSQL() {
        return this.name + " " + (this.joinBuilder != null ? this.joinBuilder.toSQL() : "");
    }
}
