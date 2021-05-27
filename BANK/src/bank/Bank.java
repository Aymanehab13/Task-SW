/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

import java.util.ArrayList;

/**
 *
 * @author Youssef ahmed
 * @version 1.6
 */
public class Bank {
/* To add a Client to the Bank Class*/
    static void addClient(Client clin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/* To add account for client in the Bank Class*/
    static void addaccount(Client clin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    /* To declare the attributes of the Bank Class*/

    /**
     *
     */
    
    protected String name;

    /**
     *
     */
    protected String address;

    /**
     *
     */
    protected int phone;
    /* ArrayList (a kind of array which ease to me getting the data of the accounts and clients in the Bank*/
    ArrayList<Client> clients = new ArrayList<Client>();
    ArrayList<Account> accounts = new ArrayList<Account>();

   Bank(){}; /* default constructor of the Bank Class*/
   /* Parametrized constructor that has the class's attributes*/
   Bank (String na,String addr,int ph, Account A ){ 
   name=na;
   address=addr;
   phone=ph;
   }

    /**
     *
     * @param na
     */
    public void setname(String na) { /* Setter Function to set a value to name*/
    name = na;}

    /**
     *
     * @param add
     */
    public void setaddress(String add) { /* Setter Function to set a value to address*/
     address = add;}

    /**
     *
     * @param ph
     */
    public void setphone(int ph) { /* Setter Function to set a value to phone*/
    phone = ph;}

    /**
     *
     * @return name
     */
    public String getname() { /* getter Function to get the value of name*/
    return name;
}

    /**
     *
     * @return address
     */
    public String getaddress() { /* getter Function to get the value of address*/
    return address;
}

    /**
     *
     * @return phone
     */
    public int getphone() { /* getter Function to get a value of phone*/
    return phone;
}

    /**
     *
     * @param Hamed
     */
    public void addclient(Client Hamed){ /* Function (addclient) to add a new client*/
        clients.add(Hamed);
}

    /**
     *
     * @param Hamed
     */
    public void addAccount(Client Hamed){ /* Function (addclient) to add a new account of client*/
        accounts.add(Hamed.account);
}

}