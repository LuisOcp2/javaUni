
import javax.swing.JOptionPane;

public class letraA {

    public String palabra;
    public char var;
    public String res;
    public int cantidad;
    public String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    public letraA() {

        palabra = "";
        var = ' ';
        res = "";
        cantidad = 0;

        System.out.println(cars[0]);

    }

    public void pedirDatos() {

        palabra = JOptionPane.showInputDialog("Ingrese una palabra con la letra s");

    }

    public String operarPalabra() {
        for (int cont = 0; palabra.length() > cont; cont++) {

            var = palabra.toUpperCase().charAt(cont);

            if (var == 'S') {

                cantidad = cantidad++;
                res = " tiene";

                JOptionPane.showMessageDialog(null, "HOLA");

            }

        }
        if (res == "") {
            res = " no tiene";

        }
        return res;
    }

    public void mostrarRes() {

        JOptionPane.showMessageDialog(null, "la palabra "+palabra+res+" la letra S");

    }

}
