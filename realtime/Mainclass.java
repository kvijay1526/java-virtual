package realtime;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
		AtmOperationInterf op=new AtmOperationImpl();
int atmnumber=12345;
int atmpin=123;
Scanner in=new Scanner(System.in);
System.out.print("Welcome to ATM Machine !!!\n ");
System.out.print("Enter Atm number : ");
int atmNumber=in.nextInt();
System.out.print("Enter pin: ");
int pin=in.nextInt();
if((atmnumber==atmNumber)&&(atmpin==pin)) {
	while(true) {
		System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.view Ministatement\n5.Exit");
		System.out.println("Enter choice : ");
		int ch=in.nextInt();
		if(ch==1) {
			op.viewBalance();
			
		}else if(ch==2) {
			System.out.println("Enter amount to withdraw");
			double withdrawnAmount=in.nextDouble();
			op.withdrawAmount(withdrawnAmount);
			
		}
else if(ch==3) {
System.out.println("Enter Amount to Deposit:");
double depositAmount=in.nextDouble();//5000	
op.depositAmount(depositAmount);
		}
else if(ch==4) {
	op.viewMiniStatement();
	
	
}
else if(ch==5) {
	System.out.println("collect your ATM card\n Thank You for using ATM Machine!!!");
	System.exit(0);
}
else 
{
	System.out.println("please Enter correct choice : ");

}




	}
}
else {
	System.out.println("Incorrect Atm number or pin");
	System.exit(0);
}


}
}
