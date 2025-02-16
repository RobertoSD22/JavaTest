package com.javajunit.examples.simple_payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static com.javajunit.examples.simple_payments.PaymentResponse.PaymentStatus.ERROR;
import static com.javajunit.examples.simple_payments.PaymentResponse.PaymentStatus.OK;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase PaymentProcessor.
 */
public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    /**
     * Configuración inicial para las pruebas.
     */
    @Before
    public void setUp() {

        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    /**
     * Prueba para verificar que el pago es correcto.
     */
    @Test
    public void paymentIsCorrect() {

        //Preparación del escenario
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(OK));

        //Ejecución y resultado
        assertTrue(paymentProcessor.makePayment(1000));
    }

    /**
     * Prueba para verificar que el pago es incorrecto.
     */
    @Test
    public void paymentIsWrong() {

        //Preparación del escenario
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(ERROR));

        //Ejecución y resultado
        assertFalse(paymentProcessor.makePayment(1000));
    }
}