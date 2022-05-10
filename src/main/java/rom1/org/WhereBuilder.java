package rom1.org;

import java.util.ArrayList;
import java.util.List;

public class WhereBuilder {
    private SQLPredicate sqlPredicate;
    private List<SQLPredicate> sqlPredicates = new ArrayList<>();

    public WhereBuilder withFirstSQLPredicate(SQLPredicate sqlPredicate) {
        this.sqlPredicate = sqlPredicate;
        return this;
    }


    public WhereBuilder withSQLPredicate(SQLPredicate sqlPredicate) {
        this.sqlPredicates.add(sqlPredicate);
        return this;
    }

    public Where build() {
        return new Where(sqlPredicate, sqlPredicates);
    }
}
