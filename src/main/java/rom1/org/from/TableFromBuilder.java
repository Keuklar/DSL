package rom1.org.from;

public class TableFromBuilder {
    private String table;
    private OnBuilder onBuilder;


    public TableFromBuilder(String table) {
        this.table = table;
    }

    public OnBuilder on() {
        this.onBuilder = new OnBuilder();
        return onBuilder;
    }

    public String toSQL() {
        return this.table + " " + this.onBuilder.toSQL();
    }
}
