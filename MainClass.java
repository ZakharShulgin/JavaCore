import java.util.Scanner;

public class MainClass {
    public static void showMenu() {
        System.out.println("Possible operations:");
        System.out.println("1. Create the result of the competition.");
        System.out.println("2. View the result of the competition.");
        System.out.println("3. Edit the result of the competition.");
        System.out.println("4. Exit.");
        System.out.print("Choose an operation: ");
    }

    public static int requestCommandNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of participants: ");
        int amount = in.nextInt();
        while (amount > 0 && (amount & (amount - 1)) == 0) { // проверяем, что введённое число - степень 2
            System.out.println("the number of participants must be a power of two. Enter the number of participants: ");
            amount = in.nextInt();
        }
        in.close();
        return amount;
    }

    public static int calculationLog(int amount) {
        int i = 1;
        for ( ; 2 * i != amount; i++);
        return i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int select;
        int amount;
        do {
            showMenu();
            select = in.nextInt();
            System.out.println(select);
            switch(select) {
                case 1:
                    amount = requestCommandNumber();
                    calculationLog(amount);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Program shutdown");
                    break;
                default:
                    System.out.println("There is no operation with this number.");
            }
        } while (select != 4);
        in.close();
    }
}
