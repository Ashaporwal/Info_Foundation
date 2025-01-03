import java.util.Scanner;
class Customer
{
private int amount;
private String pstatus= "yes";
private float loyaltypoints;

Customer(int amount)
{
    this.amount = amount;
    
}


 void calculateLoyaltPoints()
    {
        loyaltypoints = amount/10;
    }
    
    void dislay()
    {
        System.out.println("The loyal pojnts are : " +loyalpoints);
    }
}
class Pcustomer extends Customer 
{

   Pcustomer (int amount)
   {
       super(amount);
   }
   void  calculateLoyaltPoints()
    {
        loyaltypoints = 2*(amount/10);
    }
}
public class Program
{
Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
    System.out.println("Enter the amount spent:");
    int amount = sc.nextInt();
    
    System.out.println("Enter the premium status or not");
  String  pstatus = sc.next();
    
    
        Customer customer;
        if (pstatus.equalsIgnoreCase("yes")) {
            customer = new Pcustomer(amount);
        } else {
            customer = new Customer(amount); 
        }

        customer.calculateLoyaltyPoints();
        customer.displayLoyaltyPoints();   
    }
}