public abstract class Shape {
    private int x;
    private int y;

    //constructor
    protected Shape() {}

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    //setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    //extra methods
    public abstract double calculateArea();

    public abstract double calculateCircumference();
}
