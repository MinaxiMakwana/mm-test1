package constructor;

public class ConstructorExample {
    int empID;
    String empName;


    public ConstructorExample(int empID, String empName){
        this.empID = empID;
        this.empName = empName;

    }


    public void display(){
        System.out.println(empID);
        System.out.println(empName);
    }

    public static void main(String[] args) {
        ConstructorExample t = new ConstructorExample(10, "Prime");
        t.display();
        ConstructorExample t1 = new ConstructorExample(20, "Testing");
        t1.display(); //20 , Testing
    }
}
