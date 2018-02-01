package prob1;

public class CheckingAccount {
	protected double balance;
	protected int id;
	protected boolean isLowBalance = true;
	protected int numChecks = 0;
	/*
	public static void main(String[] args) {
		
		 * CheckingAccount a = new CheckingAccount(1,99.00);
		 * a.processCheck(10.00); a.processCheck(10.00); a.processCheck(10.00);
		 * String msg = a.getBalance() + " "; System.out.println(msg);
		 * //a.endOfMonth(); msg = a.getBalance() + " new" + " ";
		 * System.out.println(a);
		 
		System.out.println("***Checking Account");
		CheckingAccount ca = new CheckingAccount(123, 50.0);
		System.out.println("created: " + ca);
		ca.deposit(560.0);
		System.out.println("deposit: " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);
		ca.deposit(202.0);
		System.out.println("deposit: " + ca);
		ca.processCheck(500.0);
		System.out.println("check  : " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);

		System.out.println("\n***Gold Checking Account");
		ca = new GoldCheckingAccount(456, 50.0);
		System.out.println("created: " + ca);
		ca.deposit(575.0);
		System.out.println("deposit: " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);
		ca.deposit(1425.0);
		System.out.println("deposit: " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);
		
	}
*/
	public CheckingAccount(int id, double bal) {
		this.id = id;
		this.balance = bal;
	}

	public void deposit(double amt) {
		this.balance += amt;
		if (balance < 100.00) {
			isLowBalance = true;
		}
		else if (balance < 1000.00){
			isLowBalance = true;
		}
	}

	public void endOfMonth() {
		/*
		 * if (isLowBalance == true && numChecks > 3) { balance -= ((numChecks -
		 * 3) * 2.00) + 10.00; } else if (balance < 100.00 && numChecks > 3) {
		 * balance -= ((numChecks - 3) * 2.00); isLowBalance = true; } else
		 * if(balance > 100.00) {
		 * 
		 * isLowBalance = false;
		 * 
		 * }
		 */

		if (isLowBalance == true && numChecks > 3 && balance >= 100.00) {
			balance -= ((numChecks - 3) * 2.00) + 10.00;
			isLowBalance = false;
		} else if (isLowBalance == true && numChecks < 3 && balance < 100.00) {
			balance -= 10.00;
		} else if (isLowBalance == true && numChecks < 3 && balance >= 100.00) {
			balance -= 10.00;
			isLowBalance = false;
		} else if (isLowBalance == false && numChecks > 3 && balance >= 100.00) {
			balance -= ((numChecks - 3) * 2.00);
		} else if (isLowBalance == false && numChecks < 3 && balance < 100.00) {
			isLowBalance = true;
		}
		/*
		 * else if(balance > 100.00 && numChecks > 3){ balance -= ((numChecks -
		 * 3 ) * 2.00); isLowBalance = false; } else if(balance > 100.00 &&
		 * numChecks < 3){ isLowBalance = false;
		 * 
		 * }
		 */
		numChecks = 0;
	}

	public double getBalance() {

		return balance;
	}

	public double getId() {

		return id;
	}

	public void processCheck(double amt) {
		balance -= amt;
		if (balance < 0.00) {
			balance -= 20.00;
			isLowBalance = true;

		} else if (balance < 100.00) {
			isLowBalance = true;
		}

		numChecks++;
		/*
		 * if(numChecks < 3 && balance < 0.00){ balance -= amt + 20.00;
		 * numChecks++; } else{ balance -= amt; isLowBalance = true;
		 * numChecks++;
		 * 
		 * }
		 */

	}

	public String toString() {
		String result = " ";
		String f = String.format("%.2f", getBalance());
		result += "CA : id=" + getId() + ", balance=$" + f + ", low balance=" + isLowBalance
				+ ", num checks=" + numChecks;
		return result;
	}
}
