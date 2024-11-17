package realtime;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

public class AtmOperationImpl implements AtmOperationInterf{
	Atm atm=new Atm();
	Map<Double,String> ministmt=new HashMap<>();
	
	
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is : "+atm.getBalance());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
		if(withdrawAmount<=atm.getBalance()) {
			ministmt.put(withdrawAmount,"Amount withdrawn");
		System.out.println("collect the cash"+withdrawAmount);
		atm.setBalance(atm.getBalance()-withdrawAmount);
		viewBalance();
		// TODO Auto-generated method stub
		
	} 
			else {
			System.out.println("Insufficient Balance !!");
			}
		}
	else {
			System.out.println("Please enter the Amount in multiples of 500");
	
			
		} }

	@Override
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount,"Amount Deposited");
		System.out.println(depositAmount+" Deposited successfully !!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double,String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+ " " +m.getValue()+ new Date());
			
		}
		
		// TODO Auto-generated method stub
		
	}

}
