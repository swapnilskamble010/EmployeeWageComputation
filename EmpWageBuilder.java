package employeewagebuilder;

public class EmpWageBuilder {
	final byte WAGE_PER_HOUR = 20;
	byte empHour = 0;
	byte workingDaysCount = 0;
	
	void checkAttendance(double empCheck) {
		switch((int)empCheck) {
		case 1:
			System.out.println("Employee is Present");
			this.empHour = 8;
			workingDaysCount++;
			break;
			
		case 2:
			System.out.println("Part time Employee is Present");
			this.empHour = 4;
			workingDaysCount++;
			break;
			
		default:
			System.out.println("Employee is Absent");
			this.empHour = 0;		
		}
	}
	
	void wageCalculation() {
		int totalEmpWage = 0;
		int totalEmpHour = 0;
		EmpWageBuilder empWage = new EmpWageBuilder();
		while (empWage.workingDaysCount < 21 || totalEmpHour < 101){
			if (empWage.workingDaysCount > 20 || totalEmpHour > 100){
				break;
			}
			double empCheck = Math.floor(Math.random() * 10) % 3;
			empWage.checkAttendance(empCheck);
			int dailyEmpWage = empWage.WAGE_PER_HOUR * empWage.empHour;
			//System.out.println("Daily Wage of Employee is : " + dailyEmpWage);
			totalEmpHour += empWage.empHour;
			System.out.println("Total Employe Hour is: " + totalEmpHour);
			System.out.println("Total Working Days of Employee is : " + empWage.workingDaysCount);
			totalEmpWage += dailyEmpWage;				
			System.out.println("Monthly Wage of Employee is : " + totalEmpWage);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program using OOP's concepts");
		EmpWageBuilder empWage = new EmpWageBuilder();
		empWage.wageCalculation();
	}
}
