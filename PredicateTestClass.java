package predicatetest;
import java.util.Scanner;
import java.util.function.Predicate;
public class PredicateTestClass  {
    public static void main(String[] args) {
        Predicate<Integer> p = (x) -> x >= 0;
        System.out.println("enter no");
        Scanner sc=new Scanner(System.in);
        System.out.println(p.test(sc.nextInt()));
    }

}
