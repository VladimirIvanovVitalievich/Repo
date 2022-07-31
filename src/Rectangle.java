public class Rectangle extends Figures{
    public int side1 = 3;
    public int side2 = 5;
    public int side3 = 3;
    public int side4 = 5;

    public void calculateSquare(int side1, int side2, int side3, int side4){
        int squareRectangle = side1 + side2;
        System.out.println("The square of the rectangle is " + squareRectangle);
    }
}
