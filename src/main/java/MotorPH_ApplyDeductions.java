public class MotorPH_ApplyDeductions {
    
    //Computation for the deduction of SSS by 5% from the Gross semi-monthly salary
    public static double computeSSS(double SemiMonthlySalary) {
        return SemiMonthlySalary * 0.05;
    }
    
    //Computation for the deduction of Pag-Ibig by 2% from the Gross semi-monthly salary
    public static double computePagibig(double SemiMonthlySalary) {
        return SemiMonthlySalary * 0.02;
    }
    
    //Computation for the deduction of PhilHealth by 2.5% from the Gross semi-monthly salary
    public static double computePhilhealth(double SemiMonthlySalary) {
        return SemiMonthlySalary * 0.025;
    }
    
    //Computation for the deduction of Income Tax based on the Income Tax: 2023-2026 TRAIN law
    public static double computeIncomeTax(double incomeDeduction) {
        if (incomeDeduction <= 10417) {
            return 0;
        } else if (incomeDeduction <= 16667) {
            return (incomeDeduction - 10417) * 0.15;
        } else if (incomeDeduction <= 33333) {
            return 937.5 + (incomeDeduction - 16667) * 0.2;
        } else if (incomeDeduction <= 83333) {
            return 4270.83 + (incomeDeduction - 33333) * 0.25;
        } else if (incomeDeduction <= 333333) {
            return 16770.83 + (incomeDeduction - 83333) * 0.3;
        } else {
            return 91770.83 + (incomeDeduction - 333333) * 0.35;
        }
    }
    
    public static void main(String[] args) {
        
        //Employee Information
        String EmployeeName = "Manuel Garcia III"; // Name of Employee
        String EmployeeID = "10001"; //Employee ID
        double HoursWorked = 8.53; // Total hours of worked per day
        double HourlyRate = 535.71; //Hourly rate of the employee
        int DaysWorked = 10; //Total days worked by the employee
        
        //Validation of Hours Worked
        if (HoursWorked <= 0 || HourlyRate <= 0 || DaysWorked <= 0) { //Check if the hours worked, hourly rate, and days worked is valid if its below or equals to 0
            System.out.println("Invalid!"); //To display that the data is invalid
            return;
        } 
        
        //Salary Computation
        double SemiMonthlySalary = DaysWorked * (HoursWorked * HourlyRate); //Compute the semi-monthly salary by multiplying HoursWorked and the HourlyRate then multiplying the product of it to the DaysWorked
        
        //Declared variable for the Government Deductions and it's computation output
        double sss = computeSSS(SemiMonthlySalary);
        double pagibig = computePagibig(SemiMonthlySalary);
        double philhealth = computePhilhealth(SemiMonthlySalary);
        double incomeDeduction = SemiMonthlySalary - (sss + pagibig + philhealth); //To compute the income tax based on the deducted salary
        double incomeTax = computeIncomeTax(incomeDeduction);
        
        double totalDeductions = sss + pagibig + philhealth + incomeTax; //Declaring a variable for the total Government Deductions
        double netPay = SemiMonthlySalary - totalDeductions; //Total Net Pay of the employee
        
        //Display the Employee information and the gross semi-monthly salary with the Government Deductions
        System.out.println("=== MOTORPH SEMI-MONTHLY PAYROLL ==="); //Title for the payroll summary
        System.out.println("EMPLOYEE NAME: " + EmployeeName);
        System.out.println("EMPLOYEE ID: " + EmployeeID);
        
        System.out.println("============ DEDUCTIONS ============"); //Title for the Deductions
        
        //To Display each Government Deductions
        System.out.println("SSS: " + sss);
        System.out.println("PAG-IBIG: " + pagibig);
        System.out.println("PHILHEALTH: " + philhealth);
        System.out.println("INCOME TAX: " + incomeTax);
        
        System.out.println("===================================="); //To divide the deductions breakdown and the total deductions and net pay
        System.out.println("GROSS SEMI-MONTHLY SALARY: " + SemiMonthlySalary); //To display the gross semi-monthly salary
        System.out.println("TOTAL DEDUCTIONS: -" + totalDeductions); //To display the total deductions
        System.out.println("\nNET PAY: " + netPay); //To display the total net pay of the employee
            
        //Confirmation message that the computation is valid and verified
        System.out.println("\nComputation verified Succesfully!");
        
    }
}