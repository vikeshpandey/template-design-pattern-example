package io.github.vikeshpandey;

public abstract class EcommercePaymentEngine {

    abstract void buildCart();

    abstract void addAddress();

    abstract void addPaymentDetails();

    public final void pay(){
        try {
            buildCart();
            addAddress();
            addPaymentDetails();
        }catch (Exception e){
            System.out.println("Something went wrong, error is : " + e);
            System.out.println("Also, rollback stuff !!");
        }finally{
            System.out.println("cleaning up resources");
            //close any opened resources
        }
    }
}
