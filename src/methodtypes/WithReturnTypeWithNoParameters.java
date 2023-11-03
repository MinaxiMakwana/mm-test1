package methodtypes;

public class WithReturnTypeWithNoParameters {
    public static void main(String[] args) {
        int result = addition();
        System.out.println(result);
        WithReturnTypeWithNoParameters obj  = new WithReturnTypeWithNoParameters();
        String fullName = obj.myName();
        System.out.println(fullName);
        isRight();
        System.out.println(isRight());
    }

    /**
     * This is with return with no parameter method
     * @return - it returns int type data - e.g. here ans
     */
    public static int addition(){
        int a = 10;
        int b = 20;
        int ans = a+b;
        return ans;
    }
    public String myName(){
        String firstName = "Minaxi";
        String lastName = "Makwana";
        return firstName+" "+lastName;
    }
    public static boolean isRight(){
        boolean a = true;
        boolean b = false;
        String course = "Java";
        return a;
    }
}
