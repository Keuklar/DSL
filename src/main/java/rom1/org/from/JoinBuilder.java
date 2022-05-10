package rom1.org.from;

public class JoinBuilder {
    private JOINTYPE joinType;
    private TableFromBuilder tableFromBuilder;

    public JoinBuilder(JOINTYPE jointype) {
        this.joinType = jointype;
    }

    public TableFromBuilder table(String name) {
        this.tableFromBuilder = new TableFromBuilder(name);
        return tableFromBuilder;
    }

    public String toSQL() {
        return System.lineSeparator() + this.joinType.toSQL() + " " + this.tableFromBuilder.toSQL();
    }
}
