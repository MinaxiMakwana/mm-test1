package methodtypes;

public class NoReturnWithParameters {

    //no return type with parameters
    public static void addition(int a, int b){
       int answer = a+b;
        System.out.println(answer);
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public void printCourse(String name){
        System.out.println(name);

    }

    public static void main(String[] args) {
        addition(5, 10);
        addition(100, 200);
        printName("Java");
        NoReturnWithParameters obj = new NoReturnWithParameters();
        obj.printCourse("Python");
    }
    }
