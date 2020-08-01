public class Main {
    public static void main(String[] args) {
        Square square = new Square("Kwadrat", 5);
        System.out.println(square.getField());
        Rectangle rectangle = new Rectangle("Prostokąt", 5, 6);
        System.out.println(rectangle.getField());
        IFieldable[] figures = {square, rectangle};
        for (IFieldable figure : figures) {
            System.out.println(figure.getField());
        }
        square.printActualDate();
        rectangle.printActualDate();
    }
}