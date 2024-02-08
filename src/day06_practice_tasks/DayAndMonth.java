package day06_practice_tasks;


public class DayAndMonth {

    public static void main(String[] args) {

        String dayName = day(5);
        System.out.println(dayName);

        String monthName = month(5);
        System.out.println(monthName);

        String daysInMonth = days(5);
        System.out.println(daysInMonth);
    }

    public static String day(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid Number";
        }
    }

    public static String month(int number) {
        switch (number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Number";
        }
    }

    public static String days(int number) {
        switch (number) {
            case 1:
                return "January has 31 days";
            case 2:
                return "February has 29 days";
            case 3:
                return "March has 31 days";
            case 4:
                return "April has 30 days";
            case 5:
                return "May has 31 days";
            case 6:
                return "June has 30 days";
            case 7:
                return "July has 31 days";
            case 8:
                return "August has 31 days";
            case 9:
                return "September has 30 days";
            case 10:
                return "October has 31 days";
            case 11:
                return "November has 30 days";
            case 12:
                return "December has 31 days";
            default:
                return "Invalid Number";
        }
    }
}