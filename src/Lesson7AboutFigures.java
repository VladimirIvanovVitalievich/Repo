public class Lesson7AboutFigures {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(2, 5, 3);
        Round round = new Round(6);
        Rectangle rectangle = new Rectangle();
        triangle.calculatePerimeter();

        Figures figureOne = new Figures();
        Figures figureTwo = new Figures();
        Figures figureThree = new Figures();
        Figures figureFour = new Figures();
        Figures figureFive = new Figures();

        Figures[] figures = {figureOne, figureTwo, figureThree, figureFour, figureFive};
    }
}
