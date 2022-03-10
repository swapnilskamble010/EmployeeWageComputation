package empwage;

public class EmpWageBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHours = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
			empHours = 8;
			empWage = empHours * EMP_RATE_PER_HOUR;
			System.out.println("Employee Wage: " + empWage);
		}	
		else if(empCheck == IS_PART_TIME){
			System.out.println("Part Time Employee is Present");
			empHours = 4;
			empWage = empHours * EMP_RATE_PER_HOUR;
			System.out.println("Employee Wage: " + empWage);
		}
		else {
			System.out.println("Employee is Absent");
			System.out.println("Employee Wage: " + empWage);
		}
	}		

}
