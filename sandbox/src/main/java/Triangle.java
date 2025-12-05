public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double sideA, double sideB, double sideC) {
        a = sideA;
        b = sideB;
        c = sideC;
    }
    public double getPerimeter() {
        return a + b + c;
    }

    public double getHalfPerimeter() {
        return getPerimeter() / 2.0;
    }

    public double getArea() {
        double p = getHalfPerimeter();

        // Формула Герона
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(7, 7, 7);

        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println("Полупериметр: " + triangle.getHalfPerimeter());
        System.out.println("Площадь треугольника:: " + triangle.getArea());
    }
}