public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape square = new Square(2, 3);

        PrintService printServiceCircle = new PrintService();

        printServiceCircle.printArea(circle);
        System.out.println("---------------------------------------------");
        printServiceCircle.printArea(square);
        System.out.println("---------------------------------------------");
        printServiceCircle.printCircumference(circle);
        System.out.println("---------------------------------------------");
        printServiceCircle.printCircumference(square);
        System.out.println("---------------------------------------------");
        printServiceCircle.printDescription(circle);
        System.out.println("---------------------------------------------");
        printServiceCircle.printDescription(square);
    }
}
