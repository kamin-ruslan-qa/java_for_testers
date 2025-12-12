public class Triangle {

    private double a;
    private double b;
    private double c;


    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA < 0 || sideB < 0 || sideC < 0) {
            throw new IllegalArgumentException("Сторона А должна быть положительной ");

            //неравенство
        } else if (sideB + sideC <= sideA || sideC + sideA <= sideB || sideA + sideB <= sideC) {
            throw new IllegalArgumentException("Нарушено неравенство треугольника: ");

        }

        this.a = sideA;
        this.b = sideB;
        this.c = sideC;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getHalfPerimeter() {
        return getPerimeter() / 2;
    }

    public double getArea() {
        double p = getHalfPerimeter();

        // Формула Герона
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }


    public static void main(String[] args) {

        try {
            // правельный треугольник
            Triangle triangle = new Triangle(3, 3, 3);
            System.out.println("Периметр треугольника: " + triangle.getPerimeter());
            System.out.println("Полупериметр: " + triangle.getHalfPerimeter());
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("======");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            Triangle triangle2 = new Triangle(5, 6, 7);
            System.out.println("Периметр треугольника:" + triangle2.getPerimeter());
            System.out.println("Полупериметр: " + triangle2.getHalfPerimeter());
            System.out.println("Площадь треугольника:: " + triangle2.getArea());
            System.out.println("======");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());


        }
        try {
            Triangle triangle3 = new Triangle(23, 26, 18);
            System.out.println("Периметр: " + triangle3.getPerimeter());
            System.out.println("Полупериметр: " + triangle3.getHalfPerimeter());
            System.out.println("Площадь треугольника: " + triangle3.getArea());
            System.out.println("======");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            Triangle triangle4 = new Triangle(3, -9, 7);
            System.out.println("Периметр: " + triangle4.getPerimeter());
            System.out.println("Полупериметр: " + triangle4.getHalfPerimeter());
            System.out.println("Площадь треугольника: " + triangle4.getArea());
            System.out.println("======");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());


        }
        try {
            Triangle triangle5 = new Triangle(3, 3, 10);
            System.out.println("Периметр: " + triangle5.getPerimeter());
            System.out.println("Полупериметр: " + triangle5.getHalfPerimeter());
            System.out.println("Площадь треугольника: " + triangle5.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }

    }
    private void 
}