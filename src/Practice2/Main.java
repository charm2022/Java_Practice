package Practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);  // output = 15

        /* continued from Compute1 class
        Use user input methods:

         */
        Compute1 rectOb = new Compute1();
       // rectOb.findArea(2.5, 5);
        // rectOb.findArea(4);
        // rectOb.findArea(3, 4, 5);

        System.out.println("Enter the length of rectangle:");
        BufferedReader myBuffer = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(String.valueOf(myBuffer.read()));
        System.out.println("Enter the width of rectangle:");
        myBuffer = new BufferedReader(new InputStreamReader(System.in));
        int  width = Integer.parseInt(myBuffer.readLine());
        rectOb.findArea(length, width);

        System.out.println("Enter the side of square:");
        myBuffer = new BufferedReader(new InputStreamReader(System.in));
        int side = Integer.parseInt(myBuffer.readLine());
        rectOb.findArea(side);

        System.out.println("Enter the first side of triangle:");
        myBuffer = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(myBuffer.readLine());
        System.out.println("Enter the second side of triangle:");
        myBuffer = new BufferedReader(new InputStreamReader(System.in));
        int second = Integer.parseInt(myBuffer.readLine());
        System.out.println("Enter the third side of triangle:");
        myBuffer = new BufferedReader(new InputStreamReader(System.in));
        int third = Integer.parseInt(myBuffer.readLine());
        rectOb.findArea(first, second, third);
        }
}
