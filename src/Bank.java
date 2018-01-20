
public class Bank {

    private final int srcAcc;
    private final int desAcc;
    private int srcBal, desBal;

    public Bank(int srcAcc, int desAcc, int srcBal, int desBal) {
        this.srcAcc = srcAcc;
        this.desAcc = desAcc;
        this.srcBal = srcBal;
        this.desBal = desBal;
    }

    public int getSrcBal() {
        return srcBal;
    }

    public void setSrcBal(int srcBal) {
        this.srcBal = srcBal;
    }

    public int getDesBal() {
        return desBal;
    }

    public void setDesBal(int desBal) {
        this.desBal = desBal;
    }
    public void transferToAccount(int srcAcc,int desAcc,int amount){
        
        
        if(amount<=srcBal){
            this.srcBal=this.srcBal-amount;
            this.desBal=this.desBal+amount;
            System.out.println(amount+" Amount Transfered to destination account!");
        }
        else{
            System.out.println("please transfer amount below your limit");
        }
        System.out.println("Source balance is: "+srcBal +" and Destionation Balance is: "+desBal);
    }

    
    
}
