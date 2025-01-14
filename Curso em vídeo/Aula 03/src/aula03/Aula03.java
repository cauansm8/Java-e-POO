/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03;

public class Aula03 {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
           
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.carga = 3;
        
        c1.rabiscar();
        
        c1.definir_ponta(3.2f);
        
        c1.tampar();
        c1.status();

    }
    
}
        