package employeeWage;

public class EmpWageBuilderWhile {
    // Constant
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    public static final int MAXIMUM_HOURS_IN_MONTH = 100;

    public static void main(String[] args) {
        //Variables
        int empHrs = 0;
        int totalEmployeeHours = 0;
        int totalWorkingDays = 0;
        // Computation
        while (totalEmployeeHours <= MAXIMUM_HOURS_IN_MONTH && totalWorkingDays < NUMBER_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empcheck = (int) Math.floor(Math.random() * 100) % 2;
            switch (empcheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmployeeHours += empHrs;
            System.out.println("Total Working Day: " + totalWorkingDays + " Employee Hours: " + empHrs);
        }
        int totalEmpwage = totalEmployeeHours * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee Wage: " + totalEmpwage);

    }
}
