package iterationstatement;

public class ForLoopExample {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May"};
        String [] cars ={"BMW", "AUDI"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        for( String monthName : months){
            System.out.println(monthName);
        }

        for( String carsName: cars){
            System.out.println(carsName);
        }
    }
}
