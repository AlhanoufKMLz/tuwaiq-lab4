//Alhanouf Allazzam

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-----------setters & getters-----------");
        Circle c1 = new Circle(5);
        System.out.println(c1 + "\n");

        c1.setRadius(3);
        System.out.println("The radios after using setRadius(): " + c1.getRadius() + "\n");

        Rectangle r1 = new Rectangle(2,4);
        System.out.println(r1 + "\n");
        r1.setHeight(5);
        r1.setWidth(3);
        System.out.println("The height after using setHeight(): " + r1.getHeight());
        System.out.println("The width after using setWidth(): " + r1.getWidth() + "\n");

        Triangle t1 = new Triangle(2,4);
        System.out.println(t1 + "\n");
        t1.setHeight(4);
        t1.setBase(3);
        System.out.println("The height after using setHeight(): " + t1.getHeight());
        System.out.println("The base after using setBase(): " + t1.getBase() + "\n");

        System.out.println("***Trying to set negative numbers***");
        try{
            c1.setRadius(-1);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            r1.setHeight(-2);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            r1.setWidth(-3);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            t1.setHeight(-4);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            t1.setBase(-5);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



        System.out.println("\n-----------abstract methods-----------");
        while (true){
            System.out.println("Please choose shape or \"exit\" to quit: \n1- Circle. \n2- Rectangle. \n3- Equilateral Triangle.");
            String choice = input.nextLine();

            if(choice.equalsIgnoreCase("exit"))
                break;

            switch (choice){
                case "1":
                    System.out.print("Please enter the circle radius: ");
                    try{
                        double radius = input.nextInt();
                        Circle circle = new Circle(radius);
                        System.out.println(circle + "\n");
                    } catch (InputMismatchException e){
                        System.out.println("Invalid input. Please enter a number.\n");
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    System.out.print("Please enter the rectangle height: ");
                    try{
                        double height = input.nextInt();
                        System.out.print("Please enter the rectangle width: ");
                        double width = input.nextInt();
                        Rectangle rectangle = new Rectangle(height, width);
                        System.out.println(rectangle + "\n");
                    } catch (InputMismatchException e){
                        System.out.println("Invalid input. Please enter a number.\n");
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    System.out.print("Please enter the triangle height: ");
                    try{
                        double triangleHeight = input.nextInt();
                        System.out.print("Please enter the triangle base: ");
                        double base = input.nextInt();
                        Triangle triangle = new Triangle(triangleHeight, base);
                        System.out.println(triangle + "\n");
                    } catch (InputMismatchException e){
                        System.out.println("Invalid input. Please enter a number.\n");
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid input.");
            }
            input.nextLine();

        }



    }
}