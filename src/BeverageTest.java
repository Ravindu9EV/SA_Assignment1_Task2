import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Do you want extras with your tea (yes/no)? ");
        boolean teaExtras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        System.out.print("Do you want extras with your coffee (yes/no)? ");
        boolean coffeExtras =scanner.nextLine().trim().equalsIgnoreCase("yes");

        Beverage tea = new Tea();
        tea.setWantsExtras(teaExtras);
        Beverage coffe=new Coffee();
        coffe.setWantsExtras(coffeExtras);

        System.out.println("Making Tea ....");
        tea.finalTemplateMethod();

        System.out.println("\nMaking coffee...");
        coffe.finalTemplateMethod();

        scanner.close();
    }
}
