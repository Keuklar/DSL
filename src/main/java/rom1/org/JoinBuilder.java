package rom1.org;

public class JoinBuilder {
    private JOINTYPE joinType;
    private Table table;
    private Link link;

    public JoinBuilder withJoinType(JOINTYPE joinType) {
        this.joinType = joinType;
        return this;
    }

    public JoinBuilder withTable(Table table) {
        this.table = table;
        return this;
    }
    public JoinBuilder withLink(Link link) {
        this.link = link;
        return this;
    }

    public Join build() {
        return new Join(this.joinType, this.table, this.link);
    }

}
