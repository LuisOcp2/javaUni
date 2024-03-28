
import javax.swing.*;

public class Estudiante {

    private String nom;
    public double promedio, pago;
    private double matri, desc;

    public Estudiante() {

        nom = "";
        promedio = 0;
        pago = 0;
        matri = 0.0;
        desc = 0.0;

    }

    public void pedirDatosEstudiante() {

        nom = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio del estudiante"));

    }
    public double calcularPago(){
     
        matri = 5*325000;
        
    if(promedio > 4){
        
        desc = matri * 0.25;
     
       
    
    }else{
    
    
    desc= 0;
     
    }
    pago = matri - desc;
    return pago;
}
public void mostrarValorMatricula(){
    
    JOptionPane.showMessageDialog(null, nom+" tiene que pagar: $ "+pago);
    


}

}
