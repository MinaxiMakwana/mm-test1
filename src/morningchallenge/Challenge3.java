package morningchallenge;

public class Challenge3 {

    int eId;
    int deptNo;

    String eName;
    String job;

    public Challenge3(int eId, int deptNo, String eName, String job) {
        this.eId = eId;
        this.deptNo = deptNo;
        this.eName = eName;
        this.job = job;
    }
    public void display(){
        System.out.println(eId);
        System.out.println(eName);
        System.out.println(deptNo);
        System.out.println(job);

    }
}
