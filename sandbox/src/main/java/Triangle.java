public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double sideA, double sideB, double sideC) {
        a = sideA;
        b = sideB;
        c = sideC;
    }


    public static void main(String[] args) {
        printperimetrTriangle(7, 7, 7);
    }


    //формула вычисления периметра P = a + b + c
    private static void printperimetrTriangle(double a, double b, double c) {
        System.out.println("Периметр треугольника: " + perimetrTriangle(a, b, c));

        //Полупериметр рассчитывается как: p = (a + b + c) / 2
        System.out.println("Полупериметр: " + halfPrtimetr(a, b, c));

        // Площадь по формуле Герона
        System.out.println("Площадь треугольника: " + areaTriangle(a, b, c));
    }

    public static double halfPrtimetr(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        return p;
    }


    public static double areaTriangle(double a, double b, double c) {
        double p = halfPrtimetr(a, b, c);
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
    public static double perimetrTriangle(double a, double b, double c) {
        return a + b + c;
    }

}