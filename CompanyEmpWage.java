package employeewagebuilder;

public class CompanyEmpWage {
	public final String company;
	public final int empRatePerHr;
	public final int numOfWorkingDays;
	public final int maxHrsPerMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
}
