package optional;
import java.util.function.*;
public class FiveProgramsInLambda {
    //Implementing Runnable interface using lambda
    ToIntFunction<Double> toInt=(doub)->{
      return (int)Math.round(doub);
    };
    Runnable r=()-> System.out.println(" Implementation of run() using Lambda");
    //Implementing Predicate interface using lambda
    Predicate<String> p=(x)-> x!=null;
//implementing Supplier interface using lambda
    Supplier<Double> pi=()->{return Math.PI;};
    //Implementing BiFunction using lambda
    BiFunction<Integer,Integer,Integer> max=(x,y)-> {if (x<y) {return y;}else {return x;}};
    public static void main(String[] args) {
        FiveProgramsInLambda fp=new FiveProgramsInLambda();
        //calling a Apply method in BiFunction
        System.out.println(fp.max.apply(10,20));
        Thread t=new Thread(fp.r);
        //calling a run method in Runnable
        t.start();
        System.out.println(fp.p.test("hi"));
        //invoking a Supplier Method
        System.out.println(fp.pi.get());
        //invoking a applyAsInt Method
        System.out.println("Integer Value Of PI "+fp.toInt.applyAsInt(fp.pi.get()));
    }

}
