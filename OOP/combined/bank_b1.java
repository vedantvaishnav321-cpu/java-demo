class BankAccount {
    private String accountHolder;
    private int balance;
    
     BankAccount(String accountHolder, int balance){
         this.accountHolder = accountHolder;
         this. balance = balance;
     }
     
     void deposite(int amount){
         balance = balance + amount;
         System.out.println(amount + " Deposited successfully");
     }
     
     void withdraw(int amount){
          if(amount <= balance){
              balance = balance - amount;
              System.out.println(amount + " withdraw successful");
          }
          else{
              System.out.println("Insufficiant balance");
          }
     }
     
     void displaybalance(){
         if(balance >= 0){
             System.out.println("Balance = "+balance);
         }
         else{
             System.out.println("Balance must not be negative ");
         }
     }
}

class bank_b1 {
    public static void main(String[] args) {
         BankAccount b = new BankAccount("yash" , 30000);
         b.displaybalance();
         b.deposite(15000);
         b.withdraw(38000);
         b.displaybalance();
    }
}
