public class bankAcc{
    private String name = "Bob";
    private long phoneNum = 981276345;
    private int amount = 10000; //in dollars

    public void setName(String name){
        String toUpper = name.toUpperCase();
        this.name = toUpper;
    }

    public void setAmount(int deposit){
        amount += deposit;
    }

    public void accInfo(){
        System.out.println("Name is: " + name + ".");
        System.out.println("Your phone number is: 0" + phoneNum + ".");
        if (name == "CHONKSTER") {
        System.out.println("DAMN you have " + (amount+100000) + " in dollars.\n");
        }
        else {
        System.out.println("Current amount is: " + amount + " in dollars.\n");
        }
    }

    public int withdraw(int newBalance){
        newBalance = amount - newBalance;
        if (newBalance <= 0) {
            System.out.println("\nOi you can't withdraw " + (-newBalance) + " dollars. You only have" + amount + " .");            
            return -1;
        }
        else {
            System.out.println("Okay you have withdrew " + (amount - newBalance) + " dollars.");
            System.out.println("Now you have " + newBalance + " dollars.\n\n");
        } 
        
        return newBalance;
    }
}