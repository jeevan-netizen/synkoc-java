import java.util.Scanner;

public class FeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Course number (1-3): ");
        int courseNum = sc.nextInt();

        String course;
        double fee;

        if (courseNum == 1) {
            course = "Java Full Stack";
            fee = 14999.0;
        } else if (courseNum == 2) {
            course = "Data Science";
            fee = 12999.0;
        } else if (courseNum == 3) {
            course = "Cloud Basics";
            fee = 4999.0;
        } else {
            System.out.println("Invalid course");
            return;
        }

        System.out.print("Months (1, 3, or 6): ");
        int months = sc.nextInt();

        if (months != 1 && months != 3 && months != 6) {
            System.out.println("Invalid plan");
            return;
        }

        System.out.print("Are you a student (yes/no)? ");
        String isStudentInput = sc.next();
        boolean isStudent = isStudentInput.equalsIgnoreCase("yes");

        double discount = isStudent ? (fee * 0.10) : 0.0;
        double feeAfterDiscount = fee - discount;

        double surchargeRate = 0.0;
        if (months == 3) {
            surchargeRate = 0.02;
        } else if (months == 6) {
            surchargeRate = 0.05;
        }
        double surcharge = feeAfterDiscount * surchargeRate;

        double subtotal = feeAfterDiscount + surcharge;
        final double GST_RATE = 0.18;
        double gst = subtotal * GST_RATE;
        double total = subtotal + gst;
        double perMonth = total / months;

        System.out.printf("Course : %s%n", course);
        System.out.printf("Fee : Rs. %,.2f%n", fee);
        System.out.printf("Discount : Rs. %,.2f%n", discount);
        System.out.printf("Surcharge : Rs. %,.2f%n", surcharge);
        System.out.printf("GST : Rs. %,.2f%n", gst);
        System.out.printf("Total : Rs. %,.2f%n", total);
        System.out.printf("Per month : Rs. %,.2f%n", perMonth);
    }
}