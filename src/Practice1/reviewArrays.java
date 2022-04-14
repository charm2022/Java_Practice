import java.util.Arrays;

public class reviewArrays {
    public static void main(String[] args) {

        // find the largest number
        double[] myList = {1.9, 3.4, 2.9, 3.5};

        double max = myList[0];

        for (int i = 1; i < myList.length; i++) {
            if(myList[i] > max) {
                max = myList[i];
            }
            System.out.println("the largest number is " + max);


        }
    }
}
