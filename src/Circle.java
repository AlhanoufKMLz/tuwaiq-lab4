public class Circle extends Shape{
    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }


    //getter
    public double getRadius() {
        return radius;
    }


    //setter
    public void setRadius(double radius) {
        this.radius = radius;
    }


    //extra methods
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI;
    }


    //to string
    public String toString(){
        return "Circle: " + "\n" +
                "   * Radius: " + radius + "\n" +
                "   * Area: " + calculateArea() + "\n" +
                "   * Circumference: " + calculateCircumference();
    }
}
