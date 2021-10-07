package optional;

import java.util.Optional;

public class LambdaUsingRunnable extends Thread{
    public static void main(String[] args) {
//overriding a Runnable interface method using a lambda function
        Runnable r = () -> { System.out.println("it is a run method overridden by lambda function");};
        Thread t=new Thread(r);// passing the runnable object to the Thread Class Constructor to invoke
       t.start(); // invoking a run method by calling a start method
    }
}
