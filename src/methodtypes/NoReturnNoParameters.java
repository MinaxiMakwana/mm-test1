package methodtypes;

public class NoReturnNoParameters {

    public static void main(String[] args) {
        addition();
        NoReturnNoParameters obj = new NoReturnNoParameters();
        obj.subtraction();
    }

    // no return no params
    public static void addition() {
        int a = 5;
        int b = 10;
        int ans = a + b;
        System.out.println("Addition of two numbers " + a + " and " + b + " is : " + ans);

    }

    public void subtraction() {
            int a = 5;
            int b = 10;
            int ans = b - a;
            System.out.println("Addition of two numbers " + a + " and " + b + " is : " + ans);
    }
}
