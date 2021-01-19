package Lesson_1.additionally;

public class Main {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DaysOfWeek.Saturday));
    }

    public static String getWorkingHours(DaysOfWeek day) {
        int hour;
        if (day.ordinal() > 4)
            return "Сегодня выходной!";

        hour = (5 - day.ordinal()) * 8;

        return "Осталось работать " + hour + " часов!";
    }
}
