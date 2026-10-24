class Rectangle {
    static void area(int length, int breadth) {
        int a = length * breadth;
        System.out.println("Area of Rectangle = " + a);
    }
    static void perimeter(int length, int breadth) {
        int p = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle = " + p);
    }
    public static void main(String[] args) {
        int length = 10;
        int breadth = 5;
        area(length, breadth);
        perimeter(length, breadth);
    }
}