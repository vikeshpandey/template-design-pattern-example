package io.github.vikeshpandey;

public class FooPlatform extends EcommercePaymentEngine {
    @Override
    void buildCart() {
        System.out.println("foo only sells shoes");
    }

    @Override
    void addAddress() {
        System.out.println("foo only support country codes in UK");
    }

    @Override
    void addPaymentDetails() {
        System.out.println("foo only accepts VISA/MasterCard");
    }
}
