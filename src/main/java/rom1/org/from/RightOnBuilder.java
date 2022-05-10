package rom1.org.from;

import rom1.org.where.WhereBuilder;

public class RightOnBuilder {
    private String value;
    private JoinBuilder joinBuilder;
    private WhereBuilder whereBuilder;

    public RightOnBuilder(String s) {
        this.value = s;
    }

    public JoinBuilder joining(JOINTYPE jointype) {
        this.joinBuilder = new JoinBuilder(jointype);
        return joinBuilder;
    }

    public WhereBuilder where() {
        this.whereBuilder = new WhereBuilder();
        return whereBuilder;
    }

    public String toSQL() {
        String sql = this.joinBuilder == null ? "" : this.joinBuilder.toSQL();
        return this.value + (this.whereBuilder == null ? sql :  this.whereBuilder.toSQL());
    }

}
