package morningchallenge;

public class Challenge2 {
    public static void main(String[] args) {                     //main method
        int num1 = 10;                                           //local variable
        int num2 = 20;
        Challenge2 challenge2 = new Challenge2();
        Challenge2.multiplication(num1, num2);
    }

    public static void multiplication(int num1, int num2){
        int answer = num1 * num2;
        System.out.println(num1 + " X " + num2 + " is " + answer);
    }
}
