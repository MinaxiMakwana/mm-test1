package variables;

public class Variables {

    int a = 100;
    String programme;


    public static void main(String[] args) {

        // vatialbes declaration

        // one way of doing this - int x = 100;
        // int y = 200;

        // second way to declare variable
        //int x;
        //int y;
        //int z;

        int x,y,z;
        // variable name start with small letter
        x = 10;
        y = 20;
        z = 30;
        int a = 10;
        String name = "Prime";
        System.out.println(x+y+z);
        System.out.println(name);
        // variable holds the memory

        Variables obj = new Variables ();
        System.out.println(obj.a);
        System.out.println(obj.programme = "Java");




    }
}
