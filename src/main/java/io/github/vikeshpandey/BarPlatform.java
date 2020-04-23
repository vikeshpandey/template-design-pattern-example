package io.github.vikeshpandey;

public class BarPlatform extends EcommercePaymentEngine {
    @Override
    void buildCart() {
        System.out.println("bar only sells chocolates");
    }

    @Override
    void addAddress() {
        System.out.println("bar only support US country codes");
    }

    @Override
    void addPaymentDetails() {
        System.out.println("bar only supports paypal !!");
    }
}
