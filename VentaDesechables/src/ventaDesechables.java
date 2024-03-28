
import javax.swing.*;

/*
vaso 10 oz = 50
vaso 12 oz = 80
vaso 16 oz  =100
plato torta = 120
pato pando = 150
plato sopa = 150
bandeja = 200
 */
public class ventaDesechables {

    private int cantidad;
    private String articulo, nombreCliente;
    private int precio;
    private int valorFactura;

    public ventaDesechables() {

        cantidad = 0;
        articulo = "";
        precio = 0;
        valorFactura = 0;
        nombreCliente = "";
    }

    public void pedirDatos() {

        nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        articulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el articulo a vender" + "\n" + "LISTA DE PRODUCTOS" + "\n" + "--------------------"
        +"\n"   + "1: vaso 10 oz = 50\n"
                + "2: vaso 12 oz = 80\n"
                + "3: vaso 16 oz  =100\n"
                + "4: plato torta = 120\n"
                + "5: pato pando = 150\n"
                + "6: plato sopa = 150\n"
                + "7: bandeja = 200"));
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));

    }

    public int calcularValorFactura() {

        if (articulo == 1) {

            precio = 50;
            valorFactura = cantidad * precio;

        }
        if (articulo == 2) {
            precio = 80;
            valorFactura = cantidad * precio;

        }
        if (articulo == "vaso 16 oz") {
            precio = 100;
            valorFactura = cantidad * precio;

        }
        if (articulo == "plato torta") {
            precio = 120;
            valorFactura = cantidad * precio;

        }
        if (articulo == "plato pando") {
            precio = 150;
            valorFactura = cantidad * precio;

        }
        if (articulo == "plato sopa") {
            precio = 50;
            valorFactura = cantidad * precio;
            valorFactura = cantidad * 150;

        }
        if (articulo == "bandeja") {
            precio = 200;
            valorFactura = cantidad * precio;

        }

        return (valorFactura);
    }

    public void mostrarFactura() {

        JOptionPane.showMessageDialog(null, "cliente: " + nombreCliente + "\n" + "el producto que compro es: " + articulo + "\n" + "cantidad: " + cantidad + "\n" + "el precio unitario es: " + (valorFactura / cantidad) + "\n" + "el valor total a pagar es: " + valorFactura);

    }
}
