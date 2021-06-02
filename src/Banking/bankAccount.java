package Banking;

import java.util.Scanner;

public class bankAccount{
    int balance;
    int prevTransaction;
    String CustomerId;
    String CustomerName;
    
    bankAccount(String name, String id){
        CustomerName = name;
        CustomerId = id;
    }
    
    void deposit(int amount){
        if(amount != 0){
            balance = balance + amount ;
            prevTransaction = amount;
            
        }
    }
    void withdraw(int amount){
        if(amount !=0){
            balance = balance - amount ;
            prevTransaction = amount;
            
        }
    }
    void getPreviousTransaction(){
        if(prevTransaction > 0){
            System.out.print("Deposit: "+ prevTransaction);
        } else if (prevTransaction < 0){
            System.out.print("withdrawn: "+ prevTransaction);
        } else{
            System.out.print("No transaction occured. ");
        }
    }
    
    void showMenu(){
        
        char option;
        String choices = " \n Please choose a number to continue.. \n"+
                         " A. Check your balance \n"+
                         " B. Deposit \n"+
                         " C. withdraw \n"+
                         " D. check your previous transaction \n"+
                         " E. Exit \n";
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Welcome "+ CustomerName+ " Your ID is "+ CustomerId);
        System.out.print(choices);
        
        do{
        System.out.print("\n ************************");
        System.out.print("\n Enter your opition \n ");
        option = scanner.next().charAt(0);
        System.out.print("\n");
        
        switch(option){
            case 'A':
                System.out.print("\n ************************");
                System.out.print("\n Your balance is "+ balance);
                System.out.print("\n");
                break;
                
             case 'B':
                System.out.print("\n ************************ \n");
                System.out.print("\n Enter amount to deposit: ");
                System.out.print("\n ************************ \n");
                int amount = scanner.nextInt();
                deposit(amount);
                System.out.print("\n");
                break;
                
            case 'C':
                System.out.print("************************ \n");
                System.out.print("\n Enter amount to withdraw: ");
                System.out.print("\n ************************ \n");
                int amount2 = scanner.nextInt();
                withdraw(amount2);
                System.out.print("\n");
                break;
                
            case 'D':
                System.out.print("\n ************************ \n");
                getPreviousTransaction();
                System.out.print("************************ \n");
                System.out.print("\n");
                break;
                
            default: 
            System.out.print("\n Invalid option ");
            
        }

        }
        while(option != 'E');
        System.out.print("thanks for using us..");
        
    }
}