
/*
Diseñe un algoritmo para obtener el grado de eficiencia de un operario de una fábrica de tornillos, de acuerdo a las siguientes condiciones que se le imponen para un período de prueba:
- Menos de 200 tornillos defectuosos.
- Más de 10000 tornillos producidos.
El grado de eficiencia se determina de la siguiente manera:
- Si no cumple ninguna de las condiciones, grado 5.
- Si sólo cumple la primera condición, grado 6.
- Si sólo cumple la segunda condición, grado 7.
- Si cumple las dos condiciones, grado 8.

VARIABLES = 
CDTP : Cantidad de tornillos producidos
CDTD = Cantidad de tornillos defectuosos

 */
import javax.swing.*;

public class Eficiencia {

    private int CDTP; //Cantidad de tornillos producidos
    private int CDTD; //Cantidad de tornilos defectuosos
    private int eficiencia;

    public Eficiencia() {

        CDTP = 0;
        CDTD = 0;
        eficiencia = 0;

    }

    public void pedirDatosOperador() {

        CDTP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tornillos producidos"));
        CDTD = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tornillos defectuosos"));

    }

    public int calcularEficiencia() {
//CDTP : Cantidad de tornillos producidos
//CDTD = Cantidad de tornillos defectuosos
        // Si cumple las dos condiciones, grado 8.
        if (CDTP > 10000 && CDTD < 200) {

            eficiencia = 8;

            //  - Si sólo cumple la primera condición, grado 6.
        } else if (CDTP > 10000 && CDTD > 200) {

            eficiencia = 6;

            //   - Si sólo cumple la segunda condición, grado 7. 
        } else if (CDTD < 200 && CDTP < 10000) {
            
            eficiencia = 7;

        } //Si no cumple ninguna de las condiciones, grado 5.
        else if (CDTP < 10000 && CDTD > 200) {

            eficiencia = 5;

        }

        return (eficiencia);
    }

    public void mostrarEficiencia() {

        JOptionPane.showMessageDialog(null, "La eficiencia del operador es: " + eficiencia);

    }

}
