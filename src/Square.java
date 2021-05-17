public class Square extends Shape{
    int height;
    int width;

    public Square(int height, int length) {
        this.height = height;
        this.width = length;
        this.shapeType = ShapeType.SQUARE;
    }

    @Override
    public int calcArea() {

        return height * width;
    }

    @Override
    public int calcCircumReference() {
        return 2 * height + 2 * width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
