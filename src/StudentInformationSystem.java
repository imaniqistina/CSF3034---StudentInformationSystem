import java.util.Scanner;
public class StudentInformationSystem {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student ID: ");
        String studentId = input.nextLine();
        
        System.out.print("Enter Mark 1: ");
        double mark1 = input.nextDouble();

        System.out.print("Enter Mark 2: ");
        double mark2 = input.nextDouble();
        
        double totalMark = mark1 + mark2;
        
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Total Mark: " + totalMark);
        
        System.out.print("Result: ");
        if (totalMark >= 80) {
            System.out.println("Excellent");
        } else if (totalMark >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
        input.close();
    }
}


   


    
        
        