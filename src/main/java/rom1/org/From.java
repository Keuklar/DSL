package rom1.org;

import java.util.List;

import static java.lang.System.lineSeparator;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.joining;

public class From implements SQLElement {
    private final Table table;
    private final List<Join> joins;

    public From(Table table, List<Join> joins) {
        this.table = table;
        this.joins = joins;
    }

    @Override
    public String toString() {
        return "From{" +
                "table=" + table +
                ", joins=" + joins +
                '}';
    }

    public String toSQL() {
        return "from "
                + table.toSQL()
                + ofNullable(joins).map(l -> l.stream().map(Join::toSQL).map(s -> lineSeparator() + s).collect(joining(""))).orElse("");
    }
}
