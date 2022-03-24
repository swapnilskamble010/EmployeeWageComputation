package employeewagebuilder;

public interface ComputeEmpWage {
	public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth);
	void empWageCalc();
}
