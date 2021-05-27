/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author Ayman ehab
 * @version 1.6
 */
public class Client {

    /**
     *
     */
    protected String adress;

    /**
     *
     */
    protected int phonenum;

    /**
     *
     */
    protected String name;
    private long nationalid;
    Account account;
    
    
    

Client(){};
Account account1 = new Account();

Client(String adr,int pnum,String nam, long ni, Account A ){
   adress=adr;
   phonenum=pnum;
   name=nam;
   nationalid=ni;
   
}

    /**
     *
     * @param adress
     */
    public void setadress(String adress) {
    this.adress = adress;}

    /**
     *
     * @param phonenum
     */
    public void setphonenum(int phonenum) {
     this.phonenum = phonenum;}

    /**
     *
     * @param name
     */
    public void setname(String name) {
    this.name = name;}

    /**
     *
     * @param nationalid
     */
    public void setnationalid(long nationalid) {
        this.nationalid = nationalid;}

    /**
     *
     * @return
     */
    public String getadress() {
    return adress;
}

    /**
     *
     * @return
     */
    public int getphonenum() {
    return phonenum;
}

    /**
     *
     * @return
     */
    public String getname() {
    return name;
}

    /**
     *
     * @return
     */
    public long getnationalid() {
    return nationalid ;
}

    /**
     *
     * @return
     */
    @Override
public String toString() {
    return "information{" + "adress=" + adress + ", phone number=" + phonenum + "name"+ name +"nationat id"+ nationalid + "balance=" + account1.getBalance() + ", account_number=" + account1.getAccount_number() ;};

  
    void getclient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}