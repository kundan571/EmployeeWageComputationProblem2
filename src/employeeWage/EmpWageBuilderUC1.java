package employeeWage;

public class EmpWageBuilderUC1 {
    public static void main(String[] args) {
        // Constant
        int IS_FULL_TIME = 1;
        // Computation
        double empcheck = Math.floor(Math.random() * 100) % 2;
        if(empcheck == IS_FULL_TIME){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }

    }
}
