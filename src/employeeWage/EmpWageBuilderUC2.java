package employeeWage;

public class EmpWageBuilderUC2 {
    public static void main(String[] args) {
        // Constant
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        //Variables
        int empHrs = 0;
        int empWage = 0;
        // Computation
        double empcheck = Math.floor(Math.random() * 100) % 2;
        if(empcheck == IS_FULL_TIME){
            empHrs = 8;
        }
        else{
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage: " + empWage);

    }
}
