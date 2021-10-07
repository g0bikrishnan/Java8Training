package optional;

import java.util.Optional;

public class LambdaUsingRunnable extends Thread{
    public static void main(String[] args) {
//overrinding a Runnable interfcae method using a lambda function
        Runnable r = () -> { System.out.println("it is a run method overriden by lambda function");};
        Thread t=new Thread(r);// passing the runnable object to the Thread Class Constructor to invoke
       t.start(); // invooking a run method by calling a start method
    }
}
