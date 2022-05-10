package rom1.org.from;

public class FromBuilder {
    private TableBuilder tableBuilder;


    public TableBuilder table(String tableName) {
        this.tableBuilder = new TableBuilder(tableName);
        return tableBuilder;
    }

    public String toSQL() {
        return "from" + System.lineSeparator() + this.tableBuilder.toSQL();
    }
}
