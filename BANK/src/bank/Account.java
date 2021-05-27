/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author Mohamed Abd elkader
 * @version 1.6
 */
public class Account {
    private double balance;
    private int account_number=0;
    
    Account(){};
    Account(double b,int a_num){
       balance=b;
       account_number=a_num;
       
    }

    /**
     *
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @return
     */
    public int getAccount_number() {
        return account_number;
    }

    /**
     *
     * @param account_number
     */
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + ", account_number=" + account_number + '}';
    }

    /**
     *
     * @param num
     */
    public void withDraw(double num){
        if(balance>=num){
            balance-=num;
        }else{
            System.out.println("enough balance should be available.");
        }
    }

    /**
     *
     * @param num
     */
    public void deposit(double num){
        balance+=num;
    }
   
}
