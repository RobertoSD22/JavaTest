package com.javajunit.examples.simple_payments;

/**
 * Interfaz que define los métodos para interactuar con un gateway de pagos.
 */
public interface PaymentGateway {

    /**
     * Solicita un pago a través del gateway de pagos.
     *
     * @param request la solicitud de pago
     * @return la respuesta del pago
     */
    PaymentResponse requestPayment(PaymentRequest request);
}