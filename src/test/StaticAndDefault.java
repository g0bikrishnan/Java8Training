package test;

public class StaticAndDefault implements MyInterface
{
    public static void main(String[] args) {
        StaticAndDefault st=new StaticAndDefault();
        st.defaultMethod();

//        st.staticMethod(); --> it does not work because of we can't invoke a static method by using a class instance
        MyInterface.staticMethod();//it will be works the Interface class is only invokes static method


    }
    @Override
    public void defaultMethod() {
        System.out.println("this is the block of overriden method");
    }// here the MyInterface's Default Method is Overriden by implemented Class
}
