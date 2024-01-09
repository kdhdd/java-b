package oop1.ex;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.width = 5;
        rec.height = 8;
        //넓이
        rec.calculateArea();
        //둘레 길이
        rec.calculatePerimeter();
        //정사각형 여부
        rec.isSquare();
    }
}
