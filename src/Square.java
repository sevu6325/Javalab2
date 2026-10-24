class Square {
    static void area(int side) {
        int a = side * side;
        System.out.println("Area of Square = " + a);
    }
    static void perimeter(int side) {
        int p = 4 * side;
        System.out.println("Perimeter of Square = " + p);
    }
    public static void main(String[] args) {
        int side = 5;
        area(side);
        perimeter(side);
    }
}