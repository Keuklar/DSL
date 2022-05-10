package rom1.org.select;


public class SelectBuilder {
    private FieldBuilder fieldBuilder;

    public FieldBuilder field() {
        this.fieldBuilder = new FieldBuilder();
        return fieldBuilder;
    }

    public String toSQL() {
        return "select " + System.lineSeparator()  + this.fieldBuilder.toSQL();
    }
}
