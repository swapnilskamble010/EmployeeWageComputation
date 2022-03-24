package employeewagebuilder;

public class EmpWageBuilder {
	public static final int IS_FULL_TIME = 1; 
	public static final int IS_PART_TIME = 2; 
	

	private int numOfCompanies = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmpWageBuilder() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		companyEmpWageArray[numOfCompanies] = new CompanyEmpWage(company, empRatePerHr, numOfWorkingDays, maxHrsPerMonth);
		numOfCompanies++;
	}
	
	private void empWageCalc() {
		for(int i = 0; i < numOfCompanies; i++) {
			int totalEmpWage = this.empWageCalc(companyEmpWageArray[i]);
			System.out.println("Total Employee Wage for Company " + companyEmpWageArray[i].company + " is: " + totalEmpWage);
		}
	}
	
	private int empWageCalc(CompanyEmpWage companyEmpWage) {
		int totalEmpHour = 0;
		int empHour = 0;
		int totalWorkingDays = 0;
		
		while(totalEmpHour <= companyEmpWage.maxHrsPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkingDays) {
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
		return companyEmpWage.totalEmpWage = totalEmpHour * companyEmpWage.empRatePerHr;	
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		EmpWageBuilder companyEmpWageArray = new EmpWageBuilder();
		companyEmpWageArray.addCompanyEmpWage("D-Mart", 20, 30, 150);
		companyEmpWageArray.addCompanyEmpWage("Big Basket", 25, 30, 200);
		companyEmpWageArray.addCompanyEmpWage("Reliance Mart", 22, 30, 300);
		companyEmpWageArray.empWageCalc();
	}
}