public class Rectangle extends Lesson7AboutFigures{
    public int side1 = 3;
    public int side2 = 5;
    public int side3 = 3;
    public int side4 = 5;

    public void calculateSquare(int side3, int side2, int side1, int side4) {
        if ( side1 > side3 || side2 > side4){
            if ( side1 < side3 || side2 < side4) {
                double squareRectangle = side1 * side3;
                System.out.println("The square of the rectangle is " + squareRectangle);
            }
        }
    }

    public void calculatePerimeter() {
        double perimeterRectangle = side1 + side2 + side3 + side4;
        System.out.println("The perimeter of the rectangle is " + perimeterRectangle);
    }
}
