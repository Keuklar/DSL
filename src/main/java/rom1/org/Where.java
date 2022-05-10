package rom1.org;

import java.util.List;

import static java.lang.System.lineSeparator;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.joining;

public class Where implements SQLElement {
    private final SQLPredicate firstLine;
    private final List<SQLPredicate> whereLines;

    public Where(SQLPredicate sqlPredicate, List<SQLPredicate> whereLines) {
        this.firstLine = sqlPredicate;
        this.whereLines = whereLines;
    }

    @Override
    public String toString() {
        return "Where{" +
                "whereLines=" + whereLines +
                '}';
    }

    public String toSQL() {
        String s = ofNullable(whereLines)
                .map(wl -> wl
                        .stream()
                        .map(SQLPredicate::toSQL)
                        .collect(joining(lineSeparator()))).orElse("");
        return "where "
                + lineSeparator()
                + firstLine.toSQL()
                + s;
    }
}
