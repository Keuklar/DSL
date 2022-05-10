package rom1.org;

public class SQLBuilder {
    private Select select;
    private From from;
    private Where where;

    public SQLBuilder withSelect(Select select) {
        this.select = select;
        return this;
    }

    public SQLBuilder withFrom(From from) {
        this.from = from;
        return this;
    }

    public SQLBuilder withWhere(Where where) {
        this.where = where;
        return this;
    }

    public SQLQuery build() {
        return new SQLQuery(select, from, where);
    }


}
