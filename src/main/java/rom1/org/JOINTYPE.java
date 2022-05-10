package rom1.org;

public enum JOINTYPE {
    INNER_JOIN("JOIN"),
    FULL_OUTER_JOIN("OUTER JOIN"),
    LEFT_JOIN("LEFT JOIN");

    private final String joinType;

    JOINTYPE(String joinType) {
        this.joinType = joinType;
    }

    public String toSQL() {
        return this.joinType;
    }
}
