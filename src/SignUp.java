import java.util.Scanner;
import java.time.LocalDate;
public class SignUp {
    public static void SignUpProcesses() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter your full name:");
            String fullName = scanner.nextLine();
            if (!isFullNameCorrect(fullName)) {
                System.out.println("Full name must be greater than four characters");
                continue;
            }
            System.out.println("Please enter your mobile number (username):");
            String phoneNo = scanner.nextLine();
            if (!isPhoneNoCorrect(phoneNo)) {
                System.out.println("The mobile number must have 10 digits starting with 0");
                continue;
            }

            while (true) {
                System.out.println("Please enter your password:");
                String password = scanner.nextLine();
                if (!isPwCorrect(password)) {
                    System.out.println("The Password must initiate with alphabets followed by either one of @, & and ending with numeric.");
                    continue;
                }

                System.out.println("Please confirm your password:");
                String password1 = scanner.nextLine();
                if (!password.equals(password1)) {
                    System.out.println("Your passwords do not match. Please start again.");
                    continue;
                }
                break;
            }

            System.out.println("Please enter your Date of Birth #DD/MM/YYYY (No space):");
            String dob = scanner.nextLine();
            if (!isDobCorrect(dob)) {
                System.out.println("You have entered the Date of Birth in invalid format.Please start again.");
                continue;
            }
            System.out.println("Checking your age:.....");
            if (!ageChecker(dob)) {
                System.out.println("You must be at least 21 years old. >:( ");
                continue;
            }
            System.out.println("Login Completed");
            break;
            }
        scanner.close();
        }


    private static boolean isFullNameCorrect(String fullName) {
        return fullName.length() > 4;
    }

    private static boolean isPhoneNoCorrect(String phoneNo) {

        return phoneNo.matches("0\\d{9}");
    }

    private static boolean isPwCorrect(String password) {
        return password.matches("^[A-Za-z]+[@&]\\d+$");
    }


    private static boolean isDobCorrect(String dob) {
        String regex = "^(\\d{2}/\\d{2}/\\d{4})$";
        return dob.matches(regex);
    }

    private static boolean ageChecker(String dob) {
            String[] parts = dob.split("/");
            int year = Integer.parseInt(parts[2]);
            int currentYear = LocalDate.now().getYear();
            return (currentYear - year) >= 21;
        }
    }



