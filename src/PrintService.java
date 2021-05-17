public class PrintService {
    /*void printArea(Shape shape) : Deze methode drukt de oppervlakte van de Shape af.
    void printCircumference(Shape shape) : Deze methode drukt de omtrek van de Shape af.
    void printDescription(Shape shape) : Deze methode drukt de beschrijving van de Shape af.*/

    public void printArea(Shape shape){
        System.out.println(shape.calcArea());
    }
    public void printCircumference(Shape shape){
        System.out.println(shape.calcCircumReference());
    }
    public void printDescription(Shape shape){
        System.out.println(shape);
    }
}
