package Practice2;

public class Prime {
    public static void main(String[] args) {
        int a_number, min = 0, max = 100;
        System.out.println("Randomly generating a number in the range [" +min+", "+max+"]: ");
        a_number = (int) (Math.random()*100);
        System.out.println(a_number);
        boolean prime  = true;
        for (int i=2; i<=a_number/2; i++) {
            if (a_number % 1 == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(a_number + " is prime!");
        }
        else {
            System.out.println(a_number + " is not prime!");
        }
    }
}
