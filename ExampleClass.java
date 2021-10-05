package test;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExampleClass {
    //check the String Contains Digit or not
    Predicate<String> p=s ->{
        for(char x:s.toCharArray())
        {
            if (Character.isDigit(x))
            {
                System.out.println("it has some Digits "+x);
                return true;
            }
        }
        System.out.println("The String does not contains any Digits");
        return false;
    };
    //end of Predicate
    Consumer c= str-> System.out.println("Hello "+str);
    //end of consumer

    Function<Integer,Double> square=(x)->Math.pow(x,2);
//end of Function
    public static void main(String[] args) {
        ExampleClass ex=new ExampleClass();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name ");
        ex.c.accept(sc.nextLine());
        System.out.println("enter Number to get Square value of it");
        System.out.println(ex.square.apply(sc.nextInt()));
        System.out.println("Enter String to Check it contains a Digit or not");
        System.out.println(ex.p.test(sc.next()));

    }
}
