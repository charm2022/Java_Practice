package Practice2;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        double scale;
        System.out.println(" Enter marks of the student:");
        Scanner s = new Scanner(System.in);
        int marks = s.nextInt();
        marks = marks/10;
        String grade = "";

        switch (marks) {
            case 10:
            case 9:
            case 8:
                grade = "A+";
                break;
            case 7:
                grade = "A";
                break;
            case 6:
                grade  = "B+";
                break;
            case 5:
                grade = "B";
                break;
            case 4:
                grade = "C";
                break;
            case 3:
            case 2:
            case 1:
            case 0:
                grade  = "F";
                break;
            default:
                System.out.println( "Wrong marks entered!");
                System.exit(0);
        }
        System.out.println(" Grade is " + grade);

            }



        }


