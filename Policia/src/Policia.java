
import javax.swing.JOptionPane;

public class Policia {

    private int edad;
    private double alt;
    private String nom, estado;
    private char gen;

    public Policia() {

        edad = 0;
        alt = 0.0;
        nom = "";
        estado = "";
        gen = ' ';

    }

    public void pedirDatosCandidato() {

        nom = JOptionPane.showInputDialog("Ingrese el nombre del candidato");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del candidato"));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del candidato"));
        gen = JOptionPane.showInputDialog("Seleccione H si es hombre o M. si es mujer").toUpperCase().charAt(0);

    }

    public String tomarDecision() {

        if (gen == 'H' && edad >= 18 && edad <= 25 && alt >= 1.68) {
            estado = "aceptado";
        } else if (gen == 'M' && edad>=18 && edad<= 25 && alt >=1.68) {
            estado = "aceptada";
        }
        else{
         
            estado = "rechazado";
        
        }
        return(estado);
    }
    public void mostrarDecision(){
     
       JOptionPane.showMessageDialog(null,"La vacante es para:"+nom+" porque fue: "+ estado);
    
    }
}
