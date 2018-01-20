
import java.util.Scanner;


public class Bankmain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter source account:");
        int srcacc1=sc.nextInt();
        System.out.print("Enter destination account:");
        int desacc1=sc.nextInt();
        System.out.print("Enter source balance:");
        int srcBal1=sc.nextInt();
        System.out.print("Enter destination balance:");
        int desBal1=sc.nextInt();
        
        Bank b1=new Bank(srcacc1,desacc1,srcBal1,desBal1);
        System.out.print("Enter amount to be transferred from source to destionation:");
        int amt=sc.nextInt();
        b1.transferToAccount(srcacc1,desacc1,amt);
    }
    
}
