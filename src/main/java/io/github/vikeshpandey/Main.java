package io.github.vikeshpandey;

public class Main {

    public static void main(String[] args) {
        processPaymentsForFoo();
        processPaymentsForBar();
    }

    private static void processPaymentsForFoo(){
        System.out.println("------Foo using the ecommerce payment engine-------");
        EcommercePaymentEngine fooPaymentEngine = new FooPlatform();
        fooPaymentEngine.pay();
        System.out.println("------Foo implementation completed-------\n\n\n");
    }

    private static void processPaymentsForBar(){
        System.out.println("------Bar using the ecommerce payment engine-------");
        EcommercePaymentEngine barPaymentEngine = new BarPlatform();
        barPaymentEngine.pay();
        System.out.println("------Bar implementation completed-------");
    }
}
