import java.util.Scanner;
class EvenOrOdd
{
  public static void main(String args[])
  {
    int num;
    System.out.print("Enter a number:");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    if ( num % 2 == 0 )
        System.out.println("Even");
     else
        System.out.println("Odd");
  }
}
