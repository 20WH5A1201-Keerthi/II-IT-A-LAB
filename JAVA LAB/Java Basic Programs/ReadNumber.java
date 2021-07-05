import java.util.Scanner; 
public class ReadNumber 
{  
public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        scan.close(); 
        System.out.println("The number entered is: "+num);
    }
}