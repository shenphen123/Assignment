package assignment3;
import java.util.Scanner;
public class NameOfMonth {

	public static void main(String[] args) {
		int numberOfDays = 0; 
        String MonthOfName = "Unknown";
Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month number from 1 - 12: ");
        int month = sc.nextInt();

        

        switch (month) {
            case 1:
                MonthOfName = "January";
                numberOfDays = 31;
                break;
            case 2:
                MonthOfName = "February";
                numberOfDays = 28;
                
                break;
            case 3:
                MonthOfName = "March";
                numberOfDays = 31;
                break;
            case 4:
                MonthOfName = "April";
                numberOfDays = 30;
                break;
            case 5:
                MonthOfName = "May";
                numberOfDays= 31;
                break;
            case 6:
                MonthOfName = "June";
                numberOfDays = 30;
                break;
            case 7:
                MonthOfName = "July";
                numberOfDays = 31;
                break;
            case 8:
                MonthOfName = "August";
                numberOfDays = 31;
                break;
            case 9:
                MonthOfName = "September";
                numberOfDays = 30;
                break;
            case 10:
                MonthOfName = "October";
                numberOfDays = 31;
                break;
            case 11:
                MonthOfName = "November";
                numberOfDays = 30;
                break;
            case 12:
                MonthOfName = "December";
                numberOfDays = 31;
                break;
                default:
                	System.out.println("Invalid number");
        
        System.out.print(MonthOfName + " " + " has " + numberOfDays + " days\n");
    }
}
}

	


