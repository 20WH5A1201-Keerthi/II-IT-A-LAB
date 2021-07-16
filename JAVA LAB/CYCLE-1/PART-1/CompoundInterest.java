import java.util.*;
class CompoundInterest
{
    public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);
        float p, r, t, n;
        System.out.print("Enter Principal : ");
        p = sc.nextFloat();    
        System.out.print("Enter interest : ");
        r = sc.nextFloat();    
        System.out.print("Enter Time period : ");
        t = sc.nextFloat();     
        System.out.print("Number of times that interest is compounded per unit time");
        n=sc.nextFloat();     
        sc.close();
    	double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
}