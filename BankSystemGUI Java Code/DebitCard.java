/* DebitCard is the child class of Bankcard class which inherits properties 
of Bankcard class and also has it's own properties */
public class DebitCard extends BankCard //"Extends" Keyword indicates the use of inheritance properties
 {
     // Variables of DebitCard Class, And 
     private int PIN_Number;
     private int WithdrawalAmount;
     private String DateofWithdrawal;
     private boolean hasWithdrawn;
     
     
     /* Constructor of DebitCard class which contains it's own attributes as well as inherites attributes of it's parent class */
     public DebitCard(String ClientName, int PIN_Number,String BankAccount,String IssuerBank,int BalanceAmount,int CardID)
      {
         super(BankAccount, IssuerBank, BalanceAmount, CardID); // Using Super Keyword to call the attributes of previous class
         setClientName(ClientName);
         this.PIN_Number=PIN_Number;
         this.hasWithdrawn=false;
      }
     
     
     /* Getter Method for all attributes of DebitCard class */ 
     public int getPIN_Number()
      {
          return this.PIN_Number;
      }
     
     public int getWithdrawalAmount()
      {
          return this.WithdrawalAmount;
      }
      
     public String getDateofWithdrawal()
      {
          return this.DateofWithdrawal;
      }
     public boolean gethasWithdrawn()
      {
          return this.hasWithdrawn;
      }
     
     /* Using Setter Method for setting Withdrawal Amount
      * (Amount to draw out from Bank Account) */ 
     public void setWithdrawalAmount(int WithdrawalAmount)
      {
          this.WithdrawalAmount=WithdrawalAmount;
      }
      
     /* Method to withdraw money from your bank account under the condition that 
      * your PIN Number is correct and you have enougn balance amount to withdraw
      * and also to calculate Balance Amount after Withdrawal */
     public void Withdraw( int WithdrawalAmount, String DateofWithdrawal, int PIN_Number)
      {
         if(PIN_Number==this.PIN_Number)
          {  
             if(WithdrawalAmount!=0 && WithdrawalAmount <= getBalanceAmount())
              {
                  
                  this.WithdrawalAmount=WithdrawalAmount;
                  setBalanceAmount(getBalanceAmount()-WithdrawalAmount);
                  this.DateofWithdrawal=DateofWithdrawal;
                  this.hasWithdrawn=true;
                  System.out.println("Thanks for using our Bank Service. Wait till You get Your Cash and Receipt.");
                  System.out.println("Your Current Balance is " + getBalanceAmount());
              }  
              
              else if(WithdrawalAmount==0)
              {
                  System.out.println("Invalid Transaction. Your withdrawal Amount is currently 0");
              }
             
              // Display message when there is no enough balance in bank account
              else 
              { 
                 System.out.println("Sorry!! Not Enough Balance in your Account");  
              }
              
          }
          
         else  // If PIN is incorrect, Transaction is denied 
          {
             System.out.println("Your PIN is Invalid. " + "Please Try Again");
          }
              
          
      }
     
     /* Displays all the info of the client which includes Date of withdrawal, Withdrawal Amount, Final Current Balance */ 
     public void display()
      {
          if(hasWithdrawn=this.hasWithdrawn)
           {   
               super.display();// Display method is called from Parent class
               System.out.println("PIN Number: " + this.PIN_Number);
               System.out.println("Date of Withdrawal: " + this.DateofWithdrawal);
               System.out.println("Withdrawal amount: " + this.WithdrawalAmount);
           }
           
          else
           {
               System.out.println("Transaction is not carried for now. Please Try Again Later"); 
               System.out.println("Your Current Bank Balance Amount is " + getBalanceAmount());
           }
          
          
      }
      
      
 }