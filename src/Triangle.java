public class Triangle extends Shape{
    private double height;
    private double base;

    //constructor
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }


    //getters
    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }


    //setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }


    //extra methods
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculateCircumference() {
        return 3 * base;
    }
}
