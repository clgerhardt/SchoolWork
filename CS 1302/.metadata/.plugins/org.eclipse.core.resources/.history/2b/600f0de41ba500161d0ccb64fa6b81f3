package prob3;

public class Store {
	private Employee[] emps = new Employee[20];
	private int numEmps = 0;

	public Employee getEmps(int i) {
		if (i < emps.length) {
			return emps[i];
		}
		return null;
	}

	public int getNumEmps(int i) {

		return numEmps;
	}

	public void addEmp(Employee e) {
		if (numEmps < emps.length) {
			emps[numEmps++] = e;
		}
	}

	public double totalHours() {
		double sum = 0.0;
		for (Employee e : emps) {
			if (e != null)
				sum += e.totalHours();
		}

		return sum;
	}

	public String toString() {
		String result = "";
		result += "Num Employees: " + getNumEmps(numEmps) + '\n';
		for(int i = 0; i < emps.length;i++){
			if( emps[i] != null)
				result += emps[i] + "\n";
		}
		result += "Total Hours Worked = " + totalHours();
		
		return result;  
	}

}
