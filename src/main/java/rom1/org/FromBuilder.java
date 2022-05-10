package rom1.org;

import java.util.ArrayList;
import java.util.List;

public class FromBuilder {
    private Table table;
    private List<Join> joins= new ArrayList<>();

    public FromBuilder withFirstTable(Table table) {
        this.table = table;
        return this;
    }

    public FromBuilder withJoin(Join join) {
        this.joins.add(join);
        return this;
    }


    public From build() {
        return new From(table, joins);
    }
}
