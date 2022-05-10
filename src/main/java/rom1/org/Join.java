package rom1.org;

public class Join {
    private final JOINTYPE joinType;
    private final Table table;
    private final Link link;

    public Join(JOINTYPE joinType, Table table, Link link) {
        this.joinType = joinType;
        this.table = table;
        this.link = link;
    }

    public String toSQL() {
        return joinType.toSQL() + " " + table.toSQL() + " on " + link.toSQL();
    }
}
