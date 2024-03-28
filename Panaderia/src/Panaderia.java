
import javax.swing.JOptionPane;

public class Panaderia {

    private int cantP, pago;

    public Panaderia() {

        cantP = 0;
        pago = 0;
    }

    public void pedirDatosCompra() {

        cantP = Integer.parseInt(JOptionPane.showInputDialog("cuantos panecillos desea?"));
    }
    public double calcularPago(){
        if(cantP <= 5){
        
           pago = cantP * 700 + 250;
        
        }
        else{
          
            pago = cantP * 500 + 250;
        
        }
        return(pago);
    
    }
    public void mostrarValorCompra(){
    
        JOptionPane.showMessageDialog(null,"El cliente por su compra pago: = $"+pago);
    
    }
}

