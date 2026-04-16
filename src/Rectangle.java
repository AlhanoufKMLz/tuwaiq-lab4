public class Rectangle extends Shape{
    private double height;
    private double width;

    //constructor
    public Rectangle(double height, double width) throws IllegalArgumentException{
        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException("Height and Width must be positive.");
        }
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
    public void setHeight(double height) throws IllegalArgumentException{
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        this.height = height;
    }

    public void setWidth(double width) throws IllegalArgumentException{
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive.");
        }
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
        return String.format("Rectangle: %n" +
                        "   * Height: %.2f%n" +
                        "   * Width: %.2f%n" +
                        "   * Area: %.2f%n" +
                        "   * Perimeter: %.2f",
                height, width, calculateArea(), calculateCircumference());
    }
}
