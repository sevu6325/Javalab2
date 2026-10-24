class Circle {
    static void area(double radius) {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + a);
    }
    static void perimeter(double radius) {
        double p = 2 * 3.14 * radius;
        System.out.println("Perimeter of Circle = " + p);
    }
    public static void main(String[] args) {
        double radius = 5;
        area(radius);
        perimeter(radius);
    }
}
