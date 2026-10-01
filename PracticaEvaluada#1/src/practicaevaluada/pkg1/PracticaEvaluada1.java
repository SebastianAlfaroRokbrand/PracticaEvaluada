/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String empleados = JOptionPane.showInputDialog("Ingrese la cantidad de empleados: ");
        int numeroDeEmpleados = Integer.parseInt(empleados);
        
        int sumaSalarios = 0;
        
        for (int i = 1; i <= numeroDeEmpleados; i++) {
            String salarioTotales = JOptionPane.showInputDialog("Ingrese el salario del empleado "+ i +": ");
            int salarioIndividual = Integer.parseInt(salarioTotales);
            
            sumaSalarios = sumaSalarios + salarioIndividual;
        }
        
        int bonoSEM = (sumaSalarios * 925) / 100;
        int bonoIVM = (sumaSalarios * 508) / 100;
        int totalCCSS = bonoSEM + bonoIVM;
        String resultado = "La empresa deberá abonar a la CCSS el monto de: " + totalCCSS + " calculando el SEM y IVM";
        JOptionPane.showMessageDialog(null, resultado);
         
    }
    
}
