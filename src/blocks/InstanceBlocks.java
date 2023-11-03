package blocks;

public class InstanceBlocks {
    String eName;

    //instance block - no names only curley braces
    {
        System.out.println("I am in instance blocks");
        eName = "Shyam";
    }
public InstanceBlocks(){
    System.out.println("I am in constructor");
}

    public static void main(String[] args) {
        InstanceBlocks obj = new InstanceBlocks();
    }

}
