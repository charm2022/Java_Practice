package Practice1;

import java.util.Scanner;

public class July8 {
    public static void main(String[] args) {
        double radius, circleArea;
        System.out.println("Enter the value of radius: ");
        Scanner myData = new Scanner(System.in);
        radius = myData.nextDouble(); //nextDouble() function returns the double value read from the user
        circleArea = computeArea (radius);
        System.out.println("Area of Circle with Radius " + radius+ " is " + circleArea);

        Person myObj = new Person();
        myObj.setName("John"); //error
        System.out.println(myObj.getName()); //error
    }

    public static double computeArea (double circle_radius) {
        return 3.14*circle_radius*circle_radius;
    }



}


