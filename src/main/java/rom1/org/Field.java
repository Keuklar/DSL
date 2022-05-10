package rom1.org;

public class Field {
    private final String name;
    private String table = "";

    public Field(String table, String name) {
        this.table = table;
        this.name = name;
    }

    public Field(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Field{" +
                "name='" + name + '\'' +
                ", table='" + table + '\'' +
                '}';
    }

    public String toSQL() {
        return table + separator() + name;
    }

    private String separator() {
        return "".equalsIgnoreCase(table) ? "" : ".";
    }
}
