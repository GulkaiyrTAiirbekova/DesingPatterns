package Behavioral.ChainOfResponsibility;

public class Dollar10Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain){
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur){
        if(cur.getAmount() >= 10){
            int num = cur.getAmount()/10;
            int remainder = cur.getAmount() % 10;
            System.out.println("Dispensing " + num + " x 10$ note");
            if(remainder != 0)
                this.chain.dispense(new Currency(remainder));
        } else{
            //if there is next dispenser
            if(chain != null){
                chain.dispense(cur);
            } else{
                //if chain ended -> gives error
                System.out.println("Cannot dispense amount: " + cur.getAmount());
            }
        }
    }
}

