/*2.
ONLINE TRANSACTION

Google Pay is a popular digital payment platform that allows users to send and receive money securely. It supports various types of transactions, including person-to-person payments, online purchases, and bill payments.

Implement the following classes to represent different types of transactions in Google Pay:

1. The Transaction class should have the following attributes:
 

2. The PeerToPeerTransaction class should inherit from Transaction and have an additional attribute:
 
 
  
3. The OnlinePurchaseTransaction class should inherit from Transaction and have an additional attribute:
 
 

4. The BillPaymentTransaction class should inherit from Transaction and have an additional attribute:
 */
 
class Transaction
{
    private int transactionid;
    private double amount;
    
    public Transaction(int transactionid,double amount)
    {
        this.transactionid=transactionid;
        this.amount=amount;
    }
    public int getTransactionId()
    {
        return transactionid;
    }
    
    public double getAmount()
    {
        return amount;
    }
}

class PeerToPeerTransaction extends Transaction
{
    private String recipient;
  public PeerToPeerTransaction(int transactionid,double amount,String recipient)
    {
        super(transactionid,amount);
        this.recipient=recipient;
    }
    public String getRecipient()
    {
        return recipient;
    }

    
}
class BillPaymentTransaction extends Transaction

{
   private String merchant;
   public BillPaymentTransaction(int transactionid,double amount,String merchant)
    {
        super(transactionid,amount);
        this.merchant=merchant;
    }
    public String getMerchant()
    {
        return merchant;
    }
}


public class Program
{
    public static void main(String[] args) {
        PeerToPeerTransaction p = new PeerToPeerTransaction(101,300.00,"cdgi");
        System.out.println("Transaction id is:" +p.getTransactionId());
        System.out.println("Amount is :" +p.getAmount());
        
        
    }
}