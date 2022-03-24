package employeewagebuilder;

public class EmpWageBuilder {
	public static final int IS_FULL_TIME = 1; 
	public static final int IS_PART_TIME = 2; 
	
	public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
		int totalEmpWage = 0;
		int totalEmpHour = 0;
		int empHour = 0;
		int totalWorkingDays = 0;
		
		while(totalEmpHour <= maxHrsPerMonth && totalWorkingDays <= numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
			case IS_FULL_TIME:
				empHour = 8;
				break;
				
			case IS_PART_TIME:
				empHour = 4;
				break;
				
			default:
				empHour = 0;		
			}
			totalEmpHour += empHour;
		}
		totalEmpWage = totalEmpHour * empRatePerHour;	
		System.out.println("Total Employee Wage for Company " + company + " is : " + totalEmpWage);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program using OOP's concepts");
		EmpWageBuilder dMart = new EmpWageBuilder("DMart", 20, 30, 150);
		EmpWageBuilder bigBasket = new EmpWageBuilder("Big Basket", 25, 30, 200);
		EmpWageBuilder relianceMart = new EmpWageBuilder("Reliance Mart", 22, 30, 300);
	}
}