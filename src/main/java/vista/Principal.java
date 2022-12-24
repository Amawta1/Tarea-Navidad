/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;


/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args) {
        
        var ventanaPais = new VentanaPais();
        var ventanaProvincia = new VentanaProvincia();
        var ventanaCanton = new VentanaCanton();
        ventanaPais.setVisible(true);
        ventanaProvincia.setVisible(true);
        ventanaCanton.setVisible(true);
        
    }
}
