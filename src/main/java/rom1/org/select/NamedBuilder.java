package rom1.org.select;

import rom1.org.from.FromBuilder;

public class NamedBuilder {
    private final String value;
    private NextFieldBuilder nextFieldBuilder;
    private FromBuilder fromBuilder;

    public NamedBuilder(String name) {
        this.value = name;
    }

    public NextFieldBuilder nextField() {
        this.nextFieldBuilder = new NextFieldBuilder();
        return nextFieldBuilder;
    }

    public FromBuilder from() {
        this.fromBuilder = new FromBuilder();
        return fromBuilder;
    }

    public String toSQL() {
        String suite = this.nextFieldBuilder == null ?
                System.lineSeparator() + this.fromBuilder.toSQL() :
                "," + System.lineSeparator() + this.nextFieldBuilder.toSQL();
        return this.value  + suite;
    }
}
