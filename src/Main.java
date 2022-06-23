import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        System.out.print("Введите ваш возраст: ");
        int age = scn.nextInt();
        System.out.print("Введите ваш рост (в см): ");
        int rost = scn.nextInt();

        if (age >= 5 && age <= 19) {
            System.out.println("  ");
            System.out.println("Ваш возраст - " + age + " лет");
        } else if (age % 10 == 1){
            System.out.println("  ");
            System.out.println("Ваш возраст - " + age + " год");
        } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4){
            System.out.println("  ");
            System.out.println("Ваш возраст - " + age + " года");
        } else {
            System.out.println("  ");
            System.out.println("Ваш возраст - " + age + " лет");
        }
        System.out.println("Ваш рост - " + rost + " см");





      


    }
}
