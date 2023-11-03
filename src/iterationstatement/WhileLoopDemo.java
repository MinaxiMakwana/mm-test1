package iterationstatement;

public class WhileLoopDemo {

    public static void main(String[] args) {

        int a = 10;
        while (a>=1){
            System.out.println(a);
            a--;
        }
        System.out.println("Outside while loop");

        boolean ans = true;
        while (ans){
            if(ans){
                System.out.println("Prime");
                break;
            }
        }
    }

}
