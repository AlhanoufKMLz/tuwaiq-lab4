public class Rectangle extends Shape{
    private double height;
    private double width;

    //constructor
    public Rectangle(double height, double width){
        this.width = width;
        this.height = height;
    }


    //getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }


    //setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    //extra methods
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (width + height);
    }


    //to string
    public String toString(){
        return "Rectangle: " + "\n" +
                "   * Height: " + height + "\n" +
                "   * Width: " + width + "\n" +
                "   * Area: " + calculateArea() + "\n" +
                "   * Perimeter: " + calculateCircumference();
    }
}
