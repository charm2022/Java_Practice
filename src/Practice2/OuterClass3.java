package Practice2;

class OuterClass3 { //access outer class from inner class
    int x = 99;

    class InnerClass3 {
        public int myInnerMethod() {
            return x;
        }
    }

}
