package methodtypes;

public class MethodDeclaration {
    int a =10;
    public void m1(){
       //void is return type  - because return type is void m1 does not have any value - return type is equal to data type
        System.out.println("This is m1 method");

    }
    public void m2(){
        System.out.println("This is m2 method");
    }
    public void m3(){
        m2();
    }
    public static void addition (){
        System.out. println("This is addition method");
    }
    public static void subtraction (){
        System.out.println("This is subtraction method");
    }

    public static void main(String[] args) {
        MethodDeclaration t1 = new MethodDeclaration();
        t1.m1();
        t1.m2();
        t1.m3();
        addition();
        subtraction();

    }
}
