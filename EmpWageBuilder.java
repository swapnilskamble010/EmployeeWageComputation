package employeewagebuilder;

import java.util.ArrayList;

public class EmpWageBuilder implements ComputeEmpWage {
	public static final int IS_FULL_TIME = 1; 
	public static final int IS_PART_TIME = 2; 
	
	private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
	
	public EmpWageBuilder() {
		super();
		companyEmpWageArrayList = new ArrayList<CompanyEmpWage>();
	}
	
	public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		CompanyEmpWage companyWage = new CompanyEmpWage(company, empRatePerHr, numOfWorkingDays, maxHrsPerMonth);
		companyEmpWageArrayList.add(companyWage);
	}
	
	public void empWageCalc() {
		for(int i = 0; i < companyEmpWageArrayList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
			int totalEmpWage = this.empWageCalc(companyEmpWage);
			System.out.println("Total Employee Wage for Company " + companyEmpWage.company + " is: " + totalEmpWage);
		}
	}
	
	public int empWageCalc(CompanyEmpWage companyEmpWage) {
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