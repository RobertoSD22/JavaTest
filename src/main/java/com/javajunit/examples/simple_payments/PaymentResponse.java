package com.javajunit.examples.simple_payments;

/**
 * Clase que representa la respuesta de un pago.
 */
public class PaymentResponse {

    /**
     * Enum que define los posibles estados de un pago.
     */
    public enum PaymentStatus {
        OK, ERROR
    }

    /** El estado del pago. */
    private PaymentStatus status;

    /**
     * Constructor de la clase PaymentResponse.
     *
     * @param status el estado del pago
     */
    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    /**
     * Obtiene el estado del pago.
     *
     * @return el estado del pago
     */
    public PaymentStatus getStatus() {
        return status;
    }
}
