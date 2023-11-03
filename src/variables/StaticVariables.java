package variables;

public class StaticVariables {
    /**
     * variable which is declared outside the main method using static keyword its static variable     *  is related - class
     * scope - within the class
     * memory allocation - when class is loaded
     * store - non heap memory
     */

   static int a = 10;
    static String name = "Prime Testing";

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(StaticVariables.a);
        System.out.println(name);
        System.out.println(StaticVariables.name);
   }

    public void m1(){
        System.out.println(a);
        System.out.println(StaticVariables.a);
    }
}
