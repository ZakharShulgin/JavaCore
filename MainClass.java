import java.util.Scanner;

public class MainClass {
    public static void ShowMenu() {
        System.out.println("Possible operations:");
        System.out.println("1. Create the result of the competition.");
        System.out.println("2. View the result of the competition.");
        System.out.println("3. Edit the result of the competition.");
        System.out.println("4. Exit.");
        System.out.print("Choose an operation: ");
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int select;
        do {
            ShowMenu();
            select = in.nextInt();
            System.out.println(select);
            switch(select) {
                case 1:

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
