public abstract class Figure implements IFieldable {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public int getField() {
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }
}