

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();
        scanner.close();
        String[] dateParts = shortDate.split("-");
        int day = Integer.parseInt(dateParts[2]);
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);

        String monthName = getMonthName(month);
        System.out.println(monthName + " " + day + ", " + year);
    }
    private static String getMonthName(int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month];
    }
}
