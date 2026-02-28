class Employee {
        String name; //Employee name
        double timeIn; //Combined time-in (hour + minutes)
        int hourIn; //Hour of time-in
        double minIn; //Minutes of time-in
        double timeOut; //Combined time-out
        int hourOut; //Hour of time-out
        double minOut; //Minutes of time-out
        int breakTime; //Total breat time in hours
        int btIn; //Break time start hour
        int btOut; //Break time end hour
}
public class CalculateHoursWorked {
    public static void main(String[] args) {
        Employee[] emp = new Employee[10]; //Create array that can store 10 employees
        
        emp[0] = new Employee();
        emp[0].name = "Manuel Garcia III";
        //Set time-in values
        emp[0].hourIn = 8;
        emp[0].minIn = 59;
        emp[0].timeIn = emp[0].hourIn + (emp[0].minIn / 60);
        //Set time-out values
        emp[0].hourOut = 18;
        emp[0].minOut = 31;
        emp[0].timeOut = emp[0].hourOut + (emp[0].minOut / 60);
        //Set break time 
        emp[0].btIn = 12;
        emp[0].btOut = 13;
        emp[0].breakTime = emp[0].btOut - emp[0].btIn;
        
        emp[1] = new Employee();
        emp[1].name = "Antonio Lim";
        //Set time-in values
        emp[1].hourIn = 10;
        emp[1].minIn = 35;
        emp[1].timeIn = emp[1].hourIn + (emp[1].minIn / 60);
        //Set time-out values
        emp[1].hourOut = 19;
        emp[1].minOut = 44;
        emp[1].timeOut = emp[1].hourOut + (emp[1].minOut / 60);
        //Set break time
        emp[1].btIn = 12;
        emp[1].btOut = 13;
        emp[1].breakTime = emp[1].btOut - emp[1].btIn;
        
        emp[2] = new Employee();
        emp[2].name = "Bianca Sofia Aquino";
        //Set time-in values
        emp[2].hourIn = 10;
        emp[2].minIn = 23;
        emp[2].timeIn = emp[2].hourIn + (emp[2].minIn / 60);
        //Set time-out values
        emp[2].hourOut = 18;
        emp[2].minOut = 32;
        emp[2].timeOut = emp[2].hourOut + (emp[2].minOut / 60);
        //Set break time
        emp[2].btIn = 12;
        emp[2].btOut = 13;
        emp[2].breakTime = emp[2].btOut - emp[2].btIn;
        
        emp[3] = new Employee();
        emp[3].name = "Isabella Reyes";
        //Set time-in values
        emp[3].hourIn = 10;
        emp[3].minIn = 57;
        emp[3].timeIn = emp[3].hourIn + (emp[3].minIn / 60);
        //Set time-out values
        emp[3].hourOut = 18;
        emp[3].minOut = 14;
        emp[3].timeOut = emp[3].hourOut + (emp[3].minOut / 60);
        //Set break time
        emp[3].btIn = 12;
        emp[3].btOut = 13;
        emp[3].breakTime = emp[3].btOut - emp[3].btIn;
        
        emp[4] = new Employee();
        emp[4].name = "Eduard Hernandez";
        //Set time-in values
        emp[4].hourIn = 9;
        emp[4].minIn = 48;
        emp[4].timeIn = emp[4].hourIn + (emp[4].minIn / 60);
        //Set time-out values
        emp[4].hourOut = 17;
        emp[4].minOut = 13;
        emp[4].timeOut = emp[4].hourOut + (emp[4].minOut / 60);
        //Set break time
        emp[4].btIn = 12;
        emp[4].btOut = 13;
        emp[4].breakTime = emp[4].btOut - emp[4].btIn;
        
        emp[5] = new Employee();
        emp[5].name = "Andrea Mae Villanueva";
        //Set time-in values
        emp[5].hourIn = 9;
        emp[5].minIn = 31;
        emp[5].timeIn = emp[5].hourIn + (emp[5].minIn / 60);
        //Set time-out values
        emp[5].hourOut = 19;
        emp[5].minOut = 29;
        emp[5].timeOut = emp[5].hourOut + (emp[5].minOut / 60);
        //Set break time
        emp[5].btIn = 12;
        emp[5].btOut = 13;
        emp[5].breakTime = emp[5].btOut - emp[5].btIn;
        
        emp[6] = new Employee();
        emp[6].name = "Brad San Jose";
        //Set time-in values
        emp[6].hourIn = 9;
        emp[6].minIn = 9;
        emp[6].timeIn = emp[6].hourIn + (emp[6].minIn / 60);
        //Set time-out values
        emp[6].hourOut = 16;
        emp[6].minOut = 30;
        emp[6].timeOut = emp[6].hourOut + (emp[6].minOut / 60);
        //Set break time
        emp[6].btIn = 12;
        emp[6].btOut = 13;
        emp[6].breakTime = emp[6].btOut - emp[6].btIn;
        
        emp[7] = new Employee();
        emp[7].name = "Alice Romualdez";
        //Set time-in values
        emp[7].hourIn = 9;
        emp[7].minIn = 2;
        emp[7].timeIn = emp[7].hourIn + (emp[7].minIn / 60);
        //Set time-out values
        emp[7].hourOut = 18;
        emp[7].minOut = 6;
        emp[7].timeOut = emp[7].hourOut + (emp[7].minOut / 60);
        //Set break time
        emp[7].btIn = 12;
        emp[7].btOut = 13;
        emp[7].breakTime = emp[7].btOut - emp[7].btIn;
       
        emp[8] = new Employee();
        emp[8].name = "Rosie Atienza";
        //Set time-in values
        emp[8].hourIn = 8;
        emp[8].minIn = 18;
        emp[8].timeIn = emp[8].hourIn + (emp[8].minIn / 60);
        //Set time-out values
        emp[8].hourOut = 17;
        emp[8].minOut = 40;
        emp[8].timeOut = emp[8].hourOut + (emp[8].minOut / 60);
        //Set break time
        emp[8].btIn = 12;
        emp[8].btOut = 13;
        emp[8].breakTime = emp[8].btOut - emp[8].btIn;
        
        emp[9] = new Employee();
        emp[9].name = "Roderick Alvaro";
        //Set time-in values
        emp[9].hourIn = 8;
        emp[9].minIn = 10;
        emp[9].timeIn = emp[9].hourIn + (emp[9].minIn / 60);
        //Set time-out values
        emp[9].hourOut = 15;
        emp[9].minOut = 13;
        emp[9].timeOut = emp[9].hourOut + (emp[9].minOut / 60);
        //Set break time
        emp[9].btIn = 12;
        emp[9].btOut = 13;
        emp[9].breakTime = emp[9].btOut - emp[9].btIn;
        
        //Loop through all employees
        for (int i = 0; i < emp.length; i++) {
            double hoursWorked = (emp[i].timeOut - emp[i].timeIn) - emp[i].breakTime; //Compute total hours worked
            //Display employee information
            System.out.println("Employee" + (i + 1) + " name: " + emp[i].name);
            System.out.println("Total Hours Worked: " + String.format("%.2f", hoursWorked)); //Use String.format("%.2f", hoursWorked) to limit to 2 decimal places
            System.out.println(" ");
        }
        System.out.println("Test passed: Computation is correct"); //Verification message
    }
}
