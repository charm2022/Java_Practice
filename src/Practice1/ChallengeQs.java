
import java.util.*;

public class ChallengeQs {

    public static void main (String [] args){

        // find repeat number

        int[] intArray = {3, 4, 5, 2, 4};

        //psedo code: 1. int array into arrayLIst, for loop, if else, Hash set,

        List<Integer>integerArray = new ArrayList<>(intArray.length);

            for (int i : intArray) {
            integerArray.add(i);
            };

            System.out.println("turn intArray into arrayList" + integerArray);

            int length = integerArray.size();
            Set<Integer> integerArray_Set = new HashSet<>(integerArray);

            for(int i = 0; i < integerArray.size(); i++) {
                if (integerArray.indexOf(integerArray.get(i)) !=
                        (integerArray.lastIndexOf((integerArray.get(i))))) {
                    System.out.println("\nThe repeat number in the list is" + integerArray.get(i));
                }
            }

        }
    }


