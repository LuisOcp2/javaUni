
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
public class telefono {

    private double min, pago;

    public telefono() {
        min = 9.5;
        pago = 0.0;

    }

    public double calcularValorLlamada() {

        pago = 5 * 200 + (min - 5) * 250;
        return (pago);

    }

    public void mostrarPago() {

        JOptionPane.showMessageDialog(null, "el cliente paga $ " + pago + "  por su llamada");

    }
}
