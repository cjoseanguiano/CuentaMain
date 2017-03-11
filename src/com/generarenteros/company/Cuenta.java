package com.generarenteros.company;

/**
 * Created by carlosjoseanguiano on 11/03/17.
 */
public class Cuenta {
    private String titular;
    private double cantidad;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }

    }

    //    ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
    public void ingresaDineroCuenta(double cantidad) {

        if (cantidad > 0) {
            this.cantidad += cantidad;
        }

    }

/*    retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa,
    la cantidad de la cuenta pasa a ser 0.
*/

    public void retirarDineroCuneta(double cantidad) {

        if (cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }

    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}