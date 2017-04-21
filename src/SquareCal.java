/**
 * Created by broadwells on 4/21/17.
 */
public class SquareCal {
    private int squareLength;

//    public SquareCal(int sideLength) {
//        squareLength = sideLength;
//    }


    public SquareCal(int squareLength) {
        this.squareLength = squareLength;
    }

    public void calculatePerimeter(int squareLength) {
        int perimeter = (2 * squareLength) + (2 * squareLength);
        System.out.println("The square's perimeter is: " + perimeter);
    }
    public void calculateArea(int squareLength){
        int area = squareLength * squareLength;
        System.out.println("The area of the square is: " + area);
    }
}
