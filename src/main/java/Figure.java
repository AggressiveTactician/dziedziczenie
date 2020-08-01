public abstract class Figure {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public int getField() {
        return 0;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
}