enum Day {
    MONDAY("1"), TUESDAY("2"), WEDNESDAY("3"), THURSDAY("4"), FRIDAY("5"), SATURDAY("6"), SUNDAY("7");

    private String value;

    Day(String value) {
        this.value = value;
    }

    String value() {
        return value;
    }
}

class Driver1 {
    public void printHello() {
        System.out.println("Hello from Driver1 class");
    }

    public static void main(String[] args) {
        Day d = Day.FRIDAY;
        System.out.println("The day is " + d.name());
        System.out.println("The day is " + d.value());

        System.out.println("All the days are: ");
        for (Day day : Day.values()) {
            System.out.println("\t" + day);
        }
    }
}

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

public class Enum {
    public static void main(String args[]) {
        Month m = Month.JANUARY;
        System.out.println("The month is " + m.name());

        // printing all the months
        System.out.println("All the months are:");
        for (Month month : Month.values()) {
            System.out.println(month.name());
        }
    }
}