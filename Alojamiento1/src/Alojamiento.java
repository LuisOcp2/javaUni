
import javax.swing.JOptionPane;

public class Alojamiento {

    public String nom;
    public int dias;
    public char gym;
    public double factura; 

    public Alojamiento() {

        nom = "";
        gym = ' ';
        dias = 0;
        factura = 0;
    }

    public void pedirDatos() {

        dias = Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias se alojo?"));
        gym = JOptionPane.showInputDialog("Desea utilizar el gimansio s para si y n para no").toUpperCase().charAt(0);

    }

    public double calcularPago() {
        if (dias <= 4) {

         factura = 150000*dias * 0.88;

        } else {

            factura = 150000*dias;
        }
        if(gym == 'S' || gym == 's'){
            
            factura = factura + 5000;
           
        }
        
        
        return factura;
    
    }
    public void mostrarfactura (){
    
       JOptionPane.showMessageDialog(null,"el valor total de la factura es: = $"+factura);
    
    }

    }
