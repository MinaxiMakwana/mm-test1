package methodtypes;

public class programme3 {
    public int square(int num){
        int result = num * num;
        return result;
    }

    public static void main(String[] args) {
        programme3 obj = new programme3();
        int squareOfNumber = obj.square(10);
        System.out.println(squareOfNumber);
        System.out.println(obj.square(20));
    }
}
