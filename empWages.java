public class empWages {
    public static void main(String[] args) {
        final int EMP_RATE_PER_HOUR=125;
        final int MAX_WORKING_HOURS = 200;
        final int MAX_WORKING_DAYS = 25;
        int empHours,dailyWage,totalWage,totalWorkingHours=0,totalWorkingDays=0;
        System.out.println("Employee Wage Calculator Program");
        System.out.println("---------------------------------");

        while (totalWorkingDays<MAX_WORKING_DAYS && totalWorkingHours<MAX_WORKING_HOURS){
            empHours = empHoursReturn();
            totalWorkingDays++;
            totalWorkingHours+=empHours;

            switch (empHours) {
                case 8:
                    dailyWage = EMP_RATE_PER_HOUR*empHours;
                    System.out.println("Employee is Working Full Time and Daily Wage is "
                            + dailyWage +" And Working Day is "+ totalWorkingDays);
                    break;
                case 4:
                    dailyWage = EMP_RATE_PER_HOUR*empHours;
                    System.out.println("Employee is Working Part Time and Daily Wage is "
                            + dailyWage +" And Working Day is "+ totalWorkingDays);
                    break;
                default:
                    dailyWage = EMP_RATE_PER_HOUR*empHours;
                    System.out.println("Absent "+ dailyWage+" And Working Day is "
                            + totalWorkingDays);

                    break;
            }
        }

        totalWage = totalWorkingHours*EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Monthly Wage "+totalWage);
        System.out.println("Total Working Hours "+totalWorkingHours);
        System.out.println("Total Working Days "+totalWorkingDays);


    }

    public static int empHoursReturn(){
        /*
        This function will generate a random number between 0 and 2 (inclusive)
        And will return an Employee Hour value either 8 , 4 or 0 ,
         which wil return in integer type.
         */
        int  empCheck= (int) (Math.random()*3);
        if(empCheck==1) {
            return 8;
        }
        else if(empCheck==2)
        {

            return 4;
        }
        else {
            return 0;
        }

    }
}



/*
When to Use the Function: You can use a function to
encapsulate a piece of code that performs a specific task, such as calculating work hours in this case.
By using a function, you can make your code more modular, reusable, and easier to understand.
It also helps in reducing code duplication.
Parameter Passing by Value: In Java,
primitive data types (like int, double) are passed by value when used as function arguments.
This means that when you pass a variable as an argument to a function,
its value is copied into a new memory location for use within the function.
Any changes made to the parameter inside the function will not affect the original variable outside of it.
 */