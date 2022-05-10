package rom1.org;


import java.util.ArrayList;
import java.util.List;

public class SelectBuilder {
    private List<Field> fields = new ArrayList<>();

    public SelectBuilder withField(Field field) {
        fields.add(field);
        return this;
    }

    public FieldBuilder withField() {
        return new FieldBuilder();
    }



    public Select build() {
        if (this.fields.isEmpty()) {
//            throw new IllegalStateException("At least a field is required");
            this.fields.add(new Field("*"));
        }

        return new Select(fields);
    }
}
