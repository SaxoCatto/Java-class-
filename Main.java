public class Main {
    
    public static void main(String args[]){
        bankAcc bA = new bankAcc(); //pleb account
        bA.setName("Lemur");
        bA.setAmount(10000);
        bA.accInfo();
        bA.withdraw(1000);
        bA.accInfo();

        bankAcc vipAcc = new bankAcc(); //cracked account
        vipAcc.setName("CHONKSTER");
        //im trying to differentiate static and instance --> data seperation
        vipAcc.accInfo();

    }
}
