package com.javajunit.examples.simple_payments;

/**
 * Clase que procesa los pagos utilizando un gateway de pagos.
 */
public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    /**
     * Constructor de la clase PaymentProcessor.
     *
     * @param paymentGateway el gateway de pagos a utilizar
     */
    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    /**
     * Realiza un pago con el monto especificado.
     *
     * @param amount el monto a pagar
     * @return true si el pago fue exitoso, false en caso contrario
     */
    public boolean makePayment(double amount) {
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        return response.getStatus().equals(PaymentResponse.PaymentStatus.OK);
    }
}