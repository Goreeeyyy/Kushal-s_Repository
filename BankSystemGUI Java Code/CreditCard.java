/* This Class is another child class of BankCard */
public class CreditCard extends BankCard
 {
    /* Attributes of Class CreditCard. All of them are private.*/
    private int CVC_Number;
    private double CreditLimit;
    private double InterestRate;
    private String ExpirationDate;
    private int GracePeriod;
    private boolean isGranted;

    public CreditCard( int BalanceAmount, String ClientName, String IssuerBank, String BankAccount, int CardID, int CVC_Number, double InterestRate, String ExpirationDate) 
     {
        super(BankAccount, IssuerBank, BalanceAmount, CardID);
        setClientName(ClientName);
        this.CVC_Number = CVC_Number;
        this.InterestRate = InterestRate;
        this.ExpirationDate = ExpirationDate;
        this.isGranted = false;
    } 
    
    
    //Getter Method of all attributes
    public int getCVC_Number()
     {
        return this.CVC_Number;
     }

    public double getCreditLimit()
     {
        return this.CreditLimit;
     }

    public double getInterestRate()
     {
        return this.InterestRate;
     }

    public String getExpirationDate()
     {
        return this.ExpirationDate;
     }

    public int getGracePeriod()
     {
        return this.GracePeriod;
     }

    public boolean getisGranted()
     { 
        return this.isGranted;
     }
    
    //Using Setter Method
    public void setCreditLimit(double CreditLimit, int GracePeriod)/*Setter Method to set credit limit by checking the below condition */
    { 
        if(CreditLimit <= (2.5 * this.getBalanceAmount())){
            this.CreditLimit = CreditLimit;
            this.GracePeriod = GracePeriod;
            this.isGranted = true;
            
        } 
        
        else 
        {
            System.out.println("Credit cannot be issued at this time. Please check your account and try again.");
        }
    }

    public void cancelCreditCard()/*Method to check if client can terminate his/her Credit Card*/ 
     {
        //
        if(this.isGranted==true)
          {
            this.CVC_Number = 0;
            this.CreditLimit = 0;
            this.GracePeriod = 0;
            this.isGranted = false;
          } 
        else 
          {
            System.out.println("Credit card is not active. Cancellation of credit card is denied");
          }
     }

    public void display()
     {
        
        if(this.isGranted)
        {
            super.display();
            System.out.println("CVC Number: " + this.CVC_Number);
            System.out.println("Credit Limit: " + this.CreditLimit);
            System.out.println("Interest Rate: " + this.InterestRate);
            System.out.println("Expiration Date: " + this.ExpirationDate);
            System.out.println("Grace Period: " + this.GracePeriod);
        } 
        
        else 
        {
            System.out.println("The Credit Card is not granted. ");
        }
     }   
     
 }