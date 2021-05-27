/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author Ayman ehab
 */
public class CommercialClient extends Client{
	private long commercialid;
	private long nationalid = 00000000000000;

    /**
     *
     * @param commercialid
     */
    public void setcommercialid(long commercialid) {
        this.commercialid = commercialid;}

    /**
     *
     * @return
     */
    public long getcommercialid() {
    return commercialid;}

    /**
     *
     * @return
     */
    @Override
public String toString() {
    return "information{" + "adress=" + adress + ", phone number=" + phonenum + "name"+ name +"commercial id"+ commercialid + "balance=" + account1.getBalance() + ", account_number=" + account1.getAccount_number() ;};
}
	
