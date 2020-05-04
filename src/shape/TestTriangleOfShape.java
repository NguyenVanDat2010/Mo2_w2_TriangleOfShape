package shape;

public class TestTriangleOfShape {
    public static void main(String[] args) {
        Shape shape=new Shape("Green",false);
        System.out.println(shape);

        Triangle triangle=new Triangle(2,3,4);
        System.out.println(triangle);
        System.out.println("Perimeter is "+triangle.getPerimeter());
        System.out.println("Area is "+triangle.getArea());

        triangle=new Triangle(4,5,6,"Black",false);
        System.out.println(triangle);
        System.out.println("Perimeter is "+triangle.getPerimeter());
        System.out.println("Area is "+triangle.getArea());
    }
}
