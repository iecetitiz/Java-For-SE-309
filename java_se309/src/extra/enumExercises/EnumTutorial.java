package extra.enumExercises;

public class EnumTutorial {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.thursday;
        if(day == DaysOfTheWeek.thursday) {
            System.out.println("yay it's almost friday!");
        }
        
        DaysOfTheWeek.values();

    }
}
