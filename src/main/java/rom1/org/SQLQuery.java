package rom1.org;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SQLQuery implements SQLElement {
    private final Select select;
    private final From from;
    private final Where where;

    public SQLQuery(Select select, From from, Where where) {
        this.select = select;
        this.from = from;
        this.where = where;
    }

    public String toSQL() {
        return Stream.of(select, from, where).map(SQLElement::toSQL).collect(Collectors.joining(System.lineSeparator()));
    }
}
