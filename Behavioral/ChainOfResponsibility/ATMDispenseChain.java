package Behavioral.ChainOfResponsibility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMDispenseChain {
    private DispenseChain c1;

    public ATMDispenseChain(){
        //proceed the requests
        this.c1= new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        //link chain

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }


    public static void main(String [] args){
        ATMDispenseChain atm = new ATMDispenseChain();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter amount to dispense: ");

            int amount;

            //1. (0.5 or String will not break the program)
            try{
                amount = input.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Please enter whole number only! ");
                input.next();  //clean wrong entered value
                continue;
            }
            //2.make sure amount > 0
            if (amount <= 0){
                System.out.println("Amount must be more than 0");
                continue;
            } //3.

            if(amount % 10 !=0){
                System.out.println("Amount me be multiple of 10.");
                continue;
            }

            //PROCESS

            atm.c1.dispense((new Currency(amount)));
            System.out.println();
        }
    }
}
