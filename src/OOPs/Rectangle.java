package OOPs;

public class Rectangle {
    double area, perimeter;

    public void calculateArea(float width, float length){
        area= length*width;
    }
    public double getArea(){
        return area;
    }

    public void calculatePerimeter(float length, float width){
        perimeter=2*(length+width);
    }
    public double getPerimeter(){
        return  perimeter;
    }
}
