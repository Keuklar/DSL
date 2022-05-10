package rom1.org;

import java.util.Objects;

public class FieldBuilder {
    private String table;
    private String field = "";

    public FieldBuilder withTable(String tableName) {
        this.table = tableName;
        return this;
    }

    public FieldBuilder withField(String fieldName) {
        this.field = fieldName;
        return this;
    }

    public Field build() {
        if(Objects.isNull(this.field)) {
            throw new IllegalArgumentException("field can't be null");
        }
        return new Field(this.table, this.field);
    }
}
