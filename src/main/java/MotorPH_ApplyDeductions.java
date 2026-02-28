public class MotorPH_ApplyDeductions {
    
    public static double computeSSS(double SemiMonthlySalary) {
        return SemiMonthlySalary * 0.;
    }
    public static void main(String[] args) {
        
        //Employee Information
        String EmployeeName = "Manuel Garcia III"; // Name of Employee
        String EmployeeID = "10001"; //Employee ID
        double HoursWorked = 8.53; // Total hours of worked per day
        double HourlyRate = 535.71; //Hourly rate of the employee
        int DaysWorked = 10;
        
        
        //Validation of Hours Worked
        if (HoursWorked <= 0) { //Check if the hours worked is valid if its below or equals to 0
            System.out.println("Invalid Hours Worked!!"); //To display that the hours Worked is invalid
            
        } else { //Salary Computation
            double SemiMonthlySalary = DaysWorked  * (HoursWorked * HourlyRate); //Compute the semi-monthly salary by multiplying HoursWorked and the HourlyRate then multiplying the product of it to the DaysWorked
            
            //Display the Employee information and the computed salary with 2 decimal places
            System.out.println("Semi-Monthly Salary of " + EmployeeName + "(" + EmployeeID +") is " + String.format("%.2f", SemiMonthlySalary));
            System.out.println(" "); //Print blank line for spacing
            
            //Confirmation message that the computation is valid and verified
            System.out.println("Computation verified Succesfully!");
        }
    }
}
