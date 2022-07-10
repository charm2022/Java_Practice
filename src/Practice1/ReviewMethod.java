package Practice1;

public class ReviewMethod {
    public static void main(String[] args) {
        int result = sum(5, 9);
        System.out.println(result);
    }  //Recursions
    public static int sum(int start, int end) {
      if (end > start) {
         return end + sum (start, end - 1);
       } else {
       return end;
      }
    }

}