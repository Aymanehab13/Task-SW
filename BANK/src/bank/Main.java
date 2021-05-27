/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

import java.util.Scanner;

/**
 *
 * @author Youssef ahmed 
 * @author Ayman ehab
 * @author Mohamed
 * @version 1.6
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int num1;
        int num2;
        Bank EGB = new Bank();
        
while(true){
    System.out.println("welcome to EGB");
    System.out.println("1.client");
    System.out.println("2.Information about client");
    System.out.println("3.Information about account");
    
    Scanner B= new Scanner(System.in);
    num=B.nextInt();
    if(num ==1){
        System.out.println("Choose: Normal Client or CommercialClient");
        num1=B.nextInt();
        if(num1 == 1){
            System.out.println("Normal Account or Special Account ");
            num2=B.nextInt();
            if (num2== 1){
            Account account = new Account();
            Client clin =new Client ();
            clin.getclient();
            Bank.addClient(clin);
            Bank.addaccount(clin);
            }else if(num2 ==2){
                SpecialAccount spec_acc = new SpecialAccount();
                Client clin =new Client ();
                clin.getclient();
                Bank.addClient(clin);
                Bank.addaccount(clin);
            }
            }else if(num1 == 2){
            System.out.println("Normal Account or Special Account ");
            num2=B.nextInt();
            if (num2== 1){
                Account acc = new Account();
                CommercialClient commerc_clin = new CommercialClient ();
                commerc_clin.getclient();
                Bank.addClient(commerc_clin);
                Bank.addaccount(commerc_clin);
            }else if(num2 ==2){
                SpecialAccount spec_acc = new SpecialAccount();
                CommercialClient commerc_clin = new CommercialClient ();
                commerc_clin.getclient();
                Bank.addClient(commerc_clin);
                Bank.addaccount(commerc_clin);
            }
        }
    }
    if(num==2){
        Client one = new Client();
	one.setadress("giza");
	one.setname("ahmed");
	one.setnationalid(000000700);
	one.setphonenum(01122550011);
	System.out.println(one.toString());
    }
    if(num==3){
        
         Account acc_one = new Account();
         SpecialAccount spech_one=new SpecialAccount();
         acc_one.setAccount_number(1);
         spech_one.setAccount_number(2);
         acc_one.setBalance(2000);
         spech_one.setBalance(500);
         acc_one.withDraw(2001);
         spech_one.withDraw(1001);
         System.out.println(acc_one.toString());
         System.out.println(spech_one.toString());         
         
    }
    else if (num ==0 ){
        System.out.println("thank you") ;
        break;
    }
    
  }
 }
        // TODO code application logic here
}
    