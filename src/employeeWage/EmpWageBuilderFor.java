package employeeWage;

public class EmpWageBuilderFor {
    // Constant
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        //Variables
        int empHrs = 0;
        int empWage = 0;
        int totalEmployeeWage = 0;
        // Computation
        for (int day = 0;day < NUMBER_OF_WORKING_DAYS;day++) {
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
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmployeeWage += empWage;
            System.out.println("Employee Wage: " + empWage);
        }
        System.out.println("Total Employee Wage: " + totalEmployeeWage);

    }
}
