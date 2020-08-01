public class Square extends Figure implements Datable {
    private int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public int getField() {
        return a * a;
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
}