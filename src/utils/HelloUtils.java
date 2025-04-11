package utils;

public class HelloUtils {

    public static String greetTimeOfDay(String name, String time) {
        return "Good " + time + ", " + name + "!";
    }

    public static void reminderForLunch(String name, String time) {
        if(time.equals("12:00")){
            System.out.println("Lunch time now " + name);
        }
        System.out.println("it's not lunch time " + name );
    }
}
