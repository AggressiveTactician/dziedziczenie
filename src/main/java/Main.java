public class Main {
    public static void main(String[] args) {
        Square square = new Square("Kwadrat", 5);
        System.out.println(square.getField());
        Rectangle rectangle = new Rectangle("Prostokąt", 5, 6);
        System.out.println(rectangle.getField());
        Figure[] figures = {square, rectangle};
        for (Figure figure : figures) {
            System.out.println(figure.getField());
        }
        square.printActualDate();
        rectangle.printActualDate();
    }
}