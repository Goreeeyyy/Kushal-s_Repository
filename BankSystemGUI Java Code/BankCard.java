/* Creating a class named Bankcard which resembles a real life bank account card 
which contains all the information about the client and the transaction performed. */

public class BankCard // This class is the Main class
 {
    /*Declaring variables at private level
    (Are also called attributes of this class)*/
     private String ClientName;
     private String IssuerBank;
     private int CardID;
     private int BalanceAmount;
     private String BankAccount;
    
      // Constructor having name of the class which contains variables as parameter inside paranthesis.
      public BankCard(String BankAccount,String IssuerBank,int BalanceAmount,int CardID) 
       {
          //using this keyword to call the private instance variables . 
          this.ClientName="";
          this.BankAccount=BankAccount;
          this.IssuerBank=IssuerBank;
          this.CardID=CardID;
          this.BalanceAmount=BalanceAmount;
             
       }
       
      /*Using Getter Method*/
      
      public String getClientName()
       {
            return this.ClientName=ClientName;
           
       }
      
      public String getIssuerBank()
       {
           return this.IssuerBank;
       }
       
      public int getCardID()
       {
           return this.CardID;
           
       }
       
      public String getBankAccount()
       {
           return  this.BankAccount; 
           
       }
       
      public int getBalanceAmount()
       {
           return this.BalanceAmount;
           
       }
       
      /*Using Setter Method */
      
      public void setClientName(String ClientName)
       {
           this.ClientName=ClientName;
           
       }
     
      public void setBalanceAmount(int BalanceAmount)
       {
           this.BalanceAmount=BalanceAmount;
       } 
       
      
       public void display() /* To display all the Client details according to the given if - else statement which includes
       CardID, BankAccount, ClientName, IssuerBank, BalanceAmount*/     
       {
            
           if(this.ClientName.equals(""))
             {
               System.out.println("The operation is invalid");
             }

           else
             {
               System.out.println("The bank details are :");  
               System.out.println("The CardID is " + this.CardID);
               System.out.println("The BankAccount is " + this.BankAccount);
               System.out.println("The ClientName is " + this.ClientName);
               System.out.println("The IssuerBank is " + this.IssuerBank); 
               System.out.println("The BalanceAmount is " + this.BalanceAmount);
             }
       }  
        
      
}                                    
       
       
       