public class Rectangle extends Figure {
    private int a;
    private int b;
    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }
    @Override
    public int getField() {
        return a * b;
    }

    public String getName() {
        return null;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}