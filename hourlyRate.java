import java.util.Scanner;

public class hourlyRate {

    public static double calculateHourRate( double gross, double hoursPerWeek) {
            
            double result = (gross/(52 * hoursPerWeek));
            return result;
    }

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Type 'exit' at any time to quit program!");
                System.out.print("Enter your salary per year(A) and hours per week(B) ( A B ): ");
                int salary = scanner.nextInt();
                int hours = scanner.nextInt();
                
                if ((salary == (int)salary && hours == (int)hours)) {                    
                    double hourlyRate = calculateHourRate(salary, hours);
                    String hourlyRate1 = String.format("%.02f", hourlyRate);
                    System.out.println("Your hourly rate is " + hourlyRate1);
                }
            }
        }

        catch(Exception e) {
            System.out.println("Program exited!");
        }
    }
}