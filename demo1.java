import java.util.Scanner;

public class demo1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name  = scanner.nextLine(); 
        assert (name.strip()!="" && name != ""): "\033[31;1mInvalid name\033[0m";

        System.out.print("Enter your age: ");
        int age =scanner.nextInt();
        scanner.nextLine();
        assert (age >= 10 && age <= 18): "\033[31;1mInvalid age\033[0m";

        System.out.print("Enter your subject1: ");
        String subject1  = scanner.nextLine(); 
        System.out.println(subject1.substring(0, 3));
        assert (subject1.substring(0, 3).equals("SE-")):"\033[31;1mInvalid Subject\033[0m";// && ((subject1.length()-3)==0 && (subject1.substring(3, subject1.length())).strip()==""));
        assert ((subject1.length()-3)!=0):"\033[31;1mInvalid Subject\033[0m";
        assert !((subject1.substring(3, subject1.length())).strip().equals("")):"\033[31;1mInvalid Subject\033[0m";
        
    }
}