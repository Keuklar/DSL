package rom1.org;

import rom1.org.select.SelectBuilder;

public class SQLBuilder {
    private SelectBuilder selectBuilder;

    public SelectBuilder select() {
        this.selectBuilder = new SelectBuilder();
        return selectBuilder;
    }

    public String toSQL() {
        return this.selectBuilder.toSQL();
    }
}
