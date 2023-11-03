package methodtypes;

public class WithReturnTypeWithParameters {

    public int addition(int a, int b){
        int result = a+b;
        return result;
    }

    String name(String name){
        return name;
    }

    public static void main(String[] args) {
        WithReturnTypeWithParameters obj = new WithReturnTypeWithParameters();
        int result= obj.addition(10, 20);
        System.out.println(result); //30
        System.out.println(obj.addition(50, 100));
        System.out.println(obj.name("Minaxi"));
    }
}
