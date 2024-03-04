import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?->");
        String name = scanner.nextLine();

        System.out.println("\nHello " + name + ". This is top secret data and you need to create a password to keep it safe...\n");

        System.out.println("Your password must meet the following characteristics to be created.");
        System.out.println("- At least six characters long");
        System.out.println("- At least one uppercase and one lowercase letter");
        System.out.println("- At least one digit");

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        while (!isValidPassword(password)) {
            System.out.println("\nPassword not accepted.\n");
            System.out.println("Your password must meet the following characteristics to be created.");
            System.out.println("- At least six characters long");
            System.out.println("- At least one uppercase and one lowercase letter");
            System.out.println("- At least one digit");

            System.out.print("\nEnter password: ");
            password = scanner.nextLine();
        }

        System.out.println("\nThank you! Your password has been created and logged....Keep it secret!!!");
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 6) return false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
            if (Character.isDigit(c)) hasDigit = true;
        }

        return hasUpperCase && hasLowerCase && hasDigit;
    }
}
