public class MyApp {
    public static void main(String[] args) {
        String appName = "CampusEvents";
        String tagline = "Every college event, one tap away";
        int pageCount = 5;

        System.out.println(appName);
        System.out.println(tagline);
        System.out.printf("Pages: %d%n", pageCount);
        System.out.println("1. Home: upcoming events");
        System.out.println("2. Event details: date, venue and seats left");
        System.out.println("3. Register: sign up for an event");
        System.out.println("4. My registrations: events I joined");
        System.out.println("5. Admin: every registration, for the events team");
    }
}