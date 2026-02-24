package playground.operators;

public class DeMorgan {

    public static void main(String[] args) {
        int childAge = 15;
        int parentAge = 45;
        int grandparentAge = 75;

        System.out.println(ticketPrice(childAge, "Monday"));
        System.out.println(ticketPrice(parentAge, "Tuesday"));
        System.out.println(ticketPrice(parentAge, "Wednesday"));
        System.out.println(ticketPrice(grandparentAge, "Thursday"));
        System.out.println(ticketPrice(childAge, "BlahBlahBlah"));
    }

    public static String ticketPrice(int age, String day) {
        if (age < 0) {
            return "Invalid age";
        }

        /* !(day == null || day.isEmpty() || !isValid(day)) */
        if (day != null && !day.isEmpty() && isValid(day)) {
            if (day.equals("Wednesday")) {
                return "Wednesday ticket is half for everybody";
            } else if (age > 18 && age < 65) {
                return "Full price ticket (age: " + age + ")";
            }
            return "Half price ticket (age: " + age + ")";
        }

        return "Invalid day";
    }

    private static boolean isValid(String day) {
        return switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                 "Saturday", "Sunday" -> true;
            default -> false;
        };
    }
}
