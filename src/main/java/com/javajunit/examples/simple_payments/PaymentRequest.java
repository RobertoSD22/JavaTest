package com.javajunit.examples.simple_payments;

/**
 * Clase que representa una solicitud de pago.
 */
public class PaymentRequest {

    /** El monto del pago. */
    private double amount;

    /**
     * Constructor de la clase PaymentRequest.
     *
     * @param amount el monto del pago
     */
    public PaymentRequest(double amount) {
        this.amount = amount;
    }

    /**
     * Obtiene el monto del pago.
     *
     * @return el monto del pago
     */
    public double getAmount() {
        return amount;
    }
}
