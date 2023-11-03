package blocks;

public class StaticBlocksExample {
    static String eName;
    static int eId;

    static{
        eName = "Ram";
        eId = 101;
        System.out.println("class statement");
    }

    public static void main(String[] args) {
        System.out.println("Employee Name is : " + eName);
        System.out.println("Employee ID is : " + eId);
    }
    static{
        System.out.println("I am in second static block");
    }
}
