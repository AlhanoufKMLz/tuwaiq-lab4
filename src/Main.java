//Alhanouf Allazzam

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Please choose shape or \"exit\" to quit: \n1- Circle. \n2- Rectangle. \n3- Equilateral Triangle.");
            String choice = input.nextLine();

            if(choice.equalsIgnoreCase("exit"))
                break;

            switch (choice){
                case "1":
                    System.out.print("Please enter the circle radius: ");
                    double radius = input.nextInt();
                    Circle circle = new Circle(radius);
                    System.out.println("Circle Area: " + circle.calculateArea());
                    System.out.println("Circle Circumference: " + circle.calculateCircumference() + "\n");
                    break;
                case "2":
                    System.out.print("Please enter the rectangle height: ");
                    double height = input.nextInt();
                    System.out.print("Please enter the rectangle width: ");
                    double width = input.nextInt();
                    Rectangle rectangle = new Rectangle(height, width);
                    System.out.println("Rectangle Area: " + rectangle.calculateArea());
                    System.out.println("Rectangle Perimeter: " + rectangle.calculateCircumference() + "\n");
                    break;
                case "3":
                    System.out.print("Please enter the triangle height: ");
                    double triangleHeight = input.nextInt();
                    System.out.print("Please enter the triangle base: ");
                    double base = input.nextInt();
                    Triangle triangle = new Triangle(triangleHeight, base);
                    System.out.println("Triangle Area: " + triangle.calculateArea());
                    System.out.println("Triangle Perimeter: " + triangle.calculateCircumference() + "\n");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
            input.nextLine();

        }

    }
}