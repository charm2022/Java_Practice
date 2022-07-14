package Practice2;

public class Main3 { //to access outer class from inner class
    public static void main(String[] args) {
        OuterClass3 myOuter3 = new OuterClass3();
        OuterClass3.InnerClass3 myInner3 = myOuter3.new InnerClass3();
        System.out.println(myInner3.myInnerMethod());

    }
}
