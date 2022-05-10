package rom1.org.select;

import rom1.org.from.FromBuilder;

public class NameBuilder {
    private final String name;
    private FromBuilder fromBuilder;
    private NextFieldBuilder nextFieldBuilder;

    public NameBuilder(String name) {
        this.name = name;
    }
    public FromBuilder from() {
        this.fromBuilder = new FromBuilder();
        return fromBuilder;
    }

    public NextFieldBuilder nextField() {
        this.nextFieldBuilder = new NextFieldBuilder();
        return nextFieldBuilder;
    }

    public String toSQL() {
        String suite = this.nextFieldBuilder == null ?
                System.lineSeparator() + this.fromBuilder.toSQL()
                : "," + System.lineSeparator() + this.nextFieldBuilder.toSQL();
        return this.name + suite;
    }
}
