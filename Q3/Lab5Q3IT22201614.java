import java.util.Scanner;

public class Lab5Q3IT22201614 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 8000.0;
        final double DISCOUNT_3_TO_4 = 0.10;
        final double DISCOUNT_5_OR_MORE = 0.20;

        int startDate;
        int endDate;
        int numberOfDays;

        double totalAmount;
        double discountRate = 0.0;
        double discountAmount;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
                endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        numberOfDays = endDate - startDate;

        if (numberOfDays >= 5) {
            discountRate = DISCOUNT_5_OR_MORE;
        }
        else if (numberOfDays >= 3) {
            discountRate = DISCOUNT_3_TO_4;
        }

        totalAmount = numberOfDays * ROOM_CHARGE;

        discountAmount = totalAmount * discountRate;

        totalAmount = totalAmount - discountAmount;

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/-");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}
