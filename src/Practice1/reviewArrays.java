package Practice1;

import java.util.Arrays;

public class reviewArrays {
    public static void main(String[] args) {

        // find the largest number
        double[] myList = {1.9, 11.3, 3.4, 2.9, 3.5, 4.6, 9.8, 1.4, 5.7};

        System.out.println("print my list " + myList); //you can't print out an int array directly
        System.out.println("using Arrays.toString(variableName) to print my list " + Arrays.toString(myList));

        double max = myList[0];

        for (int i = 1; i < myList.length; i++) {
            if(myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println("the largest number is " + max);
        System.out.println(" the length of my list is " + myList.length);

        // find the total amount

        double totalAmt = 0;
        for (int j = 0; j < myList.length; j++) {
            totalAmt += myList[j];
            }
        System.out.println("\n the total amount is " + totalAmt);

        String[] stringArray = {"Mary", "John", "Adeline", "Zoey", "Monet", "Eric"};
        System.out.println("\n using Arrays.asList method to print " + Arrays.asList(stringArray));
        }

    }


