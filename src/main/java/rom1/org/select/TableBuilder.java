package rom1.org.select;

public class TableBuilder {
    private final String table;
    private NamedBuilder namedBuilder;

    public TableBuilder(String table) {
        this.table = table;
    }

    public NamedBuilder name(String name) {
        this.namedBuilder = new NamedBuilder(name);
        return namedBuilder;
    }

    public String toSQL() {
        return this.table + "." + this.namedBuilder.toSQL();
    }

}
