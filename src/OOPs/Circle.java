package OOPs;

public class Circle {
    double radius;
    Circle(double radius){
       this.radius=radius;
    }
    public void setRadius(float radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getAreaOfCircle(){
        return Math.PI*radius*radius;
    }
}
