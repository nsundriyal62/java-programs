import java.util.Scanner;

public class comparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first string: ");
        String s1 = scanner.nextLine(); 
        System.out.println( "enter your second string");
        String s2 = scanner.nextLine();
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equalsIgnoreCase(s2));  
        scanner.close();
    }
}
