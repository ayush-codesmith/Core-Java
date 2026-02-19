package com.Ayush.Multithreding;
class Bank{
    private double balance=1000;

    public synchronized void deposite(double amount){
        balance+=amount;
        System.out.println("The Amount "+amount+" is added now balance is "+balance);
    }
    public synchronized void withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
            System.out.println("The Amount "+amount+" Withdraw now balance is "+balance);
        }else {
            System.out.println("Insufficent Balance "+balance+" Enter amount "+amount);
        }
    }

    public synchronized double get(){
        return balance;
    }
}
public class ProcessSyncDemo {
    public static void main(String[] args) {
        Bank b = new Bank();

        Thread t1 = new Thread(()->{
            for (int i=0;i<3;i++){
                b.deposite(100.0);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i=0;i<3;i++){
                b.withdraw(200);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Balance :"+b.get());

    }
}
