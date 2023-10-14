public class Circle {
    public double radius;
    public Circle( double radius)
    {this.radius=radius;
    }
    public double CalculateArea(){
        float pi;
        pi=3.14F;
        return pi*(radius*radius);

    }
}
