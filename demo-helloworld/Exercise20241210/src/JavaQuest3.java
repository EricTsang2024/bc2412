import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Example 1: Input a month number: 2 Input a year: 2016
   * 
   * February 2016 has 29 days
   * 
   * Example 2: Input a month number: 12 Input a year: 2014
   * 
   * December 2014 has 31 days
   */

  // Program the number of days that the month of a year has.

  // Test cases
  // 1, 3, 5, 7, 8, 10, 12 -> 31 days
  // 2 -> 28/ 29 days
  // 4, 6, 9, 11 -> 30 days
  // why wee need declare "unknown"? --only names for operator to declare name of month

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int numberOfDaysInMonth = 0;

    String monthOfName = " ";

    System.out.print("Input a month number: ");
    int month = input.nextInt(); // assume 1 - 12

    System.out.print("Input a year: ");
    int year = input.nextInt(); // > 0

    // The February has 29 days: (Every 4 years and the year cannot divded by
    // 100) or The year can divided by 400
    // otherwise the February should have 28 days only
    if (month == 12) {
      monthOfName = "December";
    }
    if (month == 1) {
      monthOfName = "January";
    }
    if (month == 2) {
      monthOfName = "February";
    }
    if (month == 3) {
      monthOfName = "March";
    }
    if (month == 4) {
      monthOfName = "April";
    }
    if (month == 5) {
      monthOfName = "May";
    }
    if (month == 6) {
      monthOfName = "June";
    } else if (month == 7) {
      monthOfName = "July";
    } else if (month == 8) {
      monthOfName = "August";
    } else if (month == 9) {
      monthOfName = "September";
    } else if (month == 10) {
      monthOfName = "October";
    } else if (month == 11) {
      monthOfName = "November";
    }


    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12) {
      numberOfDaysInMonth = 31;
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      numberOfDaysInMonth = 30;
    }
    if (month == 2 && year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
      numberOfDaysInMonth = 29;
    } else if (month == 2) {
      numberOfDaysInMonth = 28;
    }



    System.out.println(
        monthOfName + " " + year + " has " + numberOfDaysInMonth + " days");
      
        // divided by 4, divided by 100, divided by 400
        switch (month) {
          // case 1
          case 2:
         if ( year % 4 != 0) {
          numberOfDaysInMonth = 28;
         } else if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
            numberOfDaysInMonth = 29;
         } else if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0) {

         }else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {



        }case



  }
}
