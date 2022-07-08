package Practice1;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class CodeTest {



    /* Given two strings s1 and s2, check if both the strings are anagrams of each other.
        Examples:
        Input : s1 = "listen"
                 s2 = "silent"
        Output : The strings are anagrams.

        Input : s1 = "dad"
                s2 = "bad"
        Output : The strings aren't anagrams.
         */

            static boolean bAnagram(@NotNull String s1, @NotNull String s2) {
                if (s1.length() != s2.length()) {
                    return false;
                }
                
                char[] arr1 = s1.toCharArray();
                char[] arr2 = s2.toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);

                return Arrays.equals(arr1,arr2);
                }

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter words to check if they are anagram.");

            System.out.println("Type the first word and press enter:");
            String s1 = input.nextLine();

            System.out.println("Type the second word and press enter:");
            String s2 = input.nextLine();

            if (s1.length() == s2.length()) {
                char[] charArray1 = s1.toCharArray();
                char[] charArray2 = s2.toCharArray();

                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                boolean isAnagram = Arrays.equals(charArray1, charArray2);
                System.out.println(isAnagram);



            }






            }
    }

