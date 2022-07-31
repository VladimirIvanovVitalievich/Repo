public class Round extends Lesson7AboutFigures{
    public int radius = 6;

    public Round(int radius){
        this.radius = radius;
    }

    public void calculateSquare(){
        double squareRound = radius * radius * 3.14;
        System.out.println("The square of the round is " + squareRound);
    }

    public void calculatePerimeter(){
        double perimeterRound = radius * 2 * 3.14;
        System.out.println("The perimeter of the round is " + perimeterRound);
    }
}
