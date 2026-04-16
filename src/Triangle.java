public class Triangle extends Shape{
    private double height;
    private double base;

    //constructor
    public Triangle(double height, double base) throws IllegalArgumentException{
        if (height <= 0 || base <= 0) {
            throw new IllegalArgumentException("Height and Base must be positive.");
        }
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
    public void setHeight(double height) throws IllegalArgumentException{
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        this.height = height;
    }

    public void setBase(double base) throws IllegalArgumentException{
        if (base <= 0) {
            throw new IllegalArgumentException("Base must be positive.");
        }
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


    //to string
    public String toString(){
        return String.format("Triangle: %n" +
                        "   * Height: %.2f%n" +
                        "   * Base: %.2f%n" +
                        "   * Area: %.2f%n" +
                        "   * Perimeter: %.2f",
                height, base, calculateArea(), calculateCircumference());
    }
}
