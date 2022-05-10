package rom1.org;

public class Table implements SQLElement {
    private final String name;

    public Table(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                '}';
    }

    public String toSQL() {
        return name;
    }
}
