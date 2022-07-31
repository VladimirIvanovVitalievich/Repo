public class Triangle extends Lesson7AboutFigures{
    public int a = 2;
    public int b = 5;
    public int c = 3;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateSquare(){
        int squareTriangle = (a * b) / 2;
        System.out.println("The square of the triangle is " + squareTriangle);
    }

    public void calculatePerimeter(){
        int perimeterTriangle = a + b + c;
        double perimeter = perimeterTriangle;
        System.out.println("The perimeter of the triangle is " + perimeterTriangle);
    }
}
