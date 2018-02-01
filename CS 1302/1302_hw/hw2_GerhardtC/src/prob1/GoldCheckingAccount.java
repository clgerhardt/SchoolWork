package prob1;

public class GoldCheckingAccount extends CheckingAccount {


	public GoldCheckingAccount(int id, double bal) {
		super(id, bal);
		// TODO Auto-generated constructor stub
	}
	
	public void endOfMonth(){
		/*
		if (isLowBalance == true && numChecks > 3 && balance > 100.00) {
			balance -= ((numChecks - 3) * 2.00) + 10.00;
			isLowBalance = false;
		} else if (isLowBalance == true && numChecks < 3 && balance < 100.00) {
			balance -= 10.00;
		} else if (isLowBalance == true && numChecks < 3 && balance > 100.00) {
			balance -= 10.00;
			isLowBalance = false;
		} else if (isLowBalance == false && numChecks > 3 && balance > 100.00) {
			balance -= ((numChecks - 3) * 2.00);
		} else if (isLowBalance == false && numChecks < 3 && balance < 100.00) {
			isLowBalance = true;
		}
		*/
		double oneP = 0.0;
		oneP += (.01 * balance);
		if(isLowBalance == true && balance >= 1000.00){
			balance -= 25.00;
			isLowBalance = false;
		}
		else if(isLowBalance == false && balance >= 1000.00){
			balance += oneP;
		}
		else if(isLowBalance == true && balance < 1000.00){
			balance -=25.00;
		}
		numChecks = 0;
	}
	
	public void processCheck(double amt){
		balance -= amt;
		if (balance < 0.00) {
			balance -= 20.00;
			isLowBalance = true;

		} else if (balance < 1000.00) {
			isLowBalance = true;
		}

		numChecks++;
		
	}
	
	public String toString(){
		String result = " ";
		String f = String.format("%.2f", getBalance());
		result += "CA : id=" + getId() + "balance=$" + f + ", low balance=" + isLowBalance
				+ ", num checks=" + numChecks;
		return  result;
	}

}
