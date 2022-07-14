package Practice2;

// abstract class is a restricted class that cannot be used to create objects
// to access it, it must be inherited from another class

abstract class Animal1 {
    public abstract void animalSound1(); //abstract method can only be used in an abstract class
    // and it does not have a body. The body is provided by the subclass (inherited from)
    public void sleep1() {
        System.out.println("Zzz");
    }
}
