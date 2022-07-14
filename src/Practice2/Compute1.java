package Practice2;

/* create a simple program to demonstrate method overloading
   go to Main class to see the code execution

 */
class Compute1 {

    public void findArea(int length, int width) {
        int areaOfRectangle = length*width;
        System.out.println("\nArea of the rectangle is " + areaOfRectangle + "square feet!");
    }
    public void findArea(int side) {
        int areaOfSquare = side*side;
        System.out.println("\nArea of the square is " + areaOfSquare + " square feet!");
    }
    public void findArea(int first, int second, int third) {
        double s = (first + second + third)/2;
        double areaOfTriangle = Math.sqrt(s*(s-first)*(s-second)*(s-third));
        System.out.println("\nArea of the triangle is " +areaOfTriangle +" square feet!");
    }




}
