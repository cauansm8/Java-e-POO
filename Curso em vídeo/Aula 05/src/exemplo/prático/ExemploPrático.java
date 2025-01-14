/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo.prático;


public class ExemploPrático {

    
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        c1.setNumero(111);
        c1.setDono ("Jubileu");
        c1.abrirConta("cc");
        c1.depositar(100f);
        c1.sacar(150f);
        c1.fecharConta();
        c1.informacoesConta();
        
        
        c2.setNumero(222);
        c2.setDono ("Creuza");
        c2.abrirConta ("cp");
        c2.depositar(500f);
        c2.sacar (100f);
        c2.pagarMensal();
        c2.informacoesConta();
        
        
        
        
    }
    
}
