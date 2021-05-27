/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author Mohamed
 */
class SpecialAccount extends Account {
    
   @Override
    public void withDraw(double num){
        if((this.getBalance()-num)>=-1000){
            this.setBalance((this.getBalance()-num));
        }else{
            System.out.println("enough balance should be available.");
        }
    }
}
