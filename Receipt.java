import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Course: ");
        String course = sc.nextLine();
        System.out.print("Fee: ");
        double fee = sc.nextDouble();
        final double GST_RATE = 0.18;
        double gst = fee * GST_RATE;
        System.out.printf("Course : %s%n", course);
        System.out.printf("Fee    : Rs. %,.2f%n", fee);
        System.out.printf("GST    : Rs. %,.2f%n", gst);
        System.out.printf("Total  : Rs. %,.2f%n", fee + gst);
    }
}