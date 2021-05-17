public class Circle extends Shape{
    int radius;
    final double PI = Math.PI;
    public Circle(int radius) {
        this.radius = radius;
        this.shapeType = ShapeType.CIRCLE;
    }

    @Override
    public int calcArea() {
       return Math.toIntExact(Math.round(PI * radius * radius));
    }

    @Override
    public int calcCircumReference() {
        return Math.toIntExact(Math.round(PI * 2 * radius));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}
