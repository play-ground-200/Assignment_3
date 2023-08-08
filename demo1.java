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
        assert (subject1.substring(0, 3).equals("SE-")&& ((subject1.length()>=3) && !(subject1.substring(3, subject1.length())).strip().equals(""))):"\033[31;1mInvalid Subject\033[0m";// 
       
        System.out.print("Enter your Marks1: ");
        double marks1 = scanner.nextDouble();
        scanner.nextLine();
        assert (marks1 >=0 && marks1 <= 100): "\033[31;1mInvalid marks1\033[0m";

       System.out.print("Enter your subject2: ");
       String subject2  = scanner.nextLine(); 
       assert (subject2.substring(0, 3).equals("SE-")&& ((subject2.length()>=3) && !(subject2.substring(3, subject2.length())).strip().equals(""))):"\033[31;1mInvalid Subject\033[0m";// 
       assert (!subject2.equals(subject1) ) : "\033[31;1mInvalid subject\033[0m";

        System.out.print("Enter your Marks2: ");
        double marks2 = scanner.nextDouble();
        scanner.nextLine();
        assert (marks2 >=0 && marks2 <= 100): "\033[31;1mInvalid marks2\033[0m";

       System.out.print("Enter your subject3: ");
       String subject3  = scanner.nextLine(); 
       assert (subject3.substring(0, 3).equals("SE-")&& ((subject3.length()>=3) && !(subject3.substring(3, subject3.length())).strip().equals(""))):"\033[31;1mInvalid Subject\033[0m";// 
        assert (!subject3.equals(subject1) && !subject3.equals(subject2)  ) : "\033[31;1mInvalid subject\033[0m";

         System.out.print("Enter your Marks3: ");
        double marks3 = scanner.nextDouble();
        scanner.nextLine();
        assert (marks3 >=0 && marks3 <= 100): "\033[31;1mInvalid marks3\033[0m";

        String finalname  = name.toUpperCase();
        String finalage   = age + " years old";
        double total = (marks1+marks2+marks3);
        double avarage = total/3;
        

        
        System.out.println("+---------------------------------------+");
        System.out.printf("|%10s : \033[34;1m%-25s \033[0m|\n","Name",finalname);
        System.out.printf("|%10s : %-26s|\n","Age",finalage);
        System.out.printf("|%10s : %-35s|\n","Status",grade(avarage) );
        System.out.printf("|%10s : %4.2f%-21s|\n","Avarage",avarage,"%");
        System.out.printf("|%10s : %-26.2f|\n","Total",total);
        System.out.println("+------------+-------------+------------+");
        System.out.printf("| SE-%1$03d%4$-5s|  %2$-11.2f| %3$-20s|\n",Integer.parseInt(subject1.substring(3, subject1.length()).strip()),marks1,grade(marks1),"");
        System.out.printf("| SE-%1$03d%4$-5s|  %2$-11.2f| %3$-20s|\n",Integer.parseInt(subject2.substring(3, subject2.length()).strip()),marks2,grade(marks2),"");
        System.out.printf("| SE-%1$03d%4$-5s|  %2$-11.2f| %3$-20s|\n",Integer.parseInt(subject3.substring(3, subject3.length()).strip()),marks3,grade(marks3),"");
        System.out.println("+---------------------------------------+\n");
    }
    public static String grade(double marks)
    {
        String grade;
        if (marks>=75) grade = "\033[34mDP\033[0m";
        else if (marks>=65) grade = "\033[32mCP\033[0m";
        else if (marks>=55) grade = "\033[33mP\033[0m";
        else  grade = "\033[31mF\033[0m";;

        return grade;
    }
  
}