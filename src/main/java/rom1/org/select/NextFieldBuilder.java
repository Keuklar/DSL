package rom1.org.select;

public class NextFieldBuilder {
    private TableBuilder tableBuilder;
    private NameBuilder nameBuilder;

    public NameBuilder name(String name) {
        this.nameBuilder = new NameBuilder(name);
        return nameBuilder;
    }

    public TableBuilder table(String table) {
        this.tableBuilder = new TableBuilder(table);
        return tableBuilder;
    }


    public String toSQL() {
        String field = (this.tableBuilder != null ? this.tableBuilder.toSQL() : this.nameBuilder.toSQL());
        return field
                + System.lineSeparator();
    }

}
