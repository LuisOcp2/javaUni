
import javax.swing.*;

public class iva {

    private double prod1, prod2, prod3, iva, total;

    //crear constructor
    public iva() {

        prod1 = 0.0;
        prod2 = 0.0;
        prod3 = 0.0;
        iva = 0.0;
        total = 0.0;

    }

    public void pedirDatos() {

        prod1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del primer producto"));        prod1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del primer producto"));
        prod2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del segundo producto"));
        prod3 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del tercer producto"));

    }
    public double calcularIva(){
    
    iva = (prod1+prod2+prod3)*0.19;
    return (iva);
    
    }
    public void mostrarRespuesta(){
    
    JOptionPane.showMessageDialog(null,"El iva de los 3 productos es $"+ calcularIva());
    
    
    
    
    }


}
