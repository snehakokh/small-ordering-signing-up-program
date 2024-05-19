import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO AZA");
        System.out.println("==============");
        Options option = new Options();
        option.choices();


        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        if (number.equals("1")){
            System.out.println("======You have entered the Sign Up process======");
            SignUp.SignUpProcesses();
        }else if (number.equals("2")){
            System.out.println("Thank you for using the Application");
        }else
            System.out.println("Invalid Input");

    }

}