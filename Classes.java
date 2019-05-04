package com.shivanika;

public class Main {

    public static void main(String[] args) {
        BankAccount Union = new BankAccount();
        Union.setaccount_number(234566);
        Union.setbalance(0);
        Union.setcustomer_name("Shiva");
        Union.setemail("shiva@gmail.com");
        Union.setphone_number(9087654590l);
        System.out.println("accont number = " + Union.getaccount_number());
        System.out.println("balance =" + Union.getbalance());
        System.out.println("customer name is " + Union.getcustomer_name());
        System.out.println("email is " + Union.getemail());
        System.out.println("phone number is " + Union.getphone_number());
        Union.depositFunds(20000);
        Union.withdrawlFunds(500);
    }
********************************
package com.shivanika;

public class BankAccount {
    private int account_number;
    private int balance;
    private String customer_name;
    private String email;
    private long phone_number;

    public void depositFunds(int amountDeposited) {
        this.balance += amountDeposited;
        System.out.println("Amount Deposited is  " + amountDeposited + ";  Final balance is " + this.balance);
    }

    public void withdrawlFunds(int amountwithdrawl) {
        this.balance -= amountwithdrawl;
        if (this.balance - amountwithdrawl <= 0) {
            System.out.println("The available balance =" + this.balance + ";  There is insufficient balance to withdrawl");


        } else {
            System.out.println("Amount withdrawl is  " + amountwithdrawl + ";  Final balance is " + this.balance);

        }

    }

    public void setaccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getaccount_number() {
        return this.account_number;
    }

    public void setbalance(int balance) {
        this.balance = balance;
    }

    public int getbalance() {
        return this.balance;


    }

    public void setcustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getcustomer_name() {
        return this.customer_name;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getemail() {
        return this.email;
    }

    public void setphone_number(Long phone_number) {
        this.phone_number = phone_number;
    }


        public Long getphone_number() {
            return this.phone_number;
        }
    }
OUTPUT:
accont number = 234566
balance =0
customer name is Shiva
email is shiva@gmail.com
phone number is 9087654590
Amount Deposited is  20000;  Final balance is 20000
Amount withdrawl is  500;  Final balance is 19500

Process finished with exit code 0
