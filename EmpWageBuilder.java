package empwage;

public class EmpWageBuilder {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;
		final int NO_OF_WORKING_DAYS = 20;
		int empHours = 0;
		int empWage = 0;
		int TotalEmpWage = 0;
		
		for (int day = 0; day < NO_OF_WORKING_DAYS; day++) {
			
			double empCheck = Math.floor(Math.random() * 10) % 3;
		
			switch ((int)empCheck) { 
		
			case (IS_FULL_TIME):
				System.out.println("Employee is Present");
				empHours = 8;
				//empWage = empHours * EMP_RATE_PER_HOUR;
				//System.out.println("Employee Wage: " + empWage);
				break;
				
			case (IS_PART_TIME):
				System.out.println("Part Time Employee is Present");
				empHours = 4;
				//empWage = empHours * EMP_RATE_PER_HOUR;
				//System.out.println("Employee Wage: " + empWage);
				break;
			
			default:
				System.out.println("Employee is Absent");
				//System.out.println("Employee Wage: " + empWage);
			}
		
			empWage = empHours * EMP_RATE_PER_HOUR;
			TotalEmpWage += empWage;
			System.out.println("Employee Wage: " + empWage);	
			
		}
		
		System.out.println("Total Employee Wage :" + TotalEmpWage);
		
	}	
		

}
