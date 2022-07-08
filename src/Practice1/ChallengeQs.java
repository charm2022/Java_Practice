package Practice1;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ChallengeQs<str1, str2> {

    public static void main(String[] args) {

        String s1 = "keep";
        String s2 = "peek";

        for (int i = 0; i < s1.length() - 1; i++) {
            for (int j = 0; i < s2.length() - 1; i++) {
                if (s1.split("")[i].equalsIgnoreCase(s2.split("")[j])) {
                    System.out.println("Strings are anagrams");
                }
            }
        }


        // find repeat number

        int[] intArray = {3, 4, 5, 2, 4};

        //psedo code: 1. int array into arrayLIst, for loop, if else, Hash set,

        List<Integer> integerArray = new ArrayList<>(intArray.length);

        for (int i : intArray) {
            integerArray.add(i);
        }
        ;

        System.out.println("turn intArray into arrayList" + integerArray);

        int length = integerArray.size();
        Set<Integer> integerArray_Set = new HashSet<>(integerArray);

        for (int i = 0; i < integerArray.size(); i++) {
            if (integerArray.indexOf(integerArray.get(i)) !=
                    (integerArray.lastIndexOf((integerArray.get(i))))) {
                System.out.println("\nThe repeat number in the list is" + integerArray.get(i));
            }
        }
    }



    String str1 = "Race";
    String str2 = "Care";



     // check if length is same
   // if(str1.length()==str2.length())

    {

        // convert strings to char array
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // sort the char array
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


    }
}





