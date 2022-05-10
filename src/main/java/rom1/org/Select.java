package rom1.org;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class Select implements SQLElement {
    private List<Field> fields;

    public Select(List<Field> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "Select{" +
                "fields=" + fields +
                '}';
    }

    public String toSQL() {
        return "select" + " " + fields.stream().map(Field::toSQL).collect(joining(","));
    }
}
