import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1: System.out.print("Bir"); break;
            case 2: System.out.print("Iki"); break;
            case 3: System.out.print("Uc"); break;
            default: System.out.print("Default");
        }


    }
}