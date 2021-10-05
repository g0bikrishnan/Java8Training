package test;

public interface MyInterface {
    default void defaultMethod()
    {
        System.out.println("this block of Default Method");

    }
    static void staticMethod() {
        System.out.println("this block of Static Method");
    }
}
